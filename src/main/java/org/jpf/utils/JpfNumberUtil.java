/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils;

import java.util.ArrayList;
import java.util.List;

import org.jpf.common.abstractUtil;

/**
 * @author wupf
 *
 */
public class JpfNumberUtil extends abstractUtil {

	/**
	 * 
	 */
	private JpfNumberUtil() {

	}

	private static JpfNumberUtil singleton;

	public static synchronized JpfNumberUtil getInstance() {
		if (singleton == null) {
			singleton = new JpfNumberUtil();
		}
		return singleton;
	}

	/**
	 * 
	 * @category:getBetweenNumbers
	 * @Title: getNumbers
	 * @Author:wupf@
	 * @date:2020年1月29日
	 * @param minValue
	 * @param maxValue
	 * @return
	 */
	public List getBetweenNumbers(int minValue, int maxValue) {
		List mList = new ArrayList<>();
		for (int i = minValue; i < maxValue; i++) {
			mList.add(i);
		}
		return mList;
	}

}
