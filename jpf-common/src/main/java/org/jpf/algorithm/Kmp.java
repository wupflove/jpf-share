/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.algorithm;

/**
 * @category KMP算法
 * @author wupf
 *
 */
public class Kmp {

	/**
	 * 
	 */
	public Kmp() {
	}

	/**
	 * 
	 * @category 功能
	 * @param s
	 * @param t
	 * @return
	 * @author wupf
	 * @Date :2021年3月27日下午8:18:32
	 */
	public int KMP_Index(String s, String t) {
		char[] ss = s.trim().toCharArray();
		char[] tt = t.trim().toCharArray();
		return KMP_Index(ss, tt);
	}

	/**
	 * 获得字符串的next函数值
	 * 
	 * @param t
	 *            字符串
	 * @return next函数值
	 */
	public int[] next(char[] t) {
		int[] next = new int[t.length];
		next[0] = -1;
		int i = 0;
		int j = -1;
		while (i < t.length - 1) {
			if (j == -1 || t[i] == t[j]) {
				i++;
				j++;
				if (t[i] != t[j]) {
					next[i] = j;
				} else {
					next[i] = next[j];
				}
			} else {
				j = next[j];
			}
		}
		return next;
	}

	/**
	 * KMP匹配字符串
	 * 
	 * @param s
	 *            主串
	 * @param t
	 *            模式串
	 * @return 若匹配成功，返回下标，否则返回-1
	 */
	public int KMP_Index(char[] s, char[] t) {
		int[] next = next(t);
		int i = 0;
		int j = 0;
		while (i <= s.length - 1 && j <= t.length - 1) {
			if (j == -1 || s[i] == t[j]) {
				i++;
				j++;
			} else {
				j = next[j];
			}
		}
		if (j < t.length) {
			return -1;
		} else
			return i - t.length; // 返回模式串在主串中的头下标
	}
}
