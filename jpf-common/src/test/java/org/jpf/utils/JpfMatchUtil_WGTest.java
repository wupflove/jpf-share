package org.jpf.utils;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>JpfMatchUtil_WGTest</code> contains tests for the class <code>{@link JpfMatchUtil}</code>.
 *
 * @generatedBy wupf at 21-4-28 下午4:05
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class JpfMatchUtil_WGTest {
	/**
	 * Run the void findKeyForSql() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testFindKeyForSql_1()
		throws Exception {

		JpfMatchUtil.findKeyForSql();

		// add additional test code here
	}

	/**
	 * Run the void findKeyForSql() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testFindKeyForSql_2()
		throws Exception {

		JpfMatchUtil.findKeyForSql();

		// add additional test code here
	}

	/**
	 * Run the void findKeyForSql() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testFindKeyForSql_3()
		throws Exception {

		JpfMatchUtil.findKeyForSql();

		// add additional test code here
	}

	/**
	 * Run the void findKeyForSql() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testFindKeyForSql_4()
		throws Exception {

		JpfMatchUtil.findKeyForSql();

		// add additional test code here
	}

	/**
	 * Run the void findKeyForat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testFindKeyForat_1()
		throws Exception {

		JpfMatchUtil.findKeyForat();

		// add additional test code here
	}

	/**
	 * Run the void findKeyForat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testFindKeyForat_2()
		throws Exception {

		JpfMatchUtil.findKeyForat();

		// add additional test code here
	}

	/**
	 * Run the boolean matchDateTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testMatchDateTime_1()
		throws Exception {
		String strA = "";

		boolean result = JpfMatchUtil.matchDateTime(strA);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean matchDateTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testMatchDateTime_2()
		throws Exception {
		String strA = "";

		boolean result = JpfMatchUtil.matchDateTime(strA);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean matchDateTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testMatchDateTime_3()
		throws Exception {
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
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testMatchSrcFile_1()
		throws Exception {
		String strFileName = "";
		String strFilter = "";

		boolean result = JpfMatchUtil.matchSrcFile(strFileName, strFilter);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean matchSrcFile(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testMatchSrcFile_2()
		throws Exception {
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
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testMatching_1()
		throws Exception {
		String pattern = "";
		String target = "";

		boolean result = JpfMatchUtil.matching(pattern, target);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean matching(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testMatching_2()
		throws Exception {
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
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testMatching_3()
		throws Exception {
		String pattern = null;
		String target = "";

		boolean result = JpfMatchUtil.matching(pattern, target);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean matching(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testMatching_4()
		throws Exception {
		String pattern = "";
		String target = "";

		boolean result = JpfMatchUtil.matching(pattern, target);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void showCmdMsg(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testShowCmdMsg_1()
		throws Exception {
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
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testUnitFileMatch_1()
		throws Exception {
		String strA = "";

		boolean result = JpfMatchUtil.unitFileMatch(strA);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean unitFileMatch(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testUnitFileMatch_2()
		throws Exception {
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
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testWildcardMatch2_1()
		throws Exception {
		String strA = "";
		String strB = "";

		boolean result = JpfMatchUtil.wildcardMatch2(strA, strB);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean wildcardMatch2(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:05
	 */
	@Test
	public void testWildcardMatch2_2()
		throws Exception {
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
		new org.junit.runner.JUnitCore().run(JpfMatchUtil_WGTest.class);
	}
}