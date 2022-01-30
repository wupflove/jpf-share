package org.jpf.utils.web;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JpfUrlUtil_WGTest</code> contains tests for the class <code>{@link JpfUrlUtil}</code>.
 *
 * @generatedBy wupf at 21-4-28 下午4:04
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class JpfUrlUtil_WGTest {
	/**
	 * Run the String getRootDomain(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	@Test
	public void testGetRootDomain_1()
		throws Exception {
		String url = "";

		String result = JpfUrlUtil.getRootDomain(url);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getRootDomain(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	@Test
	public void testGetRootDomain_2()
		throws Exception {
		String url = "";

		String result = JpfUrlUtil.getRootDomain(url);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getRootDomain(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	@Test
	public void testGetRootDomain_3()
		throws Exception {
		String url = "";

		String result = JpfUrlUtil.getRootDomain(url);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getUrlIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	@Test
	public void testGetUrlIndex_1()
		throws Exception {
		String pdmurl = "a";

		String result = JpfUrlUtil.getUrlIndex(pdmurl);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUrlIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	@Test
	public void testGetUrlIndex_2()
		throws Exception {
		String pdmurl = "";

		String result = JpfUrlUtil.getUrlIndex(pdmurl);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUrlIndex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	@Test
	public void testGetUrlIndex_3()
		throws Exception {
		String pdmurl = "a";

		String result = JpfUrlUtil.getUrlIndex(pdmurl);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUrlName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	@Test(expected = java.lang.StringIndexOutOfBoundsException.class)
	public void testGetUrlName_1()
		throws Exception {
		String m_url = "";

		String result = JpfUrlUtil.getUrlName(m_url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUrlName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	@Test(expected = java.lang.StringIndexOutOfBoundsException.class)
	public void testGetUrlName_2()
		throws Exception {
		String m_url = "#";

		String result = JpfUrlUtil.getUrlName(m_url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isConnect(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	@Test
	public void testIsConnect_1()
		throws Exception {
		String urlIndex = null;

		boolean result = JpfUrlUtil.isConnect(urlIndex);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isConnect(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	@Test
	public void testIsConnect_2()
		throws Exception {
		String urlIndex = "";

		boolean result = JpfUrlUtil.isConnect(urlIndex);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isConnect(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	@Test
	public void testIsConnect_3()
		throws Exception {
		String urlIndex = "a";

		boolean result = JpfUrlUtil.isConnect(urlIndex);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isConnect(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	@Test
	public void testIsConnect_4()
		throws Exception {
		String urlIndex = "a";

		boolean result = JpfUrlUtil.isConnect(urlIndex);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isConnect(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	@Test
	public void testIsConnect_5()
		throws Exception {
		String urlIndex = "a";

		boolean result = JpfUrlUtil.isConnect(urlIndex);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isConnect(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	@Test
	public void testIsConnect_6()
		throws Exception {
		String urlIndex = "a";

		boolean result = JpfUrlUtil.isConnect(urlIndex);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isConnect(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	@Test
	public void testIsConnect_7()
		throws Exception {
		String urlIndex = "a";

		boolean result = JpfUrlUtil.isConnect(urlIndex);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 21-4-28 下午4:04
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
	 * @generatedBy wupf at 21-4-28 下午4:04
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
	 * @generatedBy wupf at 21-4-28 下午4:04
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JpfUrlUtil_WGTest.class);
	}
}