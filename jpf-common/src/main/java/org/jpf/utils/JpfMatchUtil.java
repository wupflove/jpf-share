/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author wupf
 *
 */
public class JpfMatchUtil  {
	private final static Logger logger = LoggerFactory.getLogger(JpfMatchUtil.class);
	/**
	 * 
	 */
	private JpfMatchUtil() {

	}


	/**
	 * 
	 * @category 功能
	 * @param strA
	 * @param strB
	 * @return
	 * @author wupf
	 * @Date :2020年4月28日上午7:21:08
	 */
	public static boolean wildcardMatch2(String strA, String strB) {
		// String strA="SpringApplicationcontextUtilRTesta.java";
		// String strB="SpringApplicationcontextUtil.?Test[0-9]*.java";
		Pattern pattern = Pattern.compile(strA);
		Matcher matcher = pattern.matcher(strB);
		return matcher.matches();
		// 当条件满足时，将返回true，否则返回false

	}

	/**
	 * @category 是否是单元测试文件
	 * @author wupf@
	 * @param strA
	 * @return 2020年3月24日
	 */
	public static boolean unitFileMatch(String strA) {
		// String strA="SpringApplicationcontextUtilRTesta.java";
		String strB = "*Test[0-9].java";
		Pattern pattern = Pattern.compile(strA);
		Matcher matcher = pattern.matcher(strB);
		return matcher.matches();
		// 当条件满足时，将返回true，否则返回false

	}

	/**
	 * 
	 * @category 功能
	 * @param strA
	 * @return
	 * @author wupf
	 * @Date :2020年4月28日上午7:21:02
	 */
	public static boolean matchDateTime(String strA) {
		String strB = ".*(\\d{2}:\\d{2}:\\d{2}).*";
		Pattern pattern = Pattern.compile(strB);
		Matcher matcher = pattern.matcher(strA);
		if (matcher.matches()) {
			return true;
		}
		String strC = ".*(\\d{4}-\\d{2}-\\d{2}).*";
		Pattern p2 = Pattern.compile(strC);
		matcher = p2.matcher(strA);

		return matcher.matches();
	}

	/**
	 * @category 匹配文件名称
	 * @author wupf@
	 * @param strFileName
	 * @param strFilter
	 * @return 2020年3月27日
	 */
	public static boolean matchSrcFile(String strFileName, String strFilter) {
		strFilter = strFilter.trim();
		logger.info(strFilter);
		if (strFilter.startsWith("*")) {
			strFilter = "." + strFilter;
		}
		if (strFilter.startsWith("**")) {
			strFilter = "." + strFilter.substring(1, strFilter.length());
		}
		if (strFilter.startsWith(".**")) {
			strFilter = ".*" + strFilter.substring(3, strFilter.length());
		}
		logger.info(strFilter);

		Pattern p = Pattern.compile(strFilter);
		Matcher m = p.matcher(strFileName);
		return m.find();

	}

	/**
	 * 
	 * @category 匹配@字符后内容
	 * @since 2020年1月28日
	 * @author wupf
	 */
	public static void findKeyForat() {
		String input = "company_code = $csc223@cc and project_id = @pid ; update t set a = @aa,b=@cd,c=@cd,ttt=@ttt;update t2 set d=@bb";

		String regex = "@\\w+\\s?";
		// regex = "(\\s*=\\s*)|(\\s*,\\s*)|(\\s*;\\s*)|(\\s+)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}

	/**
	 * @author wupf@
	 * @param args 2020年4月18日
	 */
	public static void findKeyForSql() {
		// TODO Auto-generated method stub
		String abc = "的话 bb AND     CMS_ARTICLE_STATUS = ?   and a.CMS_ARTICLE_STATUd = ? and a.CMS_ARTICLE_STATUS3 =4";
		Pattern p = Pattern.compile("\\s^[A-Za-z][A-Z|a-z|0-9|\\.|\\_|\\-]{1,} = /?");
		// Pattern p = Pattern.compile("\\s?(.*)? = /?");
		Matcher m = p.matcher(abc);
		while (m.find()) {
			System.out.println(m.group());
		}

		abc = "的话 bb AND     CMS_ARTICLE_STATUS = ?   and a.CMS_ARTICLE_STATUd > ? and a.CMS_ARTICLE_STATUS3 < ? AND al.trans_date >= ?";
		p = Pattern.compile("[A-Za-z][A-Z|a-z|0-9|\\_|\\-]{1,}\\s?[>=<]{1,2}\\s?\\?");
		m = p.matcher(abc);
		List<String> mList = new ArrayList<String>();
		while (m.find()) {
			mList.add(
					m.group().replaceAll(">", "").replaceAll("<", "").replaceAll("=", "").replaceAll("\\?", "").trim());
			System.out.println(m.group());
		}
		System.out.println(mList);
	}


	/**
	 * 
	 * @category 功能
	 * @param line
	 * @param listMsg
	 * @author wupf
	 * @Date :2020年11月10日下午8:14:17
	 */
	public static void showCmdMsg(String line, List<String> listMsg) {
		if (logger.isDebugEnabled()) {

			if (listMsg == null) {
				System.out.println(line);

				return;
			}
			for (String strMsg : listMsg) {

				if (line.trim().startsWith(strMsg)) {
					System.out.println(line);
					break;
				}
			}
		}

	}

	/**
	 * 
	 * @category 功能
	 * @param pattern
	 * @param target
	 * @return
	 * @author wupf
	 * @Date :2020年11月23日下午10:50:26
	 */
	public static boolean matching(String pattern, String target) {
		return null != target && null != pattern && target.matches(pattern);
	}
}
