/*
 * This file was automatically generated by wupf@
 * Thu Nov 28 10:58:18 GMT 2019
 */

package org.jpf.algorithm;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class Descartes_WPTest {


	@Test(timeout = 1000)
	public void testRunThrowsArrayIndexOutOfBoundsException() throws Throwable {
		Descartes descartes0 = new Descartes();
		Stack<List<String>> stack0 = new Stack<List<String>>();
		Stack<String> stack1 = new Stack<String>();
		// Undeclared exception!
		try {
			descartes0.run(stack0, stack1, (-841), ":D4=0?&NLI0~!h`", 12);
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch (ArrayIndexOutOfBoundsException e) {
			//
			// -841
			//
		}
	}

}