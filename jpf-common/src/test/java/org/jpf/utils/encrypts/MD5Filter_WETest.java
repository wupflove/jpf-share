/*
 * This file was automatically generated by wupf@
 * Thu Nov 28 11:26:16 GMT 2019
 */

package org.jpf.utils.encrypts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MD5Filter_WETest {


	@Test(timeout = 1000)
	public void testGetMd5ByStringReturningNonEmptyString() throws Throwable {
		String string0 = MD5Filter.getMd5ByString(" a");
		assertEquals("952988da97fbd8f2ea65990c03eac425", string0);
	}

	@Test(timeout = 1000)
	public void testGetMd5ByStringReturningEmptyString() throws Throwable {
		String string0 = MD5Filter.getMd5ByString((String) null);
		assertEquals("", string0);
		assertNotNull(string0);
	}

}
