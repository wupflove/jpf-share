package org.jpf.utils.ga;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>Generic2_WGTest</code> contains tests for the class <code>{@link Generic2}</code>.
 *
 * @generatedBy wupf at 21-3-3 上午11:55
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class Generic2_WGTest {
	/**
	 * Run the String getType(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-3-3 上午11:55
	 */
	@Test
	public void testGetType_1() throws Exception {
		Object o = new Object();

		String result = Generic2.getType(o);

		// add additional test code here
		assertEquals("class java.lang.Object", result);
	}

	/**
	 * @category @param args
	 * @since 2021年1月13日
	 * @Author wupingfu
	 */
	@Test
	public void test1() {

		int i = 1; // int类型变量
		System.out.println(Generic2.getType(i)); // 打印变量类型为int

		String str = "a";

		System.out.println(Generic2.getType(str)); // 打印变量类型为int

		System.out.println(str.getClass().getName()); // 打印变量类型为int

		System.out.println(str.getClass().getTypeName());

	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 21-3-3 上午11:55
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy wupf at 21-3-3 上午11:55
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
	 * @generatedBy wupf at 21-3-3 上午11:55
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(Generic2_WGTest.class);
	}
}