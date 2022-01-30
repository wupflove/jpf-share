/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author wupf
 *
 */
public class JpfIpUtil {

	private JpfIpUtil() {}
	/**
	 * 获取ip地址
	 * @param request HttpServletRequest
	 * @return string
     */
	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		//cast localhost
		if("0:0:0:0:0:0:0:1".equals(ip)){
			ip = "127.0.0.1";
		}
		return ip;
	}
}
