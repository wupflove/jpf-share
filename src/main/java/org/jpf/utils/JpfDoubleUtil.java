/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * 
 * @author wupf
 *
 */
public class JpfDoubleUtil {
	private static final int DEF_DIV_SCALE = 10;

	private JpfDoubleUtil() {}
	/**
	 * 
	 * @category 功能
	 * @param v
	 * @return
	 * @author wupf
	 * @Date :2020年4月28日上午7:21:16
	 */
	public static double scale(double v) {
		BigDecimal bd = BigDecimal.valueOf(v);
		bd = bd.setScale(2, 4);
		return bd.doubleValue();
	}

	/**
	 * 
	 * @category 功能
	 * @param value
	 * @return
	 * @author wupf
	 * @Date :2020年4月28日上午7:21:34
	 */
	public static int getIntNum(Double value) {
		DecimalFormat df = new DecimalFormat("#");
		String str = df.format(value).replaceAll("-", "");
		return str.length();
	}

	/**
	 * 
	 * @category 功能
	 * @param value
	 * @param num
	 * @return
	 * @author wupf
	 * @Date :2020年4月28日上午7:21:40
	 */
	public static double changeDecimal(double value, int num) {
		BigDecimal b = BigDecimal.valueOf(value);
		double v = b.setScale(num, 4).doubleValue();
		return v;
	}

	/**
	 * 
	 * @category @author
	 * @param str
	 * @param decimal
	 * @return update 2020年3月17日
	 */
	public static String toDecimalString(String str, int decimal) {
		if (null == str) {
			return "";
		}
		return toDecimalString(Double.valueOf(str.trim()), decimal);
	}

	/**
	 * 
	 * @category @author
	 * @param num
	 * @param decimal
	 * @return update 2020年3月17日
	 */
	public static String toDecimalString(Double num, int decimal) {
		if (num == null) {
			return "0.00";
		}
		String str = num.toString();
		String formatStr = "#0.";
		for (int i = 0; i < decimal; ++i) {
			formatStr = formatStr + "0";
		}
		DecimalFormat df = new DecimalFormat(formatStr);
		try {
			str = df.format(num);
		} catch (Exception localException) {
		}
		return str;
	}

	/**
	 * 
	 * @category 功能
	 * @param num
	 * @param decimal
	 * @return
	 * @author wupf
	 * @Date :2020年4月28日上午7:21:47
	 */
	public static String toSplitDecimalString(Double num, int decimal) {
		if (num == null) {
			return "";
		}
		String str = num.toString();
		String formatStr = "###,###.";
		for (int i = 0; i < decimal; ++i) {
			formatStr = formatStr + "0";
		}
		DecimalFormat df = new DecimalFormat(formatStr);
		try {
			str = df.format(num);
		} catch (Exception localException) {
		}
		return str;
	}

	/**
	 * 
	 * @category 功能
	 * @param str
	 * @param decimal
	 * @return
	 * @author wupf
	 * @Date :2020年4月28日上午7:21:52
	 */
	public static String toSplitDecimalString(String str, int decimal) {
		if (null == str || 0 == str.trim().length()) {
			return "";
		}
		return toSplitDecimalString(Double.valueOf(str.trim()), decimal);
	}

	/**
	 * 
	 * @category 提供精确的加法运算。
	 * @author
	 * @param v1
	 * @param v2
	 * @return 两个参数的和 update 2020年3月17日
	 */
	public static Double add(Double v1, Double v2) {
		BigDecimal b1 = new BigDecimal(v1.toString());
		BigDecimal b2 = new BigDecimal(v2.toString());
		return Double.valueOf(b1.add(b2).doubleValue());
	}

	/**
	 * 
	 * @category 功能
	 * @param v1
	 * @param v2
	 * @param num
	 * @return
	 * @author wupf
	 * @Date :2020年4月28日上午7:21:59
	 */
	public static Double add(Double v1, Double v2, int num) {
		return Double.valueOf(changeDecimal(add(v1, v2).doubleValue(), num));
	}

	/**
	 * 
	 * @category 提供精确的减法运算。
	 * @param value1 被减数
	 * @param value2 减数
	 * @return 两个参数的差
	 */
	public static Double sub(Double v1, Double v2) {
		BigDecimal b1 = new BigDecimal(v1.toString());
		BigDecimal b2 = new BigDecimal(v2.toString());
		return Double.valueOf(b1.subtract(b2).doubleValue());
	}

	/**
	 * 
	 * @category 功能
	 * @param v1
	 * @param v2
	 * @param num
	 * @return
	 * @author wupf
	 * @Date :2020年4月28日上午7:22:06
	 */
	public static Double sub(Double v1, Double v2, int num) {
		return Double.valueOf(changeDecimal(sub(v1, v2).doubleValue(), num));
	}

	/**
	 * 
	 * @category 提供精确的乘法运算。
	 * @param value1 被乘数
	 * @param value2 乘数
	 * @return 两个参数的积
	 */
	public static Double mul(Double v1, Double v2) {
		BigDecimal b1 = new BigDecimal(v1.toString());
		BigDecimal b2 = new BigDecimal(v2.toString());
		return Double.valueOf(b1.multiply(b2).doubleValue());
	}

	/**
	 * 
	 * @category 功能
	 * @param v1
	 * @param v2
	 * @param num
	 * @return
	 * @author wupf
	 * @Date :2020年4月28日上午7:22:10
	 */
	public static Double mul(Double v1, Double v2, int num) {
		return Double.valueOf(changeDecimal(mul(v1, v2).doubleValue(), num));
	}

	/**
	 * @category 提供（相对）精确的除法运算，当发生除不尽的情况时， 精确到小数点以后10位，以后的数字四舍五入。
	 *
	 * @param dividend 被除数
	 * @param divisor  除数
	 * @return 两个参数的商
	 */
	public static Double div(Double v1, Double v2) {
		BigDecimal b1 = new BigDecimal(v1.toString());
		BigDecimal b2 = new BigDecimal(v2.toString());
		return Double.valueOf(b1.divide(b2, 10, 4).doubleValue());
	}

	public static Double div(int v1, int v2) {
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		return Double.valueOf(b1.divide(b2, 10, 4).doubleValue());
	}

	/**
	 * @category 提供（相对）精确的除法运算。 当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入。
	 *
	 * @param dividend 被除数
	 * @param divisor  除数
	 * @param scale    表示表示需要精确到小数点以后几位。
	 * @return 两个参数的商
	 */
	public static Double div(Double v1, Double v2, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b1 = new BigDecimal(v1.toString());
		BigDecimal b2 = new BigDecimal(v2.toString());
		return Double.valueOf(b1.divide(b2, scale, 4).doubleValue());
	}

	/**
	 * 提供指定数值的（精确）小数位四舍五入处理。
	 *
	 * @param value 需要四舍五入的数字
	 * @param scale 小数点后保留几位
	 * @return 四舍五入后的结果
	 */
	public static double round(double value, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b = new BigDecimal(Double.toString(value));
		BigDecimal one = new BigDecimal("1");
		return b.divide(one, scale, RoundingMode.HALF_UP).doubleValue();
	}

	/**
	 * 
	 * @category 计算2个数字的百分比
	 * @param iMiss
	 * @param iTotal
	 * @return
	 * @since 2020年1月12日
	 * @author wupf
	 */
	public static String getPercent(int iMiss, int iTotal) {
		if (0 == iTotal) {
			return "0.00";
		}
		return JpfDoubleUtil.toDecimalString(JpfDoubleUtil.div((iTotal - iMiss) * 100, iTotal), 2);
	}
}
