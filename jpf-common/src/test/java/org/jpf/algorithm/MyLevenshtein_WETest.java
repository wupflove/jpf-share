/*
 * This file was automatically generated by wupf@
 * Thu Nov 28 10:59:45 GMT 2019
 */

package org.jpf.algorithm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class MyLevenshtein_WETest {

	@Test(timeout = 1000)
	public void testCreatesMyLevenshtein() throws Throwable {
		MyLevenshtein myLevenshtein0 = new MyLevenshtein();
	}

	@Test(timeout = 1000)
	public void testLevenshteinReturningZero() throws Throwable {
		float float0 = new MyLevenshtein().levenshtein("S!", "^Co'e9wkQkAM,kN;A");
		assertEquals(0.0F, float0, 0.01F);
	}

	@Test(timeout = 1000)
	public void testLevenshteinThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			new MyLevenshtein().levenshtein((String) null, (String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testLevenshteinThrowsTooManyResourcesException() throws Throwable {
		new MyLevenshtein().levenshtein("org.jpf.algorithm.MyLevenshtein", "org.jpf.algorithm.MyLevenshtein");
		new MyLevenshtein().levenshtein("org.jpf.algorithm.MyLevenshtein", "org.jpf.algorithm.MyLevenshtein");
		// Undeclared exception!
		new MyLevenshtein().levenshtein("org.jpf.algorithm.MyLevenshtein", "org.jpf.algorithm.MyLevenshtein");
	}

}
