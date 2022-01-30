package org.jpf.infos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.jpf.enums.EnumPomDependType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>MavenDependInfo_WGTest</code> contains tests for the class <code>{@link MavenDependInfo}</code>.
 *
 * @generatedBy  at 21-7-4 上午9:35
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class MavenDependInfo_WGTest {
	/**
	 * Run the MavenDependInfo() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testMavenDependInfo_1()
		throws Exception {

		MavenDependInfo result = new MavenDependInfo();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getVersion());
		assertEquals(null, result.getScope());
		assertEquals(null, result.getArtifactId());
		assertEquals(null, result.getGroupId());
		assertEquals(false, result.isbExist());
	}

	/**
	 * Run the String getArtifactId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testGetArtifactId_1()
		throws Exception {
		MavenDependInfo fixture = new MavenDependInfo();
		fixture.setbExist(true);
		fixture.setGroupId("");
		fixture.setPomDependTypeEnum(EnumPomDependType.Denpend);
		fixture.setArtifactId("");
		fixture.setScope("");
		fixture.setVersion("");

		String result = fixture.getArtifactId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getGroupId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testGetGroupId_1()
		throws Exception {
		MavenDependInfo fixture = new MavenDependInfo();
		fixture.setbExist(true);
		fixture.setGroupId("");
		fixture.setPomDependTypeEnum(EnumPomDependType.Denpend);
		fixture.setArtifactId("");
		fixture.setScope("");
		fixture.setVersion("");

		String result = fixture.getGroupId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the EnumPomDependType getPomDependTypeEnum() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testGetPomDependTypeEnum_1()
		throws Exception {
		MavenDependInfo fixture = new MavenDependInfo();
		fixture.setbExist(true);
		fixture.setGroupId("");
		fixture.setPomDependTypeEnum(EnumPomDependType.Denpend);
		fixture.setArtifactId("");
		fixture.setScope("");
		fixture.setVersion("");

		EnumPomDependType result = fixture.getPomDependTypeEnum();

		// add additional test code here
		assertNotNull(result);
		assertEquals("depend", result.getTypeName());
		assertEquals("Denpend", result.name());
		assertEquals("Denpend", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the String getScope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testGetScope_1()
		throws Exception {
		MavenDependInfo fixture = new MavenDependInfo();
		fixture.setbExist(true);
		fixture.setGroupId("");
		fixture.setPomDependTypeEnum(EnumPomDependType.Denpend);
		fixture.setArtifactId("");
		fixture.setScope("");
		fixture.setVersion("");

		String result = fixture.getScope();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {
		MavenDependInfo fixture = new MavenDependInfo();
		fixture.setbExist(true);
		fixture.setGroupId("");
		fixture.setPomDependTypeEnum(EnumPomDependType.Denpend);
		fixture.setArtifactId("");
		fixture.setScope("");
		fixture.setVersion("");

		String result = fixture.getVersion();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean isbExist() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testIsbExist_1()
		throws Exception {
		MavenDependInfo fixture = new MavenDependInfo();
		fixture.setbExist(true);
		fixture.setGroupId("");
		fixture.setPomDependTypeEnum(EnumPomDependType.Denpend);
		fixture.setArtifactId("");
		fixture.setScope("");
		fixture.setVersion("");

		boolean result = fixture.isbExist();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isbExist() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testIsbExist_2()
		throws Exception {
		MavenDependInfo fixture = new MavenDependInfo();
		fixture.setbExist(false);
		fixture.setGroupId("");
		fixture.setPomDependTypeEnum(EnumPomDependType.Denpend);
		fixture.setArtifactId("");
		fixture.setScope("");
		fixture.setVersion("");

		boolean result = fixture.isbExist();

		// add additional test code here
		assertEquals(false, result);
	}


	/**
	 * Run the void setArtifactId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testSetArtifactId_1()
		throws Exception {
		MavenDependInfo fixture = new MavenDependInfo();
		fixture.setbExist(true);
		fixture.setGroupId("");
		fixture.setPomDependTypeEnum(EnumPomDependType.Denpend);
		fixture.setArtifactId("");
		fixture.setScope("");
		fixture.setVersion("");
		String artifactId = "";

		fixture.setArtifactId(artifactId);

		// add additional test code here
	}

	/**
	 * Run the void setGroupId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testSetGroupId_1()
		throws Exception {
		MavenDependInfo fixture = new MavenDependInfo();
		fixture.setbExist(true);
		fixture.setGroupId("");
		fixture.setPomDependTypeEnum(EnumPomDependType.Denpend);
		fixture.setArtifactId("");
		fixture.setScope("");
		fixture.setVersion("");
		String groupId = "";

		fixture.setGroupId(groupId);

		// add additional test code here
	}

	/**
	 * Run the void setPomDependTypeEnum(EnumPomDependType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testSetPomDependTypeEnum_1()
		throws Exception {
		MavenDependInfo fixture = new MavenDependInfo();
		fixture.setbExist(true);
		fixture.setGroupId("");
		fixture.setPomDependTypeEnum(EnumPomDependType.Denpend);
		fixture.setArtifactId("");
		fixture.setScope("");
		fixture.setVersion("");
		EnumPomDependType cPomDependTypeEnum = EnumPomDependType.Denpend;

		fixture.setPomDependTypeEnum(cPomDependTypeEnum);

		// add additional test code here
	}

	/**
	 * Run the void setScope(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testSetScope_1()
		throws Exception {
		MavenDependInfo fixture = new MavenDependInfo();
		fixture.setbExist(true);
		fixture.setGroupId("");
		fixture.setPomDependTypeEnum(EnumPomDependType.Denpend);
		fixture.setArtifactId("");
		fixture.setScope("");
		fixture.setVersion("");
		String scope = "";

		fixture.setScope(scope);

		// add additional test code here
	}

	/**
	 * Run the void setVersion(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testSetVersion_1()
		throws Exception {
		MavenDependInfo fixture = new MavenDependInfo();
		fixture.setbExist(true);
		fixture.setGroupId("");
		fixture.setPomDependTypeEnum(EnumPomDependType.Denpend);
		fixture.setArtifactId("");
		fixture.setScope("");
		fixture.setVersion("");
		String version = "";

		fixture.setVersion(version);

		// add additional test code here
	}

	/**
	 * Run the void setbExist(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy  at 21-7-4 上午9:35
	 */
	@Test
	public void testSetbExist_1()
		throws Exception {
		MavenDependInfo fixture = new MavenDependInfo();
		fixture.setbExist(true);
		fixture.setGroupId("");
		fixture.setPomDependTypeEnum(EnumPomDependType.Denpend);
		fixture.setArtifactId("");
		fixture.setScope("");
		fixture.setVersion("");
		boolean bExist = true;

		fixture.setbExist(bExist);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(MavenDependInfo_WGTest.class);
	}
}