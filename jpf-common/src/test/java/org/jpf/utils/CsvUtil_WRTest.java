/*
 this file is write by wupf
 */
package org.jpf.utils;

import java.util.Vector;

import org.jpf.utils.CsvUtil;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

/**
* The class <code>CsvUtilTest</code> contains tests for the class <code>{@link CsvUtil}</code>.
* <p>
* Copyright (c) 2019
* 
* @generatedBy wupf at 2019-11-28 19:14:37
* @author Administrator
* @version $Revision: 1.3.0
*/

public class CsvUtil_WRTest {

	/**
	* Run the appendCsv method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:14:37
	* @see public static  void appendCsv(final String strCsvFileName,final String content)   
	*/
	@Test(timeout = 1000)
	public void test_appendCsv_R0() throws Throwable {

		String strCsvFileName = "abc123";
		String content = "abc123";

		CsvUtil.appendCsv(strCsvFileName, content);

		//add check point here, sample: assertEquals(true,          wupf_result);

	}

	/**
	* Run the appendCsv method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:14:37
	* @see public static  void appendCsv(final String strCsvFileName,final String content)   
	*/
	@Test(timeout = 1000)
	public void test_appendCsv_R10() throws Throwable {

		String strCsvFileName = null;
		String content = "中文";

		CsvUtil.appendCsv(strCsvFileName, content);

		//add check point here, sample: assertEquals(true,          wupf_result);

	}

	/**
	* Run the appendToCsv method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:14:37
	* @see public static  void appendToCsv(String strCsvFileName,StringBuilder sb) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_appendToCsv_R12() throws Throwable {

		try {

			String strCsvFileName = "abc123";
			StringBuilder sb = new StringBuilder("abc123");
			CsvUtil.appendToCsv(strCsvFileName, sb);

			//add check point here, sample: assertEquals(true,          wupf_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the writeToCsv method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:14:37
	* @see public static  void writeToCsv(String strCsvFileName,StringBuilder sb) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_writeToCsv_R26() throws Throwable {

		try {

			String strCsvFileName = "abc123";
			StringBuilder sb = new StringBuilder("abc123");
			CsvUtil.writeToCsv(strCsvFileName, sb);

			//add check point here, sample: assertEquals(true,          wupf_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the writeToCsv method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:14:37
	* @see public static  void writeToCsv(String strCsvFileName,String str) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_writeToCsv_R40() throws Throwable {

		try {

			String strCsvFileName = "abc123";
			String str = "abc123";

			CsvUtil.writeToCsv(strCsvFileName, str);

			//add check point here, sample: assertEquals(true,          wupf_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the writeToCsv method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:14:37
	* @see public static  void writeToCsv(String strCsvFileName,String str) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_writeToCsv_R46() throws Throwable {

		try {

			String strCsvFileName = null;
			String str = "abc123";

			CsvUtil.writeToCsv(strCsvFileName, str);

			//add check point here, sample: assertEquals(true,          wupf_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the writeToCsv method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:14:37
	* @see public static  void writeToCsv(String strCsvFileName,Vector<String[]> vStrings) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_writeToCsv_R52() throws Throwable {

		try {

			String strCsvFileName = "abc123";
			Vector<String[]> vStrings = null;

			CsvUtil.writeToCsv(strCsvFileName, vStrings);

			//add check point here, sample: assertEquals(true,          wupf_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the writeToCsv method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:14:37
	* @see public static  void writeToCsv(String strCsvFileName,Vector<String[]> vStrings) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_writeToCsv_R54() throws Throwable {

		try {

			String strCsvFileName = null;
			Vector<String[]> vStrings = null;

			CsvUtil.writeToCsv(strCsvFileName, vStrings);

			//add check point here, sample: assertEquals(true,          wupf_result);

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
	* @generatedBy wupf at 2019-11-28 19:14:37
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
