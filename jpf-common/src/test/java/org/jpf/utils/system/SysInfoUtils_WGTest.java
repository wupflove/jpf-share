package org.jpf.utils.system;

import org.junit.*;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.*;

/**
 * The class <code>SysInfoUtils_WGTest</code> contains tests for the class <code>{@link SysInfoUtils}</code>.
 *
 * @generatedBy wupf at 20-5-7 上午10:15
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class SysInfoUtils_WGTest {

	/**
	 * Run the String GetJvmPid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test(timeout = 3000)
	public void testGetJvmPid_1() throws Exception {

		String result = SysInfoUtils.GetJvmPid();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setHttpProxy(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test(timeout = 3000)
	public void testSetHttpProxy_1() throws Exception {
		String host = "";
		String port = "";

		SysInfoUtils.setHttpProxy(host, port);

		// add additional test code here
	}

	/**
	 * Run the void setHttpProxy(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test(timeout = 3000)
	public void testSetHttpProxy_2() throws Exception {
		String host = "";
		String port = "";
		String username = "";
		String password = "";

		SysInfoUtils.setHttpProxy(host, port, username, password);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
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
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SysInfoUtils_WGTest.class);
	}
}
