/*
 this file is write by wupf
 */
package org.jpf.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

/**
 * The class <code>JpfStringUtilTest</code> contains tests for the class
 * <code>{@link JpfStringUtil}</code>.
 * <p>
 * Copyright (c) 2019
 * 
 * @generatedBy wupf at 2019-11-28 19:53:48
 * @author Administrator
 * @version $Revision: 1.3.0
 */

public class JpfStringUtil_WRTest {

	/**
	 * Run the isNotEmpty method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:53:48
	 * @see public static boolean isNotEmpty(String str)
	 */
	@Test(timeout = 1000)
	public void test_isNotEmpty_R9() throws Throwable {

		String str = null;

		boolean wupf_result = JpfStringUtil.isNotEmpty(str);

		System.out.println("jpf_check:isNotEmpty:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));
		assertEquals(false, wupf_result);

	}

	/**
	 * Run the isContinuityCharacter method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:53:48
	 * @see public static boolean isContinuityCharacter(String s)
	 */
	@Test(timeout = 1000)
	public void test_isContinuityCharacter_R25() throws Throwable {

		String s = "123";

		boolean wupf_result = JpfStringUtil.isContinuityCharacter(s);

		System.out.println("jpf_check:isContinuityCharacter:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));
		assertEquals(true, wupf_result);

	}

	/**
	 * Run the trim method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:53:48
	 * @see public static String trim(String sourceStr)
	 */
	@Test(timeout = 1000)
	public void test_trim_R43() throws Throwable {

		String sourceStr = null;

		String wupf_result = JpfStringUtil.trim(sourceStr);

		System.out.println("jpf_check:trim:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the urlDecode method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:53:48
	 * @see public static String urlDecode(String str)
	 */
	@Test(timeout = 1000)
	public void test_urlDecode_R107() throws Throwable {

		String str = null;

		String wupf_result = JpfStringUtil.urlDecode(str);

		System.out.println("jpf_check:urlDecode:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the ios8859ToUtf8 method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:53:48
	 * @see public static String ios8859ToUtf8(String str)
	 */
	@Test(timeout = 1000)
	public void test_ios8859ToUtf8_R114() throws Throwable {

		String str = null;

		String wupf_result = JpfStringUtil.ios8859ToUtf8(str);

		System.out.println("jpf_check:ios8859ToUtf8:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the length method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:53:48
	 * @see public static int length(String str)
	 */
	@Test(timeout = 1000)
	public void test_length_R153() throws Throwable {

		String str = null;

		int wupf_result = JpfStringUtil.length(str);

		System.out.println("jpf_check:length:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the replaceHtml method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:53:48
	 * @see public static String replaceHtml(String html)
	 */
	@Test(timeout = 1000)
	public void test_replaceHtml_R172() throws Throwable {

		String html = null;

		String wupf_result = JpfStringUtil.replaceHtml(html);

		System.out.println("jpf_check:replaceHtml:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getCNString method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:53:48
	 * @see public static String getCNString(String str) throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getCNString_Doc248() throws Throwable {

		try {

			String str = JSON.parseObject("String 瀵板懓娴嗛幑銏㈡畱鐎涙顑佹稉锟�", String.class);

			String wupf_result = JpfStringUtil.getCNString(str);

			String expected_result = JSON.parseObject("String 鏉烆剚宕叉潻鍥╂畱鐎涙顑佹稉锟�", String.class);
			System.out.println(wupf_result);
			assertEquals(wupf_result, expected_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the removeRepeatString method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:53:48
	 * @see public static String removeRepeatString(String strInput,String x)
	 */
	@Test(timeout = 1000)
	public void test_removeRepeatString_R315() throws Throwable {

		String strInput = "abc123";
		String x = "abc123";

		String wupf_result = JpfStringUtil.removeRepeatString(strInput, x);

		System.out.println("jpf_check:removeRepeatString:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the removeRepeatString method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:53:48
	 * @see public static String removeRepeatString(String strInput,String x)
	 */
	@Test(timeout = 1000)
	public void test_removeRepeatString_R317() throws Throwable {

		String strInput = "abc123";
		String x = "";

		String wupf_result = JpfStringUtil.removeRepeatString(strInput, x);

		System.out.println("jpf_check:removeRepeatString:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the replaceChinaStr method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:53:48
	 * @see public static String replaceChinaStr(String strOld,String regex,String
	 *      replacement)
	 */
	@Test(timeout = 1000)
	public void test_replaceChinaStr_R350() throws Throwable {

		String strOld = "abc123";
		String regex = "abc123";
		String replacement = null;

		String wupf_result = JpfStringUtil.replaceChinaStr(strOld, regex, replacement);

		System.out.println("jpf_check:replaceChinaStr:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFirstPosStr method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:53:48
	 * @see public static String getFirstPosStr(String str,String x)
	 */
	@Test(timeout = 1000)
	public void test_getFirstPosStr_R390() throws Throwable {

		String str = "abc123";
		String x = "123";

		String wupf_result = JpfStringUtil.getFirstPosStr(str, x);

		System.out.println("jpf_check:getFirstPosStr:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

}
