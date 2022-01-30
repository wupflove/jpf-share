/*
 this file is write by wupf
 */
package org.jpf.utils.web;

import javax.servlet.http.HttpServletRequest;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.Assert.fail;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;
import com.alibaba.fastjson.JSON;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

/**
* The class <code>JpfRequestUtilTest</code> contains tests for the class <code>{@link JpfRequestUtil}</code>.
* Copyright (c) 2020
* 
* @generatedBy wupf at 2020-05-07 10:23:31
* @version 1.0.0
*/

public class JpfRequestUtil_WRTest {

	/**
	* Run the getRequestForInt method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2020-05-07 10:23:31
	* @see public static  int getRequestForInt(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForInt_R33() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "abc123";

			int wupf_result = JpfRequestUtil.getRequestForInt(request, strRequest);

			System.out.println(" wupf_check:getRequestForInt:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForInt method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2020-05-07 10:23:31
	* @see public static  int getRequestForInt(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForInt_R34() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = null;

			int wupf_result = JpfRequestUtil.getRequestForInt(request, strRequest);

			System.out.println(" wupf_check:getRequestForInt:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForInt method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2020-05-07 10:23:31
	* @see public static  int getRequestForInt(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForInt_R35() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "";

			int wupf_result = JpfRequestUtil.getRequestForInt(request, strRequest);

			System.out.println(" wupf_check:getRequestForInt:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForInt method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2020-05-07 10:23:31
	* @see public static  int getRequestForInt(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForInt_R36() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "123";

			int wupf_result = JpfRequestUtil.getRequestForInt(request, strRequest);

			System.out.println(" wupf_check:getRequestForInt:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForInt method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2020-05-07 10:23:31
	* @see public static  int getRequestForInt(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForInt_R37() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "中文";

			int wupf_result = JpfRequestUtil.getRequestForInt(request, strRequest);

			System.out.println(" wupf_check:getRequestForInt:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForInt method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2020-05-07 10:23:31
	* @see public static  int getRequestForInt(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForInt_R38() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "中文123abc";

			int wupf_result = JpfRequestUtil.getRequestForInt(request, strRequest);

			System.out.println(" wupf_check:getRequestForInt:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getRequestForInt method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2020-05-07 10:23:31
	* @see public static  int getRequestForInt(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForInt_R39() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "abc def";

			int wupf_result = JpfRequestUtil.getRequestForInt(request, strRequest);

			System.out.println(" wupf_check:getRequestForInt:" + JSON.toJSONString(wupf_result));
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
	* @2020-05-07 10:23:31
	* @see public static  long getRequestForLong(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForLong_R53() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "abc123";

			long wupf_result = JpfRequestUtil.getRequestForLong(request, strRequest);

			System.out.println(" wupf_check:getRequestForLong:" + JSON.toJSONString(wupf_result));
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
	* @2020-05-07 10:23:31
	* @see public static  long getRequestForLong(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForLong_R54() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = null;

			long wupf_result = JpfRequestUtil.getRequestForLong(request, strRequest);

			System.out.println(" wupf_check:getRequestForLong:" + JSON.toJSONString(wupf_result));
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
	* @2020-05-07 10:23:31
	* @see public static  long getRequestForLong(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForLong_R55() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "";

			long wupf_result = JpfRequestUtil.getRequestForLong(request, strRequest);

			System.out.println(" wupf_check:getRequestForLong:" + JSON.toJSONString(wupf_result));
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
	* @2020-05-07 10:23:31
	* @see public static  long getRequestForLong(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForLong_R56() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "123";

			long wupf_result = JpfRequestUtil.getRequestForLong(request, strRequest);

			System.out.println(" wupf_check:getRequestForLong:" + JSON.toJSONString(wupf_result));
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
	* @2020-05-07 10:23:31
	* @see public static  long getRequestForLong(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForLong_R57() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "中文";

			long wupf_result = JpfRequestUtil.getRequestForLong(request, strRequest);

			System.out.println(" wupf_check:getRequestForLong:" + JSON.toJSONString(wupf_result));
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
	* @2020-05-07 10:23:31
	* @see public static  long getRequestForLong(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForLong_R58() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "中文123abc";

			long wupf_result = JpfRequestUtil.getRequestForLong(request, strRequest);

			System.out.println(" wupf_check:getRequestForLong:" + JSON.toJSONString(wupf_result));
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
	* @2020-05-07 10:23:31
	* @see public static  long getRequestForLong(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForLong_R59() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "abc def";

			long wupf_result = JpfRequestUtil.getRequestForLong(request, strRequest);

			System.out.println(" wupf_check:getRequestForLong:" + JSON.toJSONString(wupf_result));
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
	* @2020-05-07 10:23:31
	* @see public static  double getRequestForDouble(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForDouble_R73() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "abc123";

			double wupf_result = JpfRequestUtil.getRequestForDouble(request, strRequest);

			System.out.println(" wupf_check:getRequestForDouble:" + JSON.toJSONString(wupf_result));
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
	* @2020-05-07 10:23:31
	* @see public static  double getRequestForDouble(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForDouble_R74() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = null;

			double wupf_result = JpfRequestUtil.getRequestForDouble(request, strRequest);

			System.out.println(" wupf_check:getRequestForDouble:" + JSON.toJSONString(wupf_result));
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
	* @2020-05-07 10:23:31
	* @see public static  double getRequestForDouble(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForDouble_R75() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "";

			double wupf_result = JpfRequestUtil.getRequestForDouble(request, strRequest);

			System.out.println(" wupf_check:getRequestForDouble:" + JSON.toJSONString(wupf_result));
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
	* @2020-05-07 10:23:31
	* @see public static  double getRequestForDouble(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForDouble_R76() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "123";

			double wupf_result = JpfRequestUtil.getRequestForDouble(request, strRequest);

			System.out.println(" wupf_check:getRequestForDouble:" + JSON.toJSONString(wupf_result));
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
	* @2020-05-07 10:23:31
	* @see public static  double getRequestForDouble(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForDouble_R77() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "中文";

			double wupf_result = JpfRequestUtil.getRequestForDouble(request, strRequest);

			System.out.println(" wupf_check:getRequestForDouble:" + JSON.toJSONString(wupf_result));
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
	* @2020-05-07 10:23:31
	* @see public static  double getRequestForDouble(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForDouble_R78() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "中文123abc";

			double wupf_result = JpfRequestUtil.getRequestForDouble(request, strRequest);

			System.out.println(" wupf_check:getRequestForDouble:" + JSON.toJSONString(wupf_result));
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
	* @2020-05-07 10:23:31
	* @see public static  double getRequestForDouble(HttpServletRequest request,String strRequest) throws Exception  
	*/
	@Test(timeout = 3000)
	public void test_getRequestForDouble_R79() throws Throwable {

		try {

			HttpServletRequest request = mock(HttpServletRequest.class);
			String strRequest = "abc def";

			double wupf_result = JpfRequestUtil.getRequestForDouble(request, strRequest);

			System.out.println(" wupf_check:getRequestForDouble:" + JSON.toJSONString(wupf_result));
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
