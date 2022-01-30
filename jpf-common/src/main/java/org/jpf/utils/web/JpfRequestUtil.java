/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.web;

import javax.servlet.http.HttpServletRequest;

import org.jpf.common.abstractUtil;

/**
 * 
 * @author wupf
 *
 */
public class JpfRequestUtil extends abstractUtil {
	
	private JpfRequestUtil() {}

	/**
	 * 
	 * @category 获取web应用根路径
	 * @author 
	 * @param request
	 * @return update 2020年2月19日
	 */
	public static String getAppWebBase(HttpServletRequest request) {
		String path = request.getContextPath();
		String base = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
		return base;
	}

	/**
	 * 
	 * @param request
	 * @param strParamName
	 * @return
	 */
	@Deprecated
	public static String getStrParamter(HttpServletRequest request, String strParamName) {
		String strParamValue = "";
		Object objParamValue = request.getParameter(strParamName);
		if (null != objParamValue) {
			try {
				strParamValue = (String) objParamValue;
			} catch (Exception ex) {
				strParamValue = "";
			}
		}
		return strParamValue;

	}

	/**
	 * 
	 * @param request
	 * @param strRequest
	 * @return
	 * @throws Exception
	 */
	public static String getRequestForChinaString(HttpServletRequest request, String strRequest) throws Exception {
		try {
			String sStr = request.getParameter(strRequest);
			sStr = (sStr == null) ? "" : sStr.trim();
			return new String(sStr.getBytes("iso8859-1"), "gbk");
		} catch (Exception ex) {
		}
		return null;
	}

	/**
	 *
	 * @param request         HttpServletRequest
	 * @param strRequest      String
	 * @param strDefaultValue String
	 * @return String
	 * @throws Exception
	 */
	public static String getRequestForChinaString(HttpServletRequest request, String strRequest, String strDefaultValue)
			throws Exception {

		String sStr = request.getParameter(strRequest);
		if (sStr != null) {
			sStr = sStr.trim();
			return new String(sStr.getBytes("iso8859-1"), "gbk");
		}
		return strDefaultValue;

	}

	/**
	 * @todo REQUEST ȡint
	 * @param request    HttpServletRequest
	 * @param requestStr String
	 * @throws Exception
	 * @return String
	 */
	public static int getRequestForInt(HttpServletRequest request, String strRequest) throws Exception {
		return Integer.parseInt(request.getParameter(strRequest));
	}

	/**
	 *
	 * @param request       HttpServletRequest
	 * @param strRequest    String
	 * @param iDefaultValue int
	 * @return int
	 * @throws Exception
	 */
	public static int getRequestForInt(HttpServletRequest request, String strRequest, int iDefaultValue)
			throws Exception {
		String strTmp = request.getParameter(strRequest);
		if (strTmp != null) {
			return Integer.parseInt(strTmp);
		}
		return iDefaultValue;
	}

	/**
	 *
	 * @param request    HttpServletRequest
	 * @param strRequest String
	 * @return long
	 * @throws Exception
	 */
	public static long getRequestForLong(HttpServletRequest request, String strRequest) throws Exception {
		return Long.parseLong(request.getParameter(strRequest));
	}

	/**
	 *
	 * @param request       HttpServletRequest
	 * @param strRequest    String
	 * @param lDefaultValue long
	 * @return long
	 */
	public static long getRequestForLong(HttpServletRequest request, String strRequest, long lDefaultValue) {
		String strTmp = request.getParameter(strRequest);
		if (strTmp != null) {
			return Long.parseLong(strTmp);
		}
		return lDefaultValue;
	}

	/**
	 * @todo REQUEST ȡdouble
	 * @param request    HttpServletRequest
	 * @param requestStr String
	 * @throws Exception
	 * @return String
	 */
	public static double getRequestForDouble(HttpServletRequest request, String strRequest) throws Exception {
		return Double.parseDouble(request.getParameter(strRequest));
	}

}
