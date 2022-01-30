package org.jpf.utils.xmls;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Element;

import com.alibaba.fastjson.JSON;

/**
 * The class <code>JpfXmlUtil_WGTest</code> contains tests for the class <code>{@link Jpfw3cXmlUtil}</code>.
 *
 * @generatedBy wupf at 20-5-7 上午10:15
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class Jpfw3cXmlUtil_WGTest {
	@Test(timeout = 1000)
	public void testGetParIntValueTaking2ArgumentsThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			Jpfw3cXmlUtil.getParIntValue((Element) null, "xL@Wc_]?}Qx:,[");
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testGetElementFromXmlWithNull() throws Throwable {
		Element element0 = Jpfw3cXmlUtil.getElementFromXml((String) null, "");
		assertNull(element0);
	}

	@Test(timeout = 1000)
	public void testGetElementFromXmlWithEmptyString() throws Throwable {
		Element element0 = Jpfw3cXmlUtil.getElementFromXml("", "");
		assertNull(element0);
	}

	@Test(timeout = 1000)
	public void testGetChildElementThrowsNullPointerException() throws Throwable {
		try {
			Jpfw3cXmlUtil.getChildElement((Element) null, (String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testGetRootElementAttributeThrowsFileNotFoundException() throws Throwable {
		try {
			Jpfw3cXmlUtil.getRootElementAttribute("Loggers", "");
			fail("Expecting exception: FileNotFoundException");

		} catch (FileNotFoundException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testGetNodeListThrowsFileNotFoundException() throws Throwable {
		try {
			Jpfw3cXmlUtil.getNodeList(" with tag:", " with tag:");
			fail("Expecting exception: FileNotFoundException");

		} catch (FileNotFoundException e) {
			//
			// \\ with tag: (\u6587\u4EF6\u540D\u3001\u76EE\u5F55\u540D\u6216\u5377\u6807\u8BED\u6CD5\u4E0D\u6B63\u786E\u3002)
			//
		}
	}

	@Test(timeout = 1000)
	public void testGetParBoolValueThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			Jpfw3cXmlUtil.getParBoolValue((Element) null, "4/CI7zvYA9qi");
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testGetParStrValueThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			Jpfw3cXmlUtil.getParStrValue((Element) null, "(26=9=");
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testReadXMLFileThrowsMalformedURLException() throws Throwable {
		try {
			Jpfw3cXmlUtil.readXMLFile("TbO,=#x1KcNOR+W", "TbO,=#x1KcNOR+W", "TbO,=#x1KcNOR+W");
			fail("Expecting exception: MalformedURLException");

		} catch (MalformedURLException e) {
			//
			// no protocol: TbO,=#x1KcNOR+W
			//
		}
	}

	@Test(timeout = 1000)
	public void testReadXMLFile3ThrowsIllegalArgumentException() throws Throwable {
		try {
			Jpfw3cXmlUtil.readXMLFile3((String) null, "#)B0cps.;o0}\"{azjQ");
			fail("Expecting exception: IllegalArgumentException");

		} catch (IllegalArgumentException e) {
			//
			// URI cannot be null
			//
		}
	}

	@Test(timeout = 1000)
	public void testGetParIntValueTaking3ArgumentsReturningZero() throws Throwable {
		int int0 = Jpfw3cXmlUtil.getParIntValue((Element) null, ">/3[Ty", 0);
		assertEquals(0, int0);
	}
	/**
	 * Run the void stripNonValidXMLChars(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-5-7 上午10:15
	 */
	@Test(timeout = 3000)
	public void testStripNonValidXMLChars_1() throws Exception {
		String strFileName = "";

		Jpfw3cXmlUtil.stripNonValidXMLChars(strFileName);

		// add additional test code here
	}
	/**
	* Run the getElementFromXml method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 20:31:29
	* @see public static  Element getElementFromXml(String TagsName,String in_FileName) throws Exception  
	*/
	@Test(timeout = 1000)
	public void test_getElementFromXml_R108() throws Throwable {

		try {

			String TagsName = "abc123";
			String in_FileName = "abc123";

			Element wupf_result = Jpfw3cXmlUtil.getElementFromXml(TagsName, in_FileName);

			System.out.println("jpf_check:getElementFromXml:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

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
		new org.junit.runner.JUnitCore().run(Jpfw3cXmlUtil_WGTest.class);
	}
}
