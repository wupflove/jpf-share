package org.jpf.utils.classes;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>JarUtils_WGTest</code> contains tests for the class <code>{@link JpfJarUtil}</code>.
 *
 * @generatedBy wupf at 20-4-30 上午7:51
 * @author wupf
 * @version $Revision: 1.0 $
 */
public class JpfJarUtils_WGTest {


	/**
	 * Run the List<String> getClasssFromJarFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-4-30 上午7:51
	 */
	@Test(timeout = 3000)
	public void testGetClasssFromJarFile_1() throws Exception {
		String jarPath = "";

		List<String> result = JpfJarUtil.getClasssFromJarFile(jarPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getJarConn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-4-30 上午7:51
	 */
	@Test(timeout = 3000)
	public void testGetJarConn_1() throws Exception {

		String result = JpfJarUtil.getJarConn();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String readFileFromJar(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-4-30 上午7:51
	 */
	@Test(timeout = 3000)
	public void testReadFileFromJar_1() throws Exception {
		String strJarName = "";
		String strFileName = "";

		String result = JpfJarUtil.readFileFromJar(strJarName, strFileName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 20-4-30 上午7:51
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
	 * @generatedBy wupf at 20-4-30 上午7:51
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JpfJarUtils_WGTest.class);
	}
}
