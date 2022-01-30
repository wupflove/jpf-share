package org.jpf.utils.system;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>SystemInfoUtils_WGTest</code> contains tests for the class <code>{@link SystemInfoUtils}</code>.
 *
 * @generatedBy wupf at 20-5-7 上午10:15
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class SystemInfoUtils_WGTest {

	@Test
	public void testmain() {
		System.out.println(SystemInfoUtils.getInstance().getSystemInfo().getNonHeapMemoryUsage());
		System.out.println(SystemInfoUtils.getInstance().getSystemInfo().getArchName());
		System.out.println(SystemInfoUtils.getInstance().getSystemInfo().getOperateName());
		System.out.println(SystemInfoUtils.getInstance().getSystemInfo().getVersionName());
		System.out.println(SystemInfoUtils.getInstance().getSystemInfo().getSystemProperties());

	}

	/**
	 * Run the SystemInfoUtils getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test
	public void testGetInstance_1() throws Exception {

		SystemInfoUtils result = SystemInfoUtils.getInstance();

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
		new org.junit.runner.JUnitCore().run(SystemInfoUtils_WGTest.class);
	}
}
