/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.jpf.common.abstractUtil;
import org.jpf.utils.JpfConst;
import org.jpf.utils.ios.JpfOsUtil;


/**
 * @author wupf
 *
 */
public class JpfClassUtil extends abstractUtil {

	/**
	 * 
	 */
	private JpfClassUtil() {
	}


	/**
	 * @category 根据类名获取文件名称,斜杠表示类名称
	 * @param className
	 * @return
	 * @Author:wupf
	 *
	 */
	public static String getFileNameByClass(String strFullClassName) {
		if (JpfOsUtil.isWindows()) {
			return strFullClassName.replaceAll("\\.", "\\\\");
		}
		return strFullClassName.replaceAll("\\.", "/");
	}

	/**
	 * 
	 * @return
	 */
	public static String getTitle() {
		try {
			return new String("璇诲彇閰嶇疆寮傚父".getBytes("GBK"), "UTF-8");
		} catch (Exception e) {
			logger.error("getTitle",e);
		}
		return null;
	}

	/**
	 * @category 斜杠表示类名称
	 * @param strFullClassName
	 * @return
	 * @Author:wupf
	 *
	 */
	public static String getClassNameWithSlash(String strClassFullName) {

		if (JpfOsUtil.isWindows()) {
			return strClassFullName.replaceAll("\\.", "\\\\");
		}
		return strClassFullName.replaceAll("\\.", "/");

	}
	/**
	 * 
	 * @param strFullClassName
	 * @return
	 */
	public static String getSimpleClassNameByPoint(String strClassFullName) {
		return strClassFullName.substring(strClassFullName.lastIndexOf(".") + 1, strClassFullName.length());
	}

	/**
	 * @category 类表达形式转换
	 * @param strClassName
	 * @return
	 */
	public static String getClassNameWithDot(String strClassName) {
		if (strClassName == null || strClassName.trim().length() == 0) {
			return "Object";
		}
		if (strClassName.startsWith("L") && !strClassName.startsWith("Long") && !strClassName.startsWith("List")) {
			strClassName = strClassName.substring(1, strClassName.length());
		}
		if (strClassName.startsWith(".")) {
			strClassName = strClassName.substring(1, strClassName.length());
		}
		return strClassName.replaceAll("/", ".").replaceAll("\\\\", ".");
	}

	/**
	 * @category 获取类的所有构造方法
	 * @author wupf
	 * @param c
	 * @return
	 */
	public static String getConstructors(Class c) {
		StringBuffer buf = new StringBuffer();
		// 获取类的构造方法
		Constructor<?>[] cons = c.getDeclaredConstructors();
		for (Constructor con : cons) {
			// 获取构造方法的访问修饰符
			buf.append("    ").append(Modifier.toString(con.getModifiers())).append(" ");
			// 获取构造方法的名称
			buf.append(con.getName()).append("(");
			// 获取构造方法的参数
			Class<?>[] paramType = con.getParameterTypes();
			for (int i = 0; i < paramType.length; ++i) {
				if (i != 0) {
					buf.append(paramType[i].getName());
				} else {
					buf.append(", ").append(paramType[i].getName());
				}
			}
			buf.append(")");

			// 获取方法声明的异常
			Class<?>[] excepTypes = con.getExceptionTypes();
			for (int i = 0; i < excepTypes.length; ++i) {
				if (i == 0) {
					buf.append(" throws ").append(excepTypes[i].getName());
				} else {
					buf.append(", ").append(excepTypes[i].getName());
				}
			}
			buf.append(";\n");
		}
		return buf.toString();
	}

	/**
	 * 
	 * @category: 从类名获取包名
	 * @Title: getPackageFromClass
	 * @param strClassName
	 * @return
	 */
	public static String getPackageFromClass(String strClassFullName) {
		return strClassFullName.substring(0, strClassFullName.lastIndexOf("."));
	}

	/**
	 * 
	 * @category 功能
	 * @param strParamType
	 * @return
	 * @author wupf
	 * @Date :2020年9月28日下午1:16:13
	 */
	public static String getRealClassType(String strParamType) {
		int iPos = strParamType.indexOf("<");
		if (iPos > 0) {
			strParamType = strParamType.substring(iPos + 1, strParamType.length());
		}
		if (strParamType.endsWith(">")) {
			strParamType = strParamType.substring(0, strParamType.length() - 1);
		}
		return strParamType;
	}

	/**
	 * 
	 * @param strInReturn
	 * @return
	 *
	 */
	public static String parseMethodReturnBySignature(final String strDesc) {

		if (logger.isDebugEnabled()) {
			logger.debug("parseMethodReturnBySignature input :" + strDesc);
		}

		String strResult = strDesc;
		int iPos = strDesc.indexOf(")");
		if (iPos > 0) {
			strResult = strDesc.substring(iPos + 1, strDesc.length());
		}
		boolean isArray = false;
		if (strResult.startsWith("[")) {
			isArray = true;
			strResult = strResult.substring(1, strResult.length());
		}

		if (strResult.startsWith("L")) {
			strResult = strResult.substring(1, strResult.length());
		}
		if (strResult.endsWith(";")) {
			strResult = strResult.substring(0, strResult.length() - 1);
		}
		strResult = strResult.replaceAll("<L", "<").replace(";>", ">").replaceAll(";L", ",");
		if (isArray) {
			strResult += "[]";
		}
		if (logger.isDebugEnabled()) {
			logger.debug("return type: " + strResult);
		}
		return strResult;
	}
	
	/**
	 * 
	 * @category 获取包名
	 * @param strSrcFileName
	 * @return
	 * @author wupf
	 * @Date :2021年4月22日下午11:24:29
	 */
	public static String getPackageNameBySrcFileName(String strSrcFileName) {
		String strClassName = getFullClassNameBySrcFileName(strSrcFileName);
		return strClassName.replaceAll(".(?=[^.]*$)", "");
	}
	/**
	 * 
	 * @category 功能
	 * @param strSrcFileName
	 * @return
	 * @author wupf
	 * @Date :2020年6月2日下午7:55:41
	 */
	public static String getFullClassNameBySrcFileName(String strSrcFileName) {

		String strClassName = strSrcFileName.substring(strSrcFileName.indexOf(JpfConst.SRC_MAIN_JAVA_PATH)
				+ JpfConst.SRC_MAIN_JAVA_PATH.length() + 1, strSrcFileName.length() - 5);
		strClassName = strClassName.replaceAll("\\\\", ".").replaceAll("/", ".");

		return strClassName;
	}
	
	/**
	 * 
	 * @category @author wupf
	 * @date 2020年4月27日 下午5:23:15
	 * @param strClassFullName
	 * @return
	 */
	public static String getPackageName(String strClassFullName) {
		if (null == strClassFullName) {
			return "";
		}
		int index = strClassFullName.lastIndexOf(".");
		if (index >= 0) {

			if (JpfOsUtil.isWindows()) {
				return strClassFullName.substring(0, index).replaceAll("\\.", "\\\\");
			}
			return strClassFullName.substring(0, index).replaceAll("\\.", "/");

		}
		return strClassFullName;
	}
}
