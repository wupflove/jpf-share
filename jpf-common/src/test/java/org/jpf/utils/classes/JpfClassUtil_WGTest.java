package org.jpf.utils.classes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>JpfClassUtil_WGTest</code> contains tests for the class <code>{@link ClassUtil}</code>.
 *
 * @generatedBy wupf at 20-8-6 上午9:06
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class JpfClassUtil_WGTest {

	@Test
	public void test_getClassNameWithDot_1() {
		try {
			String result = JpfClassUtil.getClassNameWithDot("List");
			System.out.println("test_getClassNameWithDot_1:" + result);
			assertEquals("List", result);

			result = JpfClassUtil.getClassNameWithDot("List<String>");
			System.out.println("test_getClassNameWithDot_1:" + result);
			assertEquals("List<String>", result);

			result = JpfClassUtil.getClassNameWithDot("java.lang.String");
			System.out.println("test_getClassNameWithDot_1:" + result);
			assertEquals("java.lang.String", result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Run the String getClassNameWithDot(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-8-6 上午9:06
	 */
	@Test
	public void testGetClassNameWithDot_1() throws Exception {
		String strClassName = null;

		String result = JpfClassUtil.getClassNameWithDot(strClassName);

		// add additional test code here
		assertEquals("Object", result);
	}

	/**
	 * Run the String getClassNameWithDot(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-8-6 上午9:06
	 */
	@Test
	public void testGetClassNameWithDot_2() throws Exception {
		String strClassName = "";

		String result = JpfClassUtil.getClassNameWithDot(strClassName);

		// add additional test code here
		assertEquals("Object", result);
	}

	/**
	 * Run the String getClassNameWithDot(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-8-6 上午9:06
	 */
	@Test
	public void testGetClassNameWithDot_3() throws Exception {
		String strClassName = "L";

		String result = JpfClassUtil.getClassNameWithDot(strClassName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getClassNameWithSlash(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-8-6 上午9:06
	 */
	@Test
	public void testGetClassNameWithSlash_1() throws Exception {
		String strClassFullName = "";

		String result = JpfClassUtil.getClassNameWithSlash(strClassFullName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getConstructors(Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-8-6 上午9:06
	 */
	@Test
	public void testGetConstructors_1() throws Exception {
		Class c = Object.class;

		String result = JpfClassUtil.getConstructors(c);

		// add additional test code here
		assertEquals("    public java.lang.Object();\n", result);
	}

	/**
	 * Run the String getFileNameByClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-8-6 上午9:06
	 */
	@Test
	public void testGetFileNameByClass_1() throws Exception {
		String strFullClassName = "";

		String result = JpfClassUtil.getClassNameWithSlash(strFullClassName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getPackageFromClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-8-6 上午9:06
	 */
	@Test(expected = java.lang.StringIndexOutOfBoundsException.class)
	public void testGetPackageFromClass_1() throws Exception {
		String strClassFullName = "";

		String result = JpfClassUtil.getPackageFromClass(strClassFullName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSimpleClassNameByPoint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-8-6 上午9:06
	 */
	@Test
	public void testGetSimpleClassNameByPoint_1() throws Exception {
		String strClassFullName = "";

		String result = JpfClassUtil.getSimpleClassNameByPoint(strClassFullName);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 20-8-6 上午9:06
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

}
