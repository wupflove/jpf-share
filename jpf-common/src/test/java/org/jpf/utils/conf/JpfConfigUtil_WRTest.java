/*
 this file is write by wupf
 */
package org.jpf.utils.conf;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import com.alibaba.fastjson.JSON;

/**
* The class <code>JpfConfigUtilTest</code> contains tests for the class <code>{@link JpfConfigUtil}</code>.
* <p>
* Copyright (c) 2019
* 
* @generatedBy wupf at 2019-11-28 19:10:40
* @author Administrator
* @version $Revision: 1.3.0
*/

public class JpfConfigUtil_WRTest {

	/**
	* Run the getStrFromConfig method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:10:40
	* @see public static  String getStrFromConfig(String strFileName,String strKey)   
	*/
	@Test(timeout = 1000)
	public void test_getStrFromConfig_R6() throws Throwable {

		String strFileName = null;
		String strKey = "abc123";

		String wupf_result = JpfConfigUtil.getStrFromConfig(strFileName, strKey);

		System.out.println("jpf_check:getStrFromConfig:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	* Run the getIntFromConfig method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:10:40
	* @see public static  int getIntFromConfig(String strFileName,String sKey)   
	*/
	@Test(timeout = 1000)
	public void test_getIntFromConfig_R48() throws Throwable {

		String strFileName = "abc123";
		String sKey = "abc123";

		int wupf_result = JpfConfigUtil.getIntFromConfig(strFileName, sKey);

		System.out.println("jpf_check:getIntFromConfig:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	* 濞村鐦弬瑙勭《閸掓繂顫愰崠锟�.
	* 
	* @throws Exception 
	*         if the initialization fails for some reason 
	*  
	* @generatedBy wupf at 2019-11-28 19:10:40
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
