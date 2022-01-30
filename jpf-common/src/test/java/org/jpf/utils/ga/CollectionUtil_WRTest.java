/*
 this file is write by wupf
 */
package org.jpf.utils.ga;

import java.util.Arrays;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import java.util.Date;
import java.lang.reflect.Method;
import java.util.Collection;
import org.jpf.utils.JpfStringUtil;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.Collections;

import org.mockito.Mock;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import org.mockito.MockitoAnnotations;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import java.util.List;
import com.alibaba.fastjson.JSON;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

/**
* The class <code>CollectionUtilTest</code> contains tests for the class <code>{@link CollectionUtil}</code>.
* <p>
* Copyright (c) 2019
* 
* @generatedBy wupf at 2019-11-29 17:06:03
* @author Administrator
* @version $Revision: 1.3.0
*/

public class CollectionUtil_WRTest {

	@Test(timeout = 1000)
	public void test_deepCopyByJson_R0() throws Throwable {

		List<Object> src = null;
		List<Object> wupf_result = CollectionUtil.deepCopyByJson(src);

		System.out.println("jpf_check:deepCopyByJson:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	@Test(timeout = 1000)
	public void test_subList_R10() throws Throwable {

		List<Object> source = null;
		int from = Integer.MIN_VALUE;
		int to = Integer.MAX_VALUE;

		List<Object> wupf_result = CollectionUtil.subList(source, from, to);

		System.out.println("jpf_check:subList:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	@Test(timeout = 1000)
	public void test_mergeAndSwap_R19() throws Throwable {

		List<Object> result1 = null;
		List<Object> result2 = null;
		List<Object> wupf_result = CollectionUtil.mergeAndSwap(result1, result2);

		System.out.println("jpf_check:mergeAndSwap:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	@Test(timeout = 1000)
	public void test_splitList_R20() throws Throwable {

		List<Object> list = null;
		int pageSize = Integer.MAX_VALUE;

		List<List<Object>> wupf_result = CollectionUtil.splitList(list, pageSize);

		System.out.println("jpf_check:splitList:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	@Test(timeout = 1000)
	public void test_isImplementsOf_R70() throws Throwable {

		Class<?> clazz = String.class;
		Class<?> szInterface = String.class;
		boolean wupf_result = CollectionUtil.isImplementsOf(clazz, szInterface);

		System.out.println("jpf_check:isImplementsOf:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));
		assertEquals(false, wupf_result);

	}

	/**
	* 娴嬭瘯鏂规硶鍒濆鍖�.
	* 
	* @throws Exception 
	*         if the initialization fails for some reason 
	*  
	* @generatedBy wupf at 2019-11-29 17:06:03
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
