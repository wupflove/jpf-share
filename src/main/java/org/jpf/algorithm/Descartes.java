/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.algorithm;

import java.util.List;

/**
 * 
 * @author wupf
 *
 */
public class Descartes {

	/**
	 * 
	 * @category 功能
	 * @param dimvalue
	 * @param result
	 * @param layer
	 * @param curstring
	 * @param MaxSize
	 * @author wupf
	 * @Date :2021年3月27日下午8:18:20
	 */
	public void run(List<List<String>> dimvalue, List<String> result, int layer, String curstring, int MaxSize) {

		if (MaxSize > 1000) {
			MaxSize = 1000;
		}
		if (null == dimvalue) {
			return;
		}
		// 大于一个集合时：
		if (result.size() > MaxSize) {
			return;
		}
		if (layer < dimvalue.size() - 1) {
			// 大于一个集合时，第一个集合为空
			if (dimvalue.get(layer).size() == 0) {
				run(dimvalue, result, layer + 1, curstring, MaxSize);
			} else {
				for (int i = 0; i < dimvalue.get(layer).size(); i++) {
					StringBuilder s1 = new StringBuilder();
					s1.append(curstring);
					s1.append(dimvalue.get(layer).get(i));
					run(dimvalue, result, layer + 1, s1.toString(), MaxSize);
				}
			}
		}
		// 只有一个集合时：
		else if (layer == dimvalue.size() - 1) {
			// 只有一个集合，且集合中没有元素
			if (dimvalue.get(layer).size() == 0)
				result.add(curstring);
			// 只有一个集合，且集合中有元素时：其笛卡尔积就是这个集合元素本身
			else {
				int j = dimvalue.get(layer).size();
				for (int i = 0; i < j; i++) {
					result.add(curstring + dimvalue.get(layer).get(i));
				}
				/*
				 * for (int i = 0; i < dimvalue.get(layer).size(); i++) { result.add(curstring +
				 * dimvalue.get(layer).get(i)); }
				 */
			}
		}
	}

}
