/*
 this file is write by wupf
 */
package org.jpf.mlgb;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import java.util.Enumeration;
import java.util.Date;
import java.net.NetworkInterface;
import java.net.InetAddress;
import java.net.SocketException;
import org.jpf.utils.JpfDateTimeUtil;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;
import com.alibaba.fastjson.JSON;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import java.lang.reflect.Method;
import org.junit.Before;

/**
* The class <code>MlgbzTest</code> contains tests for the class <code>{@link Mlgbz}</code>.
* <p>
* Copyright (c) 2019
* 
* @generatedBy wupf at 2019-11-28 19:05:39
* @author Administrator
* @version $Revision: 1.3.0
*/

public class Mlgbz_WRTest {

	/**
	* Run the w3 method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:05:39
	* @see private static   String w3()   
	*/
	@Test(timeout = 1000)
	public void test_w3_NP2() throws Throwable {

		Mlgbz wupf_fixture = new Mlgbz();
		Class testClass = wupf_fixture.getClass();
		Class[] typeParams = new Class[] {};
		Object objParams[] = {};

		Method method = testClass.getDeclaredMethod("w3", typeParams);
		method.setAccessible(true);
		String wupf_result = (String) method.invoke(wupf_fixture, objParams);

		System.out.println("jpf_check:w3:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	* 娴嬭瘯鏂规硶鍒濆鍖�.
	* 
	* @throws Exception 
	*         if the initialization fails for some reason 
	*  
	* @generatedBy wupf at 2019-11-28 19:05:39
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
