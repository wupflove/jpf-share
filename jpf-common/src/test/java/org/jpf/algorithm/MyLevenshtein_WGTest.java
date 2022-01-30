package org.jpf.algorithm;

import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>MyLevenshtein_WGTest</code> contains tests for the class <code>{@link MyLevenshtein}</code>.
 *
 * @generatedBy wupf at 20-1-22 下午3:44
 * @version $Revision: 1.0 $
 */
public class MyLevenshtein_WGTest {
	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy wupf at 20-1-22 下午3:44
	 */
	@Test
	public void testMain_1() throws Exception {

		//要比较的两个字符串
		String str1 = "今天星期四";
		String str2 = "今天是星期五";
		String str3 = "今天星期五";
		String str4 = "AliPayId";
		String str5 = "WeiXinPayId";
		String str6 = "PayId";
		MyLevenshtein cMyLevenshtein=new MyLevenshtein();
		cMyLevenshtein.levenshtein(str1,str2);
		cMyLevenshtein.levenshtein(str3,str2);
		cMyLevenshtein.levenshtein(str4,str5);
		cMyLevenshtein.levenshtein(str4,str6);
		cMyLevenshtein.levenshtein(str5,str6);
		
		cMyLevenshtein.levenshtein("今天是星期四","今天星期五吗");
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
		new org.junit.runner.JUnitCore().run(MyLevenshtein_WGTest.class);
	}
}
