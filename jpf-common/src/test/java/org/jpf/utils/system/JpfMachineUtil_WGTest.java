package org.jpf.utils.system;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>JpfMachineUtil_WGTest</code> contains tests for the class <code>{@link JpfMachineUtil}</code>.
 *
 * @generatedBy wupf at 20-5-7 上午10:15
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class JpfMachineUtil_WGTest {
	/**
	 * Run the String getHostDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test(timeout = 3000)
	public void testGetHostDesc_1() throws Exception {

		String result = JpfMachineUtil.getHostDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getHostIp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test(timeout = 3000)
	public void testGetHostIp_1() throws Exception {

		String result = JpfMachineUtil.getHostIp();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getHostName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test(timeout = 3000)
	public void testGetHostName_1() throws Exception {

		String result = JpfMachineUtil.getHostName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getProcessNo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test(timeout = 3000)
	public void testGetProcessNo_1() throws Exception {

		String result = JpfMachineUtil.getProcessNo();

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(JpfMachineUtil_WGTest.class);
	}
}
