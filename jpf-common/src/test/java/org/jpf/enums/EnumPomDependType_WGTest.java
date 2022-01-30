package org.jpf.enums;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>EnumPomDependType_WGTest</code> contains tests for the class <code>{@link EnumPomDependType}</code>.
 *
 * @generatedBy  at 21-7-4 上午9:35
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class EnumPomDependType_WGTest {

	/**
	 * Run the EnumPomDependType fromTypeName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testFromTypeName_1()
		throws Exception {
		String typeName = "";

		EnumPomDependType result = EnumPomDependType.fromTypeName(typeName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the EnumPomDependType fromTypeName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testFromTypeName_2()
		throws Exception {
		String typeName = "";

		EnumPomDependType result = EnumPomDependType.fromTypeName(typeName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the EnumPomDependType fromTypeName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testFromTypeName_3()
		throws Exception {
		String typeName = "";

		EnumPomDependType result = EnumPomDependType.fromTypeName(typeName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTypeName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testGetTypeName_1()
		throws Exception {
		EnumPomDependType fixture = EnumPomDependType.Denpend;

		String result = fixture.getTypeName();

		// add additional test code here
		assertEquals("depend", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy  at 21-7-4 上午9:35
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
	 * @generatedBy  at 21-7-4 上午9:35
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
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EnumPomDependType_WGTest.class);
	}
}