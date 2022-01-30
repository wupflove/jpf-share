/*
 * This file was automatically generated by wupf@
 * Thu May 07 03:40:02 GMT 2020
 */

package org.jpf.utils.ga;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.NotSerializableException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.regex.PatternSyntaxException;

import org.junit.Test;

public class ListUtil_WETest {
	@Test(timeout = 3000)
	public void testFuzzyContainsThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			ListUtil.fuzzyContains("", (List) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test
	public void testmain() {
		Set set = new HashSet<>();
		set.add("20180101");
		set.add("20180103");
		set.add("22180104");
		set.add("20180102");
		set.add("22180105");
		List<?> list = ListUtil.orderSet(set);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	@Test(timeout = 3000)
	public void testDeepCopyReturningListWhereIsEmptyIsTrueAndListWhereSizeIsZero() throws Throwable {
		Locale locale0 = Locale.SIMPLIFIED_CHINESE;
		Set<String> set0 = locale0.getUnicodeLocaleKeys();
		Vector<String> vector0 = new Vector<String>(set0);
		List<String> list0 = ListUtil.deepCopy((List<String>) vector0);
		assertEquals(0, list0.size());
	}

	@Test(timeout = 3000)
	public void testFuzzyContains0() throws Throwable {
		Stack<String> stack0 = new Stack<String>();
		stack0.add("");
		boolean boolean0 = ListUtil.fuzzyContains("", stack0);

	}

	@Test(timeout = 3000)
	public void testFuzzyQuery0() throws Throwable {
		Stack<String> stack0 = new Stack<String>();
		stack0.add("");
		List list0 = ListUtil.fuzzyQuery("Ay!Y#tx\u0007_%^$3", stack0);
		assertEquals(0, list0.size());
	}

	@Test(timeout = 3000)
	public void testDeepCopyThrowsNotSerializableException() throws Throwable {
		LinkedList<Object> linkedList0 = new LinkedList<Object>();
		Object object0 = new Object();
		linkedList0.add(object0);
		try {
			ListUtil.deepCopy((List<Object>) linkedList0);
			fail("Expecting exception: NotSerializableException");

		} catch (NotSerializableException e) {
			//
			// java.lang.Object
			//
		}
	}

	@Test(timeout = 3000)
	public void testFuzzyQueryThrowsPatternSyntaxException() throws Throwable {
		ArrayList<String> arrayList0 = new ArrayList<String>();
		// Undeclared exception!
		try {
			ListUtil.fuzzyQuery("b*>,Znxe(|/", arrayList0);
			fail("Expecting exception: PatternSyntaxException");

		} catch (PatternSyntaxException e) {
			//
			// Unclosed group near index 11\r
			// b*>,Znxe(|/
			//
		}
	}

	@Test(timeout = 3000)
	public void testReplaceForListThrowsNullPointerException() throws Throwable {
		ArrayList<String> arrayList0 = new ArrayList<String>();
		arrayList0.add(".converterTo(");
		// Undeclared exception!
		try {
			ListUtil.replaceForList(arrayList0, (String) null, (String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 3000)
	public void testReplaceForListReturningListWhereIsEmptyIsFalse() throws Throwable {
		Stack<String> stack0 = new Stack<String>();
		stack0.add("");
		List<String> list0 = ListUtil.replaceForList(stack0, "", "");
		assertTrue(list0.contains(""));
	}

}