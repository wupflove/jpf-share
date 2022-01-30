/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.conf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.jpf.utils.JpfCloseUtil;
import org.jpf.utils.ios.JpfFileUtil;


/**
 * 
 * @author wupf
 *
 */
public class JpfPropertiesUtil  {

	private JpfPropertiesUtil() {
	}

	/**
	 * 
	 * @category 功能
	 * @param key
	 * @return
	 * @author wupf
	 * @Date :2021年4月28日下午1:49:53
	 */
	public static String key(final  String key) {
		return System.getProperty(key);
	}

	/**
	 * 
	 * @category 功能
	 * @param strFileName
	 * @param strKey
	 * @return
	 * @author wupf
	 * @Date :2021年4月28日下午1:49:50
	 */
	public static String GetValueByKey(final String strFileName, final String strKey) {
		try {
			Properties property = new Properties();
			property.load(new FileInputStream(strFileName));
			return property.getProperty(strKey, "");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	/**
	 * 
	 * @category
	 * @param strFileName
	 * @return
	 * @throws IOException
	 * @Author:wupf
	 * @date 2020年9月17日
	 */
	public static Map<String, String> GetAllProperties(final String strFileName) throws IOException {

		Properties property = new Properties();
		property.load(new FileInputStream(strFileName));
		Enumeration en = property.propertyNames();
		Map<String, String> mMap = new HashMap<String, String>();
		while (en.hasMoreElements()) {
			String strKey = (String) en.nextElement();
			String strValue = property.getProperty(strKey);
			mMap.put(strKey, strValue);
		}

		return mMap;
	}

	/**
	 * 
	 * @param filePath
	 * @param pKey
	 * @param pValue
	 * @throws IOException
	 */
	public static void WriteProperties(final String filePath, final String pKey, final String pValue)
			throws IOException {
		Properties props = new Properties();

		props.load(new FileInputStream(filePath));

		OutputStream fos = new FileOutputStream(filePath);
		props.setProperty(pKey, pValue);

		props.store(fos, "Update '" + pKey + "' value");

	}

	private static String getPropFileName(final String strPomPath,final String key,final String PropFileName) {
		return JpfFileUtil.joinPath(System.getProperty("user.home"), key,
				JpfFileUtil.getFileLastPath(strPomPath), PropFileName);

	}

	/**
	 * 
	 * @param filePath
	 * @param pKey
	 * @param pValue
	 * @throws IOException
	 */
	public static void WriteProperties(final String strPomPath,final String key,final String PropFileName, Map<String,String> map) throws IOException {

		Properties props = new Properties();

		String strPropFileName = getPropFileName(strPomPath,key,PropFileName);

		if (!JpfFileUtil.isFileExist(strPropFileName)) {
			createPropFile(strPropFileName);
		}
		props.load(new FileInputStream(strPropFileName));

		OutputStream fos = new FileOutputStream(strPropFileName);
		
		for(String pKey:map.keySet())
		{
			props.setProperty(pKey, map.get(pKey));
		}

		props.store(fos, "Update value");

	}
	
	/**
	 * 
	 * @param filePath
	 * @param pKey
	 * @param pValue
	 * @throws IOException
	 */
	public static void WriteProperties(final String strPomPath,final String key,final String PropFileName, final String pKey, final String pValue) throws IOException {

		Properties props = new Properties();

		String strPropFileName = getPropFileName(strPomPath,key,PropFileName);

		if (!JpfFileUtil.isFileExist(strPropFileName)) {
			createPropFile(strPropFileName);
		}
		props.load(new FileInputStream(strPropFileName));

		OutputStream fos = new FileOutputStream(strPropFileName);
		props.setProperty(pKey, pValue);

		props.store(fos, "Update '" + pKey + "' value");

	}

	/**
	 * 
	 * @category @param strFileName
	 * @since 2020年1月4日
	 * @author wupf
	 */
	private static void createPropFile(final String strFileName) {
		FileWriter fw = null;
		try {
			JpfFileUtil.mkDirs(strFileName);
			File file = new File(strFileName);
			if (file.exists()) {
				return;
			}
			fw = new FileWriter(file);
			fw.write("");
			fw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JpfCloseUtil.close(fw);
		}
	}

	/**
	 * 
	 * @category 功能
	 * @param strPomPath
	 * @return
	 * @throws IOException
	 * @author wupf
	 * @Date :2021年11月8日下午4:05:24
	 */
	public Map<String, String> getAllProperties(final String strPomPath,final String key,final String PropFileName) throws IOException {

		Properties property = new Properties();

		String strPropFileName = getPropFileName(strPomPath,key,PropFileName);
		property.load(new FileInputStream(strPropFileName));
		Enumeration en = property.propertyNames();
		Map<String, String> mMap = new HashMap<String, String>();
		while (en.hasMoreElements()) {
			String strKey = (String) en.nextElement();
			String strValue = property.getProperty(strKey);
			mMap.put(strKey, strValue);
		}

		return mMap;
	}
	
	/**
	 * 
	 * @category 功能
	 * @param strPomPath
	 * @param key
	 * @return
	 * @throws IOException
	 * @author wupf
	 * @Date :2021年11月8日下午4:43:57
	 */
	public String getProperties(final String strPomPath,final String key,final String PropFileName,final String propKey) throws IOException {

		Properties property = new Properties();

		String strPropFileName = getPropFileName(strPomPath,key,PropFileName);
		
		if (!JpfFileUtil.isFileExist(strPropFileName))
		{
			return null;
		}
		property.load(new FileInputStream(strPropFileName));
		Enumeration en = property.propertyNames();

		while (en.hasMoreElements()) {
			String strKey = (String) en.nextElement();
			if (strKey.equalsIgnoreCase(propKey))
			{
				return property.getProperty(strKey);
			}
		}

		return null;
	}
}
