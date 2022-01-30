/*
 this file is write by wupf
 */
package org.jpf.utils.dbsql;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import com.alibaba.fastjson.JSON;

/**
* The class <code>DbInfoUtilsTest</code> contains tests for the class <code>{@link DbInfoWork}</code>.
* <p>
* Copyright (c) 2019
* 
* @generatedBy wupf at 2019-11-28 19:15:44
* @author Administrator
* @version $Revision: 1.3.0
*/

public class DbInfoWork_WRTest {

	/**
	* Run the GetTablePK method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:15:44
	* @see public static  String GetTablePK(Connection conn,String TableName) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_GetTablePK_R0() throws Throwable {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			String TableName = "abc123";

			String wupf_result = new DbInfoWork().GetTablePK(conn, TableName);

			System.out.println("jpf_check:GetTablePK:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the GetTablePK method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:15:44
	* @see public static  String GetTablePK(Connection conn,String TableName) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_GetTablePK_R1() throws Throwable {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			String TableName = null;

			String wupf_result = new DbInfoWork().GetTablePK(conn, TableName);

			System.out.println("jpf_check:GetTablePK:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the GetTablePK method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:15:44
	* @see public static  String GetTablePK(Connection conn,String TableName) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_GetTablePK_R2() throws Throwable {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			String TableName = "";

			String wupf_result = new DbInfoWork().GetTablePK(conn, TableName);

			System.out.println("jpf_check:GetTablePK:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the GetTablePK method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:15:44
	* @see public static  String GetTablePK(Connection conn,String TableName) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_GetTablePK_R3() throws Throwable {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			String TableName = "123";

			String wupf_result = new DbInfoWork().GetTablePK(conn, TableName);

			System.out.println("jpf_check:GetTablePK:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the GetTablePK method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:15:44
	* @see public static  String GetTablePK(Connection conn,String TableName) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_GetTablePK_R4() throws Throwable {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			String TableName = "中文";

			String wupf_result = new DbInfoWork().GetTablePK(conn, TableName);

			System.out.println("jpf_check:GetTablePK:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the GetTablePK method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:15:44
	* @see public static  String GetTablePK(Connection conn,String TableName) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_GetTablePK_R5() throws Throwable {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			String TableName = "中文123abc";

			String wupf_result = new DbInfoWork().GetTablePK(conn, TableName);

			System.out.println("jpf_check:GetTablePK:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the GetTableColumn method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:15:44
	* @see public static  String GetTableColumn(Connection conn,String TableName) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_GetTableColumn_R6() throws Throwable {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			String TableName = "abc123";

			String wupf_result = new DbInfoWork().GetTableColumn(conn, TableName);

			System.out.println("jpf_check:GetTableColumn:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the GetTableColumn method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:15:44
	* @see public static  String GetTableColumn(Connection conn,String TableName) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_GetTableColumn_R7() throws Throwable {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			String TableName = null;

			String wupf_result = new DbInfoWork().GetTableColumn(conn, TableName);

			System.out.println("jpf_check:GetTableColumn:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the GetTableColumn method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:15:44
	* @see public static  String GetTableColumn(Connection conn,String TableName) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_GetTableColumn_R8() throws Throwable {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			String TableName = "";

			String wupf_result = new DbInfoWork().GetTableColumn(conn, TableName);

			System.out.println("jpf_check:GetTableColumn:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the GetTableColumn method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:15:44
	* @see public static  String GetTableColumn(Connection conn,String TableName) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_GetTableColumn_R9() throws Throwable {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			String TableName = "123";

			String wupf_result = new DbInfoWork().GetTableColumn(conn, TableName);

			System.out.println("jpf_check:GetTableColumn:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the GetTableColumn method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:15:44
	* @see public static  String GetTableColumn(Connection conn,String TableName) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_GetTableColumn_R10() throws Throwable {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			String TableName = "中文";

			String wupf_result = new DbInfoWork().GetTableColumn(conn, TableName);

			System.out.println("jpf_check:GetTableColumn:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the GetTableColumn method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:15:44
	* @see public static  String GetTableColumn(Connection conn,String TableName) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_GetTableColumn_R11() throws Throwable {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			String TableName = "中文123abc";

			String wupf_result = new DbInfoWork().GetTableColumn(conn, TableName);

			System.out.println("jpf_check:GetTableColumn:" + JSON.toJSONString(wupf_result));
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
	* @generatedBy wupf at 2019-11-28 19:15:44
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
