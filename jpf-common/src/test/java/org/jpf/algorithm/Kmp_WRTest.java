/*
 this file is write by wupf
 */
package org.jpf.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

/**
* The class <code>KmpTest</code> contains tests for the class <code>{@link Kmp}</code>.
* <p>
* Copyright (c) 2019
* 
* @generatedBy wupf at 2019-11-28 18:54:54
* @author Administrator
* @version $Revision: 1.3.0
*/

public class Kmp_WRTest {

	/**
	* Run the Kmp method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 18:54:54
	* @see public   Kmp(String s,String t)   
	*/
	@Test(timeout = 1000)
	public void testKmp_0() throws Exception {

		String cc_s = "abc123";
		String cc_t = "abc123";
		Kmp wupf= new Kmp();
		int result=wupf.KMP_Index(cc_s, cc_t);
		assertEquals(0,result);
	}

	/**
	* Run the Kmp method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 18:54:54
	* @see public   Kmp(String s,String t)   
	*/
	@Test(timeout = 1000)
	public void testKmp_3() throws Exception {

		String cc_s = "abc123";
		String cc_t = "123";
		Kmp wupf= new Kmp();
		int result=wupf.KMP_Index(cc_s, cc_t);
		assertEquals(3,result);

	}

	/**
	* 濞村鐦弬瑙勭《閸掓繂顫愰崠锟�.
	* 
	* @throws Exception 
	*         if the initialization fails for some reason 
	*  
	* @generatedBy wupf at 2019-11-28 18:54:54
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
