/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.ios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.jpf.common.abstractWork;
import org.jpf.utils.JpfCloseUtil;

/**
 * 
 * @author wupf
 *
 */
public final class JpfFtp extends abstractWork {

	/**
	 * 
	 * @category 
	 * @author  
	 * @param url
	 * @param port
	 * @param username
	 * @param password
	 * @param path
	 * @param filename
	 * @param localFileName
	 * @return
	 * update 2020年3月29日
	 */
	public boolean uploadFile(String url, int port, String username, String password, String path, String filename,
			String localFileName) {
		// 初始表示上传失败
		boolean success = false;
		// 创建FTPClient对象
		FTPClient ftp = new FTPClient();
		InputStream input = null;
		try {
			int reply;
			// 连接FTP服务器
			// 如果采用默认端口，可以使用ftp.connect(url)的方式直接连接FTP服务器

			logger.debug("文件上传，连接到FTP..." + url);
			// ftp.connect(url);
			ftp.connect(url, port);
			// 登录ftp
			ftp.login(username, password);
			// 看返回的值是不是230，如果是，表示登陆成功
			logger.info("Remote system is " + ftp.getSystemName());

			reply = ftp.getReplyCode();
			// 以2开头的返回值就会为真
			if (!FTPReply.isPositiveCompletion(reply)) {
				ftp.disconnect();
				return success;
			}
			// 转到指定上传目录
			logger.debug("切换到目录：" + path);
			ftp.changeWorkingDirectory(path);
			// 将上传文件存储到指定目录
			ftp.enterLocalPassiveMode();

			input = new FileInputStream(localFileName);
			logger.debug("上传文件：" + localFileName);
			// if(ftp.remoteStore(filename))
			if (ftp.storeFile(filename, input)) {
				logger.info("succ put file:" + filename);
			} else {
				logger.info("fail put file:" + filename);
				success = false;
			}

			// 退出ftp
			ftp.noop(); // check that control connection is working OK
			ftp.logout();
			logger.info("close ftp");
			// 表示上传成功
			success = true;
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			// 关闭输入流
			JpfCloseUtil.close(input);
			close(ftp);
		}
		return success;
	}

	final int keepAliveTimeout = 600;
	final int controlKeepAliveReplyTimeout = 600;

	/**
	 * Description: 从FTP服务器下载文件
	 * 
	 * @param url
	 *            FTP服务器hostname
	 * @param port
	 *            FTP服务器端口
	 * @param username
	 *            FTP登录账号
	 * @param password
	 *            FTP登录密码
	 * @param remotePath
	 *            FTP服务器上的相对路径
	 * @param fileName
	 *            要下载的文件名
	 * @param localPath
	 *            下载后保存到本地的路径
	 * @return
	 */
	public boolean downFile(String url, int port, String username, String password, String remotePath, String fileName,
			String localPath, boolean IsDelFile) {
		// 初始表示下载失败
		boolean success = false;
		// 创建FTPClient对象
		FTPClient ftp = new FTPClient();
		try {
			int reply;
			// 连接FTP服务器
			// 如果采用默认端口，可以使用ftp.connect(url)的方式直接连接FTP服务器
			// ftp.connect(url, port);
			// ftp.setControlKeepAliveTimeout(keepAliveTimeout);
			ftp.setConnectTimeout(keepAliveTimeout);
			// ftp.setControlKeepAliveReplyTimeout(controlKeepAliveReplyTimeout);
			logger.debug("文件下载，连接到FTP..." + url);
			// ftp.connect(url);
			ftp.connect(url, port);
			// 登录ftp
			ftp.login(username, password);
			logger.info("Remote system is " + ftp.getSystemName());
			reply = ftp.getReplyCode();
			if (!FTPReply.isPositiveCompletion(reply)) {
				ftp.disconnect();
				logger.warn("FTP server refused connection ");
				return success;
			}
			ftp.setFileType(FTP.BINARY_FILE_TYPE);
			ftp.enterLocalPassiveMode();

			// 转到指定下载目录
			ftp.changeWorkingDirectory(remotePath);
			// 列出该目录下所有文件
			FTPFile[] fs = ftp.listFiles();
			// 遍历所有文件，找到指定的文件
			// for (FTPFile f : ftp.listFiles(remote)) {
			if (fs.length > 0) {

				for (FTPFile ff : fs) {

					logger.info("list file:" + ff.getName() + " " + ff.getSize());
					// if (ff.getName().equals(fileName))
					// if (ff.getName().indexOf(".jsp") > 0)
					if (ff.getName().startsWith(fileName)) {
						OutputStream os = null;
						try {

							// 根据绝对路径初始化文件
							File localFile = new File(localPath + "/" + ff.getName());
							// 输出流
							os = new FileOutputStream(localFile);
							// 下载文件

							if (!ftp.retrieveFile(ff.getName(), os)) {
								logger.error("fail get file:" + ff.getName());
								success = false;
							} else {
								logger.info("succ get file:" + ff.getName());
								success = true;
								// 删除文件
								if (IsDelFile) {
									if (ftp.deleteFile(ff.getName())) {
										logger.info("succ del server file:" + ff.getName());
										success = true;
									} else {
										logger.error("fail del server file " + ff.getName());
										success = false;
									}
								}
							}
							os.flush();
							// this.wait(10);
						} catch (Exception ex) {
							logger.error(ex.getMessage());
						} finally {
							JpfCloseUtil.close(os);
						}
					}
				}
			} else {
				logger.debug("no file in server");

			}
			// 退出ftp
			ftp.noop(); // check that control connection is working OK
			ftp.logout();
			// 下载成功
			logger.info("FTP退出");
		} catch (IOException e) {
			logger.error(e.getMessage());
		} finally {
			close(ftp);
		}
		return success;
	}

	/**
	 * 
	 * @category 功能
	 * @param ftp
	 * @author wupf
	 * @Date :2021年5月13日下午3:18:49
	 */
	public void close(FTPClient ftp) {
		try {
			if (ftp != null && ftp.isConnected())
				ftp.disconnect();
		} catch (IOException ioe) {
		}
	}
}
