/*
 this file is write by wupf
 */
package org.jpf.utils.encrypts;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import com.alibaba.fastjson.JSON;

/**
* The class <code>MD5FilterTest</code> contains tests for the class <code>{@link MD5Filter}</code>.
* <p>
* Copyright (c) 2019
* 
* @generatedBy wupf at 2019-11-28 19:25:10
* @author Administrator
* @version $Revision: 1.3.0
*/

public class MD5Filter_WRTest {

	/**
	* Run the getMd5ByFile method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:25:10
	* @see public static  String getMd5ByFile(String strFileName)   
	*/
	@Test(timeout = 1000)
	public void test_getMd5ByFile_R0() throws Throwable {

		String strFileName = "abc123";

		String wupf_result = MD5Filter.getMd5ByFile(strFileName);

		System.out.println("jpf_check:getMd5ByFile:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	* 测试方法初始化.
	* 
	* @throws Exception 
	*         if the initialization fails for some reason 
	*  
	* @generatedBy wupf at 2019-11-28 19:25:10
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
