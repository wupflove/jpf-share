/*
 * This file was automatically generated by wupf@
 * Thu Nov 28 11:29:18 GMT 2019
 */

package org.jpf.utils.encrypts;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Map;

import javax.crypto.Cipher;

import org.junit.Test;

public class RSAUtil_WETest {

	@Test(timeout = 1000)
	public void testGenerateKeyPairThrowsInvalidParameterException() throws Throwable {
		// Undeclared exception!
		try {
			RSAUtil.generateKeyPair(1);
			fail("Expecting exception: InvalidParameterException");

		} catch (InvalidParameterException e) {
		}
	}

	@Test(timeout = 1000)
	public void testGetPublicKeyTakingKeyPairThrowsNullPointerException() throws Throwable {
		KeyPair keyPair0 = new KeyPair((PublicKey) null, (PrivateKey) null);
		// Undeclared exception!
		try {
			RSAUtil.getPublicKey(keyPair0);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testDecryptStringThrowsRuntimeException() throws Throwable {
		// Undeclared exception!
		try {
			RSAUtil.decryptString("9", "9");
			fail("Expecting exception: RuntimeException");

		} catch (RuntimeException e) {
			//
			// An exception occurred while decrypting the string [9]
			//
		}
	}

	@Test(timeout = 1000)
	public void testGetKeyPairThrowsFileNotFoundException() throws Throwable {
		try {
			RSAUtil.getKeyPair("EP8C");
			fail("Expecting exception: FileNotFoundException");

		} catch (FileNotFoundException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testSaveKeyPair() throws Throwable {
		KeyPair keyPair0 = new KeyPair((PublicKey) null, (PrivateKey) null);
		RSAUtil.saveKeyPair(keyPair0, "driX#gC1E:");
	}

	@Test(timeout = 1000)
	public void testGetPrivateKeyTakingKeyPairThrowsNullPointerException() throws Throwable {
		KeyPair keyPair0 = new KeyPair((PublicKey) null, (PrivateKey) null);
		// Undeclared exception!
		try {
			RSAUtil.getPrivateKey(keyPair0);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testGetPublicKeyTakingString() throws Throwable {
		RSAPublicKey rSAPublicKey0 = RSAUtil.getPublicKey("driX#gC1E:");
		assertNull(rSAPublicKey0);
	}

	@Test(timeout = 1000)
	public void testPublicEncryptThrowsRuntimeException() throws Throwable {
		// Undeclared exception!
		try {
			RSAUtil.publicEncrypt("vYI1+D|woqD}[xr46", (RSAPublicKey) null);
			fail("Expecting exception: RuntimeException");

		} catch (RuntimeException e) {
			//
			// An exception occurred while encrypting the string [vYI1+D|woqD}[xr46]
			//
		}
	}

	@Test(timeout = 1000)
	public void testEncryptString() throws Throwable {
		String string0 = RSAUtil.encryptString((String) null, (String) null);
		assertNull(string0);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testEncryptStringThrowsIllegalArgumentException() throws Throwable {

		RSAUtil.encryptString("H%-40b?iCyJv", "H%-40b?iCyJv");
		fail("Expecting exception: IllegalArgumentException");

	}

	@Test(timeout = 1000)
	public void testRsaSplitCodecThrowsRuntimeException() throws Throwable {
		byte[] byteArray0 = new byte[7];
		try {
			RSAUtil.rsaSplitCodec((Cipher) null, 1938, byteArray0, (byte) 0);
			fail("Expecting exception: RuntimeException");

		} catch (RuntimeException e) {
			//
			// An exception occurred when the encryption and decryption threshold was [-11]
			//
		}
	}

	@Test(timeout = 1000)
	public void testRsaSplitCodec() throws Throwable {
		byte[] byteArray0 = new byte[0];
		byte[] byteArray1 = RSAUtil.rsaSplitCodec((Cipher) null, 79, byteArray0, 0);
		assertNotSame(byteArray0, byteArray1);
	}

	@Test(timeout = 1000)
	public void testPrivateDecryptThrowsRuntimeException() throws Throwable {
		// Undeclared exception!
		try {
			RSAUtil.privateDecrypt("}_wH#ok.6A*", (RSAPrivateKey) null);
			fail("Expecting exception: RuntimeException");

		} catch (RuntimeException e) {
			//
			// An exception occurred while decrypting the string [}_wH#ok.6A*]
			//
		}
	}

	@Test(timeout = 1000)
	public void testGetPrivateKeyTakingString() throws Throwable {
		RSAPrivateKey rSAPrivateKey0 = RSAUtil.getPrivateKey("driX#gC1E:");
		assertNull(rSAPrivateKey0);
	}

	@Test(timeout = 1000)
	public void testEncryptStringThrowsRuntimeException() throws Throwable {
		try {
			RSAUtil.encryptString("k5@P#", "pS<34(<ge*%Z-}Y1,l");
			fail("Expecting exception: RuntimeException");

		} catch (RuntimeException e) {
			//
			// An exception occurred while encrypting the string [k5@P#]
			//
		}
	}


	@Test(timeout = 1000)
	public void testCreateKeysReturningNull() throws Throwable {
		Map<String, String> map0 = RSAUtil.createKeys((-245));
		assertNull(map0);
	}
}
