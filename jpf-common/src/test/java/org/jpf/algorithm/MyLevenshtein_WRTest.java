/*
 this file is write by wupf
 */
package org.jpf.algorithm;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import com.alibaba.fastjson.JSON;

/**
 * The class <code>MyLevenshteinTest</code> contains tests for the class
 * <code>{@link MyLevenshtein}</code>.
 * <p>
 * Copyright (c) 2019
 * 
 * @generatedBy wupf at 2019-11-28 18:58:21
 * @author Administrator
 * @version $Revision: 1.3.0
 */

public class MyLevenshtein_WRTest {

	/**
	 * Run the levenshtein method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 18:58:21
	 * @see public static float levenshtein(String str1,String str2)
	 */
	@Test(timeout = 1000)
	public void test_levenshtein_R1() throws Throwable {

		try {

			String str1 = "abc123";
			String str2 = null;

			float wupf_result = new MyLevenshtein().levenshtein(str1, str2);

			System.out.println("jpf_check:levenshtein:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	/**
	 * Run the levenshtein method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 18:58:21
	 * @see public static float levenshtein(String str1,String str2)
	 */
	@Test(timeout = 1000)
	public void test_levenshtein_R2() throws Throwable {

		String str1 = "abc123";
		String str2 = "";

		float wupf_result = new MyLevenshtein().levenshtein(str1, str2);

		System.out.println("jpf_check:levenshtein:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the levenshtein method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 18:58:21
	 * @see public static float levenshtein(String str1,String str2)
	 */
	@Test(timeout = 1000)
	public void test_levenshtein_R6() throws Throwable {
		try {

			String str1 = null;
			String str2 = "abc123";

			float wupf_result = new MyLevenshtein().levenshtein(str1, str2);

			System.out.println("jpf_check:levenshtein:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	/**
	 * Run the levenshtein method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 18:58:21
	 * @see public static float levenshtein(String str1,String str2)
	 */
	@Test(timeout = 1000)
	public void test_levenshtein_R7() throws Throwable {

		try {

			String str1 = null;
			String str2 = null;

			float wupf_result = new MyLevenshtein().levenshtein(str1, str2);

			System.out.println("jpf_check:levenshtein:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	/**
	 * Run the levenshtein method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 18:58:21
	 * @see public static float levenshtein(String str1,String str2)
	 */
	@Test(timeout = 1000)
	public void test_levenshtein_R8() throws Throwable {
		try {

			String str1 = null;
			String str2 = "";

			float wupf_result = new MyLevenshtein().levenshtein(str1, str2);

			System.out.println("jpf_check:levenshtein:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));
		} catch (Exception e) {

		}

	}

	/**
	 * Run the levenshtein method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 18:58:21
	 * @see public static float levenshtein(String str1,String str2)
	 */
	@Test(timeout = 1000)
	public void test_levenshtein_R9() throws Throwable {

		try {

			String str1 = null;
			String str2 = "123";

			float wupf_result = new MyLevenshtein().levenshtein(str1, str2);

			System.out.println("jpf_check:levenshtein:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));
		} catch (Exception e) {

		}
	}

	/**
	 * Run the levenshtein method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 18:58:21
	 * @see public static float levenshtein(String str1,String str2)
	 */
	@Test(timeout = 1000)
	public void test_levenshtein_R10() throws Throwable {

		try {

			String str1 = null;
			String str2 = "中文";

			float wupf_result = new MyLevenshtein().levenshtein(str1, str2);

			System.out.println("jpf_check:levenshtein:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));
		} catch (Exception e) {

		}
	}

	/**
	 * Run the levenshtein method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 18:58:21
	 * @see public static float levenshtein(String str1,String str2)
	 */
	@Test(timeout = 1000)
	public void test_levenshtein_R11() throws Throwable {

		try {

			String str1 = null;
			String str2 = "中文123abc";

			float wupf_result = new MyLevenshtein().levenshtein(str1, str2);

			System.out.println("jpf_check:levenshtein:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));
		} catch (Exception e) {

		}
	}

	/**
	 * 测试方法初始化.
	 * 
	 * @throws Exception if the initialization fails for some reason
	 * 
	 * @generatedBy wupf at 2019-11-28 18:58:21
	 */
	@Before
	public void setUp() throws Exception {
		// TODO: add additional set up code here
		try {
			MockitoAnnotations.initMocks(this);
		} catch (Exception ex) {
		}
	}

}
