/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.jpf.common.abstractUtil;
import org.jpf.utils.JpfCloseUtil;
import org.jpf.utils.JpfSysInfoUtil;
import org.jpf.utils.ios.JpfOsUtil;

/**
 * 
 * @author wupf
 *
 */
public class JpfJarUtil extends abstractUtil {

	private JpfJarUtil() {
	}

	/**
	 * 
	 * @category:
	 * @Title: readFileFromJar
	 * @Author:wupf
	 * @date:2020年3月6日
	 * @param strJarName
	 * @param strFileName
	 * @return
	 */
	public static String readFileFromJar(String strJarName, String strFileName) {
		StringBuffer sb = new StringBuffer();
		JarFile currentJar = null;
		try {
			String currentJarPath = JpfJarUtil.class.getProtectionDomain().getCodeSource().getLocation().getFile();
			currentJar = new JarFile(strJarName);
			JarEntry dbEntry = currentJar.getJarEntry(strFileName);
			InputStream in = currentJar.getInputStream(dbEntry);

			// FileInputStream fis = new
			// FileInputStream(currentJarPath+"/text.properties");
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String readLine = null;
			while ((readLine = br.readLine()) != null) {
				sb.append(readLine).append(JpfSysInfoUtil.LINE_SEPARATOR);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			JpfCloseUtil.close(currentJar);
		}
		return sb.toString();
	}

	/**
	 * @category 从jar文件中读取指定目录下面的所有的class文件
	 * 
	 * @param jarPaht  jar文件存放的位置
	 * @param filePaht 指定的文件目录
	 * @return 所有的的class的对象
	 */
	public static List<String> getClasssFromJarFile(String jarPath) {
		List<String> clazzs = new ArrayList<String>();

		JarFile jarFile = null;
		try {
			jarFile = new JarFile(jarPath);

			Enumeration<JarEntry> ee = jarFile.entries();
			while (ee.hasMoreElements()) {
				JarEntry entry = ee.nextElement();
				// 过滤我们出满足我们需求的东西

				if (entry.getName().endsWith(".class")) {
					String className = entry.getName().replace('/', '.');
					className = className.substring(0, className.length() - 6);
					clazzs.add(className);
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			JpfCloseUtil.close(jarFile);
		}

		return clazzs;
	}

	/**
	 * 
	 * @category @return
	 * @Author:wupf
	 * @date 2020年3月21日
	 */
	public static String getJarConn() {
		if (JpfOsUtil.isWindows()) {
			return ";";
		}
		return ":";

	}
}
