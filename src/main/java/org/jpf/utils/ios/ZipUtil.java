/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.ios;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.apache.tools.bzip2.CBZip2InputStream;
import org.apache.tools.bzip2.CBZip2OutputStream;
import org.jpf.common.abstractUtil;
import org.jpf.utils.JpfCloseUtil;

/**
 * @author wpf
 * @version 创建时间：2020年3月8日 上午11:41:20 程序的简单说明
 */

public class ZipUtil extends abstractUtil {

	/**
	 * 
	 */
	private ZipUtil() {

	}

	/**
	 * 
	 * @category 压缩
	 * @author
	 * @param str
	 * @return
	 * @throws IOException update 2020年3月18日
	 */
	public static String compress(String str) throws IOException {
		if (str == null || str.length() == 0) {
			return str;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		GZIPOutputStream gzip = new GZIPOutputStream(out);
		gzip.write(str.getBytes());
		gzip.close();
		return out.toString("ISO-8859-1");
	}

	/**
	 * 
	 * @category 解压缩
	 * @author
	 * @param str
	 * @return
	 * @throws IOException update 2020年3月18日
	 */
	public static String uncompress(String str) throws IOException {
		if (str == null || str.length() == 0) {
			return str;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
		GZIPInputStream gunzip = new GZIPInputStream(in);
		byte[] buffer = new byte[256];
		int n;
		while ((n = gunzip.read(buffer)) >= 0) {
			out.write(buffer, 0, n);
		}
		// toString()使用平台默认编码，也可以显式的指定如toString("GBK")
		return out.toString();
	}

	/***
	 * 压缩GZip
	 * 
	 * @param data
	 * @return
	 */
	public static byte[] gZip(byte[] data) {
		byte[] b = null;
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			GZIPOutputStream gzip = new GZIPOutputStream(bos);
			gzip.write(data);
			gzip.finish();
			gzip.close();
			b = bos.toByteArray();
			bos.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex);
		}
		return b;
	}

	/***
	 * 解压GZip
	 * 
	 * @param data
	 * @return
	 */
	public static byte[] unGZip(byte[] data) {
		byte[] b = null;
		try {
			ByteArrayInputStream bis = new ByteArrayInputStream(data);
			GZIPInputStream gzip = new GZIPInputStream(bis);
			byte[] buf = new byte[1024];
			int num = -1;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			while ((num = gzip.read(buf, 0, buf.length)) != -1) {
				baos.write(buf, 0, num);
			}
			b = baos.toByteArray();
			baos.flush();
			baos.close();
			gzip.close();
			bis.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex);
		}
		return b;
	}

	/***
	 * 压缩Zip
	 * 
	 * @param data
	 * @return
	 */
	public static byte[] zip(byte[] data) {
		byte[] b = null;
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ZipOutputStream zip = new ZipOutputStream(bos);
			ZipEntry entry = new ZipEntry("zip");
			entry.setSize(data.length);
			zip.putNextEntry(entry);
			zip.write(data);
			zip.closeEntry();
			zip.close();
			b = bos.toByteArray();
			bos.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex);
		}
		return b;
	}

	/***
	 * 解压Zip
	 * 
	 * @param data
	 * @return
	 */
	public static byte[] unZip(byte[] data) {
		byte[] b = null;
		ZipInputStream zip = null;
		ByteArrayInputStream bis = null;
		try {
			bis = new ByteArrayInputStream(data);
			zip = new ZipInputStream(bis);
			while (zip.getNextEntry() != null) {
				byte[] buf = new byte[1024];
				int num = -1;
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				while ((num = zip.read(buf, 0, buf.length)) != -1) {
					baos.write(buf, 0, num);
				}
				b = baos.toByteArray();
				baos.flush();
				baos.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex);
		} finally {

			JpfCloseUtil.close(zip);
			JpfCloseUtil.close(bis);
		}
		return b;
	}

	/***
	 * 压缩BZip2
	 * 
	 * @param data
	 * @return
	 */
	public static byte[] bZip2(byte[] data) {
		byte[] b = null;
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			CBZip2OutputStream bzip2 = new CBZip2OutputStream(bos);
			bzip2.write(data);
			bzip2.flush();
			bzip2.close();
			b = bos.toByteArray();
			bos.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex);
		}
		return b;
	}

	/***
	 * 解压BZip2
	 * 
	 * @param data
	 * @return
	 */
	public static byte[] unBZip2(byte[] data) {
		byte[] b = null;
		try {
			ByteArrayInputStream bis = new ByteArrayInputStream(data);
			CBZip2InputStream bzip2 = new CBZip2InputStream(bis);
			byte[] buf = new byte[1024];
			int num = -1;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			while ((num = bzip2.read(buf, 0, buf.length)) != -1) {
				baos.write(buf, 0, num);
			}
			b = baos.toByteArray();
			baos.flush();
			baos.close();
			bzip2.close();
			bis.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex);
		}
		return b;
	}

	/**
	 * 把字节数组转换成16进制字符串
	 * 
	 * @param bArray
	 * @return
	 */
	public static String bytesToHexString(byte[] bArray) {
		StringBuilder sb = new StringBuilder(bArray.length);
		String sTemp;
		for (int i = 0; i < bArray.length; i++) {
			sTemp = Integer.toHexString(0xFF & bArray[i]);
			if (sTemp.length() < 2)
				sb.append(0);
			sb.append(sTemp.toUpperCase());
		}
		return sb.toString();
	}

	/**
	 * jzlib 压缩数据
	 * 
	 * @param object
	 * @return
	 * @throws IOException
	 */
	public static byte[] jzlib(byte[] object) {
		byte[] data = null;
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			ZipOutputStream zOut = new ZipOutputStream(out);
			DataOutputStream objOut = new DataOutputStream(zOut);
			objOut.write(object);
			objOut.flush();
			zOut.close();
			data = out.toByteArray();
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
			logger.error(ex);
		}
		return data;
	}

	/**
	 * jzLib压缩的数据
	 * 
	 * @param object
	 * @return
	 * @throws IOException
	 */
	public static byte[] unjzlib(byte[] object) {
		byte[] data = null;
		ByteArrayInputStream in = null;
		ZipInputStream zIn = null;
		try {
			in = new ByteArrayInputStream(object);
			zIn = new ZipInputStream(in);
			byte[] buf = new byte[1024];
			int num = -1;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			while ((num = zIn.read(buf, 0, buf.length)) != -1) {
				baos.write(buf, 0, num);
			}
			data = baos.toByteArray();
			baos.flush();
			baos.close();
			zIn.close();

		} catch (IOException ex) {
			ex.printStackTrace();
			logger.error(ex);
		} finally {
			JpfCloseUtil.close(in);
			JpfCloseUtil.close(zIn);
		}
		return data;
	}

	/**
	 * @todo 压缩文件
	 * @param zipFileName String
	 * @param arrFileList ArrayList
	 * @throws Exception
	 */
	public static void zipFile(String zipFileName, ArrayList<String> arrFileList) throws Exception {

		if (zipFileName == null || zipFileName.trim().length() == 0) {
			throw new Exception("文件名不能为空。");
		}
		if (arrFileList == null || arrFileList.size() == 0) {
			throw new Exception("待压缩的文件列表为空。");
		}

		ZipOutputStream os = new ZipOutputStream(new FileOutputStream(zipFileName));
		byte[] buf = new byte[1024 * 1024];
		os.setLevel(9);
		try {
			for (int i = 0; i < arrFileList.size(); i++) {
				String sPathFile = arrFileList.get(i);
				FileInputStream is = null;
				String sFile = JpfFileUtil.getFileName(sPathFile);
				try {
					is = new FileInputStream(sPathFile);
					ZipEntry zEntry = new ZipEntry(sFile);
					os.putNextEntry(zEntry);
					int bFlag = -1;
					while ((bFlag = is.read(buf)) != -1) {
						os.write(buf, 0, bFlag);
					}

				} catch (Exception ex) {
					ex.printStackTrace();
					logger.error(zipFileName, ex);
					throw ex;
				} finally {
					JpfCloseUtil.close(is);
				}
			}
			os.flush();
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(zipFileName, ex);
			throw ex;
		} finally {
			JpfCloseUtil.close(os);
		}

	}

	/**
	 * @todo 压缩文件
	 * @param zipFileName String
	 * @param arrFileList String
	 * @throws Exception
	 */

	public static int zipFile(String zipFileName, String arrFileList, String in_Path) throws Exception {

		if (arrFileList == null || arrFileList.trim().length() == 0) {
			throw new Exception("待压缩的文件列表为空。");

		}
		String[] a = arrFileList.split(";");
		ArrayList<String> b = new ArrayList<String>();

		for (int i = 0; i < a.length; i++) {
			File m_file = new File(in_Path + a[i]);
			if (m_file.exists()) {
				b.add(in_Path + a[i]);
			} else {
				throw new Exception("文件不存在:" + in_Path + a[i]);
			}
		}
		if (b == null || b.size() == 0) {
			// return -2;
			throw new Exception("待压缩的文件列表为空。");
		}

		zipFile(zipFileName, b);

		return 0;
	}

}
