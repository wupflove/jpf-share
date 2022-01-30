package org.jpf.utils.encrypts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>JpfThreeDes_WGTest</code> contains tests for the class
 * <code>{@link JpfThreeDes}</code>.
 *
 * @generatedBy wupf at 20-5-6 下午12:21
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class JpfThreeDes_WGTest {

	@Test(timeout = 1000)
	public void testByteArr2HexStr0() throws Throwable {
		byte[] byteArray0 = new byte[3];
		byteArray0[1] = (byte) (-127);
		String string0 = JpfThreeDes.byteArr2HexStr(byteArray0);
		assertEquals("008100", string0);
	}

	@Test(timeout = 1000)
	public void testByte2hexReturningNonEmptyString() throws Throwable {
		byte[] byteArray0 = new byte[3];
		byteArray0[1] = (byte) (-127);
		String string0 = JpfThreeDes.byte2hex(byteArray0);
		assertEquals("008100", string0);
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
	public void testByteArr2HexStrReturningEmptyString() throws Throwable {
		byte[] byteArray0 = JpfThreeDes.hexStr2ByteArr("");
		String string0 = JpfThreeDes.byteArr2HexStr(byteArray0);
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testDecryptModeReturningEmptyArray() throws Throwable {
		byte[] byteArray0 = JpfThreeDes.hexStr2ByteArr("");
		byte[] byteArray1 = JpfThreeDes.decryptMode(byteArray0);
		assertNotNull(byteArray1);
		assertEquals(0, byteArray1.length);
	}

	/**
	 * Run the String byte2hex(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-6 下午12:21
	 */
	@Test(timeout = 3000)
	public void testByte2hex_1() throws Exception {
		byte[] b = new byte[] { (byte) 1 };

		String result = JpfThreeDes.byte2hex(b);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String byte2hex(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-6 下午12:21
	 */
	@Test(timeout = 3000)
	public void testByte2hex_3() throws Exception {
		byte[] b = new byte[] {};

		String result = JpfThreeDes.byte2hex(b);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String byteArr2HexStr(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-6 下午12:21
	 */
	@Test(timeout = 3000)
	public void testByteArr2HexStr_1() throws Exception {
		byte[] arrB = new byte[] { (byte) -1 };

		String result = JpfThreeDes.byteArr2HexStr(arrB);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String byteArr2HexStr(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-6 下午12:21
	 */
	@Test(timeout = 3000)
	public void testByteArr2HexStr_2() throws Exception {
		byte[] arrB = new byte[] { (byte) 16 };

		String result = JpfThreeDes.byteArr2HexStr(arrB);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String byteArr2HexStr(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-6 下午12:21
	 */
	@Test(timeout = 3000)
	public void testByteArr2HexStr_3() throws Exception {
		byte[] arrB = new byte[] {};

		String result = JpfThreeDes.byteArr2HexStr(arrB);

		// add additional test code here
		assertNotNull(result);
	}

	@Test(timeout = 3000)
	public void testmain_1() throws Exception {

		String stra = "abcdef";
		stra = JpfThreeDes.DoDecrypt(stra);
		System.out.println(stra);

	}

	/**
	 * Run the byte[] encryptMode(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-6 下午12:21
	 */
	@Test(timeout = 3000)
	public void testEncryptMode_1() throws Exception {
		byte[] src = new byte[] {};

		byte[] result = JpfThreeDes.encryptMode(src);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] hexStr2ByteArr(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-6 下午12:21
	 */
	@Test(timeout = 3000)
	public void testHexStr2ByteArr_1() throws Exception {
		String strIn = "";

		byte[] result = JpfThreeDes.hexStr2ByteArr(strIn);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 20-5-6 下午12:21
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy wupf at 20-5-6 下午12:21
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JpfThreeDes_WGTest.class);
	}
}
