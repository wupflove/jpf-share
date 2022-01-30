package org.jpf.algorithm;

import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>Descartes_WGTest</code> contains tests for the class <code>{@link Descartes}</code>.
 *
 * @generatedBy wupf at 20-1-22 下午3:44
 * @version $Revision: 1.0 $
 */
public class Descartes_WGTest {
	/**
	 * Run the void run(List<List<String>>,List<String>,int,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-1-22 下午3:44
	 */
	@Test
	public void testRun_1() throws Exception {
		Descartes fixture = new Descartes();
		List<List<String>> dimvalue = null;
		List<String> result = new LinkedList();
		int layer = 1;
		String curstring = "";
		int MaxSize = 1001;

		fixture.run(dimvalue, result, layer, curstring, MaxSize);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy wupf at 20-1-22 下午3:44
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
	 * @generatedBy wupf at 20-1-22 下午3:44
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(Descartes_WGTest.class);
	}
}
