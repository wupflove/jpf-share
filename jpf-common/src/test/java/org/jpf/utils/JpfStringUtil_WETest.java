/*
 * This file was automatically generated by wupf@
 * Thu Nov 28 11:55:34 GMT 2019
 */

package org.jpf.utils;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.regex.PatternSyntaxException;

import org.junit.Test;

public class JpfStringUtil_WETest {

	@Test(timeout = 1000)
	public void testReplaceChinaStrReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.replaceChinaStr("-]+6l!80To1>Gp2ol", (String) null, "");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testGetStringCountReturningZero() throws Throwable {
		int int0 = JpfStringUtil.getStringCount("");
		assertEquals(0, int0);
	}

	@Test(timeout = 1000)
	public void testSplitTaking1And1ReturningNonEmptyArray() throws Throwable {
		String[] stringArray0 = JpfStringUtil.split("..", '%');
		assertNotNull(stringArray0);
		assertEquals(2, stringArray0.length);
	}

	@Test(timeout = 1000)
	public void testShowCharCodeThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.showCharCode((byte[]) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
		}
	}

	@Test(timeout = 1000)
	public void testCapitalise() throws Throwable {
		String string0 = JpfStringUtil.capitalise("2U\";r{@XN4a");
		assertEquals("2U\";r{@XN4a", string0);
	}

	@Test(timeout = 1000)
	public void testGetChineseReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.getChinese("+cO");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testCreateSerialNo() throws Throwable {
		String string0 = JpfStringUtil.createSerialNo();
		assertNotEquals("20140214202121320", string0);
	}

	@Test(timeout = 1000)
	public void testLengthReturningPositive() throws Throwable {
		int int0 = JpfStringUtil.length("S|aWDAo>/^|}l&!S:");
		assertEquals(17, int0);
	}

	@Test(timeout = 1000)
	public void testLengthReturningZero() throws Throwable {
		int int0 = JpfStringUtil.length("");
		assertEquals(0, int0);
	}

	@Test(timeout = 1000)
	public void testReplaceHtmlReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.replaceHtml("null");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testRemovePrefix0() throws Throwable {
		String string0 = JpfStringUtil.removePrefix("NaN", "");
		assertEquals("NaN", string0);
	}

	@Test(timeout = 1000)
	public void testRemoveQuotesReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.removeQuotes("");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testIsNotEmptyReturningTrue() throws Throwable {
		boolean boolean0 = JpfStringUtil.isNotEmpty("AUG");
		assertTrue(boolean0);
	}

	@Test(timeout = 1000)
	public void testIsContinuityCharacterThrowsNumberFormatException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.isContinuityCharacter("00000000000000000000000000000-992");
			fail("Expecting exception: NumberFormatException");

		} catch (NumberFormatException e) {
			//
			// For input string: \"-\"
			//
		}
	}

	@Test(timeout = 1000)
	public void testTrimReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.trim("=");
		assertEquals("=", string0);
	}

	@Test(timeout = 1000)
	public void testTrimReturningNull() throws Throwable {
		String string0 = JpfStringUtil.trim("");
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testFilterStrReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.filterStr("5f6~)Y\"o{l-5Fr# xT");
		assertEquals("5f6~)Y\"o{l-5Fr# xT", string0);
	}

	@Test(timeout = 1000)
	public void testFilterStrReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.filterStr("");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testCleanSqlWildCharaterReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.cleanSqlWildCharater(":Lb&seiZT,");
		assertEquals(":Lb&seiZT,", string0);
	}

	@Test(timeout = 1000)
	public void testCleanSqlWildCharaterReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.cleanSqlWildCharater("");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testCleanXSSReturningNull() throws Throwable {
		String string0 = JpfStringUtil.cleanXSS((String) null);
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testCamelToUnderlineWithNull() throws Throwable {
		String string0 = JpfStringUtil.camelToUnderline((String) null);
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testCamelToUnderlineWithEmptyString() throws Throwable {
		String string0 = JpfStringUtil.camelToUnderline("");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testCamelToUnderlineReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.camelToUnderline(";59N6");
		assertEquals(";59_n6", string0);
	}

	@Test(timeout = 1000)
	public void testUnderlineToCamelWithNull() throws Throwable {
		String string0 = JpfStringUtil.underlineToCamel((String) null);
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testUnderlineToCamelWithEmptyString() throws Throwable {
		String string0 = JpfStringUtil.underlineToCamel("");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testUnderlineToCamel0() throws Throwable {
		String string0 = JpfStringUtil.underlineToCamel("TTb:Ncfs=`pYsrK_");
		assertEquals("TTb:Ncfs=`pYsrK", string0);
	}

	@Test(timeout = 1000)
	public void testToCapitalizeCamelCaseReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.toCapitalizeCamelCase("[+<?\"`\"_maF<");
		assertEquals("[+<?\"`\"MaF<", string0);
		assertNotNull(string0);
	}

	@Test(timeout = 1000)
	public void testToCapitalizeCamelCaseReturningNull() throws Throwable {
		String string0 = JpfStringUtil.toCapitalizeCamelCase((String) null);
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testFirstToUpperCase0() throws Throwable {
		String string0 = JpfStringUtil.firstToUpperCase("%3E");
		assertEquals("%3E", string0);
	}

	@Test(timeout = 1000)
	public void testFirstToUpperCase1() throws Throwable {
		String string0 = JpfStringUtil.firstToUpperCase("}m[R:QO[Wrk'@+");
		assertEquals("}m[R:QO[Wrk'@+", string0);
	}

	@Test(timeout = 1000)
	public void testFirstToUpperCase2() throws Throwable {
		String string0 = JpfStringUtil.firstToUpperCase("org.fusesource.jansi.AnsiRenderer");
		assertEquals("Org.fusesource.jansi.AnsiRenderer", string0);
	}

	@Test(timeout = 1000)
	public void testFirstToLowerCase0() throws Throwable {
		String string0 = JpfStringUtil.firstToLowerCase("7{W +s");
		assertEquals("7{W +s", string0);
	}

	@Test(timeout = 1000)
	public void testFirstToLowerCase1() throws Throwable {
		String string0 = JpfStringUtil.firstToLowerCase("My>?`");
		assertEquals("my>?`", string0);
	}

	@Test(timeout = 1000)
	public void testFirstToLowerCase2() throws Throwable {
		String string0 = JpfStringUtil.firstToLowerCase("\u62FE");
		assertEquals("\u62FE", string0);
	}

	@Test(timeout = 1000)
	public void testUrlDecodeReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.urlDecode("0");
		assertEquals("0", string0);
	}

	@Test(timeout = 1000)
	public void testUrlDecodeReturningNull() throws Throwable {
		String string0 = JpfStringUtil.urlDecode("");
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testIos8859ToUtf8ReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.ios8859ToUtf8("kk$;n-pr`c~k .");
		assertEquals("kk$;n-pr`c~k .", string0);
	}

	@Test(timeout = 1000)
	public void testIos8859ToUtf8ReturningNull() throws Throwable {
		String string0 = JpfStringUtil.ios8859ToUtf8("");
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testBinaryString2hexStringWithNull() throws Throwable {
		String string0 = JpfStringUtil.binaryString2hexString((String) null);
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testBinaryString2hexStringWithEmptyString() throws Throwable {
		String string0 = JpfStringUtil.binaryString2hexString("");
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testBinaryString2hexString() throws Throwable {
		String string0 = JpfStringUtil.binaryString2hexString("Xd");
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testBinaryString2hexStringThrowsNumberFormatException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.binaryString2hexString("threadId");
			fail("Expecting exception: NumberFormatException");

		} catch (NumberFormatException e) {
			//
			// For input string: \"t\"
			//
		}
	}

	@Test(timeout = 1000)
	public void testHexString2binaryStringWithNull() throws Throwable {
		String string0 = JpfStringUtil.hexString2binaryString((String) null);
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testHexString2binaryString() throws Throwable {
		String string0 = JpfStringUtil.hexString2binaryString("java.lang.String@0000000001");
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testHexString2binaryStringReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.hexString2binaryString("");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testTrimBlankReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.trimBlank("</strong></font>");
		assertEquals("</strong></font>", string0);
	}

	@Test(timeout = 1000)
	public void testTrimBlankReturningNull() throws Throwable {
		String string0 = JpfStringUtil.trimBlank((String) null);
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testRemoveQuotesReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.removeQuotes("Mu)");
		assertEquals("Mu)", string0);
	}

	@Test(timeout = 1000)
	public void testReplaceHtmlReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.replaceHtml("/>~0V)>Tk2Y");
		assertEquals("/>~0V)>Tk2Y", string0);
	}

	@Test(timeout = 1000)
	public void testReplaceMobileHtmlReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.replaceMobileHtml((String) null);
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testRemovePrefix1() throws Throwable {
		String string0 = JpfStringUtil.removePrefix("bCnz", "");
		assertEquals("bCnz", string0);
	}

	@Test(timeout = 1000)
	public void testRemovePrefixWithNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.removePrefix("{8$", "aKadJ(");
		assertEquals("{8$", string0);
	}

	@Test(timeout = 1000)
	public void testRemovePrefixReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.removePrefix(":Lb&seiZT,", ":Lb&seiZT,");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testSplitTaking2StringsReturningNull() throws Throwable {
		String[] stringArray0 = JpfStringUtil.split((String) null, "");
		assertNull(stringArray0);
	}

	@Test(timeout = 1000)
	public void testSeqNumLeftPadZeroWithNegativeAndZero() throws Throwable {
		String string0 = JpfStringUtil.seqNumLeftPadZero((-5060), 0);
		assertEquals("-5060", string0);
	}

	@Test(timeout = 1000)
	public void testGetCNStringTakingStringWithNull() throws Throwable {
		String string0 = JpfStringUtil.getCNString((String) null);
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testGetCNStringTakingStringWithEmptyString() throws Throwable {
		String string0 = JpfStringUtil.getCNString("");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testGetCNStringTakingStringReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.getCNString(";59N6");
		assertEquals(";59N6", string0);
	}

	@Test(timeout = 1000)
	public void testGetStrToInt() throws Throwable {
		int int0 = JpfStringUtil.getStrToInt("yXwxl360A");
		assertEquals(0, int0);
	}

	@Test(timeout = 1000)
	public void testGetStrToIntWithNull() throws Throwable {
		int int0 = JpfStringUtil.getStrToInt((String) null);
		assertEquals(0, int0);
	}

	@Test(timeout = 1000)
	public void testGetNotNullStrTakingObjectReturningNonEmptyString() throws Throwable {
		Object object0 = new Object();
		String string0 = JpfStringUtil.getNotNullStr(object0);
		assertNotNull(string0);
	}

	@Test(timeout = 1000)
	public void testGetNotNullStrTakingStringReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.getNotNullStr((String) null);
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testHtmEncode0() throws Throwable {
		String string0 = JpfStringUtil.htmEncode(".-i&a$4 9l");
		assertEquals(".-i&amp;a$49l", string0);
	}

	@Test(timeout = 1000)
	public void testHtmEncode1() throws Throwable {
		String string0 = JpfStringUtil.htmEncode("Vg|\"u7J,m)");
		assertEquals("Vg|&quot;u7J,m)", string0);
	}

	@Test(timeout = 1000)
	public void testHtmEncode2() throws Throwable {
		String string0 = JpfStringUtil.htmEncode("Xy2<:Q");
		assertEquals("Xy2&lt;:Q", string0);
	}

	@Test(timeout = 1000)
	public void testHtmEncode3() throws Throwable {
		String string0 = JpfStringUtil.htmEncode("Js>s-I7#D");
		assertEquals("Js&gt;s-I7#D", string0);
	}

	@Test(timeout = 1000)
	public void testHtmEncode4() throws Throwable {
		String string0 = JpfStringUtil.htmEncode("J,2 ");
		assertEquals("J,2", string0);
	}

	@Test(timeout = 1000)
	public void testGetRuleSplitStringWithEmptyString() throws Throwable {
		String string0 = JpfStringUtil.getRuleSplitString("");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testGetRuleSplitStringWithNull() throws Throwable {
		String string0 = JpfStringUtil.getRuleSplitString((String) null);
		assertEquals("0", string0);
	}

	@Test(timeout = 1000)
	public void testGetRuleSplitStringReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil
				.getRuleSplitString("Unable to create custom ContextSelector. Falling back to default.");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testGetRuleSplitStringReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.getRuleSplitString("2147483647");
		assertEquals("2147483647", string0);
	}

	@Test(timeout = 1000)
	public void testIsNumberWithNull() throws Throwable {
		boolean boolean0 = JpfStringUtil.isNumber((String) null);
		assertFalse(boolean0);
	}

	@Test(timeout = 1000)
	public void testIsNumberWithEmptyString() throws Throwable {
		boolean boolean0 = JpfStringUtil.isNumber("");
		assertFalse(boolean0);
	}

	@Test(timeout = 1000)
	public void testIsChineseTakingStringReturningTrue() throws Throwable {
		boolean boolean0 = JpfStringUtil.isChinese("\u842C");
		assertTrue(boolean0);
	}

	@Test(timeout = 1000)
	public void testIsChineseTakingChar() throws Throwable {
		boolean boolean0 = JpfStringUtil.isChinese('s');
		assertFalse(boolean0);
	}

	@Test(timeout = 1000)
	public void testIsChineseTakingStringReturningFalse() throws Throwable {
		boolean boolean0 = JpfStringUtil.isChinese("GB2312");
		assertFalse(boolean0);
	}

	@Test(timeout = 1000)
	public void testShowKeyRedWithNull() throws Throwable {
		String string0 = JpfStringUtil.seqNumLeftPadZero(0L, 8202);
		String string1 = JpfStringUtil.showKeyRed((String) null, string0);
		assertEquals("", string1);
	}

	@Test(timeout = 1000)
	public void testShowKeyRed0() throws Throwable {
		String string0 = JpfStringUtil.showKeyRed(".-i&a$4 9l", ".-i&amp;a$49l");
		assertEquals(".-i&a$4 9l", string0);
	}

	@Test(timeout = 1000)
	public void testShowKeyRedWithEmptyStringAndNull() throws Throwable {
		String string0 = JpfStringUtil.showKeyRed("", (String) null);
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testGetNotNullStrTakingObjectReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.getNotNullStr((Object) null);
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testRemoveRepeatStringWithNullAndNonEmptyString0() throws Throwable {
		String string0 = JpfStringUtil.removeRepeatString((String) null, "0");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testRemoveRepeatStringWithNullAndNonEmptyString1() throws Throwable {
		String string0 = JpfStringUtil.removeRepeatString(".java", (String) null);
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testRemoveRepeatString() throws Throwable {
		String string0 = JpfStringUtil.removeRepeatString("", "com.google.common.base.Predicates$SubtypeOfPredicate");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testDelRepeat0() throws Throwable {
		StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "");
		JpfStringUtil.delRepeat(stringBuilder0);
		assertEquals("0", stringBuilder0.toString());
	}

	@Test(timeout = 1000)
	public void testDelRepeat1() throws Throwable {
		StringBuilder stringBuilder0 = new StringBuilder("0");
		JpfStringUtil.delRepeat(stringBuilder0);
		JpfStringUtil.delRepeat(stringBuilder0);
		assertEquals("0,0", stringBuilder0.toString());
	}

	@Test(timeout = 1000)
	public void testGetEncoding0() throws Throwable {
		String string0 = JpfStringUtil.getEncoding("\u9678");
		assertEquals("UTF-8", string0);
	}

	@Test(timeout = 1000)
	public void testGetEncoding1() throws Throwable {
		String string0 = JpfStringUtil.getEncoding(",|-0TS0");
		assertEquals("GB2312", string0);
	}

	@Test(timeout = 1000)
	public void testConvertThrowsNullPointerException0() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.convert("Ja^ETiZJI /D%<");
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testConvertReturningZero() throws Throwable {
		long long0 = JpfStringUtil.convert("");
		assertEquals(0L, long0);
	}

	@Test(timeout = 1000)
	public void testGetCNStringTaking2ArgumentsWithNullAndNull() throws Throwable {
		String string0 = JpfStringUtil.getCNString((String) null, (String) null);
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testGetCNStringTaking2ArgumentsWithNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.getCNString("!", "");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testGetCNStringTaking2ArgumentsWithEmptyString() throws Throwable {
		String string0 = JpfStringUtil.getCNString("", "");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testGetFirstPosStrReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.getFirstPosStr("my>?`", "RollingFileAppender '{}': No name provided.");
		assertEquals("my>?`", string0);
	}

	@Test(timeout = 1000)
	public void testIsEmptyWithNull() throws Throwable {
		boolean boolean0 = JpfStringUtil.isEmpty((String) null);
		assertTrue(boolean0);
	}

	@Test(timeout = 1000)
	public void testIsEmptyWithEmptyString() throws Throwable {
		boolean boolean0 = JpfStringUtil.isEmpty("");
		assertTrue(boolean0);
	}

	@Test(timeout = 1000)
	public void testIsEmptyReturningFalse() throws Throwable {
		boolean boolean0 = JpfStringUtil.isEmpty("GB2312");
		assertFalse(boolean0);
	}

	@Test(timeout = 1000)
	public void testIsNotEmptyReturningFalse() throws Throwable {
		boolean boolean0 = JpfStringUtil.isNotEmpty("");
		assertFalse(boolean0);
	}

	@Test(timeout = 1000)
	public void testUnderlineToCamel1() throws Throwable {
		String string0 = JpfStringUtil.underlineToCamel("XYzs_JW]N`D%50");
		assertEquals("XYzsJW]N`D%50", string0);
	}

	@Test(timeout = 1000)
	public void testGetNotNullStrTakingStringReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.getNotNullStr("&#43;");
		assertEquals("&#43;", string0);
	}

	@Test(timeout = 1000)
	public void testIsNumber() throws Throwable {
		boolean boolean0 = JpfStringUtil.isNumber(" &nbsp;");
		assertFalse(boolean0);
	}

	@Test(timeout = 1000)
	public void testConvertThrowsNullPointerException1() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.convert("0");
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testCapitaliseThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.capitalise((String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testCapitaliseThrowsStringIndexOutOfBoundsException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.capitalise("");
			fail("Expecting exception: StringIndexOutOfBoundsException");

		} catch (StringIndexOutOfBoundsException e) {
		}
	}

	@Test(timeout = 1000)
	public void testDelRepeatThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.delRepeat((StringBuilder) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testFillStringByArgsThrowsNullPointerException() throws Throwable {
		String[] stringArray0 = new String[6];
		// Undeclared exception!
		try {
			JpfStringUtil.fillStringByArgs((String) null, stringArray0);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testFirstToLowerCaseThrowsArrayIndexOutOfBoundsException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.firstToLowerCase("");
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch (ArrayIndexOutOfBoundsException e) {
			//
			// 0
			//
		}
	}

	@Test(timeout = 1000)
	public void testFirstToLowerCaseThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.firstToLowerCase((String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testFirstToUpperCaseThrowsArrayIndexOutOfBoundsException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.firstToUpperCase("");
			fail("Expecting exception: ArrayIndexOutOfBoundsException");

		} catch (ArrayIndexOutOfBoundsException e) {
			//
			// 0
			//
		}
	}

	@Test(timeout = 1000)
	public void testFirstToUpperCaseThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.firstToUpperCase((String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testGetChineseThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.getChinese((String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testGetFirstPosStrThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.getFirstPosStr((String) null,
					"org.apache.logging.log4j.spi.CopyOnWriteSortedArrayThreadContextMap$1");
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testGetNotChineseThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.getNotChinese((String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testGetStringCountThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.getStringCount((String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testHtmEncodeThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.htmEncode((String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testHtmlEncodeThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.htmlEncode((String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testIsChineseTakingStringThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.isChinese((String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testIsContinuityCharacterThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.isContinuityCharacter((String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testIsSameCharacterThrowsNullPointerException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.isSameCharacter((String) null);
			fail("Expecting exception: NullPointerException");

		} catch (NullPointerException e) {
			//
			// no message in exception (getMessage() returned null)
			//
		}
	}

	@Test(timeout = 1000)
	public void testIsSameCharacterThrowsStringIndexOutOfBoundsException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.isSameCharacter("");
			fail("Expecting exception: StringIndexOutOfBoundsException");

		} catch (StringIndexOutOfBoundsException e) {
		}
	}

	@Test(timeout = 1000)
	public void testRemoveRepeatStringThrowsPatternSyntaxException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.removeRepeatString("", "%bvl:wW!P(=9mBE");
			fail("Expecting exception: PatternSyntaxException");

		} catch (PatternSyntaxException e) {
			//
			// Unclosed group near index 15\r
			// %bvl:wW!P(=9mBE
			//
		}
	}

	@Test(timeout = 1000)
	public void testSplitTaking2StringsThrowsPatternSyntaxException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.split("", "hm?:k^Q$JgheP)ogp");
			fail("Expecting exception: PatternSyntaxException");

		} catch (PatternSyntaxException e) {
			//
			// Unmatched closing ')' near index 12\r
			// hm?:k^Q$JgheP)ogp\r
			//             ^
			//
		}
	}

	@Test(timeout = 1000)
	public void testToCapitalizeCamelCaseThrowsStringIndexOutOfBoundsException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.toCapitalizeCamelCase("");
			fail("Expecting exception: StringIndexOutOfBoundsException");

		} catch (StringIndexOutOfBoundsException e) {
		}
	}

	@Test(timeout = 1000)
	public void testUrlDecodeThrowsIllegalArgumentException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.urlDecode("%");
			fail("Expecting exception: IllegalArgumentException");

		} catch (IllegalArgumentException e) {
			//
			// URLDecoder: Incomplete trailing escape (%) pattern
			//
		}
	}

	@Test(timeout = 1000)
	public void testCleanSqlWildCharaterReturningNull() throws Throwable {
		String string0 = JpfStringUtil.cleanSqlWildCharater((String) null);
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testCleanXSSReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.cleanXSS("");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testConvertReturningPositive() throws Throwable {
		long long0 = JpfStringUtil.convert("\u5341");
		assertEquals(10L, long0);
	}

	@Test(timeout = 1000)
	public void testConvertTo8859WithEmptyString() throws Throwable {
		String string0 = JpfStringUtil.convertTo8859("");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testFillStringByArgsReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.fillStringByArgs("", (String[]) null);
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testFilterStrReturningNull() throws Throwable {
		String string0 = JpfStringUtil.filterStr((String) null);
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testGetEncodingReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.getEncoding((String) null);
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testGetNotChineseReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.getNotChinese("'qc6y=#}");
		assertEquals("qc6y", string0);
	}

	@Test(timeout = 1000)
	public void testGetStrToIntReturningPositive() throws Throwable {
		int int0 = JpfStringUtil.getStrToInt("2147483647");
		assertEquals(Integer.MAX_VALUE, int0);
	}

	@Test(timeout = 1000)
	public void testHtmEncodeReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.htmEncode("");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testHtmlEncodeReturningEmptyString() throws Throwable {
		String string0 = JpfStringUtil.htmlEncode("");
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testIsNumberReturningTrue() throws Throwable {
		boolean boolean0 = JpfStringUtil.isNumber("0");
		assertTrue(boolean0);
	}

	@Test(timeout = 1000)
	public void testIsSameCharacterReturningTrue() throws Throwable {
		boolean boolean0 = JpfStringUtil.isSameCharacter("\u4F70");
		assertTrue(boolean0);
	}

	@Test(timeout = 1000)
	public void testRemovePrefixReturningNull() throws Throwable {
		String string0 = JpfStringUtil.removePrefix((String) null, (String) null);
		assertNull(string0);
	}

	@Test(timeout = 1000)
	public void testReplaceChinaStrReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.replaceChinaStr("2147483647", "g", ",BvJ3DeZbv{%]p5R.-i&amp;a$49l");
		assertEquals("\uFFFD\uFFFD2147483647", string0);
	}

	@Test(timeout = 1000)
	public void testReplaceMobileHtmlReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.replaceMobileHtml("20140214202121320");
		assertEquals("20140214202121320", string0);
	}

	@Test(timeout = 1000)
	public void testSplitTaking1And1ReturningNull() throws Throwable {
		String[] stringArray0 = JpfStringUtil.split((String) null, 'D');
		assertNull(stringArray0);
	}

	@Test(timeout = 1000)
	public void testSplitTaking2StringsReturningNonEmptyArray() throws Throwable {
		String[] stringArray0 = JpfStringUtil.split(",|-0TS0", "");
		assertEquals(7, stringArray0.length);
	}

	@Test(timeout = 1000)
	public void testConvertTo8859WithNull() throws Throwable {
		String string0 = JpfStringUtil.convertTo8859((String) null);
		assertEquals("", string0);
	}

	@Test(timeout = 1000)
	public void testHexString2binaryStringThrowsNumberFormatException() throws Throwable {
		// Undeclared exception!
		try {
			JpfStringUtil.hexString2binaryString("Cx/gWsHiY^KS3]zR");
			fail("Expecting exception: NumberFormatException");

		} catch (NumberFormatException e) {
			//
			// For input string: \"x\"
			//
		}
	}

	@Test(timeout = 1000)
	public void testShowCharCode() throws Throwable {
		byte[] byteArray0 = new byte[4];
		JpfStringUtil.showCharCode(byteArray0);
		assertArrayEquals(new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0 }, byteArray0);
	}

	@Test(timeout = 1000)
	public void testIsContinuityCharacterWithEmptyString() throws Throwable {
		boolean boolean0 = JpfStringUtil.isContinuityCharacter("");
		assertTrue(boolean0);
	}

	@Test(timeout = 1000)
	public void testCreateRandomWithZero() throws Throwable {
		String string0 = JpfStringUtil.createRandom(0);
		assertEquals("0", string0);
	}

	@Test(timeout = 1000)
	public void testShowKeyRed1() throws Throwable {
		String string0 = JpfStringUtil.showKeyRed("12.TS;c_U8$gf", "2");
		assertEquals("1<font color='red'>2</font>.TS;c_U8$gf", string0);
	}

	@Test(timeout = 1000)
	public void testRemoveRepeatStringReturningNonEmptyString() throws Throwable {
		String string0 = JpfStringUtil.removeRepeatString("2147483647", "");
		assertEquals("2147836", string0);
	}
}
