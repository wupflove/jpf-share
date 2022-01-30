package org.jpf.utils;

import org.junit.*;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import org.jpf.utils.AntToMaven;

import static org.junit.Assert.*;

/**
 * The class <code>AntToMaven_WGTest</code> contains tests for the class <code>{@link AntToMaven}</code>.
 *
 * @generatedBy wupf at 20-5-7 上午10:14
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class AntToMaven_WGTest {
	/**
	 * Run the AntToMaven(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:14
	 */
	@Test(timeout = 3000)
	public void testAntToMaven_1() throws Exception {
		String strFilePath = "";
		String strPomPath = "";

		AntToMaven result = new AntToMaven(strFilePath, strPomPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void addUnit(StringBuilder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:14
	 */
	@Test(timeout = 3000)
	public void testAddUnit_1() throws Exception {
		AntToMaven fixture = new AntToMaven("", "");
		StringBuilder sb = new StringBuilder();

		fixture.addUnit(sb);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 20-5-7 上午10:14
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
	 * @generatedBy wupf at 20-5-7 上午10:14
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AntToMaven_WGTest.class);
	}
}
