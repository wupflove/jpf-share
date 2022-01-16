/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.system;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author wupf
 */
public class JpfMachineUtil {

	/**
	 * 
	 * @category @author
	 * @return update 2020年2月19日
	 */
	public static String getProcessNo() {

		String name = ManagementFactory.getRuntimeMXBean().getName();
		return name.split("@")[0];

	}

	/**
	 * 
	 * @category @author
	 * @return update 2020年2月19日
	 */
	private static InetAddress getInetAddress() {
		try {
			return InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * 
	 * @category @author
	 * @return update 2020年2月19日
	 */
	public static String getHostIp() {

		InetAddress netAddress = getInetAddress();
		if (null == netAddress) {
			return null;
		}
		return netAddress.getHostAddress(); // get the ip address
	}

	/**
	 * 
	 * @category @author
	 * @return update 2020年2月19日
	 */
	public static String getHostName() {

		InetAddress netAddress = getInetAddress();
		if (null == netAddress) {
			return null;
		}
		return netAddress.getHostName(); // get the host address

	}

	/**
	 * 
	 * @category @author
	 * @return update 2020年2月19日
	 */
	public static String getHostDesc() {
		return getHostName() + "/" + getHostIp();
	}

	/**
	 * 
	 * @category 防止实列化
	 * @author
	 * @return update 2020年2月19日
	 */
	private JpfMachineUtil() {
	}

}
