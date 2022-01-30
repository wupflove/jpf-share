package org.jpf.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>JpfStringUtil_WGTest</code> contains tests for the class <code>{@link JpfStringUtil}</code>.
 *
 * @generatedBy wupf at 21-1-5 下午2:14
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class JpfStringUtil_WGTest {

	/**
	 * Run the String camelToUnderline(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-1-5 下午2:14
	 */
	@Test
	public void testCamelToUnderline_3() throws Exception {
		String param = "aa";

		String result = JpfStringUtil.camelToUnderline(param);

		// add additional test code here
		assertEquals("aa", result);
	}

	/**
	 * Run the String htmEncode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-1-5 下午2:14
	 */
	@Test
	public void testHtmEncode_1() throws Exception {
		String s = "aa";

		String result = JpfStringUtil.htmEncode(s);

		// add additional test code here
		assertEquals("aa", result);
	}

	/**
	 * Run the boolean isChinese(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-1-5 下午2:14
	 */
	@Test
	public void testIsChinese_8() throws Exception {
		String strName = "";

		boolean result = JpfStringUtil.isChinese(strName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String removeEscapeStr(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-1-5 下午2:14
	 */
	@Test
	public void testRemoveEscapeStr_1() throws Exception {
		String strInput = null;

		String result = JpfStringUtil.removeEscapeStr(strInput);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String removeEscapeStr(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-1-5 下午2:14
	 */
	@Test
	public void testRemoveEscapeStr_2() throws Exception {
		String strInput = "";

		String result = JpfStringUtil.removeEscapeStr(strInput);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String removePrefix(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-1-5 下午2:14
	 */
	@Test
	public void testRemovePrefix_1() throws Exception {
		String str = "";
		String prefix = "";

		String result = JpfStringUtil.removePrefix(str, prefix);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String replaceHtml(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-1-5 下午2:14
	 */
	@Test
	public void testReplaceHtml_1() throws Exception {
		String html = "";

		String result = JpfStringUtil.replaceHtml(html);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String replaceLast(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-1-5 下午2:14
	 */
	@Test
	public void testReplaceLast_1() throws Exception {
		String strInput = "";
		String regEx = "";
		String replacement = "";

		String result = JpfStringUtil.replaceLast(strInput, regEx, replacement);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String showKeyRed(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-1-5 下午2:14
	 */
	@Test
	public void testShowKeyRed_1() throws Exception {
		String a = null;
		String b = "";

		String result = JpfStringUtil.showKeyRed(a, b);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String specTrim(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-1-5 下午2:14
	 */
	@Test
	public void testSpecTrim_1() throws Exception {
		String sourceStr = "";

		String result = JpfStringUtil.trimIncludeLineBreaks(sourceStr);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String trimBlank(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-1-5 下午2:14
	 */
	@Test
	public void testTrimBlank_1() throws Exception {
		String str = "";

		String result = JpfStringUtil.trimBlank(str);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String underlineToCamel(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-1-5 下午2:14
	 */
	@Test
	public void testUnderlineToCamel_3() throws Exception {
		String param = "aa";

		String result = JpfStringUtil.underlineToCamel(param);

		// add additional test code here
		assertEquals("aa", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 21-1-5 下午2:14
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
	 * @generatedBy wupf at 21-1-5 下午2:14
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JpfStringUtil_WGTest.class);
	}
}
