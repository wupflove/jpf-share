/*
 * This file was automatically generated by wupf@
 * Thu Nov 28 11:11:48 GMT 2019
 */

package org.jpf.utils.conf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Test;


public class JpfConfigUtil_WETest {

	@Test(timeout = 1000)
	public void testGetStrFromConfigTaking2ArgumentsReturningEmptyString() throws Throwable {
		String string0 = JpfConfigUtil.getStrFromConfig("i[=F4<)X'", "i[=F4<)X'");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testGetStrFromConfigWithExceptionThrowsNullPointerException() throws Throwable {
		try {
			JpfConfigUtil.getStrFromConfigWithException((String) null, (String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testSaveToPropFileThrowsArrayIndexOutOfBoundsException() throws Throwable {
		// Undeclared exception!
		try {
			JpfConfigUtil.saveToPropFile("key cannot be null", "0u4:fH8A}% [",
					"org.apache.logging.log4j.util.EnvironmentPropertySource");
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch (ArrayIndexOutOfBoundsException e) {
			//
			// 1
			//
		}
	}

	@Test(timeout = 1000)
	public void testSaveToPropFileThrowsException() throws Throwable {
		try {
			JpfConfigUtil.saveToPropFile("", "not find value for :", ",)z#-cfPs,");
			fail("Expecting exception: Exception");

		} catch (Exception e) {
			//
			// IOException:
			//
		}
	}

	@Test(timeout = 1000)
	public void testGetIntFromConfigTaking3ArgumentsReturningNegative() throws Throwable {
		int int0 = JpfConfigUtil.getIntFromConfig("", "", (-1));
		assertEquals((-1), int0);
	}

	@Test(timeout = 1000)
	public void testGetStrFromConfigTaking3ArgumentsReturningNull() throws Throwable {
		String string0 = JpfConfigUtil.getStrFromConfig("nJ$ ,)\";3)l8C", "=", (String) null);
		assertNull(string0);
	}

}