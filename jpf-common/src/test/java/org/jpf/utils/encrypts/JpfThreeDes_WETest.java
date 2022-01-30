/*
 * This file was automatically generated by wupf@
 * Thu Nov 28 11:24:35 GMT 2019
 */

package org.jpf.utils.encrypts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Test;

public class JpfThreeDes_WETest {

	@Test(timeout = 1000)
	public void testDecryptModeReturningNull() throws Throwable {
		byte[] byteArray0 = new byte[43];
		byte[] byteArray1 = JpfThreeDes.decryptMode(byteArray0);
		assertNull(byteArray1);
	}

	@Test(timeout = 1000)
	public void testEncryptMode() throws Throwable {
		byte[] byteArray0 = new byte[43];
		byte[] byteArray1 = JpfThreeDes.encryptMode(byteArray0);
		assertNotNull(byteArray1);

		String string0 = JpfThreeDes.byteArr2HexStr(byteArray1);
		assertEquals("d698ec9ea1bc3c61d698ec9ea1bc3c61d698ec9ea1bc3c61d698ec9ea1bc3c61d698ec9ea1bc3c61c3e500c3f4e80bbd",
				string0);
	}

	@Test(timeout = 1000)
	public void testHexStr2ByteArrReturningNonEmptyArray() throws Throwable {
		byte[] byteArray0 = JpfThreeDes.hexStr2ByteArr(
				"d698ec9ea1bc3c61d698ec9ea1bc3c61d698ec9ea1bc3c61d698ec9ea1bc3c61d698ec9ea1bc3c61c3e500c3f4e80bbd");
		assertEquals(48, byteArray0.length);
	}

	@Test(timeout = 1000)
	public void testByte2hexReturningNonEmptyString() throws Throwable {
		byte[] byteArray0 = new byte[43];
		byte[] byteArray1 = JpfThreeDes.encryptMode(byteArray0);
		String string0 = JpfThreeDes.byte2hex(byteArray1);
		assertEquals("D698EC9EA1BC3C61D698EC9EA1BC3C61D698EC9EA1BC3C61D698EC9EA1BC3C61D698EC9EA1BC3C61C3E500C3F4E80BBD",
				string0);
	}

	@Test(timeout = 1000)
	public void testDoDecryptReturningEmptyString() throws Throwable {
		String string0 = JpfThreeDes.DoDecrypt("");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testDoDecryptThrowsStringIndexOutOfBoundsException() throws Throwable {
		// Undeclared exception!
		try {
			JpfThreeDes.DoDecrypt("d");
			fail("Expecting exception: StringIndexOutOfBoundsException");

		} catch (StringIndexOutOfBoundsException e) {
		}
	}

	@Test(timeout = 1000)
	public void testDoDecryptThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfThreeDes.DoDecrypt((String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testDoDecryptThrowsNumberFormatException() throws Throwable {
		// Undeclared exception!
		try {
			JpfThreeDes.DoDecrypt("dhn'U>&0J~Mm#");
			fail("Expecting exception: NumberFormatException");

		} catch (NumberFormatException e) {
			//
			// For input string: \"dh\"
			//
		}
	}

	@Test(timeout = 1000)
	public void testByte2hexThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfThreeDes.byte2hex((byte[]) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testByteArr2HexStrThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfThreeDes.byteArr2HexStr((byte[]) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testHexStr2ByteArrThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfThreeDes.hexStr2ByteArr((String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testHexStr2ByteArrThrowsNumberFormatException() throws Throwable {
		// Undeclared exception!
		try {
			JpfThreeDes.hexStr2ByteArr("naTM44@");
			fail("Expecting exception: NumberFormatException");

		} catch (NumberFormatException e) {
			//
			// For input string: \"na\"
			//
		}
	}

	@Test(timeout = 1000)
	public void testHexStr2ByteArrThrowsStringIndexOutOfBoundsException() throws Throwable {
		// Undeclared exception!
		try {
			JpfThreeDes.hexStr2ByteArr("0");
			fail("Expecting exception: StringIndexOutOfBoundsException");

		} catch (StringIndexOutOfBoundsException e) {
		}
	}

	@Test(timeout = 1000)
	public void testDoDecryptReturningNonEmptyString() throws Throwable {
		String string0 = JpfThreeDes.DoDecrypt("0000");
		assertEquals("\u000B\u000B", string0);
	}

	@Test(timeout = 1000)
	public void testByte2hexReturningEmptyStringAndHexStr2ByteArrReturningEmptyArray() throws Throwable {
		byte[] byteArray0 = JpfThreeDes.hexStr2ByteArr("");
		String string0 = JpfThreeDes.byte2hex(byteArray0);
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testByteArr2HexStrReturningEmptyString() throws Throwable {
		byte[] byteArray0 = new byte[0];
		String string0 = JpfThreeDes.byteArr2HexStr(byteArray0);
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testDecryptModeReturningEmptyArray() throws Throwable {
		byte[] byteArray0 = new byte[0];
		byte[] byteArray1 = JpfThreeDes.decryptMode(byteArray0);
		assertEquals(0, byteArray1.length);
		assertNotNull(byteArray1);
	}

	@Test(timeout = 1000)
	public void testDecryptModeReturningNonEmptyArray() throws Throwable {
		byte[] byteArray0 = new byte[8];
		byte[] byteArray1 = JpfThreeDes.encryptMode(byteArray0);
		byte[] byteArray2 = JpfThreeDes.decryptMode(byteArray1);
		assertEquals(8, byteArray2.length);
		assertNotNull(byteArray2);
	}

	@Test(timeout = 1000)
	public void testEncryptModeReturningNull() throws Throwable {
		byte[] byteArray0 = JpfThreeDes.encryptMode((byte[]) null);
		assertNull(byteArray0);
	}

	@Test(timeout = 1000)
	public void testByteArr2HexStr() throws Throwable {
		byte[] byteArray0 = new byte[8];
		byteArray0[7] = (byte) 16;
		String string0 = JpfThreeDes.byteArr2HexStr(byteArray0);
		assertEquals("0000000000000010", string0);
	}
}