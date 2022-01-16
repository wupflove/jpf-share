/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.ios;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Properties;

import org.jpf.common.abstractUtil;

/**
 * @author wupf
 *
 */
public class JpfOsUtil extends abstractUtil{

	private JpfOsUtil() {
	}

	/**
	 * @category 是否是WINDOWS操作系统
	 * @return
	 */
	public static boolean isWindows() {
		String os = System.getProperty("os.name");
		// System.out.println(os);
		if (os.trim().toLowerCase().startsWith("windows")) {
			return true;
		}
		return false;
	}

	/**
	 * @category 简单获取操作系统
	 * @return
	 */
	public static String getOsName() {
		Properties prop = System.getProperties();
		return prop.getProperty("os.name");

	}

	/**
	 * @category 获取本机所有IP地址
	 * 
	 * @return
	 */
	public static String getLocalIP() {
		try {
			Enumeration allNetInterfaces = NetworkInterface.getNetworkInterfaces();
			InetAddress ip = null;
			while (allNetInterfaces.hasMoreElements()) {
				NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
				Enumeration addresses = netInterface.getInetAddresses();
				while (addresses.hasMoreElements()) {
					ip = (InetAddress) addresses.nextElement();
					if (ip != null && ip instanceof Inet4Address) {
						return ip.getHostAddress();
					}
				}
			}
		} catch (Exception e) {
			logger.error("getLocalIP",e);
		}
		return "";
	}

	/**
	 * @category 获取本机所有物理地址
	 * 
	 * @return
	 */
	public static String getMacAddress() {
		StringBuffer buf = new StringBuffer();
		try {
			Enumeration<NetworkInterface> el = NetworkInterface.getNetworkInterfaces();
			InetAddress ip = null;
			while (el.hasMoreElements()) {
				NetworkInterface ni = (NetworkInterface) el.nextElement();
				byte[] mac = ni.getHardwareAddress();
				if (mac == null || mac.length == 0)
					continue;
				Enumeration<InetAddress> nii = ni.getInetAddresses();
				while (nii.hasMoreElements()) {
					ip = nii.nextElement();
					if (ip instanceof Inet6Address)
						continue;
					if (!ip.isReachable(3000))
						continue;
					for (byte b : mac) {
						buf.append(b + "-");
						// buf.append(Integer.toHexString(b & 0xFF) + "-");
					}
					buf.append(";");
				}
			}
		} catch (Exception e) {
			logger.error("getMacAddress",e);
		}
		return buf.toString();
	}

}
