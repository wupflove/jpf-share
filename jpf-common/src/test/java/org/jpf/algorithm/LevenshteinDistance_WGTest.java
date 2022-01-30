package org.jpf.algorithm;

import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>LevenshteinDistance_WGTest</code> contains tests for the class <code>{@link LevenshteinDistance}</code>.
 *
 * @generatedBy wupf at 20-1-22 下午3:44
 * @version $Revision: 1.0 $
 */
public class LevenshteinDistance_WGTest {

	@Test(timeout = 1000)
	public void testMain_1() throws Exception {
		String a = "Steel";
		String b = "Steel Pipe";
		LevenshteinDistance cLevenshteinDistance=new LevenshteinDistance();
		System.out.println("相似度：" + cLevenshteinDistance.getSimilarityRatio(a, b));

		String str1 = "今天星期四";
		String str2 = "今天是星期五";
		String str3 = "今天星期五";
		String str4 = "AliPayId";
		String str5 = "WeiXinPayId";
		String str6 = "PayId";
		System.out.println(cLevenshteinDistance.getSimilarityRatio(str1, str2));
		System.out.println(cLevenshteinDistance.getSimilarityRatio(str3, str2));
		System.out.println(cLevenshteinDistance.getSimilarityRatio(str4, str5));
		System.out.println(cLevenshteinDistance.getSimilarityRatio(str4, str6));
		System.out.println(cLevenshteinDistance.getSimilarityRatio(str5, str6));
		System.out.println("1="+cLevenshteinDistance.getSimilarityRatio("今天是星期四","今天星期五吗"));
	
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
		new org.junit.runner.JUnitCore().run(LevenshteinDistance_WGTest.class);
	}
}
