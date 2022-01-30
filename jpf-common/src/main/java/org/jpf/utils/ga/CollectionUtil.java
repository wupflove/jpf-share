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
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jpf.common.abstractUtil;
import org.jpf.utils.JpfStringUtil;

import com.alibaba.fastjson.JSON;

/**
 * 
 * @author wupf
 *
 */
public class CollectionUtil extends abstractUtil {

	private CollectionUtil() {

	}

	
	public static void main(String[] args)
	{
		System.out.println("main");
		try {
			List<String> list1=new ArrayList<String>();
			list1.add("1");
			list1.add("2");
			
			List<String> list2=new ArrayList<String>();
			list2.addAll(list1);
			
			System.out.println(list2);
			System.out.println(list1);
			
			list1.clear();
			
			System.out.println(list2);
			System.out.println(list1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * @category 使用JSON做深度拷贝
	 * @param <T>
	 * @param src
	 * @return
	 */
	public static <T> List<T> deepCopyByJson(List<T> src) {

		return (List<T>) JSON.parse(JSON.toJSONString(src));
	}

	public static <T> List<T> deepCopyBySteam(List<T> src) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(byteOut);
		out.writeObject(src);

		ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
		ObjectInputStream in = new ObjectInputStream(byteIn);
		@SuppressWarnings("unchecked")
		List<T> dest = (List<T>) in.readObject();
		return dest;
	}

	/**
	 * @category 深度拷贝
	 * @param <K>
	 * @param <V>
	 * @param src
	 * @return
	 */
	public static <K, V> Map<K, V> deepCopy(Map<K, V> src) {

		Map<K, V> map = new HashMap<K, V>();
		map.putAll(src);
		return map;
	}

	/**
	 * 
	 * isNotEmpty:(检查集合是否为空，不为空返回true)
	 * 
	 * @param <T> type of param
	 * @param c   collection
	 * @return boolean
	 */
	public static <T> boolean isNotEmpty(Collection<T> c) {
		if (c != null && c.size() != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * checkEmpty:(检查集合是否为空，为空返回true)
	 * 
	 * @param <T> type of param
	 * @param c   collection
	 * @return boolean
	 */
	public static <T> boolean isEmpty(Collection<T> c) {
		if (c == null || c.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 该sublist增加了下标检测，避免报错
	 * 
	 * @param <T>    type of param
	 * @param source List
	 * @param from   from index
	 * @param to     to index
	 * @return list
	 */
	public static <T> List<T> subList(List<T> source, int from, int to) {
		if (isEmpty(source)) {
			return null;
		}
		int size = source.size();
		if (to > size) {
			return source.subList(from, size);
		} else {
			return source.subList(from, to);
		}
	}

	/**
	 * 将数组转换为List,如果数组为空则返回一个空list
	 * 
	 * @param <T> type of param
	 * @param a   object array
	 * @return List
	 */
	public static <T> List<T> asList(T... a) {
		if (null != a) {
			return Arrays.asList(a);
		} else {
			return new ArrayList<>(0);
		}
	}

	/**
	 * 较差合并两个list的各项值交叉合并,合并有先后顺序，对于集合数据不为空的情况， result1的值第一个值放最前面
	 * 
	 * @param <T>     type of param
	 * @param result1 first of list
	 * @param result2 second of list
	 * @return List
	 */
	public static <T> List<T> mergeAndSwap(List<T> result1, List<T> result2) {

		// 两个数据都为空，则返回空的结合
		if (isEmpty(result1) && isEmpty(result2)) {
			return new ArrayList<>(0);
		}

		// 近使用result2的结果，无需合并
		if (isEmpty(result1) && isNotEmpty(result2)) {
			return result2;
		}

		// 仅仅使用result1的结果，无需合并
		if (isNotEmpty(result1) && isEmpty(result2)) {
			return result1;
		}

		int a = result1.size();
		int b = result2.size();
		int size = a + b;
		// 两个list的值交叉合并算法(暂时未经过测试)
		List<T> finalResult = new ArrayList<>(size);
		if (a >= b) {
			for (int i = 0; i < size; i++) {
				if (i > (b << 1) - 1) {
					finalResult.add(result1.get(i - b));
				} else {
					if ((i & 1) == 0 && i >> 1 < a) {
						finalResult.add(result1.get(i >> 1));
					}
				}
				if ((i & 1) == 1 && (i - 1) >> 1 < b) {
					finalResult.add(result2.get((i - 1) >> 1));
				}
			}
		} else {
			for (int i = 0; i < size; i++) {
				if ((i & 1) == 0 && (i >> 1) < a) {
					finalResult.add(result1.get(i >> 1));
				}
				if ((i & 1) == 1 && (i >> 1) < a - 1) {
					finalResult.add(result2.get((i - 1) >> 1));
				}
				if (i >= (a << 1) - 1) {
					finalResult.add(result2.get(i - a));
				}
			}
		}
		return finalResult;
	}

	/**
	 * split list
	 * 
	 * @param <T>      type of param
	 * @param list     data of list
	 * @param pageSize page size
	 * @return List
	 */
	public static <T> List<List<T>> splitList(List<T> list, int pageSize) {
		List<List<T>> listArray = new ArrayList<>();
		if (list != null && list.size() > 0) {
			int listSize = list.size();
			int page = (listSize + (pageSize - 1)) / pageSize;
			for (int i = 0; i < page; i++) {
				List<T> subList = new ArrayList<>();
				for (int j = 0; j < listSize; j++) {
					int pageIndex = ((j + 1) + (pageSize - 1)) / pageSize;
					if (pageIndex == (i + 1)) {
						subList.add(list.get(j));
					}

					if ((j + 1) == ((j + 1) * pageSize)) {
						break;
					}
				}
				listArray.add(subList);
			}
		}
		return listArray;
	}

	/**
	 * 将List集合中的无效的map数据清空，被指定为排除的字段 即使map中这些指定字段有值,只要其他的key是无效的数据都会被被移除，但是0并不代表没有值
	 * 
	 * @param list       list of map data
	 * @param exceptKeys except keys
	 * @return List
	 */
	public static List<Map<String, Object>> filterEmpty(List<Map<String, Object>> list, String... exceptKeys) {
		List<Map<String, Object>> tempList = new ArrayList<>();
		for (Map<String, Object> map : list) {
			int a = map.size();
			int counter = 0;
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				for (String str : exceptKeys) {
					if (!entry.getKey().equals(str)) {
						Object value = entry.getValue();
						if (value instanceof String) {
							if (JpfStringUtil.isEmpty(String.valueOf(value))) {
								counter++;
							}
						} else {
							if (null == value) {
								counter++;
							}
						}
					}
				}
			}
			if (counter < a - exceptKeys.length) {
				tempList.add(map);
			}
		}
		return tempList;
	}

	public static final String DESC = "desc";
	public static final String ASC = "asc";

	/**
	 * 对list中的元素按升序排列.
	 * 
	 * @param list  排序集合
	 * @param field 排序字段
	 * @return
	 */
	public static List<?> sort(List<?> list, final String field) {
		return sort(list, field, null);
	}

	/**
	 * @category对list中的元素进行排序.
	 * 
	 * @param list  排序集合
	 * @param field 排序字段
	 * @param sort  排序方式: SortList.DESC(降序) SortList.ASC(升序).
	 */
	@SuppressWarnings("unchecked")
	public static List<?> sort(List<?> list, final String field, final String sort) {
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object a, Object b) {
				int ret = 0;
				try {
					Field f = a.getClass().getDeclaredField(field);
					f.setAccessible(true);
					Class<?> type = f.getType();

					if (type == int.class) {
						ret = Integer.compare(f.getInt(a), f.getInt(b));
					} else if (type == double.class) {
						ret = Double.compare(f.getDouble(a), f.getDouble(b));
					} else if (type == long.class) {
						ret = Long.compare(f.getLong(a), f.getLong(b));
					} else if (type == float.class) {
						ret = Float.compare(f.getFloat(a), f.getFloat(b));
					} else if (type == Date.class) {
						ret = ((Date) f.get(a)).compareTo((Date) f.get(b));
					} else if (isImplementsOf(type, Comparable.class)) {
						ret = ((Comparable) f.get(a)).compareTo(f.get(b));
					} else {
						ret = String.valueOf(f.get(a)).compareTo(String.valueOf(f.get(b)));
					}

				} catch (SecurityException | NoSuchFieldException | IllegalAccessException
						| IllegalArgumentException e) {
					e.printStackTrace();
					logger.error(e);
				}
				if (sort != null && sort.equalsIgnoreCase(DESC)) {
					return -ret;
				} else {
					return ret;
				}

			}
		});
		return list;
	}

	/**
	 * 对list中的元素按fields和sorts进行排序,
	 * fields[i]指定排序字段,sorts[i]指定排序方式.如果sorts[i]为空则默认按升序排列.
	 * 
	 * @param list
	 * @param fields
	 * @param sorts
	 */
	@SuppressWarnings("unchecked")
	public static List<?> sort(List<?> list, String[] fields, String[] sorts) {
		if (fields != null && fields.length > 0) {
			for (int i = fields.length - 1; i >= 0; i--) {
				final String field = fields[i];
				String tmpSort = ASC;
				if (sorts != null && sorts.length > i && sorts[i] != null) {
					tmpSort = sorts[i];
				}
				final String sort = tmpSort;
				Collections.sort(list, new Comparator() {
					@Override
					public int compare(Object a, Object b) {
						int ret = 0;
						try {
							Field f = a.getClass().getDeclaredField(field);
							f.setAccessible(true);
							Class<?> type = f.getType();
							if (type == int.class) {
								ret = ((Integer) f.getInt(a)).compareTo(f.getInt(b));
							} else if (type == double.class) {
								ret = ((Double) f.getDouble(a)).compareTo(f.getDouble(b));
							} else if (type == long.class) {
								ret = ((Long) f.getLong(a)).compareTo(f.getLong(b));
							} else if (type == float.class) {
								ret = ((Float) f.getFloat(a)).compareTo(f.getFloat(b));
							} else if (type == Date.class) {
								ret = ((Date) f.get(a)).compareTo((Date) f.get(b));
							} else if (isImplementsOf(type, Comparable.class)) {
								ret = ((Comparable) f.get(a)).compareTo(f.get(b));
							} else {
								ret = String.valueOf(f.get(a)).compareTo(String.valueOf(f.get(b)));
							}

						} catch (SecurityException | NoSuchFieldException | IllegalArgumentException
								| IllegalAccessException e) {
							e.printStackTrace();
							logger.error(e);
						}

						if (sort != null && sort.equalsIgnoreCase(DESC)) {
							return -ret;
						} else {
							return ret;
						}
					}
				});
			}
		}
		return list;
	}

	/**
	 * 默认按正序排列
	 * 
	 * @param list
	 * @param method
	 */
	public static List<?> sortByMethod(List<?> list, final String method) {
		return sortByMethod(list, method, null);
	}

	@SuppressWarnings("unchecked")
	public static List<?> sortByMethod(List<?> list, final String method, final String sort) {
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object a, Object b) {
				int ret = 0;
				try {
					Method m = a.getClass().getMethod(method, null);
					m.setAccessible(true);
					Class<?> type = m.getReturnType();
					if (type == int.class) {
						ret = ((Integer) m.invoke(a, null)).compareTo((Integer) m.invoke(b, null));
					} else if (type == double.class) {
						ret = ((Double) m.invoke(a, null)).compareTo((Double) m.invoke(b, null));
					} else if (type == long.class) {
						ret = ((Long) m.invoke(a, null)).compareTo((Long) m.invoke(b, null));
					} else if (type == float.class) {
						ret = ((Float) m.invoke(a, null)).compareTo((Float) m.invoke(b, null));
					} else if (type == Date.class) {
						ret = ((Date) m.invoke(a, null)).compareTo((Date) m.invoke(b, null));
					} else if (isImplementsOf(type, Comparable.class)) {
						ret = ((Comparable) m.invoke(a, null)).compareTo(m.invoke(b, null));
					} else {
						ret = String.valueOf(m.invoke(a, null)).compareTo(String.valueOf(m.invoke(b, null)));
					}

					if (isImplementsOf(type, Comparable.class)) {
						ret = ((Comparable) m.invoke(a, null)).compareTo(m.invoke(b, null));
					} else {
						ret = String.valueOf(m.invoke(a, null)).compareTo(String.valueOf(m.invoke(b, null)));
					}

				} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
					e.printStackTrace();
					logger.error(e);
				}

				if (sort != null && sort.toLowerCase().equals(DESC)) {
					return -ret;
				} else {
					return ret;
				}
			}
		});
		return list;
	}

	@SuppressWarnings("unchecked")
	public static List<?> sortByMethod(List<?> list, final String methods[], final String sorts[]) {
		if (methods != null && methods.length > 0) {
			for (int i = methods.length - 1; i >= 0; i--) {
				final String method = methods[i];
				String tmpSort = ASC;
				if (sorts != null && sorts.length > i && sorts[i] != null) {
					tmpSort = sorts[i];
				}
				final String sort = tmpSort;
				Collections.sort(list, new Comparator() {
					@Override
					public int compare(Object a, Object b) {
						int ret = 0;
						try {
							Method m = a.getClass().getMethod(method, null);
							m.setAccessible(true);
							Class<?> type = m.getReturnType();
							if (type == int.class) {
								ret = ((Integer) m.invoke(a, null)).compareTo((Integer) m.invoke(b, null));
							} else if (type == double.class) {
								ret = ((Double) m.invoke(a, null)).compareTo((Double) m.invoke(b, null));
							} else if (type == long.class) {
								ret = ((Long) m.invoke(a, null)).compareTo((Long) m.invoke(b, null));
							} else if (type == float.class) {
								ret = ((Float) m.invoke(a, null)).compareTo((Float) m.invoke(b, null));
							} else if (type == Date.class) {
								ret = ((Date) m.invoke(a, null)).compareTo((Date) m.invoke(b, null));
							} else if (isImplementsOf(type, Comparable.class)) {
								ret = ((Comparable) m.invoke(a, null)).compareTo(m.invoke(b, null));
							} else {
								ret = String.valueOf(m.invoke(a, null)).compareTo(String.valueOf(m.invoke(b, null)));
							}

						} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
							e.printStackTrace();
							logger.error(e);
						}

						if (sort != null && sort.toLowerCase().equals(DESC)) {
							return -ret;
						} else {
							return ret;
						}
					}
				});
			}
		}
		return list;
	}

	/**
	 * @category:判断对象实现的所有接口中是否包含szInterface
	 * 
	 * @param clazz
	 * @param szInterface
	 */
	public static boolean isImplementsOf(Class<?> clazz, Class<?> szInterface) {
		boolean flag = false;

		Class<?>[] face = clazz.getInterfaces();
		for (Class<?> c : face) {
			if (c == szInterface) {
				flag = true;
			} else {
				flag = isImplementsOf(c, szInterface);
			}
		}

		if (!flag && null != clazz.getSuperclass()) {
			return isImplementsOf(clazz.getSuperclass(), szInterface);
		}
		return flag;
	}
}
