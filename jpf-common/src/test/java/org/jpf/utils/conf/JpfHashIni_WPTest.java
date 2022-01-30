/*
 * This file was automatically generated by wupf@
 * Thu Nov 28 11:14:34 GMT 2019
 */

package org.jpf.utils.conf;

import org.junit.Test;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.*;
import java.io.IOException;
import org.jpf.utils.conf.JpfHashIni;

public class JpfHashIni_WPTest {

	@Test(timeout = 1000)
	public void testWriteIniWithEmptyString() throws Throwable {
		try {
			JpfHashIni.writeIni("");
			fail("Expecting exception: IOException");

		} catch (IOException e) {
			//
			// no file name given
			//
		}
	}

}
