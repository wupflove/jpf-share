/*
 this file is write by wupf
 */
package org.jpf.algorithm;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

/**
 * The class <code>DescartesTest</code> contains tests for the class
 * <code>{@link Descartes}</code>.
 * <p>
 * Copyright (c) 2019
 * 
 * @generatedBy wupf at 2019-11-28 18:54:54
 * @author Administrator
 * @version $Revision: 1.3.0
 */

public class Descartes_WRTest {

	/**
	 * Run the run method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 18:54:54
	 * @see public void run(List<List<String>> dimvalue,List<String> result,int
	 *      layer,String curstring,int MaxSize)
	 */
	@Test(timeout = 1000)
	public void test_run_R1() throws Throwable {

		List<List<String>> dimvalue = null;
		List<String> result = null;
		int layer = Integer.MAX_VALUE;
		String curstring = "abc123";
		int MaxSize = Integer.MIN_VALUE;

		Descartes wupf_fixture = new Descartes();
		wupf_fixture.run(dimvalue, result, layer, curstring, MaxSize);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * 测试方法初始化.
	 * 
	 * @throws Exception if the initialization fails for some reason
	 * 
	 * @generatedBy wupf at 2019-11-28 18:54:54
	 */
	@Before
	public void setUp() throws Exception {
		// TODO: add additional set up code here
		try {
			MockitoAnnotations.initMocks(this);
		} catch (Exception ex) {
		}
	}

}
