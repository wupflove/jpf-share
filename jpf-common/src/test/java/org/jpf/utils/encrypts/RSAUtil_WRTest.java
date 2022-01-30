/*
 this file is write by wupf
 */
package org.jpf.utils.encrypts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.security.KeyPair;

import javax.crypto.Cipher;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import com.alibaba.fastjson.JSON;

/**
* The class <code>RSAUtilTest</code> contains tests for the class <code>{@link RSAUtil}</code>.
* <p>
* Copyright (c) 2019
* 
* @generatedBy wupf at 2019-11-28 19:27:28
* @author Administrator
* @version $Revision: 1.3.0
*/

public class RSAUtil_WRTest {

	/**
	* Run the getKeyPair method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:27:28
	* @see public static  KeyPair getKeyPair(String filePath) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_getKeyPair_Doc16() throws Throwable {

		try {

			String filePath = JSON.parseObject("鏂囦欢璺緞", String.class);

			KeyPair wupf_result = RSAUtil.getKeyPair(filePath);

			KeyPair expected_result = JSON.parseObject("KeyPair KeyPair", KeyPair.class);
			System.out.println(wupf_result);
			assertEquals(wupf_result, expected_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the getKeyPair method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:27:28
	* @see public static  KeyPair getKeyPair(String filePath) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_getKeyPair_R21() throws Throwable {

		try {

			String filePath = "涓枃";

			KeyPair wupf_result = RSAUtil.getKeyPair(filePath);

			System.out.println("jpf_check:getKeyPair:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the saveKeyPair method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:27:28
	* @see public static  void saveKeyPair(KeyPair kp,String filePath) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_saveKeyPair_Doc23() throws Throwable {

		try {

			KeyPair kp = JSON.parseObject("绉橀挜瀵�", KeyPair.class);
			String filePath = JSON.parseObject("淇濆瓨绉橀挜鐨勬枃浠惰矾寰�", String.class);

			RSAUtil.saveKeyPair(kp, filePath);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the saveKeyPair method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:27:28
	* @see public static  void saveKeyPair(KeyPair kp,String filePath) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_saveKeyPair_R25() throws Throwable {

		try {

			KeyPair kp = null;
			String filePath = null;

			RSAUtil.saveKeyPair(kp, filePath);

			//add check point here, sample: assertEquals(true,          wupf_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the saveKeyPair method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:27:28
	* @see public static  void saveKeyPair(KeyPair kp,String filePath) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_saveKeyPair_R28() throws Throwable {

		try {

			KeyPair kp = null;
			String filePath = "涓枃";

			RSAUtil.saveKeyPair(kp, filePath);

			//add check point here, sample: assertEquals(true,          wupf_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the encryptString method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:27:28
	* @see public static  String encryptString(String plaintext,String publicKey) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_encryptString_Doc49() throws Throwable {

		try {

			String plaintext = JSON.parseObject("寰呭姞瀵嗙殑瀛楃涓�", String.class);
			String publicKey = JSON.parseObject("瀛楃涓插叕閽�", String.class);

			String wupf_result = RSAUtil.encryptString(plaintext, publicKey);

			String expected_result = JSON.parseObject("String", String.class);
			System.out.println(wupf_result);
			assertEquals(wupf_result, expected_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the encryptString method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:27:28
	* @see public static  String encryptString(String plaintext,String publicKey) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_encryptString_R56() throws Throwable {

		try {

			String plaintext = null;
			String publicKey = "abc123";

			String wupf_result = RSAUtil.encryptString(plaintext, publicKey);

			System.out.println("jpf_check:encryptString:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* Run the rsaSplitCodec method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:27:28
	* @see public static  byte[] rsaSplitCodec(Cipher cipher,int opmode,byte[] datas,int keySize) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_rsaSplitCodec_R102() throws Throwable {

		try {

			Cipher cipher = null;
			int opmode = Integer.MAX_VALUE;
			byte[] datas = new byte[10];
			int keySize = Integer.MAX_VALUE;

			byte[] wupf_result = RSAUtil.rsaSplitCodec(cipher, opmode, datas, keySize);

			System.out.println("jpf_check:rsaSplitCodec:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	* 娴嬭瘯鏂规硶鍒濆鍖�.
	* 
	* @throws Exception 
	*         if the initialization fails for some reason 
	*  
	* @generatedBy wupf at 2019-11-28 19:27:28
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
