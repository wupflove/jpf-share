/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils;

import java.util.List;
import java.util.Map;

import org.jpf.common.abstractUtil;
import org.jpf.utils.ga.MapUtil;

/**
 * 
 * @author wupf
 *
 */
public class JpfPrintClass extends abstractUtil {
	
	private JpfPrintClass() {}
	/**
	 * 
	 * @category @param strData
	 * @Author:wupf
	 * @date 2020年3月15日
	 */
	public static void printArray(Object[][] strData) {
		System.out.println(strData.length);
		System.out.println(strData[0].length);
		for (int i = 0; i < strData.length; i++) {
			if (strData[i] == null) {
				continue;
			}
			for (int j = 0; j < strData[i].length; j++) {
				System.out.print(strData[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

	/**
	 * 
	 * @category @param strData
	 * @Author:wupf
	 * @date 2020年3月15日
	 */
	public  static void printArray(Object[] strData) {
		System.out.println("strData length=" + strData.length);
		for (int i = 0; i < strData.length; i++) {
			System.out.println(strData[i]);
		}
		System.out.println("\n");

	}

	/**
	 * 
	 * @category 打印list
	 * @param mList
	 * @Author:wupf
	 * @date 2020年3月15日
	 */
	public static void printList(List mList) {
		// System.out.println("printList size=" + mList.size());
		if (logger.isDebugEnabled()) {
			for (int i = 0; i < mList.size(); i++) {
				logger.debug(mList.get(i) + " ");
			}
		}
	}

	/**
	 * 
	 * @category @param mList
	 * @return
	 * @Author:wupf
	 * @date 2020年3月5日
	 */
	public static String List2String(List mList) {
		return List2String(mList, " ");
	}

	/**
	 * 
	 * @category @param mList
	 * @param strSepChar
	 * @return
	 * @Author:wupf
	 * @date 2020年3月5日
	 */
	public static String List2String(List mList, String strSepChar) {
		StringBuilder sb = new StringBuilder();
		if (mList == null) {
			return "";
		}
		if (mList.size() == 0) {
			return "";
		}
		for (int i = 0; i < mList.size() - 1; i++) {
			sb.append(mList.get(i) + strSepChar);
		}

		sb.append(mList.get(mList.size() - 1));
		return sb.toString();
	}

	/**
	 * 
	 * @category @param map
	 * @Author:wupf
	 * @date 2020年3月7日
	 */
	public static void printMap(Map map) {
		MapUtil.getInstance().cycle1(map);
	}

}
