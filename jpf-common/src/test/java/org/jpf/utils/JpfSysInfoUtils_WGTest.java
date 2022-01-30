package org.jpf.utils;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>JpfSysInfoUtils_WGTest</code> contains tests for the class
 * <code>{@link JpfSysInfoUtil}</code>.
 *
 * @generatedBy wupf at 22-1-15 下午6:23
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class JpfSysInfoUtils_WGTest {
	/**
	 * Run the JpfSysInfoUtils() constructor test.
	 *
	 * @generatedBy wupf at 22-1-15 下午6:23
	 */
	@Test
	public void testJpfSysInfoUtils_1() throws Exception {
		JpfSysInfoUtil result = new JpfSysInfoUtil();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void setHttpProxy(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 22-1-15 下午6:23
	 */
	@Test
	public void testSetHttpProxy_1() throws Exception {
		String host = "";
		String port = "";

		JpfSysInfoUtil.setHttpProxy(host, port);

		// add additional test code here
	}

	/**
	 * Run the void setHttpProxy(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 22-1-15 下午6:23
	 */
	@Test
	public void testSetHttpProxy_2() throws Exception {
		String host = "";
		String port = "";
		String username = "";
		String password = "";

		JpfSysInfoUtil.setHttpProxy(host, port, username, password);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 22-1-15 下午6:23
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception if the clean-up fails for some reason
	 *
	 * @generatedBy wupf at 22-1-15 下午6:23
	 */
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy wupf at 22-1-15 下午6:23
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JpfSysInfoUtils_WGTest.class);
	}
}