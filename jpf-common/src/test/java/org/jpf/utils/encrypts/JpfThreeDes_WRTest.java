/*
 this file is write by wupf
 */
package org.jpf.utils.encrypts;

import javax.crypto.spec.SecretKeySpec;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

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
* The class <code>JpfThreeDesTest</code> contains tests for the class <code>{@link JpfThreeDes}</code>.
* <p>
* Copyright (c) 2019
* 
* @generatedBy wupf at 2019-11-28 19:23:26
* @author Administrator
* @version $Revision: 1.3.0
*/

public class JpfThreeDes_WRTest {

	/**
	* Run the byteArr2HexStr method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:23:26
	* @see public static  String byteArr2HexStr(byte[] arrB)   
	*/
	@Test(timeout = 1000)
	public void test_byteArr2HexStr_R0() throws Throwable {

		byte[] arrB = new byte[10];

		String wupf_result = JpfThreeDes.byteArr2HexStr(arrB);

		System.out.println("jpf_check:byteArr2HexStr:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	* 濞村鐦弬瑙勭《閸掓繂顫愰崠锟�.
	* 
	* @throws Exception 
	*         if the initialization fails for some reason 
	*  
	* @generatedBy wupf at 2019-11-28 19:23:26
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
