package org.jpf.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>JpfNumberUtil_WGTest</code> contains tests for the class <code>{@link JpfNumberUtil}</code>.
 *
 * @generatedBy wupf at 21-4-28 下午4:05
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class JpfNumberUtil_WGTest {
	/**
	 * Run the List getBetweenNumbers(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testGetBetweenNumbers_1()
		throws Exception {
		int minValue = 1;
		int maxValue = 1;

		List result = JpfNumberUtil.getInstance() .getBetweenNumbers(minValue, maxValue);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List getBetweenNumbers(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testGetBetweenNumbers_2()
		throws Exception {
		int minValue = 1;
		int maxValue = 1;

		List result = JpfNumberUtil.getInstance().getBetweenNumbers(minValue, maxValue);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	@Test(timeout = 1000)
	public void testGetBetweenNumbersReturningListWhereIsEmptyIsFalse() throws Throwable {
		List list0 = JpfNumberUtil.getInstance().getBetweenNumbers((-50), (-11));
		assertEquals(39, list0.size());
	}

	@Test(timeout = 1000)
	public void testGetBetweenNumbersReturningListWhereIsEmptyIsTrue() throws Throwable {
		List list0 = JpfNumberUtil.getInstance().getBetweenNumbers((-1), (-293));
		assertEquals(0, list0.size());
	}
	
	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JpfNumberUtil_WGTest.class);
	}
}