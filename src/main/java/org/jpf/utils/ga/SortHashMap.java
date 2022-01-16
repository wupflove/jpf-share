/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.ga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author wupf
 *
 */
public class SortHashMap {

	public  List<Map.Entry<String, String>> sortMapByKey(Map<String, String> maps) {
		// 排序前的输出

		System.out.println(maps.size());
		System.out.println("----------------");
		// 排序后的输出
		List<Map.Entry<String, String>> info = new ArrayList<Map.Entry<String, String>>(maps.entrySet());
		Collections.sort(info, new Comparator<Map.Entry<String, String>>() {
			@Override
			public int compare(Map.Entry<String, String> obj1, Map.Entry<String, String> obj2) {
				return obj1.getKey().toUpperCase().compareTo(obj2.getKey().toUpperCase());
			}
		});
		System.out.println(info.size());
		return info;
	}

}
