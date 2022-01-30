/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author wupf
 * 
 */
public class JpfStringUtil  {

	private JpfStringUtil() {}
	private static final String SERIALNO_PATTERN = "yyyyMMddHHmmssSSS";
	private static final char UNDERLINE = '_';
	private static final String SPLIT_STRING = ",";

	/**
	 * Checks if a CharSequence is empty or null.
	 * 
	 * @category 判断String是否为空
	 * @param str String
	 * @return {@code true} if the CharSequence is empty or null
	 */
	public static boolean isEmpty(String str) {
		return null == str || "".equals(str.trim()) || "null".equals(str.trim()) || "NaN".equals(str.trim());
	}

	/**
	 * Checks if a CharSequence is empty or null.
	 * 
	 * @param str String
	 * @return {@code false } if the CharSequence is empty or null
	 */
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}

	/**
	 * Check if characters are the same in the string.
	 * 
	 * @param s the CharSequence to check.
	 * @return {@code true } if characters are the same in the string
	 */
	public static boolean isSameCharacter(String s) {
		s = s.toUpperCase();
		String character = s.substring(0, 1);
		String replace = "";
		String test = s.replace(character, replace);
		return "".equals(test);
	}

	/**
	 * 
	 * @category 功能
	 * @param str
	 * @return
	 * @author wupf
	 * @Date :2021年10月25日下午4:54:14
	 */
	public static boolean isISO8859(String str)
	{
		String enCoding="ISO-8859-1";
		try {
			if (str.equalsIgnoreCase(new String(str.getBytes(enCoding),enCoding)))
			{
				return true;
			}
		} catch (Exception e) {
			
		}
		return false;
	}
	
	/**
	 * Check if the character in a string is a continuous character
	 *
	 * @param s the CharSequence to check
	 * @return {@code true } if the character in a string is a continuous character
	 */
	public static boolean isContinuityCharacter(String s) {
		boolean continuity = true;
		char[] data = s.toCharArray();
		for (int i = 0; i < data.length - 1; i++) {
			int a = Integer.parseInt(data[i] + "");
			int b = Integer.parseInt(data[i + 1] + "");
			continuity = continuity && (a + 1 == b || a - 1 == b);
		}
		return continuity;
	}

	/**
	 * convert to 8859
	 *
	 * @param str String
	 * @return String
	 */
	public static String convertTo8859(String str) {
		String strOutPut = "";
		try {
			byte[] tempStrByte = str.getBytes("ISO-8859-1");
			strOutPut = new String(tempStrByte);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strOutPut;
	}

	public static String capitalise(String fieldName) {
		return fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
	}

	/**
	 * 
	 * @category 去掉空格
	 * @param sourceStr
	 * @return
	 * @author wupf
	 * @Date :2020年8月22日下午11:03:43
	 */
	public static String trim(String sourceStr) {
		if (isEmpty(sourceStr)) {
			return null;
		} else {
			return sourceStr.replaceAll(" ", "");
		}
	}

	/**
	 * 
	 * @category 强力去掉空格
	 * @param sourceStr
	 * @return
	 * @author wupf
	 * @Date :2020年8月22日下午11:04:16
	 */
	public static String trimIncludeLineBreaks(String sourceStr) {
		if (isEmpty(sourceStr)) {
			return null;
		} else {
			return sourceStr.replaceAll(" ", "").replaceAll("\n", "");
		}
	}
	/**
	 * Clear special characters in a string
	 *
	 * @param str String
	 * @return String
	 */
	public static String filterStr(String str) {
		if (isEmpty(str)) {
			return str;
		} else {
			str = str.replaceAll(";", "");
			str = str.replaceAll("%", "");
			str = str.replaceAll("--", "");
			str = str.replaceAll("/", "");
			str = str.replaceAll("=", "");
			str = str.replaceAll("'", "&#39;");
			str = str.replaceAll("\\(", "&#40;").replace("\\)", "&#41;");
			str = str.replaceAll("<", "&lt");
			str = str.replaceAll(">", "&gt");
			return str;
		}
	}

	/**
	 * Clear wildcards in sql
	 * 
	 * @param str sql
	 * @return string
	 */
	public static String cleanSqlWildCharater(String str) {
		if (isEmpty(str)) {
			return str;
		} else {
			str = str.replaceAll("%", "invalid character");
			str = str.replaceAll("_", "invalid character");
			str = str.replaceAll("=", "invalid character");
			return str;
		}
	}

	/**
	 * Clear xss script injection
	 *
	 * @param value script
	 * @return not contains xss script
	 */
	public static String cleanXSS(String value) {
		if (null == value) {
			return value;
		} else {
			value = value.replaceAll("\\bselect\\b", "invalid character");
			value = value.replaceAll("\\band\\b", "invalid character");
			value = value.replaceAll("\\bor\\b", "invalid character");
			value = value.replaceAll("\\bdelete\\b", "invalid character");
			value = value.replaceAll("\\bjoin\\b", "invalid character");
			value = value.replaceAll("\\bdrop\\b", "invalid character");

			value = value.replaceAll("\\+", "&#43;");
			value = value.replaceAll("&", "&amp;");
			value = value.replaceAll("%", "&#37;");
			// value = value.replaceAll("\"","&quot;");
			value = value.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
			value = value.replaceAll("%3C", "&lt;").replaceAll("%3E", "&gt;");
			value = value.replaceAll("\\(", "&#40;").replaceAll("\\)", "&#41;");
			value = value.replaceAll("%28", "&#40;").replaceAll("%29", "&#41;");
			value = value.replaceAll("'", "&#39;");
			value = value.replaceAll("alert", "invalid character");
			value = value.replaceAll("eval\\((.*)\\)", "invalid character");
			value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
			value = value.replaceAll("<\\s*script", "invalid character");
			value = value.replaceAll("location.href", "invalid character");
		}
		return value;
	}

	/**
	 * camel to underline
	 *
	 * @param param pending character
	 * @return String
	 */
	public static String camelToUnderline(String param) {
		if (param == null || "".equals(param.trim())) {
			return "";
		}
		int length = param.length();
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			char c = param.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(UNDERLINE);
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	/**
	 * underline to camel
	 *
	 * @param param pending character
	 * @return String
	 */
	public static String underlineToCamel(String param) {
		if (param == null || "".equals(param.trim())) {
			return "";
		}
		int length = param.length();
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			char c = param.charAt(i);
			if (c == UNDERLINE) {
				if (++i < length) {
					sb.append(Character.toUpperCase(param.charAt(i)));
				}
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	/**
	 * Camel case
	 * 
	 * @param s characters
	 * @return String after Camel case
	 */
	public static String toCapitalizeCamelCase(String s) {
		if (s == null) {
			return null;
		}
		s = underlineToCamel(s);
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

	/**
	 * Turn the first letter into a uppercase
	 *
	 * @param param pending character
	 * @return String
	 */
	public static String firstToUpperCase(String param) {
		char[] cs = param.toCharArray();
		if (cs[0] > 96 && cs[0] < 123) {
			cs[0] -= 32;
		}
		return String.valueOf(cs);
	}

	/**
	 * Turn the first letter into a lowercase
	 *
	 * @param param pending character
	 * @return String
	 */
	public static String firstToLowerCase(String param) {
		char[] cs = param.toCharArray();
		if (cs[0] > 64 && cs[0] < 91) {
			cs[0] += 32;
		}
		return String.valueOf(cs);
	}

	/**
	 * Generating sequence number according to timestamp
	 *
	 * @return String
	 */
	public static String createSerialNo() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat(SERIALNO_PATTERN);
		return format.format(cal.getTime());
	}

	/**
	 * Decoding the parameters passed by the URL
	 * 
	 * @param str pending character
	 * @return String after decode
	 */
	public static String urlDecode(String str) {
		if (isEmpty(str)) {
			return null;
		} else {
			try {
				return java.net.URLDecoder.decode(str, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				return null;
			}
		}
	}

	/**
	 * convert 8859 to utf-8
	 *
	 * @param str pending character
	 * @return String
	 */
	public static String ios8859ToUtf8(String str) {
		if (isEmpty(str)) {
			return null;
		} else {
			try {
				return new String(str.getBytes("iso8859-1"), "utf-8");
			} catch (Exception e) {
				return null;
			}
		}
	}

	/**
	 * Convert binary strings to hexadecimal strings
	 * 
	 * @param bString binary string
	 * @return String
	 */
	public static String binaryString2hexString(String bString) {
		if (bString == null || bString.equals("") || bString.length() % 8 != 0) {
			return null;
		}
		StringBuilder tmp = new StringBuilder();
		int iTmp;
		for (int i = 0; i < bString.length(); i += 4) {
			iTmp = 0;
			for (int j = 0; j < 4; j++) {
				iTmp += Integer.parseInt(bString.substring(i + j, i + j + 1)) << (4 - j - 1);
			}
			tmp.append(Integer.toHexString(iTmp));
		}
		return tmp.toString();
	}

	/**
	 * Convert hex strings to binary strings
	 * 
	 * @param hexString hexadecimal strings
	 * @return binary strings
	 */
	public static String hexString2binaryString(String hexString) {
		if (hexString == null || hexString.length() % 2 != 0)
			return null;
		String bString = "", tmp;
		for (int i = 0; i < hexString.length(); i++) {
			tmp = "0000" + Integer.toBinaryString(Integer.parseInt(hexString.substring(i, i + 1), 16));
			bString += tmp.substring(tmp.length() - 4);
		}
		return bString;
	}

	/**
	 *
	 * @param str
	 * @param arr
	 * @return
	 */
	public static String fillStringByArgs(String str, String[] arr) {
		Matcher m = Pattern.compile("\\{(\\d)\\}").matcher(str);
		while (m.find()) {
			str = str.replace(m.group(), arr[Integer.parseInt(m.group(1))]);
		}
		return str;
	}

	/**
	 * left trim and right trim
	 * 
	 * @param str string
	 * @return string
	 */
	public static String trimBlank(String str) {
		if (isEmpty(str)) {
			return null;
		} else {
			return str.replaceAll("^[　 ]+|[　 ]+$", "");
		}
	}

	public static int length(String str) {
		if (isEmpty(str)) {
			return 0;
		} else {
			return str.length();
		}
	}

	/**
	 * 生成指定长度的随机整数
	 *
	 * @param length int
	 * @return String
	 */
	public static String createRandom(int length) {
		double a = Math.pow(10, length - 1);
		int num = (int) ((Math.random() * 9 + 1) * a);
		return String.valueOf(num);
	}

	/**
	 * Remove single or double quotes in query keywords to avoid sql errors
	 *
	 * @param str String
	 * @return String
	 */
	public static String removeQuotes(String str) {
		if (isNotEmpty(str)) {
			return str.replace("'", "").replace("\"", "");
		} else {
			return "";
		}
	}

	/**
	 * replace special character of html
	 * 
	 * @param html html tag
	 * @return String after replaced}
	 */
	public static String replaceHtml(String html) {
		if (isEmpty(html)) {
			return "";
		}
		String regEx = "<.+?>";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(html);
		String s = m.replaceAll("");
		return s;
	}

	/**
	 * replace special character of html
	 * 
	 * @param html html tag
	 * @return String after replaced}
	 */
	public static String replaceMobileHtml(String html) {
		if (html == null) {
			return "";
		}
		return html.replaceAll("<([a-z]+?)\\s+?.*?>", "<$1>");
	}

	/**
	 * Extract Chinese in a string
	 *
	 * @param str characters
	 * @return Chinese characters
	 */
	public static String getChinese(String str) {
		String reg = "[^\u4e00-\u9fa5]";
		str = str.replaceAll(reg, "");
		return str;
	}

	/**
	 * Extract non-Chinese characters in a string
	 *
	 * @param str characters
	 * @return non-Chinese characters
	 */
	public static String getNotChinese(String str) {
		String reg = "[^A-Za-z0-9_]";
		str = str.replaceAll(reg, "");
		return str;
	}

	/**
	 * Remove the specified prefix
	 *
	 * @param str    source
	 * @param prefix prefix
	 * @return If the prefix does not match, return the original string
	 */
	public static String removePrefix(String str, String prefix) {
		if (isEmpty(str) || isEmpty(prefix)) {
			return str;
		}

		if (str.startsWith(prefix)) {
			return str.substring(prefix.length());
		}
		return str;
	}

	/**
	 * 把传入的字符串分割为数组格式
	 * 
	 * @param str 传入的字符串
	 * 
	 *            * @param x 间隔符
	 * 
	 * @return String
	 * 
	 */
	public static String[] split(String str, String regex) {
		if (null != str) {
			return str.split(regex);
		}
		return null;
	}

	/**
	 * Left pad a long number with zero
	 * 
	 * @param seq sequence number
	 * @param len max length of number
	 * @return String
	 */
	public static String seqNumLeftPadZero(long seq, int len) {
		String b = String.valueOf(seq);
		StringBuilder builder = new StringBuilder();
		int rest = len - b.length();
		for (int i = 0; i < rest; i++) {
			builder.append("0");
		}
		builder.append(b);
		return builder.toString();
	}

	/**
	 * 字符串经过从字符集iso-8859-1到字符集gb2312的转换，所有从字符集为
	 * iso-8859-1的系统中取得的字符串都必须经过这样的转换才能正常显示在 jsp页面上，否则中文显示会有乱码出现。
	 * 
	 * @param str String 待转换的字符串
	 * @return String 转换过的字符串
	 */
	public static String getCNString(String str) throws Exception {
		if (str == null || "".equals(str)) {
			return "";
		}

		return new String(str.trim().getBytes("ISO-8859-1"), "GB2312");

	}

	/**
	 * 通过字符串转换成相应的整型，并返回。
	 * 
	 * @param strValue String 待转换的字符串
	 * @return int 转换完成的整型
	 */
	public static int getStrToInt(String strValue) {
		if (null == strValue) {
			return 0;
		}

		int iValue = 0;

		try {
			iValue = new Integer(strValue.trim()).intValue();
		} catch (Exception ex) {
			iValue = 0;
		}

		return iValue;
	}

	/**
	 * 得到非空的字符串，若字符串为null，则返回""。
	 * 
	 * @param strValue String待转换的原字符串
	 * @return String 转换后的字符串
	 */
	public static String getNotNullStr(String strValue) {
		return (strValue == null ? "" : strValue.trim());
	}

	/**
	 * 把传入的字符串分割为数组格式
	 * 
	 * @param str 传入的字符串
	 * 
	 *            * @param x 间隔符
	 * 
	 * @return String
	 * 
	 */

	public static String[] split(String str, char x) {

		StringBuilder sbSplit = new StringBuilder(x);

		return split(str, sbSplit.toString());

	}

	public static String htmEncode(String s) {
		StringBuilder stringbuffer = new StringBuilder();
		int j = s.length();
		for (int i = 0; i < j; i++) {
			char c = s.charAt(i);
			switch (c) {
			case 60:
				stringbuffer.append("&lt;");
				break;
			case 62:
				stringbuffer.append("&gt;");
				break;
			case 38:
				stringbuffer.append("&amp;");
				break;
			case 34:
				stringbuffer.append("&quot;");
				break;
			case 169:
				stringbuffer.append("&copy;");
				break;
			case 174:
				stringbuffer.append("&reg;");
				break;
			case 165:
				stringbuffer.append("&yen;");
				break;
			case 8364:
				stringbuffer.append("&euro;");
				break;
			case 8482:
				stringbuffer.append("&#153;");
				break;
			case 13:
				if (i < j - 1 && s.charAt(i + 1) == 10) {
					stringbuffer.append("<br>");
					i++;
				}
				break;
			case 32:
				if (i < j - 1 && s.charAt(i + 1) == ' ') {
					stringbuffer.append(" &nbsp;");
					i++;
				}
				break;
			default:
				stringbuffer.append(c);
				break;
			}
		}
		return stringbuffer.toString();
	}

	/**
	 * 
	 * @param inString 规整前数据
	 * @return 规整数据
	 */
	public static String getRuleSplitString(final String inString) {
		StringBuilder sBuffer = new StringBuilder();

		if (inString == null) {
			sBuffer.append("0");
		} else {
			String[] tmpStrings = inString.split(SPLIT_STRING);
			for (int i = 0; i < tmpStrings.length; i++) {
				if (!tmpStrings[i].equalsIgnoreCase("") && isNumber(tmpStrings[i])) {
					sBuffer.append(tmpStrings[i]).append(SPLIT_STRING);
				}
			}
			if (sBuffer.length() > 0) {
				sBuffer.deleteCharAt(sBuffer.length() - SPLIT_STRING.length());
			}

		}
		return sBuffer.toString();
	}

	/**
	 * 
	 * @category 判断String是否是数字
	 * @author
	 * @param str
	 * @return update 2020年2月19日
	 */
	public static boolean isNumber(final String str) {
		try {
			if (str == null || "".equalsIgnoreCase(str)) {
				return false;
			}
			Long.parseLong(str);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @category 判断是否是中文
	 * @author
	 * @param c
	 * @return update 2020年2月19日
	 */
	public static final boolean isChinese(char c) {
		Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
		if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
				|| ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
				|| ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
				|| ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
				|| ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
			return true;
		}
		return false;
	}

	/**
	 * @category 判断是否有中文
	 * @param strName
	 * @return update 2019-8-13
	 */
	public static final boolean isChinese(String strName) {
		char[] ch = strName.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (isChinese(c)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @category 关键字显示为红色
	 * @param a
	 * @param b
	 * @return
	 */
	public static String showKeyRed(String a, String b) {
		if (a == null || b == null)
			return "";
		String c = "";
		int i = a.indexOf(b);

		if (i >= 0) {
			c = a.substring(0, i) + "<font color='red'>" + b + "</font>" + a.substring(i + b.length(), a.length());

		} else {
			c = a;
		}
		return c;
	}

	/**
	 * 得到非空的字符串,若字符串对象为null,则返回""。
	 * 
	 * @param objValue Object待转换的原字符串对象
	 * @return String 转换后的字符串
	 */
	public static String getNotNullStr(Object objValue) {
		return (objValue == null ? "" : getNotNullStr(objValue.toString()));
	}

	/**
	 * 
	 * @category 移除字符串中重复字符
	 * @author
	 * @param strInput
	 * @param x
	 * @return update 2020年9月7日
	 */
	public static String removeRepeatString(String strInput, String x) {
		if (null == strInput || null == x) {
			return "";
		}
		String[] strResult = strInput.split(x);
		strInput = "";
		for (int i = 0; i < strResult.length; i++) {
			if (strInput.indexOf(strResult[i]) < 0) {
				strInput += strResult[i] + x;
			}
		}
		return strInput;
	}

	public static String htmlEncode(String str) {
		str = str.replace(">", "&lt;");
		str = str.replace(">", "&lt;");
		return str;
	}

	/**
	 * 
	 * @category:删除重复内容
	 * @Title: delRepeat
	 * @Author:wupf@
	 * @date:2020年3月14日
	 * @param sb
	 */
	public static void delRepeat(StringBuilder sb) {
		String stra = sb.toString();
		String[] arrs = stra.split(",");
		List<String> list = new LinkedList<String>();
		sb.setLength(0);
		sb.append("0");
		for (int i = 0; i < arrs.length; i++) {
			if (arrs[i] != null && !"".equalsIgnoreCase(arrs[i])) {
				if (!list.contains(arrs[i])) {
					list.add(arrs[i]);
					sb.append(",").append(arrs[i]);
				}
			}
		}
		list.clear();

	}

	/**
	 * @category 获取字符长度
	 * @param s
	 * @return
	 * @author wupf
	 */
	public static int getStringCount(String s) {
		s = s.replaceAll("[^\\x00-\\xff]", "**");
		int length = s.length();
		return length;
	}

	/**
	 * 
	 * @category 功能
	 * @param strOld
	 * @param regex
	 * @param replacement
	 * @return
	 * @author wupf
	 * @Date :2021年10月15日下午10:17:06
	 */
	public static String replaceChinaStr(String strOld, String regex, String replacement) {
		try {
			// regex=new String(regex.getBytes("UTF8"),"gb2312");
			regex = new String(regex.getBytes("gb2312"), "unicode");
			strOld = new String(strOld.getBytes("gb2312"), "unicode");
			replacement = new String(replacement.getBytes("gb2312"), "unicode");
			strOld = strOld.replaceAll(regex, replacement);
			return new String(strOld.getBytes("unicode"), "gb2312");
		} catch (Exception ex) {
			// TODO: handle exception
		}

		return "";
	}

	/**
	 * 
	 * @category 功能
	 * @param str
	 * @return
	 * @author wupf
	 * @Date :2021年10月25日下午5:14:57
	 */
	public static String getEncoding(String str) {
		String encode = "GB2312";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s = encode;
				return s;
			}
		} catch (Exception exception) {
		}
		encode = "ISO-8859-1";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s1 = encode;
				return s1;
			}
		} catch (Exception exception1) {
		}
		encode = "ISO-8859-1";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s1 = encode;
				return s1;
			}
		} catch (Exception exception1) {
		}
		encode = "UTF-8";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s2 = encode;
				return s2;
			}
		} catch (Exception exception2) {
		}
		encode = "GBK";
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				String s3 = encode;
				return s3;
			}
		} catch (Exception exception3) {
		}
		return "";
	}

	public static HashMap<String, Long> chineseNumbers = new HashMap<String, Long>() { // java
																						// verbosity.
																						// compare
																						// this to
																						// python's
																						// dict
		private static final long serialVersionUID = 1L;

		{
			put("零", 0L);
			put("一", 1L);
			put("壹", 1L);
			put("二", 2L);
			put("两", 2L);
			put("貳", 2L);
			put("贰", 2L);
			put("叁", 3L);
			put("參", 3L);
			put("三", 3L);
			put("肆", 4L);
			put("四", 4L);
			put("五", 5L);
			put("伍", 5L);
			put("陸", 6L);
			put("陆", 6L);
			put("六", 6L);
			put("柒", 7L);
			put("七", 7L);
			put("捌", 8L);
			put("八", 8L);
			put("九", 9L);
			put("玖", 9L);
			put("十", 10L);
			put("拾", 10L);
			put("佰", 100L);
			put("百", 100L);
			put("仟", 1000L);
			put("千", 1000L);
			put("万", 10000L);
			put("萬", 10000L);
			put("億", 100000000L);
			put("亿", 100000000L);
		}
	};

	/**
	 * 
	 * @category 汉字表示的数字转换成阿拉伯数字,recursive的方法
	 * @author
	 * @param s
	 * @return update 2020年2月19日
	 */
	public static long convert(String s) {
		int sLen = s.length();
		if (sLen == 0)
			return 0;
		if (sLen > 1) {
			int pivot = 0; // index of the highest singular character value in the string
			for (int i = 0; i < sLen; i++) // loop through the characters in the string to get the
											// character with the highest value. That is your pivot
				if (convert(String.valueOf(s.charAt(i))) > convert(String.valueOf(s.charAt(pivot))))
					pivot = i;
			long value = convert(String.valueOf(s.charAt(pivot)));
			long LHS, RHS;
			LHS = convert(s.substring(0, pivot)); // multiply value with LHS
			RHS = convert(s.substring(pivot + 1)); // add value with RHS
			if (LHS > 0)
				value *= LHS;
			value += RHS;
			return value;
		} else {
			return chineseNumbers.get(s).longValue();
		}
	}

	/**
	 * 
	 * @category 功能
	 * @param s
	 * @author wupf
	 * @Date :2021年10月15日下午10:17:34
	 */
	public static void showCharCode(byte[] s) {
		// byte [] s =
		// {(byte)0xc7,(byte)0xfd,(byte)0xb6,(byte)0xaf,(byte)0xb3,(byte)0xcc,(byte)0xd0,(byte)0xf2,(byte)0xb9,(byte)0xdc,(byte)0xc0,(byte)0xed,(byte)0xc6,(byte)0xf7};
		try {
			System.out.println(new String(s, "gb2312"));
		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();
		}
		// \xc7\xfd\xb6\xaf\xb3\xcc\xd0\xf2\xb9\xdc\xc0\xed\xc6\xf7
	}

	/**
	 * 
	 * @category @author
	 * @param str
	 * @param strCodeType
	 * @return update 2020年3月20日
	 */
	public static String getCNString(String str, String strCodeType) {
		if (str == null || "".equals(str)) {
			return "";
		}

		try {
			return new String(str.trim().getBytes(strCodeType), "GB2312");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}

	/**
	 * 返回第一个值 aa;bb 返回aa
	 * 
	 * @param str String
	 * @param x   String
	 * @return String
	 */
	public static String getFirstPosStr(String str, String x) {
		int i = str.indexOf(x);
		if (i > 0) {
			str = str.substring(0, i);
		}
		return str;
	}


	/**
	 * @category 去掉换行符
	 * @param strInput
	 * @return
	 */
	public static String removeEscapeStr(String strInput) {
		if (strInput == null) {
			return "";
		}
		strInput = strInput.replaceAll("\t", "").replaceAll("\r\n", "").replaceAll("\n", "");
		return strInput;
	}



	/**
	 * 
	 * @category 替换最后一个查找的关键字
	 * @author
	 * @param strInput
	 * @param regEx
	 * @param replacement
	 * @return update 2020年2月5日
	 */
	public static String replaceLast(String strInput, String regEx, String replacement) {
		int iPos = strInput.lastIndexOf(regEx);
		if (iPos >= 0) {
			String tmpStr = strInput.substring(0, iPos) + replacement;
			if (iPos + regEx.length() < strInput.length()) {
				tmpStr += strInput.substring(iPos + regEx.length(), strInput.length());
			}
			return tmpStr;
		}
		return strInput;

	}
}
