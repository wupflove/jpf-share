package org.jpf.utils;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>MatchUtil_WGTest</code> contains tests for the class <code>{@link JpfMatchUtil}</code>.
 *
 * @generatedBy wupf at 20-11-10 下午8:25
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class MatchUtil_WGTest {

	@Test
	public void testJpfReplaceAll_4() throws Exception {
		String abc = "com.wupf.a.b";
		String def = "com.alibaba.b.c";
		Pattern p = Pattern.compile("com.[wupf|alibaba].*");
		// Pattern p = Pattern.compile("\\s?(.*)? = /?");
		Matcher m = p.matcher(abc);
		while (m.find()) {
			System.out.println(m.group());
		}

		m = p.matcher(def);
		while (m.find()) {
			System.out.println(m.group());
		}
		System.out.println(JpfMatchUtil.matching("com.[wupf|alibaba].*", "com.wupf.a.b"));
		System.out.println(JpfMatchUtil.matching("com.[wupf|alibaba].*", def));

		abc = "assertEquals(Long.valueOf(0L),wupf_result)";
		p = Pattern.compile("Equals(.*,wupf_result)");
		m = p.matcher(abc);
		while (m.find()) {
			System.out.println(m.group());
		}
	}

	@Test
	public void testJpfReplaceAll_3() throws Exception {

		String strC = "Unexpected exception, expected<.*> but was<.*>";
		String strA = strC.replaceAll("\\*\\*", "\\.*");
		System.out.println(strA);

		String strB = "Unexpected exception, expected<java.lang.SecurityException> but was<java.io.IOException>";
		Pattern pattern = Pattern.compile(strA);
		Matcher matcher = pattern.matcher(strB);
		System.out.println(matcher.matches());

		strA = "expected:<.*> but was:<.*>";
		strB = "expected:<1.56514648E12> but was:<1.56902359E12>";
		pattern = Pattern.compile(strA);
		matcher = pattern.matcher(strB);
		System.out.println(matcher.matches());

		strA = "(<.*>)";
		strB = "expected:<1.56514648E12> but was:<1.56902359E12>";
		pattern = Pattern.compile(strA);
		matcher = pattern.matcher(strB);

		if (matcher.matches()) {
			for (int i = 0; i <= matcher.groupCount(); i++) {
				System.out.println(i + ":" + matcher.group(i));
			}
		}

		String str = "abc3443abcfgjhgabcgfjabc";
		String rgex = ".*a(.*?)c.*";

		pattern = Pattern.compile(rgex);
		matcher = pattern.matcher(str);

		if (matcher.matches()) {
			for (int i = 0; i <= matcher.groupCount(); i++) {
				System.out.println(i + ":" + matcher.group(i));
			}
		}

		System.out.println(JpfMatchUtil.wildcardMatch2("a1", "a.*"));
		System.out.println(JpfMatchUtil.wildcardMatch2("a.*", "a1"));

		System.out.println(JpfMatchUtil.wildcardMatch2(strC, strB));

		Pattern p = Pattern.compile(".*//*aa//*");
		Matcher m = p.matcher("22bb//23");
		System.out.println(m.find());// 返回true

		Matcher m2 = p.matcher("cc//bb//aa//2223");
		System.out.println(m2.find());// 返回true

		Matcher m3 = p.matcher("aa2223bb");
		System.out.println(m3.find());// 返回true

		Matcher m4 = p.matcher("aabb");
		System.out.println(m4.find());// 返回false

		System.out.println(JpfMatchUtil.matchSrcFile("cc//bb//aa//2223", "*//aa//*"));
		System.out.println(JpfMatchUtil.matchSrcFile("cc//bb//1aa//2223", ".**//*aa//*"));
		System.out.println(JpfMatchUtil.matchSrcFile("cc//bb//aa2//2223", "**//aa*//*"));
		System.out.println(JpfMatchUtil.wildcardMatch2("cc//bb//aa2//2223", ".*//aa.*//.*"));

		System.out.println(JpfMatchUtil.matchDateTime("2019-06-10 00:ss:421"));
	}

	/**
	 * Run the void findKeyForSql() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-11-10 下午8:25
	 */
	@Test
	public void testFindKeyForSql_1() throws Exception {

		JpfMatchUtil.findKeyForSql();

		// add additional test code here
	}

	/**
	 * Run the void findKeyForat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-11-10 下午8:25
	 */
	@Test
	public void testFindKeyForat_1() throws Exception {

		JpfMatchUtil.findKeyForat();

		// add additional test code here
	}

	/**
	 * Run the boolean matchDateTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-11-10 下午8:25
	 */
	@Test
	public void testMatchDateTime_1() throws Exception {
		String strA = "";

		boolean result = JpfMatchUtil.matchDateTime(strA);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean matchSrcFile(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-11-10 下午8:25
	 */
	@Test
	public void testMatchSrcFile_1() throws Exception {
		String strFileName = "";
		String strFilter = "";

		boolean result = JpfMatchUtil.matchSrcFile(strFileName, strFilter);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean matching(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-11-10 下午8:25
	 */
	@Test
	public void testMatching_2() throws Exception {
		String pattern = "";
		String target = null;

		boolean result = JpfMatchUtil.matching(pattern, target);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean matching(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-11-10 下午8:25
	 */
	@Test
	public void testMatching_3() throws Exception {
		String pattern = null;
		String target = "";

		boolean result = JpfMatchUtil.matching(pattern, target);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void showCmdMsg(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-11-10 下午8:25
	 */
	@Test
	public void testShowCmdMsg_1() throws Exception {
		String line = "";
		List<String> listMsg = null;

		JpfMatchUtil.showCmdMsg(line, listMsg);

		// add additional test code here
	}

	/**
	 * Run the boolean unitFileMatch(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-11-10 下午8:25
	 */
	@Test
	public void testUnitFileMatch_1() throws Exception {
		String strA = "";

		boolean result = JpfMatchUtil.unitFileMatch(strA);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean wildcardMatch2(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-11-10 下午8:25
	 */
	@Test
	public void testWildcardMatch2_1() throws Exception {
		String strA = "";
		String strB = "";

		boolean result = JpfMatchUtil.wildcardMatch2(strA, strB);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 20-11-10 下午8:25
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
	 * @generatedBy wupf at 20-11-10 下午8:25
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MatchUtil_WGTest.class);
	}
}
