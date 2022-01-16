/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Vector;

import org.jpf.common.abstractUtil;
import org.jpf.utils.ios.JpfFileUtil;
/**
 * 
 * @author wupf
 *
 */
public class CsvUtil extends abstractUtil {

	/**
	 * @author wupf 2020年3月9日
	 */
	private CsvUtil() {

	}

	/**
	 * 
	 * @category CSV文件追加操作
	 * @author 
	 * @param strCsvFileName
	 * @param content        
	 * @Date 2020年3月29日
	 */
	public static void appendCsv(final String strCsvFileName, final String content) {

		BufferedWriter writer = null;
		try {
			// 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件

			JpfFileUtil.mkDirs(strCsvFileName);
			writer = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(strCsvFileName, true), "x-UTF-16LE-BOM"));
			writer.write(content);
			writer.flush();
		} catch (IOException ex) {
			logger.error("appendCsv error:", ex);
		} catch (Exception ex) {
			logger.error("appendCsv error:", ex);
		} finally {
			JpfCloseUtil.close(writer);
		}
	}

	/**
	 * 
	 * @param strCvsName
	 * @param sb
	 * @throws Exception
	 */
	public static void appendToCsv(String strCsvFileName, StringBuilder sb) throws Exception {
		OutputStreamWriter writer = null;
		try {
			JpfFileUtil.mkDirs(strCsvFileName);
			writer = new OutputStreamWriter(new FileOutputStream(strCsvFileName, true), "x-UTF-16LE-BOM");
			writer.write(sb.toString());
			writer.flush();

		} catch (Exception ex) {
			// TODO: handle exception

			logger.error(ex.getMessage());
			throw ex;
		} finally {
			JpfCloseUtil.close(writer);
		}

	}

	/**
	 * 
	 * @category @param strCvsName
	 * @param sb
	 * @throws Exception
	 * @Author:wupf
	 * @date 2020年3月27日
	 */
	public static void writeToCsv(String strCsvFileName, StringBuilder sb) throws Exception {
		OutputStreamWriter writer = null;
		try {
			JpfFileUtil.mkDirs(strCsvFileName);
			writer = new OutputStreamWriter(new FileOutputStream(strCsvFileName), "x-UTF-16LE-BOM");
			writer.write(sb.toString());
			writer.flush();
			sb.delete(0, sb.length());
		} catch (Exception ex) {
			logger.error("writeToCsv error:", ex);
			throw ex;
		} finally {
			JpfCloseUtil.close(writer);
		}

	}

	/**
	 * 
	 * @category 
	 * @param strCvsName
	 * @param str
	 * @throws Exception
	 * @Author:wupf
	 * @date 2020年3月27日
	 */
	public static void writeToCsv(String strCsvFileName, String str) throws Exception {
		OutputStreamWriter writer = null;
		try {
			JpfFileUtil.mkDirs(strCsvFileName);
			writer = new OutputStreamWriter(new FileOutputStream(strCsvFileName), "x-UTF-16LE-BOM");
			writer.write(str);
			writer.flush();
			str = "";
		} catch (Exception ex) {

			logger.error("writeToCsv error:", ex);
			throw ex;
		} finally {
			JpfCloseUtil.close(writer);
		}

	}

	/**
	 * 
	 * @category 写入到CVS文件
	 * @author 
	 * @param strCvsName
	 * @param vStrings
	 * @throws Exception update 2020年3月30日
	 */
	public static void writeToCsv(String strCsvFileName, Vector<String[]> vStrings) throws Exception {
		OutputStreamWriter writer = null;
		try {
			JpfFileUtil.mkDirs(strCsvFileName);
			writer = new OutputStreamWriter(new FileOutputStream(strCsvFileName), "x-UTF-16LE-BOM");

			logger.debug("记录数:" + vStrings.size());

			for (int i = 0; i < vStrings.size(); i++) {
				for (int j = 0; j < vStrings.get(i).length; j++) {
					if (0 == j) {
						writer.write(vStrings.get(i)[j]);
						writer.write("\t");
					} else {
						writer.write(vStrings.get(i)[j] + "\t");
					}
				}
				writer.write("\n");
			}
			writer.flush();
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			throw ex;
		} finally {
			JpfCloseUtil.close(writer);
		}

	}
}
