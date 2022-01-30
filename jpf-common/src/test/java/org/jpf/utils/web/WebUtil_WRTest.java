/*
 this file is write by wupf
 */
package org.jpf.utils.web;

import javax.servlet.ServletException;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;

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
import org.junit.Before;

/**
* The class <code>WebUtilTest</code> contains tests for the class <code>{@link WebUtil}</code>.
* <p>
* Copyright (c) 2019
* 
* @generatedBy wupf at 2019-11-28 20:29:47
* @author Administrator
* @version $Revision: 1.3.0
*/

public class WebUtil_WRTest {

	/**
	* Run the getRequestForLong method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:29:47
	* @see public static  long getRequestForLong(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_getRequestForLong_R49() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "abc123";

			long wupf_result = WebUtil.getRequestForLong(request, strRequest);

			System.out.println("jpf_check:getRequestForLong:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForLong method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:29:47
	* @see public static  long getRequestForLong(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_getRequestForLong_R50() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = null;

			long wupf_result = WebUtil.getRequestForLong(request, strRequest);

			System.out.println("jpf_check:getRequestForLong:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForLong method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:29:47
	* @see public static  long getRequestForLong(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_getRequestForLong_R51() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "";

			long wupf_result = WebUtil.getRequestForLong(request, strRequest);

			System.out.println("jpf_check:getRequestForLong:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForLong method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:29:47
	* @see public static  long getRequestForLong(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_getRequestForLong_R52() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "123";

			long wupf_result = WebUtil.getRequestForLong(request, strRequest);

			System.out.println("jpf_check:getRequestForLong:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForLong method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:29:47
	* @see public static  long getRequestForLong(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_getRequestForLong_R53() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "中文";

			long wupf_result = WebUtil.getRequestForLong(request, strRequest);

			System.out.println("jpf_check:getRequestForLong:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForLong method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:29:47
	* @see public static  long getRequestForLong(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_getRequestForLong_R54() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "中文123abc";

			long wupf_result = WebUtil.getRequestForLong(request, strRequest);

			System.out.println("jpf_check:getRequestForLong:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForDouble method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:29:47
	* @see public static  double getRequestForDouble(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_getRequestForDouble_R55() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "abc123";

			double wupf_result = WebUtil.getRequestForDouble(request, strRequest);

			System.out.println("jpf_check:getRequestForDouble:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForDouble method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:29:47
	* @see public static  double getRequestForDouble(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_getRequestForDouble_R56() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = null;

			double wupf_result = WebUtil.getRequestForDouble(request, strRequest);

			System.out.println("jpf_check:getRequestForDouble:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForDouble method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:29:47
	* @see public static  double getRequestForDouble(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_getRequestForDouble_R57() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "";

			double wupf_result = WebUtil.getRequestForDouble(request, strRequest);

			System.out.println("jpf_check:getRequestForDouble:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForDouble method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:29:47
	* @see public static  double getRequestForDouble(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_getRequestForDouble_R58() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "123";

			double wupf_result = WebUtil.getRequestForDouble(request, strRequest);

			System.out.println("jpf_check:getRequestForDouble:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForDouble method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:29:47
	* @see public static  double getRequestForDouble(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_getRequestForDouble_R59() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "中文";

			double wupf_result = WebUtil.getRequestForDouble(request, strRequest);

			System.out.println("jpf_check:getRequestForDouble:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForDouble method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:29:47
	* @see public static  double getRequestForDouble(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_getRequestForDouble_R60() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "中文123abc";

			double wupf_result = WebUtil.getRequestForDouble(request, strRequest);

			System.out.println("jpf_check:getRequestForDouble:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* 测试方法初始化.
	* 
	* @throws Exception 
	*         if the initialization fails for some reason 
	*  
	* @generatedBy wupf at 2019-11-28 20:29:47
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
