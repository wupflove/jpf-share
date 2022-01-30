package org.jpf.algorithm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>Kmp_WGTest</code> contains tests for the class <code>{@link Kmp}</code>.
 *
 * @generatedBy wupf at 20-1-22 涓嬪崍3:44
 * @version $Revision: 1.0 $
 */
public class Kmp_WGTest {

	/**
	 * Run the int KMP_Index(char[],char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-1-22 涓嬪崍3:44
	 */
	@Test
	public void testKMP_Index_1() throws Exception {
		char[] s = new char[] { '' };
		char[] t = new char[] { '' };

		int result = new Kmp().KMP_Index(s, t);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int[] next(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-1-22 涓嬪崍3:44
	 */
	@Test
	public void testNext_1() throws Exception {
		char[] t = new char[] { '' };

		int[] result = new Kmp().next(t);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(-1, result[0]);
	}

	/**
	 * Run the int[] next(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-1-22 涓嬪崍3:44
	 */
	@Test
	public void testNext_2() throws Exception {
		char[] t = new char[] { '', '' };

		int[] result = new Kmp().next(t);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
		assertEquals(-1, result[0]);
		assertEquals(-1, result[1]);
	}
	@Test
	public void test_KMP_Index_2() {
		String s = "abbabbbbcab"; // 主串
		String t = "      bbcac"; // 模式串
		Kmp cKmp=new Kmp();
		int result=cKmp.KMP_Index(s,t);
		assertEquals(-1, result);
	}
	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 20-1-22 涓嬪崍3:44
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
	 * @generatedBy wupf at 20-1-22 涓嬪崍3:44
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(Kmp_WGTest.class);
	}
}
