/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.encrypts;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

import org.jpf.common.abstractUtil;
import org.jpf.utils.JpfCloseUtil;

/**
 * 
 * @author wupf
 *
 */
public class MD5Filter extends abstractUtil {

	private MD5Filter() {}
	/**
	 * 
	 * @category 返回字符串MD5值
	 * @author 
	 * @param inStr
	 * @return update 2020年12月3日
	 */
	public static String getMd5ByString(String inStr) {
		String reString = "";
		try {
			reString = org.apache.commons.codec.digest.DigestUtils.md5Hex(inStr);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
		}

		return reString;
	}

	/**
	 * 
	 * @category 文件的MD5值
	 * @author 
	 * @param strFileName
	 * @return update 2020年3月2日
	 */
	public static String getMd5ByFile(String strFileName) {
		String value = null;
		FileInputStream in = null;
		try {
			in = new FileInputStream(strFileName);
			MappedByteBuffer byteBuffer = in.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, strFileName.length());
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(byteBuffer);
			BigInteger bi = new BigInteger(1, md5.digest());
			value = bi.toString(16);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
		} finally {

			JpfCloseUtil.close(in);
		}
		return value;
	}

	/**
	 * 
	 * @category: MD5
	 * @Title: getFileMD5
	 * @Author:wupf@
	 * @date:2020年1月11日
	 * @param file
	 * @return
	 */
	public static String getFileMD5(File file) {
		if (!file.isFile()) {
			return null;
		}
		MessageDigest digest = null;
		FileInputStream in = null;
		byte buffer[] = new byte[8192];
		int len;
		try {
			digest = MessageDigest.getInstance("MD5");
			in = new FileInputStream(file);
			while ((len = in.read(buffer)) != -1) {
				digest.update(buffer, 0, len);
			}
			BigInteger bigInt = new BigInteger(1, digest.digest());
			return bigInt.toString(16);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			JpfCloseUtil.close(in);
		}
	}

	/**
	 * 
	 * @category: Sha1
	 * @Title: getFileSha1
	 * @Author:wupf@
	 * @date:2020年1月11日
	 * @param file
	 * @return
	 */
	public static String getFileSha1(File file) {
		if (!file.isFile()) {
			return null;
		}
		MessageDigest digest = null;
		FileInputStream in = null;
		byte buffer[] = new byte[8192];
		int len;
		try {
			digest = MessageDigest.getInstance("SHA-1");
			in = new FileInputStream(file);
			while ((len = in.read(buffer)) != -1) {
				digest.update(buffer, 0, len);
			}
			BigInteger bigInt = new BigInteger(1, digest.digest());
			return bigInt.toString(16);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			JpfCloseUtil.close(in);
		}
	}

	/**
	 * 
	 * @category:获取网络文件的MD5
	 * @Title: getNetFileMD5
	 * @Author:wupf@
	 * @date:2020年1月11日
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public static String getNetFileMD5(String path) throws Exception {
		URL url = new URL(path);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		InputStream inStream = con.getInputStream();

		MessageDigest digest = null;
		byte buffer[] = new byte[8192];
		int len;
		try {
			digest = MessageDigest.getInstance("MD5");
			while ((len = inStream.read(buffer)) != -1) {
				digest.update(buffer, 0, len);
			}
			BigInteger bigInt = new BigInteger(1, digest.digest());
			return bigInt.toString(16);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			JpfCloseUtil.close(inStream);
		}
	}
}
