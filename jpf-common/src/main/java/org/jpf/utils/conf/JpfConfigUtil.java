/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.conf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.jpf.common.abstractUtil;
import org.jpf.utils.JpfCloseUtil;
import org.jpf.utils.JpfStringUtil;
import org.jpf.utils.ios.JpfFileUtil;

/**
 * 
 * @author wupf
 *
 */
public class JpfConfigUtil extends abstractUtil {

	private JpfConfigUtil() {
	}

	/**
	 * 
	 * @category:
	 * @Title: getStrFromConfig
	 * @Author:wupf@
	 * @date:2020年3月15日
	 * @param strFileName
	 * @param strKey
	 * @return
	 */
	public static String getStrFromConfig(String strFileName, String strKey) {
		try {
			Properties property = new Properties();
			property.load(new FileInputStream(strFileName));
			return property.getProperty(strKey, "");
		} catch (FileNotFoundException e) {
			logger.error("FileNotFoundException:" + strFileName);
			e.printStackTrace();
		} catch (Exception ex) {
			logger.error(strFileName, ex);
			ex.printStackTrace();
		}
		return "";
	}

	/**
	 * 
	 * @category:
	 * @Title: getStrFromConfigWithException
	 * @Author:wupf@
	 * @date:2020年3月15日
	 * @param strFileName
	 * @param strKey
	 * @return
	 * @throws Exception
	 */
	public static String getStrFromConfigWithException(String strFileName, String strKey) throws Exception {
		Properties property = new Properties();
		JpfFileUtil.checkFile(strFileName);
		property.load(new FileInputStream(strFileName));
		String m_str = property.getProperty(strKey);
		if (m_str == null || "".equalsIgnoreCase(m_str)) {
			throw new Exception("not find value for :" + strKey);
		}
		return m_str;
	}

	/**
	 * 
	 * @category:
	 * @Title: getStrFromConfig
	 * @Author:wupf@
	 * @date:2020年3月15日
	 * @param strFileName
	 * @param sKey
	 * @param sDefaultValue
	 * @return
	 */
	public static String getStrFromConfig(String strFileName, String sKey, String sDefaultValue) {
		String m_str = getStrFromConfig(strFileName, sKey);
		if (null == m_str || "".equals(m_str)) {
			logger.warn("not find value for :" + sKey);
			return sDefaultValue;
		} else {
			return m_str;
		}
	}

	/**
	 * 
	 * @category:
	 * @Title: getIntFromConfig
	 * @Author:wupf@
	 * @date:2020年3月15日
	 * @param strFileName
	 * @param sKey
	 * @param sDefaultValue
	 * @return
	 */
	public static int getIntFromConfig(String strFileName, String sKey, int sDefaultValue) {
		String m_str = getStrFromConfig(strFileName, sKey);
		if (null == m_str || "".equals(m_str)) {
			logger.warn("not find value for :" + sKey);
			return sDefaultValue;
		} else {
			int i = JpfStringUtil.getStrToInt(m_str);
			if (i < sDefaultValue) {
				logger.warn("not find value for :" + sKey);
				return sDefaultValue;
			} else {
				return i;
			}
		}
	}

	/**
	 * 
	 * @category:
	 * @Title: getIntFromConfig
	 * @Author:wupf@
	 * @date:2020年3月15日
	 * @param strFileName
	 * @param sKey
	 * @return
	 */
	public static int getIntFromConfig(String strFileName, String sKey) {
		String m_str = getStrFromConfig(strFileName, sKey);
		if (null == m_str || "".equals(m_str)) {
			logger.warn(sKey + "");
			return -1;
		} else {
			return JpfStringUtil.getStrToInt(m_str);
		}
	}

	/**
	 * 
	 * @category:
	 * @Title: saveFile
	 * @Author:wupf@
	 * @date:2020年3月15日
	 * @param fileName
	 * @param description
	 * @param strItems
	 * @throws Exception
	 */
	public static void saveToPropFile(String fileName, String description, String strItems) throws Exception {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(fileName);
			Properties config = new Properties();
			String[] strKeyValue = strItems.split(";");
			for (int i = 0; i < strKeyValue.length; i++) {
				String[] strItem = strKeyValue[i].split("=");
				config.setProperty(strItem[0], strItem[1]);
			}
			config.store(fout, description);
			fout.close();
		} catch (IOException ex) {
			throw new Exception("IOException:" + fileName);
		} finally {
			JpfCloseUtil.close(fout);
		}
	}
}
