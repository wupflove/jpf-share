/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.mlgb;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Date;
import java.util.Enumeration;

import org.jpf.utils.JpfDateTimeUtil;

/**
 * 
 * @author wupf
 *
 */
public class Mlgbz implements IMlgbz {

	/**
	 * @category 时间时间
	 * @return 
	 * @Author:wupf 2020年3月28日
	 *
	 */
	private boolean w4() {
		if (Long.parseLong(JpfDateTimeUtil.getCurrDate().replaceAll("-", ""), 23) < 6823084366L) {
			return true;
		}
		return false;
	}

	private boolean w2() {
		String p1 = w3();
		// System.out.println(p1);
		if (p1 == null) {
			return false;
		}
		if (p1.equalsIgnoreCase("5a7aa87365ba")) {
			return true;
		}
		return false;
	}

	private String w3() {
		try {
			InetAddress netAddress = InetAddress.getLocalHost();
			if (null == netAddress) {
				return null;
			}

			return netAddress.getHostName(); // get the host address
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}

	private boolean w1() {
		try {
			InetAddress ia = InetAddress.getLocalHost();
			// System.out.println(ia.getHostAddress());
			byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();
			System.out.println(mac);
			StringBuilder sb = new StringBuilder("");
			for (int i = 0; i < mac.length; i++) {

				// 字节转换为整数
				int temp = mac[i] & 0xff;
				System.out.println(temp);
				String str = Integer.toHexString(temp);
				if (str.length() == 1) {
					sb.append("0" + str);
				} else {
					sb.append(str);
				}
			}
			if (sb.toString().equalsIgnoreCase("505BC2C3DAEB")) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	private boolean w5(InetAddress ia) {
		try {
			// System.out.println(ia.getHostAddress());
			byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();

			StringBuilder sb = new StringBuilder("");
			for (int i = 0; i < mac.length; i++) {

				// 字节转换为整数
				int temp = mac[i] & 0xff;
				// logger.debug(temp);
				String str = Integer.toHexString(temp);
				// System.out.println(Integer.parseInt(str, 15));
				// logger.debug(str);

				sb.append(Integer.parseInt(str, 15));

			}
			if (sb.toString().equalsIgnoreCase("7586182183205221")) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean mlgbz1() {

		// System.out.println(w2());
		// System.out.println(w4());
		// System.out.println(getLocalIp());
		/*
		 * if (w6() && w2() && w4()) { return true; }
		 */
		if (w4()) {
			return true;
		}
		return false;
	}

	private boolean w6() {
		InetAddress ip = null;
		boolean bFindIP = false;
		Enumeration<NetworkInterface> netInterfaces = null;
		try {
			netInterfaces = (Enumeration<NetworkInterface>) NetworkInterface.getNetworkInterfaces();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		while (netInterfaces.hasMoreElements()) {

			NetworkInterface ni = (NetworkInterface) netInterfaces.nextElement();
			// ----------特定情况，可以考虑用ni.getName判断
			// 遍历所有ip
			Enumeration<InetAddress> ips = ni.getInetAddresses();
			while (ips.hasMoreElements()) {
				ip = (InetAddress) ips.nextElement();
				if (ip.isSiteLocalAddress() && !ip.isLoopbackAddress() // 127.开头的都是lookback地址
						&& ip.getHostAddress().indexOf(":") == -1) {

					// logger.debug(ip.getHostAddress());
					bFindIP = w5(ip);
					// logger.debug (bFindIP);
					if (bFindIP) {
						return true;
					}
				}
			}
		}

		return false;

	}

	public static void main(String[] args) {

		System.out.println(Long.parseLong(JpfDateTimeUtil.getCurrDate().replaceAll("-", ""), 23));

		String strDate = JpfDateTimeUtil.dateToStr(JpfDateTimeUtil.addDays(new Date(), 90), "YYYYMMdd");
		System.out.println(strDate);
		System.out.println(Long.parseLong(strDate, 23));

	}
}
