/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.ios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.codehaus.plexus.util.DirectoryScanner;
import org.jpf.common.abstractUtil;
import org.jpf.utils.JpfCloseUtil;
import org.jpf.utils.JpfConst;
import org.jpf.utils.JpfSysInfoUtil;

/**
 * 
 * @author wupf
 *
 */
public class JpfFileUtil extends abstractUtil {


	/**
	 * 私有构造方法，防止类的实例化，因为工具类不需要实例化。
	 */
	private JpfFileUtil() {
	}

	/**
	 * use nio copy file
	 *
	 * @param source source file
	 * @param target target file
	 */
	public static void nioTransferCopy(File source, File target) {
		FileChannel in = null;
		FileChannel out = null;
		FileInputStream inStream = null;
		FileOutputStream outStream = null;
		try {
			inStream = new FileInputStream(source);
			outStream = new FileOutputStream(target);
			in = inStream.getChannel();
			out = outStream.getChannel();
			in.transferTo(0, in.size(), out);
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e);
		} finally {

			JpfCloseUtil.close(inStream);
			JpfCloseUtil.close(in);
			JpfCloseUtil.close(outStream);
			JpfCloseUtil.close(out);
		}
	}

	/**
	 * Convert InputStream to byte array
	 *
	 * @param inStream InputStream
	 * @return byte array
	 * @throws IOException io exception
	 */
	public static byte[] input2byte(InputStream inStream) throws IOException {
		ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
		byte[] buff = new byte[100];
		int rc;
		while ((rc = inStream.read(buff, 0, 100)) > 0) {
			swapStream.write(buff, 0, rc);
		}
		return swapStream.toByteArray();
	}

	/**
	 * write string contents to file
	 *
	 * @param source   string contents
	 * @param filePath local file path
	 * @param append   append operate
	 * @return boolean
	 */
	public static boolean writeFile(String source, String filePath, boolean append) {
		return writeFile(source, filePath, append, DEFAULT_CHARSET);
	}

	/**
	 * write string contents to file,overwrite any existing file
	 *
	 * @param source   string content
	 * @param filePath file path
	 * @return boolean
	 */
	public static boolean writeFileNotAppend(String source, String filePath) {
		return writeFile(source, filePath, false, DEFAULT_CHARSET);
	}

	/**
	 * write by OutPutStreamWriter
	 *
	 * @param source   String source
	 * @param filePath File path
	 * @param append   is append
	 * @param encoding encoding
	 * @return boolean
	 */
	public static boolean writeFile(String source, String filePath, boolean append, String encoding) {
		boolean flag;
		OutputStreamWriter osw = null;
		try {
			osw = new OutputStreamWriter(new FileOutputStream(filePath, append), encoding);
			osw.write(source);
			flag = true;
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e);
			flag = false;
		} finally {
			JpfCloseUtil.close(osw);
		}
		return flag;
	}

	/**
	 * write by BufferedWriter
	 *
	 * @param source String source
	 * @param file   File
	 * @param append append operate
	 * @return boolean
	 */
	public static boolean writeFile(String source, File file, boolean append) {
		boolean flag;
		BufferedWriter output = null;
		try {
			file.createNewFile();
			output = new BufferedWriter(new FileWriter(file, append));
			output.write(source);
			flag = true;
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e);
			flag = false;
		} finally {
			JpfCloseUtil.close(output);
		}
		return flag;
	}

	/**
	 * get file content
	 *
	 * @param fileName file name
	 * @return String
	 */
	public static String getFileContent(String fileName) throws Exception {
		File f = new File(fileName);
		return org.apache.commons.io.FileUtils.readFileToString(f, "UTF-8");

	}

	/**
	 * get files from folder
	 *
	 * @param folder folder
	 * @return files array
	 */
	public static File[] getResourceFolderFiles(String folder) {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL url = loader.getResource(folder);
		if (null == url) {
			throw new RuntimeException("url is null");
		}
		String path = url.getPath();
		return new File(path).listFiles();
	}

	/**
	 * Use nio write file
	 *
	 * @param contents string contents
	 * @param filePath file path
	 * @return boolean
	 */
	public static boolean nioWriteFile(String contents, String filePath) {
		return nioWriteFile(filePath, contents, null);
	}

	/**
	 * Appending The New Data To The Existing File
	 * 
	 * @param contents string contents
	 * @param filePath file path
	 * @return boolean
	 */
	public static boolean nioWriteAppendable(String contents, String filePath) {
		return nioWriteFile(filePath, contents, StandardOpenOption.APPEND);
	}

	/**
	 * Use nio write file
	 *
	 * @param filePath   file path
	 * @param contents   string contents
	 * @param openOption open or create options
	 * @return boolean
	 */
	public static boolean nioWriteFile(String filePath, String contents, OpenOption openOption) {
		Path path = Paths.get(filePath);
		try {
			Files.createDirectories(path.getParent());
			if (!Files.exists(path)) {
				Files.createFile(path);
			}
			if (null == openOption) {
				Files.write(path, contents.getBytes(DEFAULT_CHARSET));
			} else {
				Files.write(path, contents.getBytes(DEFAULT_CHARSET), openOption);
			}
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e);
		}
		return false;
	}

	/**
	 * To Suffix getFileExt
	 * 
	 * @since 0.2
	 * @param fileName file name
	 * @return String
	 */
	public static String toSuffix(String fileName) {
		String name = null;
		try {
			int index = fileName.lastIndexOf(".");
			name = fileName.substring(0, index);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
		}
		return name;
	}

	/**
	 * 
	 * @category 获取WINDOWS的用户盘
	 * @author
	 * @return update 2020年12月3日
	 */
	public static List<String> getFileSystemWin() {
		List<String> mFileSystem = new ArrayList<String>();

		File[] files = File.listRoots();

		for (int i = 0; i < files.length; i++) {
			mFileSystem.add(files[i].getPath());
		}
		return mFileSystem;
	}

	/**
	 * @category 比较文件时间
	 * @param sFileName1
	 * @param sFileName2
	 * @return update 2019-9-6
	 */
	public static boolean compareFileDate(String sFileName1, String sFileName2) {
		File fpath1 = new File(sFileName1);
		long timeStamp1 = fpath1.lastModified();
		File fpath2 = new File(sFileName2);
		long timeStamp2 = fpath2.lastModified();
		return timeStamp1 > timeStamp2;
	}

	/**
	 * 
	 * @category 功能
	 * @param url
	 * @param time
	 * @return
	 * @author wupf
	 * @Date :2020年4月28日上午7:20:18
	 */
	public static boolean fileTime(String url, int time) {
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		File f = new File(url);
		// 获得文件创建时间
		long file_time = f.lastModified();
		// 获得当前系统时间
		long now_time = System.currentTimeMillis();
		if ((now_time - file_time) > time * 60 * 1000) {
			return false;
		} else {
			return true;
		}
	}


	static class MyFilter implements FilenameFilter {
		private String[] types;

		public MyFilter(String type) {
			this.types = type.split(";");
			if (logger.isTraceEnabled()) {
				for (String strType : types) {
					logger.trace(strType);
				}
			}
		}

		@Override
		public boolean accept(File dir, String name) {
			// System.out.println(name);
			// System.out.println(dir.toString());
			if (!isFile(dir, name)) {
				return true;
			} else {
				for (String strType : types) {
					if (name.endsWith(strType)) {
						return true;
					}
				}
			}
			return false;
		}
	}

	/**
	 * 删除空目录
	 * 
	 * @param inFileDir String
	 */
	public static void delBlankDir(String inFileDir) {
		File f1 = new File(inFileDir);
		if (!f1.isDirectory()) {
			return;
		}
		File[] f2 = f1.listFiles();
		if (f2 != null) {
			for (int i = 0; i < f2.length; i++) {
				if (f2[i].isDirectory()) {
					delBlankDir(f2[i].toString());
				}
			}
		}
		f2 = f1.listFiles();

		if (f2 != null && 0 == f2.length) {
			f1.delete();
		}

	}

	/**
	 * 
	 * @category 删除文件目录
	 * @author wupf
	 * @param path update 2020年1月29日
	 */
	public static void deleteDirectory(String path) throws Exception {
		File dir = new File(path);
		if (!dir.exists())
			return;
		if (dir.isFile()) {
			dir.delete();
			return;
		}
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			deleteDirectory(files[i].getAbsolutePath());
		}
		dir.delete();
	}

	/**
	 * @category 保存文件
	 * @param strFileFullName
	 * @param sb              update 2019-9-5
	 */
	public static void saveFile(String strFileFullName, StringBuilder sb) throws Exception {
		mkDirs(getFilePath(strFileFullName));
		saveFile(strFileFullName, sb.toString());
	}

	/**
	 * @category 确定已经下载了的文件大小
	 * @param pathAndFile
	 * @return
	 */
	public static long FileSize(String pathAndFile) {
		File file = new File(pathAndFile);
		return file.length();
	}

	/**
	 * @todo 删除文件
	 * @param in_Path     String
	 * @param arrFileList ArrayList
	 * @throws Exception
	 */
	public static void delFile(String in_Path, ArrayList<String> arrFileList) throws Exception {
		for (int i = 0; i < arrFileList.size(); i++) {
			String sFile = arrFileList.get(i);
			File delFile = new File(sFile);
			delFile.delete();
		}
	}

	/**
	 * 
	 * @category @author
	 * @param strFileName
	 * @throws Exception update 2020年4月16日
	 */
	public static void checkPath(String strFileName) throws Exception {
		File oldFile = new File(strFileName);
		if (!oldFile.exists()) {
			throw new Exception(strFileName + ":is not exist");
		}
		if (!oldFile.isDirectory()) {
			throw new Exception(strFileName + ":is not a file");
		}
	}

	/**
	 * 
	 * @category 当前路径
	 * @return
	 * @throws IOException
	 * @author wupf
	 * @Date :2020年9月30日下午11:08:28
	 */
	public static String getCurrentPath() throws IOException {
		File directory = new File("");// 参数为空
		return directory.getCanonicalPath();
	}

	/**
	 * Scans a set of directories
	 *
	 * @param roots    Directories to scan
	 * @param includes
	 * @param excludes
	 * @return
	 */
	public static List<File> scan(List<String> roots, String[] includes, String[] excludes) {
		List<File> files = new ArrayList<File>();
		for (String root : roots) {
			files.addAll(scan(new File(root), includes, excludes));
		}
		return files;
	}

	/**
	 * Scans a single directory
	 *
	 * @param root     Directory to scan
	 * @param includes
	 * @param excludes
	 * @return
	 */
	public static List<File> scan(File root, String[] includes, String[] excludes) {
		List<File> files = new ArrayList<File>();
		if (!root.exists()) {
			return files;
		}

		final DirectoryScanner directoryScanner = new DirectoryScanner();
		directoryScanner.setIncludes(includes);
		directoryScanner.setExcludes(excludes);
		directoryScanner.setBasedir(root);
		directoryScanner.scan();

		for (final String fileName : directoryScanner.getIncludedFiles()) {
			files.add(new File(root, fileName));
		}

		return files;
	}

	/**
	 * 
	 * @category @author
	 * @param sFileName
	 * @return update 2020年3月26日
	 */
	public static long getFileSize(String sFileName) {
		File file = new File(sFileName);
		if (!file.exists() || !file.isFile()) {
			return -1;
		}
		return file.length();
	}

	/**
	 * 
	 * @category @author
	 * @param sFileName
	 * @return update 2020年4月16日
	 */
	public static String getFileDate(String sFileName) {
		File fpath = new File(sFileName);
		long timeStamp = fpath.lastModified();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String tsForm = formatter.format(new Date(timeStamp));
		// LOGGER.debug(tsForm);
		return tsForm;
	}

	/**
	 * @category 保存文件
	 * @param strFileFullName
	 * @param sb              update 2020-2-25
	 */
	public static void saveFile(String strFileFullName, List<String> strList, String strEncoding)throws Exception {

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strList.size(); i++) {
			sb.append(strList.get(i)).append(JpfSysInfoUtil.LINE_SEPARATOR);
		}
		saveFile(strFileFullName, sb.toString(), strEncoding);
	}

	/**
	 * 
	 * @category 功能
	 * @param strFileFullName
	 * @param JavaFileTexts
	 * @param strEncoding
	 * @author wupf
	 * @Date :2021年3月25日上午11:38:38
	 */
	public static void saveFile(String strFileFullName, String[] JavaFileTexts, String strEncoding)throws Exception {

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < JavaFileTexts.length; i++) {
			sb.append(JavaFileTexts[i]).append(JpfSysInfoUtil.LINE_SEPARATOR);
		}
		saveFile(strFileFullName, sb.toString(), strEncoding);
	}

	/**
	 * 
	 * @category @author
	 * @param FileName
	 * @param strEncode
	 * @return
	 * @throws Exception update 2020年4月16日
	 */
	public static String getFileTxt2(String strFileName) throws Exception {

		logger.debug(strFileName);
		if (null == strFileName || 0 == strFileName.trim().length()) {
			return "";
		}
		File f = new File(strFileName);
		String encoding = "UTF-8";
		Long filelength = f.length();
		byte[] filecontent = new byte[filelength.intValue()];
		FileInputStream in = null;
		try {
			in = new FileInputStream(f);
			in.read(filecontent);
		} catch (Exception e) {
			logger.error(e);
			throw e;
		} finally {
			JpfCloseUtil.close(in);
		}

		return new String(filecontent, encoding);

	}

	/**
	 * 
	 * @category @author
	 * @param FileName
	 * @param strChat
	 * @return
	 * @throws Exception update 2020年4月16日
	 */
	public static List<String> getFileTxt2List(String strFileName, String strEncode) throws Exception {

		List<String> mList = new ArrayList<String>();
		if (null == strFileName || 0 == strFileName.trim().length()) {
			return mList;
		}
		File f = new File(strFileName);
		if (!f.exists()) {

			return mList;
		}
		FileInputStream in = null;
		BufferedReader br = null;
		try {

			in = new FileInputStream(f);
			// 指定读取文件时以UTF-8的格式读取
			if (strEncode.length() > 0) {
				strEncode = Charset.defaultCharset().name();
			}
			br = new BufferedReader(new InputStreamReader(in, strEncode));

			String line = br.readLine();
			while (line != null) {
				mList.add(line);
				line = br.readLine();
			}
		} finally {
			JpfCloseUtil.close(br);
			JpfCloseUtil.close(in);
		}
		return mList;
	}
	
	/**
	 * @todo 拷贝文件
	 * @param in_Path     String
	 * @param arrFileList ArrayList
	 * @throws Exception
	 */
	public static void copyFile(String new_Path, String old_Path, List<String> arrFileList) throws Exception {
		if (arrFileList == null || arrFileList.size() == 0) {
			throw new Exception("待处理的文件列表为空。");
		}

		for (int i = 0; i < arrFileList.size(); i++) {
			String sFile = old_Path + arrFileList.get(i);
			// int bytesum=0;
			int byteread = 0;
			File oldFile = new File(sFile);
			if (oldFile.exists()) {
				FileInputStream inStream = null;
				FileOutputStream outStream = null;
				try {

					inStream = new FileInputStream(oldFile);
					String m_FileName = new_Path + arrFileList.get(i);
					outStream = new FileOutputStream(m_FileName);
					byte[] buf = new byte[1024];
					while ((byteread = inStream.read(buf)) != -1) {
						// bytesum+=byteread;
						outStream.write(buf, 0, byteread);
					}

					outStream.flush();
				} finally {
					JpfCloseUtil.close(outStream);
					JpfCloseUtil.close(inStream);
				}
			}
		}
	}

	/**
	 * 
	 * @category @author
	 * @param strFileName
	 * @throws Exception update 2020年4月16日
	 */
	public static void checkFile(String strFileName) throws Exception {
		File oldFile = new File(strFileName);
		if (!oldFile.exists()) {
			throw new Exception(strFileName + ":is not exist");
		}
		if (!oldFile.isFile()) {
			throw new Exception(strFileName + ":is not a file");
		}
	}

	/**
	 * 
	 * @category @author
	 * @param strFileName
	 * @return
	 * @throws Exception update 2020年4月16日
	 */
	public static boolean isEmptyFile(String strFileName) throws Exception {
		File f = new File(strFileName);
		if (f.exists() && f.isFile() && 0 == f.length()) {
			return true;
		}
		return false;
	}

	/**
	 * @category 移除指定文件类型
	 * @param v
	 * @param inFileType
	 * @throws Exception update 2020年3月15日
	 */
	public static void removeFilesByType(Vector<String> v, String inFileType) throws Exception {
		String strFileName = "";
		for (int i = v.size() - 1; i >= 0; i--) {
			strFileName = v.get(i);
			if (strFileName.toLowerCase().endsWith("." + inFileType.toLowerCase())) {
				v.remove(i);
			}
		}
	}

	/**
	 * @category 保留指定文件类型
	 * @param v
	 * @param inFileType
	 * @throws Exception update 2020年3月15日
	 */
	public static void keepFilesByType(Vector<String> v, String inFileType) throws Exception {
		String strFileName = "";
		for (int i = v.size() - 1; i >= 0; i--) {
			strFileName = v.get(i);
			if (!strFileName.toLowerCase().endsWith("." + inFileType.toLowerCase())) {
				v.remove(i);
			}
		}
	}

	/**
	 * 
	 * @category 复制文件目录
	 * @author
	 * @param src
	 * @param des
	 * @throws Exception update 2020年3月18日
	 */
	public static void copyDir(String src, String des) throws Exception {
		try {
			File file1 = new File(src);
			File[] fs = file1.listFiles();
			File file2 = new File(des);
			if (!file2.exists()) {
				file2.mkdirs();
			}
			if (!file1.exists()) {
				return;
			}
			for (File f : fs) {
				if (f.isFile()) {
					// fileCopy(f.getPath(),des+"\\"+f.getName()); //调用文件拷贝的方法
					copyFile(des + FileSep + f.getName(), f.getPath());
				} else if (f.isDirectory()) {
					copyDir(f.getPath(), des + FileSep + f.getName());
				}
			}
		} catch (Exception ex) {
			// TODO: handle exception
			logger.error("src=" + src, ex);
			logger.error("des=" + des, ex);
			throw ex;
		}
	}

	/**
	 * 
	 * @param destDirName
	 * @return Author:wupf 2020年3月16日
	 *
	 */
	public static void createDir(String destDirName) throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug("createDir:" + destDirName);
		}
		File dir = new File(destDirName);
		com.google.common.io.Files.createParentDirs(dir);
	}



	/**
	 * @category 功能
	 * @param strStorePath
	 * @return
	 * @author wupf
	 * @Date :2021年5月10日下午8:00:49 
	 */
	public static String getStandPath(String strStorePath) {

		File f = new File(strStorePath);
		return f.getAbsolutePath();
	}
	
	public static final String CR_LF_UNIX = "\n";
	public static final String CR_LF_WIN = "\r\n";

	public static final String DEFAULT_CHARSET = "utf-8";
	public final static String FileSep = java.io.File.separator;

	/**
	 * The Unix separator character.
	 */
	public static final char UNIX_SEPARATOR = '/';

	/**
	 * The Windows separator character.
	 */
	public static final char WINDOWS_SEPARATOR = '\\';

	public static String getFileSeparator() {
		return System.getProperty("file.separator");
	}

	/**
	 * 
	 * @category 获取SRC/MAIN/JAVA路径
	 * @return
	 * @author wupf
	 * @Date :2020年8月10日下午12:55:34
	 */
	public static String getSrcMainJavaPath(final String strPomPath) {
		return joinPath(strPomPath, JpfConst.SRC_MAIN_JAVA_PATH);
	}

	/**
	 * 
	 * @category 功能
	 * @param strKey
	 * @param strPomPath
	 * @return
	 * @author wupf
	 * @Date :2021年10月16日下午6:48:24
	 */
	public static String getUsrHome(final String strKey, final String strPomPath) {

		return joinPath(System.getProperty("user.home"), strKey, getFileLastPath(strPomPath));
	}

	/**
	 * @category 确定文件是否已经下载，但没有下载完成
	 * @param pathAndFile
	 * @return
	 */
	public static boolean isFileExist(String pathAndFile) {
		if (pathAndFile == null) {
			return false;
		}
		File file = new File(pathAndFile);
		if (file.exists())
			return true;
		else
			return false;
	}

	/**
	 * 
	 * @author wupf@
	 * @param strPath1
	 * @param strPath2
	 * @return 2020年3月21日
	 */
	public static String joinPath(String strPath1, String strPath2) {
		if (strPath1.endsWith(FileSep)) {
			if (strPath2.startsWith(FileSep)) {
				return strPath1 + strPath2.substring(1, strPath2.length());
			} else {
				return strPath1 + strPath2;
			}
		}

		if (strPath2.startsWith(FileSep)) {
			return strPath1 + strPath2;
		} else {
			return strPath1 + FileSep + strPath2;
		}

	}

	/**
	 * 
	 * @category 拼接文件名称
	 * @param strPath1
	 * @param strPath2
	 * @param strPath3
	 * @return
	 * @author wupf
	 * @Date :2020年10月10日上午10:10:17
	 */
	public static String joinPath(String strPath1, String strPath2, String strPath3) {
		return joinPath(joinPath(strPath1, strPath2), strPath3);
	}

	public static String joinPath(String strPath1, String strPath2, String strPath3, String strPath4) {
		return joinPath(joinPath(joinPath(strPath1, strPath2), strPath3), strPath4);
	}

	/**
	 * @category 根据文件名称过滤
	 * @param inFilePath
	 * @param v
	 * @param strFileType
	 */
	public static void getFiles(String inFilePath, Vector<String> v, String strFileType) throws Exception {
		MyFilter cMyFilter = new MyFilter(strFileType);
		getFilesWithFilter(inFilePath, v, cMyFilter);
	}

	/**
	 * 
	 * @category 确定文件是否已经下载，但没有下载完成
	 * @author
	 * @param filePath
	 * @param fileName
	 * @return update 2020年12月25日
	 */
	public static String isFileExist(String filePath, String fileName) {

		String strResult = null;
		try {
			Vector<String> vFiles = new Vector<String>();
			getFiles(filePath, vFiles);

			for (int i = 0; i < vFiles.size(); i++) {
				if (getFileName(vFiles.get(i)).equalsIgnoreCase(fileName)) {
					strResult = vFiles.get(i);
					break;
				}
			}
			vFiles.clear();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return strResult;
	}

	/**
	 * @todo:获取一个目录下所有文件
	 * @param inFilePath
	 * @param v          update 2019-8-13
	 */
	public static void getFiles(String inFilePath, Vector<String> v) throws Exception {
		// String strFile = "";
		try {
			File f1 = new File(inFilePath);
			if (f1.isDirectory()) {
				File[] f2 = f1.listFiles();
				if (f2 != null) {
					for (int i = 0; i < f2.length; i++) {
						// strFile = f2[i].toString();

						if (f2[i].isDirectory()) {
							getFiles(f2[i].toString(), v);
						} else {
							v.add(f2[i].toString());
						}

					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * 
	 * @category @author
	 * @param sFilePathName
	 * @return update 2020年4月16日
	 */
	public static String getFileName(String sFilePathName) {

		if (sFilePathName == null) {
			return null;
		}

		final int index = indexOfLastSeparator(sFilePathName);
		return sFilePathName.substring(index + 1);

	}

	public static int indexOfLastSeparator(final String filename) {
		if (filename == null) {
			return 0;
		}
		final int lastUnixPos = filename.lastIndexOf(UNIX_SEPARATOR);
		final int lastWindowsPos = filename.lastIndexOf(WINDOWS_SEPARATOR);
		return Math.max(lastUnixPos, lastWindowsPos);
	}

	/**
	 * 
	 * @category 功能
	 * @param inFilePath
	 * @param v
	 * @param cMyFilter
	 * @throws Exception
	 * @author wupf
	 * @Date :2021年4月25日下午1:02:36
	 */
	public static void getFilesWithFilter(String inFilePath, Vector<String> v, MyFilter cMyFilter) throws Exception {
		String strFile = "";
		try {
			File f1 = new File(inFilePath);
			if (f1.isDirectory()) {
				File[] f2 = f1.listFiles(cMyFilter);
				if (f2 != null) {
					for (int i = 0; i < f2.length; i++) {

						strFile = f2[i].toString();

						if (f2[i].isDirectory()) {
							getFilesWithFilter(f2[i].toString(), v, cMyFilter);
						} else {
							// System.out.println(strFile);
							v.add(f2[i].toString());
						}

					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * 
	 * @category 功能
	 * @param strTestFileName
	 * @throws Exception
	 * @author wupf
	 * @Date :2021年11月2日下午10:29:07
	 */
	public static void mkDirs(String strTestFileName) throws Exception {
		// System.out.println(strTestFileName);
		strTestFileName = getFilePath(strTestFileName);
		// System.out.println(strTestFileName);
		File fp = new File(strTestFileName);
		// 创建目录
		if (!fp.exists()) {
			fp.mkdirs();
		}

	}

	/**
	 * 
	 * @param strTestFileName
	 */
	public static void mkDirs2(String strTestFileName) throws Exception {
		String strPath = getFilePath(strTestFileName);
		System.out.println("check file path:" + strPath);
		File fp = new File(strPath);
		// 创建目录
		if (!fp.exists()) {
			if (!fp.mkdirs()) {
				throw new IOException("mkdir fail:" + fp.getAbsolutePath());
			}
		}
		if (!fp.isDirectory()) {
			throw new IOException(fp.getAbsolutePath() + " must be a directory!");
		}
	}

	/**
	 * @category获取文件路径
	 * @param sFilePathName String
	 * @return String
	 */
	public static String getFilePath(String sFilePathName) {

		int i = sFilePathName.lastIndexOf("/");
		if (i > 0) {
			sFilePathName = sFilePathName.substring(0, i);
			return sFilePathName;
		}

		i = sFilePathName.lastIndexOf(File.separator);

		if (i > 0) {
			sFilePathName = sFilePathName.substring(0, i);
		}
		return sFilePathName;

	}

	/**
	 * @category 保存文件
	 * @param strFileFullName
	 * @param sb              update 2019-9-5
	 */
	public static void saveFile(String strFileFullName, String str) throws Exception {
		saveFile(strFileFullName, str, "UTF-8");
	}

	/**
	 * @category 保存文件
	 * @param strFileFullName
	 * @param sb              update 2019-9-5
	 */
	public static void saveFile(String strFileFullName, String str, String strEncoding) throws Exception {
		FileOutputStream fout = null;
		OutputStreamWriter osw = null;
		try {

			mkDirs(strFileFullName);

			fout = new FileOutputStream(strFileFullName);
			osw = new OutputStreamWriter(fout, strEncoding);
			osw.write(str);
			osw.flush();

		} catch (Exception e) {
			throw e;
		} finally {
			JpfCloseUtil.close(osw);
			JpfCloseUtil.close(fout);
		}
	}


	/**
	 * 
	 * @category @author
	 * @param strInput
	 * @return update 2020年9月29日
	 */
	public static boolean isDirectory(String strInput) {
		File file = new File(strInput);
		if (file.exists() && file.isDirectory()) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @category @author
	 * @param dir
	 * @param name
	 * @return update 2020年9月29日
	 */
	public static boolean isFile(File dir, String name) {
		File file = new File(dir.getAbsolutePath() + java.io.File.separator + name);
		if (file.exists() && file.isFile()) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @category 功能
	 * @param name
	 * @return
	 * @author wupf
	 * @Date :2021年10月12日下午5:05:07
	 */
	public static boolean isFile(String name) {
		File file = new File(name);
		if (file.exists() && file.isFile()) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @category 功能
	 * @param oldPath
	 * @param newPath
	 * @throws Exception
	 * @author wupf
	 * @Date :2021年5月19日下午5:44:57
	 */
	public static void rename(String oldPath, String newPath) throws Exception {
		try {
			mkDirs(newPath);
			File fDesc = new File(newPath);
			File fSource = new File(oldPath);
			fSource.renameTo(fDesc);
		} catch (Exception ex) {

			throw ex;
		}
	}

	/**
	 * 
	 * @category 功能
	 * @param strPath
	 * @return
	 * @author wupf
	 * @Date :2021年10月14日下午6:06:43
	 */
	public static String removeFileSep(String strPath) {
		if (strPath == null || strPath.trim().length() == 0) {
			return strPath;
		}
		if (strPath.endsWith(FileSep)) {
			return strPath.substring(0, strPath.length() - 1);
		}
		return strPath;
	}

	/**
	 * 
	 * @category 功能
	 * @param in_FileName
	 * @throws Exception
	 * @author wupf
	 * @Date :2021年5月19日下午5:44:52
	 */
	public static void delFile(String in_FileName) throws Exception {

		File delFile = new File(in_FileName);
		if (delFile.isFile()) {
			delFile.delete();
		}
	}

	/**
	 * 
	 * @category 一定程度上强制删除
	 * @param logFile
	 * @return
	 * @author wupf
	 * @Date :2021年10月20日上午9:40:09
	 */
	public static boolean forceDelete(String logFile) {
		File file = new File(logFile);
		boolean result = file.delete();

		int tryCount = 0;

		while (!result && tryCount++ < 10) {

			System.gc(); // 回收资源

			result = file.delete();

		}

		return result;

	}

	/**
	 * 
	 * @category @author
	 * @param path update 2020年1月29日
	 */
	public static void deleteAllFilesOfDir(String path) {
		File dir = new File(path);
		if (!dir.exists())
			return;
		if (dir.isFile()) {
			dir.delete();
			return;
		}
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			deleteAllFilesOfDir(path + java.io.File.separator + files[i].getName());
		}
		dir.delete();
	}

	/**
	 * @category 功能
	 * @param sourcepath
	 * @return
	 * @author wupf
	 * @Date :2021年5月19日下午5:43:34 
	 */
	public static String getFileLastPath(String sFilePathName) {
		if (sFilePathName.endsWith(File.separator)) {
			sFilePathName = sFilePathName.substring(0, sFilePathName.length() - 1);
		}
		int i = sFilePathName.lastIndexOf(File.separator);
		if (i > 0) {
			sFilePathName = sFilePathName.substring(i + 1, sFilePathName.length());
			return sFilePathName;
		}

		i = sFilePathName.lastIndexOf("/");
		if (i > 0) {
			sFilePathName = sFilePathName.substring(i + 1, sFilePathName.length());
		}
		return sFilePathName;
	}

	/**
	 * 
	 * @category @author
	 * @param NewFile
	 * @param OldFile
	 * @throws Exception update 2020年4月16日
	 */
	public static void copyFile(String NewFile, String OldFile) throws Exception {
		FileInputStream inStream = null;
		FileOutputStream outStream = null;
		try {

			int byteread = 0;
			File oldFile = new File(OldFile);
			if (!oldFile.exists()) {
				throw new Exception(OldFile + ":is not exist");
			}
			if (!oldFile.isFile()) {
				throw new Exception(OldFile + ":is not a file");
			}
			// 检查目标目录是否存在
			File fNewFile = new File(NewFile);
			// 如果路径不存在,则创建
			if (!fNewFile.getParentFile().exists()) {
				fNewFile.getParentFile().mkdirs();
			}

			inStream = new FileInputStream(oldFile);
			outStream = new FileOutputStream(NewFile);
			byte[] buf = new byte[1024];
			while ((byteread = inStream.read(buf)) != -1) {
				// bytesum+=byteread;
				outStream.write(buf, 0, byteread);
			}
			outStream.flush();
		} finally {
			JpfCloseUtil.close(inStream);
			JpfCloseUtil.close(outStream);
		}
	}

	/**
	 * 
	 * @category @author
	 * @param FileName
	 * @return
	 * @throws Exception update 2020年4月16日
	 */
	public static String getFileTxt(String strFileName) throws Exception {
		return getFileTxt(strFileName, "UTF-8");
	}

	/**
	 * 
	 * @category @author
	 * @param FileName
	 * @param strEncode
	 * @return
	 * @throws Exception update 2020年4月16日
	 */
	public static String getFileTxt(String strFileName, String strEncode) throws Exception {
		if (null == strFileName || 0 == strFileName.trim().length()) {
			return "";
		}
		File f = new File(strFileName);
		if (!f.exists()) {

			return "";
		}
		// logger.info("strChat:" + strChat);
		StringBuilder sb = new StringBuilder();
		FileInputStream in = null;
		BufferedReader br = null;
		try {

			in = new FileInputStream(f);
			// 指定读取文件时以UTF-8的格式读取
			if (null == strEncode) {
				strEncode = Charset.defaultCharset().name();
			}
			// logger.info("strChat:" + strChat);
			br = new BufferedReader(new InputStreamReader(in, strEncode));

			String line = br.readLine();
			while (line != null) {
				sb.append(line).append(JpfSysInfoUtil.LINE_SEPARATOR);
				line = br.readLine();
			}
			br.close();
		} finally {
			JpfCloseUtil.close(br);
			JpfCloseUtil.close(in);
		}
		return sb.toString();
	}

	/**
	 * 
	 * @category 功能
	 * @param strFileName
	 * @param strKey
	 * @param strReplace
	 * @return
	 * @author wupf
	 * @Date :2021年12月23日下午4:11:56
	 */
	public static String reNameFileKeyStr(String strFileName, String strKey, String strReplace) {

		String strPattern = ".*\\+";
		strFileName = strFileName.replaceAll(strPattern, strReplace + "+");
		return strFileName;
	}

	/**
	 * @category @param strJavaFileName
	 * @param MinMaxPos
	 * @Author:wupf
	 * @date 2020年3月30日
	 */
	public static boolean isJavaFile(final String strJavaFileName) {
		if (!isFile(strJavaFileName)) {
			logger.info("Not a file:" + strJavaFileName);
			return false;
		}
		if (!strJavaFileName.endsWith(".java")) {
			logger.info("Not a java file:" + strJavaFileName);
			return false;
		}
		return true;
	}
}
