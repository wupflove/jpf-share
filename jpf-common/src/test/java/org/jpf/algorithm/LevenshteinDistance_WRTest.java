/*
 this file is write by wupf
 */
package org.jpf.algorithm;

import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import com.alibaba.fastjson.JSON;

/**
 * The class <code>LevenshteinDistanceTest</code> contains tests for the class
 * <code>{@link LevenshteinDistance}</code>.
 * <p>
 * Copyright (c) 2019
 * 
 * @generatedBy wupf at 2019-11-28 18:57:24
 * @author Administrator
 * @version $Revision: 1.3.0
 */

public class LevenshteinDistance_WRTest {

	/**
	 * Run the compare method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 18:57:24
	 * @see private static int compare(String str,String target)
	 */
	@Test(timeout = 1000)
	public void test_compare_R0() throws Throwable {

		String str = "abc123";
		String target = "abc123";

		LevenshteinDistance wupf_fixture = new LevenshteinDistance();
		Class testClass = wupf_fixture.getClass();
		Class[] typeParams = new Class[] { String.class, String.class };
		Object objParams[] = { str, target };

		Method method = testClass.getDeclaredMethod("compare", typeParams);
		method.setAccessible(true);
		int wupf_result = (Integer) method.invoke(wupf_fixture, objParams);

		System.out.println("jpf_check:compare:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the compare method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 18:57:24
	 * @see private static int compare(String str,String target)
	 */
	@Test(timeout = 1000)
	public void test_compare_R2() throws Throwable {

		String str = "abc123";
		String target = "";

		LevenshteinDistance wupf_fixture = new LevenshteinDistance();
		Class testClass = wupf_fixture.getClass();
		Class[] typeParams = new Class[] { String.class, String.class };
		Object objParams[] = { str, target };

		Method method = testClass.getDeclaredMethod("compare", typeParams);
		method.setAccessible(true);
		int wupf_result = (Integer) method.invoke(wupf_fixture, objParams);

		System.out.println("jpf_check:compare:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the compare method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 18:57:24
	 * @see private static int compare(String str,String target)
	 */
	@Test(timeout = 1000)
	public void test_compare_R4() throws Throwable {

		String str = "abc123";
		String target = "涓枃";

		LevenshteinDistance wupf_fixture = new LevenshteinDistance();
		Class testClass = wupf_fixture.getClass();
		Class[] typeParams = new Class[] { String.class, String.class };
		Object objParams[] = { str, target };

		Method method = testClass.getDeclaredMethod("compare", typeParams);
		method.setAccessible(true);
		int wupf_result = (Integer) method.invoke(wupf_fixture, objParams);

		System.out.println("jpf_check:compare:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the min method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 18:57:24
	 * @see private static int min(int one,int two,int three)
	 */
	@Test(timeout = 1000)
	public void test_min_R12() throws Throwable {

		int one = Integer.MAX_VALUE;
		int two = Integer.MAX_VALUE;
		int three = Integer.MAX_VALUE;

		LevenshteinDistance wupf_fixture = new LevenshteinDistance();
		Class testClass = wupf_fixture.getClass();
		Class[] typeParams = new Class[] { int.class, int.class, int.class };
		Object objParams[] = { one, two, three };

		Method method = testClass.getDeclaredMethod("min", typeParams);
		method.setAccessible(true);
		int wupf_result = (Integer) method.invoke(wupf_fixture, objParams);

		System.out.println("jpf_check:min:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the min method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 18:57:24
	 * @see private static int min(int one,int two,int three)
	 */
	@Test(timeout = 1000)
	public void test_min_R16() throws Throwable {

		int one = Integer.MAX_VALUE;
		int two = Integer.MIN_VALUE;
		int three = Integer.MAX_VALUE;

		LevenshteinDistance wupf_fixture = new LevenshteinDistance();
		Class testClass = wupf_fixture.getClass();
		Class[] typeParams = new Class[] { int.class, int.class, int.class };
		Object objParams[] = { one, two, three };

		Method method = testClass.getDeclaredMethod("min", typeParams);
		method.setAccessible(true);
		int wupf_result = (Integer) method.invoke(wupf_fixture, objParams);

		System.out.println("jpf_check:min:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getSimilarityRatio method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 18:57:24
	 * @see public static float getSimilarityRatio(String str,String target)
	 */
	@Test(timeout = 1000)
	public void test_getSimilarityRatio_R28() throws Throwable {

		String str = "abc123";
		String target = "涓枃";

		float wupf_result = new LevenshteinDistance().getSimilarityRatio(str, target);

		System.out.println("jpf_check:getSimilarityRatio:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * 娴嬭瘯鏂规硶鍒濆鍖�.
	 * 
	 * @throws Exception if the initialization fails for some reason
	 * 
	 * @generatedBy wupf at 2019-11-28 18:57:24
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
