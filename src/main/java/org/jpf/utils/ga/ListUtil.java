/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.ga;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 
 * @author wupf
 *
 */
public class ListUtil {
	
	private ListUtil() {}
	/**
	 * 
	 * @category 替换LIST元素中的关键字
	 * @param qnames
	 * @param regex
	 * @param replacement
	 * @return
	 * @since 2020年1月24日
	 * @author wupf
	 */
	public static List<String> replaceForList(List<String> qnames, String regex, String replacement) {
		// return qnames.stream().map(x -> x.replace('.',
		// '/')).collect(Collectors.toList());
		return qnames.stream().map(x -> x.replace(regex, replacement)).collect(Collectors.toList());
	}

	/**
	 * 
	 * @category 功能
	 * @param set
	 * @return
	 * @author wupf
	 * @Date :2020年12月13日上午11:30:35
	 */
	public static List<?> orderSet(Set<?> set) {
		List<String> list = new ArrayList(set);
		Collections.sort(list);

		return list;
	}

	/**
	 * 
	 * @category LIST模糊查找
	 * @param name
	 * @param list
	 * @return
	 * @since 2020年12月7日
	 * @author wupf
	 */
	public static boolean fuzzyContains(String name, List list) {
		// 大小写不敏感的时候，多加一个条件
		// Pattern pattern = Pattern.compile(name, Pattern.CASE_INSENSITIVE);
		// logger.debug( list.size());
		for (int i = 0; i < list.size(); i++) {
			// logger.debug( list.get(i));
			Pattern pattern = Pattern.compile(list.get(i).toString(), Pattern.CASE_INSENSITIVE);
			// Matcher matcher = pattern.matcher((list.get(i)).toString());
			Matcher matcher = pattern.matcher(name);
			if (matcher.find()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @category LIST模糊查找
	 * @param name
	 * @param list
	 * @return
	 * @since 2020年12月7日
	 * @author wupf
	 */
	public static List fuzzyQuery(String name, List list) {
		List fuzzyQuery = new ArrayList();
		// 大小写不敏感的时候，多加一个条件
		Pattern pattern = Pattern.compile(name, Pattern.CASE_INSENSITIVE);
		for (int i = 0; i < list.size(); i++) {
			Matcher matcher = pattern.matcher((list.get(i)).toString());
			if (matcher.find()) {
				fuzzyQuery.add(list.get(i));
			}
		}
		return fuzzyQuery;
	}

	/**
	 * @category 进行深度拷贝
	 * @param <T>
	 * @param src
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static <T> List<T> deepCopy(List<T> src) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(byteOut);
		out.writeObject(src);

		ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
		ObjectInputStream in = new ObjectInputStream(byteIn);
		@SuppressWarnings("unchecked")
		List<T> dest = (List<T>) in.readObject();
		return dest;
	}
}
