/*
 this file is write by wupf
 */
package org.jpf.utils.encrypts;

import javax.crypto.IllegalBlockSizeException;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import javax.crypto.spec.SecretKeySpec;
import org.jpf.utils.JpfStringUtil;
import javax.crypto.Cipher;
import org.apache.commons.codec.binary.Base64;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.BadPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.io.UnsupportedEncodingException;

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
* The class <code>AESUtilTest</code> contains tests for the class <code>{@link AESUtil}</code>.
* <p>
* Copyright (c) 2019
* 
* @generatedBy wupf at 2019-11-28 19:20:27
* @author Administrator
* @version $Revision: 1.3.0
*/

public class AESUtil_WRTest {

	/**
	* Run the decryptByCBC method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:20:27
	* @see public static  byte[] decryptByCBC(byte[] content,byte[] key,byte[] initVector)   
	*/
	@Test(timeout = 1000)
	public void test_decryptByCBC_R0() throws Throwable {

		byte[] content = new byte[10];
		byte[] key = new byte[10];
		byte[] initVector = new byte[10];

		byte[] wupf_result = AESUtil.decryptByCBC(content, key, initVector);

		System.out.println("jpf_check:decryptByCBC:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	* Run the encryptByCBC method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:20:27
	* @see public static  byte[] encryptByCBC(byte[] content,byte[] key,byte[] initVector)   
	*/
	@Test(timeout = 1000)
	public void test_encryptByCBC_R1() throws Throwable {

		byte[] content = new byte[10];
		byte[] key = new byte[10];
		byte[] initVector = new byte[10];

		byte[] wupf_result = AESUtil.encryptByCBC(content, key, initVector);

		System.out.println("jpf_check:encryptByCBC:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	* Run the decryptByECB method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:20:27
	* @see public static  byte[] decryptByECB(byte[] content,byte[] key)   
	*/
	@Test(timeout = 1000)
	public void test_decryptByECB_R3() throws Throwable {

		byte[] content = new byte[10];
		byte[] key = new byte[10];

		byte[] wupf_result = AESUtil.decryptByECB(content, key);

		System.out.println("jpf_check:decryptByECB:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	* 娴嬭瘯鏂规硶鍒濆鍖�.
	* 
	* @throws Exception 
	*         if the initialization fails for some reason 
	*  
	* @generatedBy wupf at 2019-11-28 19:20:27
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
