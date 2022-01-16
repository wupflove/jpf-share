/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.web;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jpf.common.abstractUtil;

/**
 * 
 * @author wupf
 *
 */
public class JpfUrlUtil extends abstractUtil {
	
	private JpfUrlUtil() {}
	private static final String URLOUTRIGHTSTR = "#";
	private static final String URLOUTLEFTSTR = "http://";

	// private static final String URLKEYSTR = "?";

	public static String getUrlName(String m_url) {
		if (m_url.endsWith(URLOUTRIGHTSTR)) {
			m_url = m_url.substring(0, m_url.length() - URLOUTRIGHTSTR.length());
		}
		if (m_url.substring(0, URLOUTLEFTSTR.length()).equalsIgnoreCase(URLOUTLEFTSTR)) {
			m_url = m_url.substring(URLOUTLEFTSTR.length(), m_url.length());
		}

		int i = m_url.indexOf("/");
		m_url = m_url.substring(i);

		return m_url;
	}

	/**
	 * 功能：检测当前URL是否可连接或是否有效
	 * @param urlStr
	 *            指定URL网络地址
	 * @author 谭亮
	 * @version 创建时间：2020年1月19日 下午1:24:47 
	 * @return URL
	 */
	public static boolean isConnect(String urlIndex) {

		if (urlIndex == null || urlIndex.length() <= 0) {
			return false;
		}

		try {
			URL url = new URL(urlIndex);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			if (con.getResponseCode() == 200) {
				logger.info("URL可用！");
				return true;
			}
		} catch (Exception ex) {
			// ex.printStackTrace();
			logger.error("URL不可用！");
		}

		return false;
	}

	/**
	 * @category 在URL中取出第三个‘/’之前的地址
	 * @author 谭亮
	 * @version 创建时间：2020年1月19日 下午1:24:47 
	 * @return urlIndex
	 * 
	 */
	public static String getUrlIndex(String pdmurl) {
		int count = 0, s = 0;
		char arr[] = pdmurl.toCharArray();
		for (int k = 0; k < pdmurl.length(); k++) {
			if (arr[k] == '/')
				count++;
			if (count == 3) {
				s = k;
				break;
			}
		}
		String urlIndex = pdmurl.substring(0, s);
		return urlIndex;
	}

	/**
	 * 
	 * @category  通过正则获取根域名程序
	 * @author  
	 * @param url
	 * @return
	 * update 2020年2月19日
	 */
	public static String getRootDomain(String url) {
		String domain = "";
		Pattern pattern = Pattern
				.compile("[\\w-]+\\.(com.cn|net.cn|gov.cn|org.cn|com|net|org|gov|cc|biz|info|cn|co)\\b()*");
		Matcher matcher = pattern.matcher(url);
		if (matcher.find()) {
			domain = matcher.group();
		}
		if (domain == null || domain.trim().equals(""))
			return null;
		else {
			return domain;
		}
	}
}
