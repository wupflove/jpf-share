/*
 this file is write by wupf
 */
package org.jpf.utils;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import com.alibaba.fastjson.JSON;

/**
* The class <code>JpfPrintClassTest</code> contains tests for the class <code>{@link JpfPrintClass}</code>.
* Copyright (c) 2020
* 
* @generatedBy wupf at 2020-05-07 10:23:31
* @version 1.0.0
*/

public class JpfPrintClass_WRTest {

	/**
	* Run the List2String method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2020-05-07 10:23:31
	* @see public static  String List2String(List mList)   
	*/
	@Test(timeout = 3000)
	public void test_List2String_R3() throws Throwable {

		List mList = null;
		String wupf_result = JpfPrintClass.List2String(mList);

		System.out.println(" wupf_check:List2String:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	* Run the List2String method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2020-05-07 10:23:31
	* @see public static  String List2String(List mList,String strSepChar)   
	*/
	@Test(timeout = 3000)
	public void test_List2String_R10() throws Throwable {

		List mList = null;
		String strSepChar = "abc def";

		String wupf_result = JpfPrintClass.List2String(mList, strSepChar);

		System.out.println(" wupf_check:List2String:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	* Run the printMap method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2020-05-07 10:23:31
	* @see public static  void printMap(Map map)   
	*/
	@Test(timeout = 3000)
	public void test_printMap_R12() throws Throwable {

		Map map = new HashMap();

		JpfPrintClass.printMap(map);

		//add check point here, sample: assertEquals(true, wupf_result);
		assertTrue(true);

	}

	/**
	* 测试方法初始化.
	* 
	* @throws Exception 
	*         if the initialization fails for some reason 
	*  
	* @generatedBy wupf at 2020-05-07 10:23:31
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
