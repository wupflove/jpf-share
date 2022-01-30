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
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * @author wupf
 *
 */
public class MapUtil {

	private MapUtil() {}
	
	private static MapUtil singleton;

	public static synchronized MapUtil getInstance() {
		if (singleton == null) {
			singleton = new MapUtil();
		}
		return singleton;
	}
	/*
	 * 
	 * （1）集合反序列化 Map<String,String> map=JSON.parseObject(jsonString, Map.class);
	 * System.out.println("map get name:"+map.get("name"));
	 * System.out.println("map:"+map);
	 * 
	 * （2）泛型的反序列化,使用TypeReference传入类型信息 Map<String,String>
	 * map2=JSON.parseObject((jsonString,new TypeReference<Map<String,String>>(){});
	 * System.out.println("map2 get name:"+map2.get("name"));
	 * System.out.println("map2 get hobbies:"+map2.get("hobbies"));
	 * System.out.println("map2:"+map2);
	 */
	/**
	 * 
	 * @category:
	 * @Title: sort
	 * @Author:wupf@
	 * @date:2020年3月18日
	 * @param map
	 * @return
	 */
	public Map sort(Map map) {
		Map<Object, Object> mapVK = new TreeMap<Object, Object>(new Comparator<Object>() {
			@Override
			public int compare(Object obj1, Object obj2) {
				String v1 = (String) obj1;
				String v2 = (String) obj2;
				int s = v2.compareTo(v1);
				return s;
			}
		});

		Set col = map.keySet();
		Iterator iter = col.iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			Integer value = (Integer) map.get(key);
			mapVK.put(key, value);
		}
		return mapVK;
	}

	/**
	 * 
	 * @category:如果只是遍历key而无需value的话，可以直接用
	 * @Title: cycle1
	 * @Author:wupf@
	 * @date:2020年3月18日
	 * @param map
	 */
	public void cycle1(Map map) {

		for (Object key : map.keySet()) {
			// key process
			System.out.println("key:" + key);
			System.out.println("value:" + map.get(key));
		}
	}
	
	/**
	 * 
	 * @category 边循环边删除
	 * @author wupf
	 * @Date :2021年4月9日下午3:14:04
	 */
	public void cycle3() {
		Map<String, String> map = new HashMap<String, String>();
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			String key = entry.getKey();
			String cStg3CaseRunResultInfo = entry.getValue();
			it.remove();
		}
	}

	/**
	 * 
	 * @category lambda循环功能
	 * @param map
	 * @author wupf
	 * @Date :2021年4月9日下午3:14:22
	 */
	public void cycleLambda(Map map) {
		// 遍历
		map.forEach((key, value) -> {
			System.out.println(key);
			System.out.println(value);
		});
	}

	/**
	 * 
	 * @category: 如果既需要key也需要value，直接用
	 * @Title: cycle2
	 * @Author:wupf@
	 * @date:2020年3月18日
	 * @param map
	 */
	public void cycle2(Map map2) {
		Map<String, String> map = new HashMap<String, String>();
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

	public void writeMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "1");

		String strValueString = map.get("1");
		if (strValueString != null) {
			System.out.println("exist");
			strValueString = "2";
			map.put("1", strValueString);
		}
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

	static class MapValueComparator implements Comparator<Map.Entry<String, String>> {

		@Override
		public int compare(Entry<String, String> me1, Entry<String, String> me2) {

			return me1.getValue().compareTo(me2.getValue());
		}
	}

	/**
	 * 使用 Map按value进行排序
	 * 
	 * @param map
	 * @return
	 */
	public Map<String, String> sortMapByValue(Map<String, String> oriMap) {
		if (oriMap == null || oriMap.isEmpty()) {
			return null;
		}
		Map<String, String> sortedMap = new LinkedHashMap<String, String>();
		List<Map.Entry<String, String>> entryList = new ArrayList<Map.Entry<String, String>>(oriMap.entrySet());
		Collections.sort(entryList, new MapValueComparator());

		Iterator<Map.Entry<String, String>> iter = entryList.iterator();
		Map.Entry<String, String> tmpEntry = null;
		while (iter.hasNext()) {
			tmpEntry = iter.next();
			sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
		}
		return sortedMap;
	}

	/**
	 * 使用 Map按key进行排序
	 * 
	 * @param map
	 * @return
	 */
	public Map<String, String> sortMapByKey(Map<String, String> map) {
		if (map == null || map.isEmpty()) {
			return null;
		}

		Map<String, String> sortMap = new TreeMap<String, String>(new MapKeyComparator());

		sortMap.putAll(map);

		return sortMap;
	}

	static class MapKeyComparator implements Comparator<String> {

		@Override
		public int compare(String str1, String str2) {

			return str1.compareTo(str2);
		}
	}

}
