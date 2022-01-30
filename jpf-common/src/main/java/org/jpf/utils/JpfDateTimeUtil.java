/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils;

import java.sql.Connection;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.jpf.common.abstractUtil;
import org.jpf.utils.dbsql.JpfDBUtil;

/**
 * @author wupf
 */
public class JpfDateTimeUtil extends abstractUtil {

	private final static String[] WEEK_ARR = { "周日", "周一", "周二", "周三", "周四", "周五", "周六" };

	public static final String DATE_FORMAT_MINITE = "yyyy-MM-dd HH:mm";

	public static final String DATE_FORMAT_DAY = "yyyy-MM-dd";

	public static final String DATE_FORMAT_SECOND = "yyyy-MM-dd HH:mm:ss";

	public static final String DATE_FORMAT_CHINESE = "yyyy年MM月dd日";

	public static final String DATE_FORMAT_CHINESE_SECONDE = "yyyy年MM月dd日 HH:mm:ss";

	public static final String DATE_FORMAT_CHINESE_WEEK_SECONDE = "yyyy年MM月dd日 E HH:mm:ss";

	public static final long DAY_MS = 86400000L;

	private JpfDateTimeUtil() {
	}

	/**
	 * Formats a java.util.Date using a format string
	 *
	 * @param date   The date to format
	 * @param format The format string like yyyy-MM-dd
	 * @return String
	 */
	public static String dateToStr(Date date, String format) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(date);
	}

	/**
	 * Formats a java.sql.Date using a format string
	 *
	 * @param date   java.sql.Date
	 * @param format format like yyyy-MM-dd
	 * @return String
	 */
	public static String sqlDateToStr(java.sql.Date date, String format) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(date);
	}

	/**
	 * @category Parses a date using a specified format string
	 *
	 * @param sDate  String
	 * @param format String
	 * @return Date
	 */
	public static Date strToDate(String sDate, String format) throws Exception {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		try {
			return simpleDateFormat.parse(sDate);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new Exception("error parse date:" + sDate, e);
		}
	}

	/**
	 * Generation timestamp
	 *
	 * @return java.sql.Timestamp
	 */
	public static Timestamp nowTimeStamp() {
		return new Timestamp(getNowTime());
	}

	/**
	 * format a string time like '2019-02-13' to '2019-02-13 00:00:00.0'
	 *
	 * @param date String
	 * @return java.sql.Timestamp
	 */
	public static Timestamp strToStamp(String date) {
		return strToStamp(date, DATE_FORMAT_DAY);
	}

	/**
	 * Convert String to Timestamp
	 *
	 * @param date   String of date content
	 * @param format data format
	 * @return Timestamp
	 */
	public static Timestamp strToStamp(String date, String format) {
		Timestamp time = null;
		if (date != null) {
			SimpleDateFormat df = new SimpleDateFormat(format);
			try {
				time = new Timestamp(df.parse(date).getTime());
			} catch (Exception e) {

			}
		}
		return time;
	}

	/**
	 * 
	 * @category 功能
	 * @param date
	 * @return
	 * @author wupf
	 * @Date :2021年10月17日下午7:59:53
	 */
	public static Timestamp getTimestampFromStr(String date) {
		Timestamp time = null;
		try {
			time = Timestamp.valueOf(date);
		} catch (IllegalArgumentException e) {

		}
		return time;
	}

	/**
	 * input began time and end time calculate run time
	 *
	 * @param beginTime long
	 * @param endTime   long
	 * @return double
	 */
	public static double calcRunTime(long beginTime, long endTime) {
		return endTime - beginTime;
	}

	/**
	 * 
	 * @category 功能
	 * @param beganTime
	 * @param endTime
	 * @return
	 * @author wupf
	 * @Date :2021年2月24日下午1:46:52
	 */
	public static String printRunTime(long beganTime, long endTime) {
		return "CostTime->" + (endTime - beganTime) / 1000.00 + " Seconds";
	}

	/**
	 * obtain now time
	 *
	 * @return Long
	 */
	public static Long getNowTime() {
		return System.currentTimeMillis();
	}

	/**
	 * Get Distance Of ms between and two date
	 *
	 * @param before before date
	 * @param after  after date
	 * @return long
	 */
	public static long getDistanceOfTwoDate(Date before, Date after) {
		long beforeTime = before.getTime();
		long afterTime = after.getTime();
		return (afterTime - beforeTime) / (1000 * 60 * 60 * 24);
	}

	/**
	 * 
	 * @category: 判断闰年
	 * @Title: isLeapYear
	 * @Author:wupf@
	 * @date:2020年3月14日
	 * @param year
	 * @return
	 */
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	/**
	 * format TimeStamp to string
	 *
	 * @param time java.sql.Timestamp
	 * @param fmt  String
	 * @return String
	 */
	public static String timestampToString(Timestamp time, String fmt) {
		SimpleDateFormat df = new SimpleDateFormat(fmt);
		return df.format(time);
	}

	/**
	 * set time to next day's 0 hour 0 minute 0 second
	 *
	 * @param time java.sql.Timestamp
	 * @return long
	 */
	public static long setTimeToNextDay0H0M0S(Timestamp time) {
		if (time != null) {
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(time.getTime());
			cal.add(Calendar.DATE, 1);
			// 时、分、秒、毫秒置零
			cal.set(Calendar.HOUR_OF_DAY, 0);
			cal.set(Calendar.MINUTE, 0);
			cal.set(Calendar.SECOND, 0);
			cal.set(Calendar.MILLISECOND, 0);
			// time.setTime(cal.getTimeInMillis());
			return cal.getTimeInMillis();
		} else {
			throw new NullPointerException("Timestamp can not be null");
		}
	}

	/**
	 * set time to next day's 0 hour 0 minute 0 second
	 *
	 * @param millis long
	 * @return long
	 */
	public static long setTimeToNextDay0H0M0S(long millis) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(millis);
		cal.add(Calendar.DATE, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		// time.setTime(cal.getTimeInMillis());
		return cal.getTimeInMillis();
	}

	/**
	 * if the time is today return current milliseconds else set time to next day's
	 * 0 hour 0 minute 0 second then return except today
	 *
	 * @param millis long
	 * @return long
	 */
	public static long setToNextDay0H0M0SExceptToday(long millis) {
		long finalTime;
		boolean flag = isDifferentDay(System.currentTimeMillis(), millis);
		if (flag) {
			finalTime = setTimeToNextDay0H0M0S(millis);
		} else {
			finalTime = System.currentTimeMillis();
		}
		return finalTime;
	}

	/**
	 * if the time is today return current milliseconds else set time to next day's
	 * 0 hour 0 minute 0 second then return except today
	 *
	 * @param stamp java.sql.Timestamp
	 * @return long
	 */
	public static long setToNextDay0H0M0SExceptToday(Timestamp stamp) {
		long finalTime;
		if (stamp != null) {
			boolean flag = isDifferentDay(nowTimeStamp(), stamp);
			if (flag) {
				finalTime = setTimeToNextDay0H0M0S(stamp);
			} else {
				finalTime = System.currentTimeMillis();
			}
		} else {
			throw new NullPointerException("Timestamp can not be null");
		}
		return finalTime;
	}

	/**
	 * set time to 0 hour 0 minute 0 second
	 *
	 * @param time java.sql.Timestamp
	 * @return long
	 */
	public static long setTimeTo0H0M0S(Timestamp time) {
		if (time != null) {
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(time.getTime());
			cal.set(Calendar.HOUR_OF_DAY, 0);
			cal.set(Calendar.MINUTE, 0);
			cal.set(Calendar.SECOND, 0);
			cal.set(Calendar.MILLISECOND, 0);
			// time.setTime(cal.getTimeInMillis());
			return cal.getTimeInMillis();
		} else {
			throw new NullPointerException("Timestamp can not be null");
		}
	}

	/**
	 * set time to 0 hour 0 minute 0 second
	 *
	 * @param millis long
	 * @return long
	 */
	public static long setTimeTo0H0M0S(long millis) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(millis);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		// time.setTime(cal.getTimeInMillis());
		return cal.getTimeInMillis();

	}

	/**
	 * set time to last day's 0 hour 0 minute 0 second
	 *
	 * @param time java.sql.Timestamp
	 */
	public static void setTimeToLastDay0H0M0S(Timestamp time) {
		if (time != null) {
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(time.getTime());
			cal.add(Calendar.DATE, -1);
			cal.set(Calendar.HOUR_OF_DAY, 0);
			cal.set(Calendar.MINUTE, 0);
			cal.set(Calendar.SECOND, 0);
			cal.set(Calendar.MILLISECOND, 0);
			time.setTime(cal.getTimeInMillis());
		} else {
			throw new NullPointerException("Timestamp can not be null");
		}
	}

	/**
	 * 判断是否是同一天
	 *
	 * @param calendar1 Calendar
	 * @param calendar2 Calendar
	 * @return boolean
	 */
	public static boolean isDifferentDay(Calendar calendar1, Calendar calendar2) {
		return (calendar1.get(Calendar.YEAR) != calendar2.get(Calendar.YEAR)
				|| calendar1.get(Calendar.DAY_OF_YEAR) != calendar2.get(Calendar.DAY_OF_YEAR));
	}

	/**
	 * 判断是否是同一天
	 *
	 * @param timestamp0 java.sql.Timestamp
	 * @param timestamp1 java.sql.Timestamp
	 * @return boolean
	 */
	public static boolean isDifferentDay(Timestamp timestamp0, Timestamp timestamp1) {
		if (timestamp0 == null || timestamp1 == null) {
			throw new NullPointerException("Timestamp can not be null");
		} else {
			Calendar cal1 = Calendar.getInstance();
			cal1.setTimeInMillis(timestamp0.getTime());
			Calendar cal2 = Calendar.getInstance();
			cal2.setTimeInMillis(timestamp1.getTime());
			return isDifferentDay(cal1, cal2);
		}
	}

	/**
	 * 判断是否是同一天
	 *
	 * @param millis0 long
	 * @param millis1 long
	 * @return boolean
	 */
	public static boolean isDifferentDay(long millis0, long millis1) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTimeInMillis(millis0);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTimeInMillis(millis1);
		return isDifferentDay(cal1, cal2);
	}

	/**
	 * 将毫秒时间格式化为字符串时间(yyyy-MM-dd)
	 *
	 * @param millSec 毫秒数
	 * @return String
	 */
	public static String long2Str(Long millSec) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_CHINESE);
		Date date = new Date(millSec);
		return sdf.format(date);
	}

	/**
	 * 将毫秒时间格式化为指定格式的字符串时间
	 *
	 * @param millSec 毫秒
	 * @param format  需要格式的样式(yyyy-MM-dd等)
	 * @return String
	 */
	public static String long2Str(long millSec, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.CHINESE);
		Date date = new Date(millSec);
		return sdf.format(date);
	}

	/**
	 * 将毫秒时间格式化为指定格式的字符串时间
	 *
	 * @param millSec 毫秒
	 * @param format  需要格式的样式(yyyy-MM-dd等)
	 * @param locale  语言地域
	 * @return String
	 */
	public static String long2Str(long millSec, String format, Locale locale) {
		SimpleDateFormat sdf = new SimpleDateFormat(format, locale);
		Date date = new Date(millSec);
		return sdf.format(date);
	}

	/**
	 * transfer string to long
	 *
	 * @param dateFormat String
	 * @param strDate    String
	 * @return long
	 */
	public static long strToLong(String dateFormat, String strDate) {
		long temp;
		if (JpfStringUtil.isEmpty(strDate)) {
			temp = 0;
		} else {
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			try {
				Date date = sdf.parse(strDate);
				temp = date.getTime();
			} catch (ParseException e) {
				temp = 0;
			}
		}
		return temp;
	}

	/**
	 * 根据当天时间戳获取从0点起经过的毫秒数
	 *
	 * @param millions long
	 * @return long
	 */
	public static long todayPastMillisecond(long millions) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(millions);
		return cal.get(Calendar.HOUR_OF_DAY) * 3600 + cal.get(Calendar.MINUTE) * 60;
	}

	/**
	 * 获取本月天数
	 *
	 * @return int
	 */
	public static int getCurrentMonthDays() {
		Calendar a = Calendar.getInstance();
		a.set(Calendar.DATE, 1);// 把日期设置为当月第一天
		a.roll(Calendar.DATE, -1);// 日期回滚一天，也就是最后一天
		return a.get(Calendar.DATE);
	}

	/**
	 * 根据时间获得所属月的天数
	 *
	 * @param stamp java.sql.Timestamp
	 * @return int
	 */
	public static int getCurrentMonthDays(Timestamp stamp) {
		if (null != stamp) {
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(stamp.getTime());
			return getCurrentMonthDays(cal);
		} else {
			throw new NullPointerException("Timestamp can not be null");
		}
	}

	/**
	 * 根据long时间戳获取所属于的天数
	 *
	 * @param ms millisecond
	 * @return int
	 */
	public static int getCurrentMonthDays(long ms) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(ms);
		return getCurrentMonthDays(cal);
	}

	/**
	 * 根据long时间戳获取所属于的天数
	 *
	 * @param cal Calendar
	 * @return int
	 */
	public static int getCurrentMonthDays(Calendar cal) {
		if (null != cal) {
			cal.set(Calendar.DATE, 1);// 把日期设置为当月第一天
			cal.roll(Calendar.DATE, -1);// 日期回滚一天，也就是最后一天
			int maxDate = cal.get(Calendar.DATE);
			return maxDate;
		} else {
			throw new NullPointerException("Calendar can not be null");
		}
	}

	/**
	 * 根据当前时间获取所属周的第一天(0HOMOS) 根据中国习惯将星期一当做第一天
	 *
	 * @param stamp java.sql.Timestamp
	 * @return long
	 */
	public static long getFirstDayOfCurrentWeek(Timestamp stamp) {
		if (null != stamp) {
			return getFirstDayOfCurrentWeek(stamp.getTime());
		} else {
			throw new NullPointerException("Timestamp can not be null");
		}
	}

	/**
	 * 根据时间获取所属周的第一天(0HOMOS) 根据中国习惯将星期一当做第一天
	 *
	 * @param ms long
	 * @return long
	 */
	public static long getFirstDayOfCurrentWeek(long ms) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(ms);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		if (dayOfWeek == 1) {
			// 如果是星期天，则设置为上周
			cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); // 获取本周一的日期
			cal.add(Calendar.WEEK_OF_YEAR, -1);
		} else {
			// 如果不是星期天，则设置为本周
			cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); // 获取本周一的日期
		}
		return cal.getTimeInMillis();
	}

	/**
	 * 将时间设置位当年第一天，并且将时分秒全部置0
	 *
	 * @param millis long
	 * @return long
	 */
	public static long setToFirstDayOfCurrentYear(long millis) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(millis);
		cal.set(Calendar.DAY_OF_YEAR, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}

	/**
	 * 将时间设置为下一年的第一天
	 *
	 * @param millis long
	 * @return long
	 */

	public static long setToFirstDayOfNextYear(long millis) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(millis);
		cal.set(Calendar.DAY_OF_YEAR, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		cal.add(Calendar.YEAR, 1);
		return cal.getTimeInMillis();
	}

	/**
	 * 将时间重置到上月的第一天
	 *
	 * @param ms millisecond
	 * @return millisecond
	 */
	public static long setToFirstDayOfLastMonth(long ms) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(ms);
		cal.add(Calendar.MONTH, -1);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}

	/**
	 * 上月同期
	 *
	 * @param ms millisecond
	 * @return millisecond
	 */
	public static long setToLastMonthCommonDay(long ms) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(ms);
		calendar.add(Calendar.MONTH, -1);
		return calendar.getTimeInMillis();
	}

	/**
	 * 将时间重置为时间当前月的第一天，并且将时分秒全置0
	 *
	 * @param millis long
	 * @return long
	 */
	public static long setToFirstDayOfCurrentMonth(long millis) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(millis);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}

	/**
	 * 将时间重置为下月的第一天，并将时分秒全置0
	 *
	 * @param millis long
	 * @return long
	 */
	public static long setToFirstDayOfNextMonth(long millis) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(millis);
		cal.add(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}

	/**
	 * 根据时间获取下一年的同一天
	 *
	 * @param millis long
	 * @return long
	 */
	public static long setToNextYearCommonDay(long millis) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(millis);
		cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) + 1);
		return cal.getTimeInMillis();
	}

	/**
	 * 去年同期
	 *
	 * @param millis millisecond
	 * @return long
	 */
	public static long setToLastYearCommonDay(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - 1);
		return calendar.getTimeInMillis();
	}

	/**
	 * 根据时间获取所属周的最后一天(中国习惯)
	 *
	 * @param stamp java.sql.Timestamp
	 * @return long
	 */
	public static long getLastDayOfCurrentWeek(Timestamp stamp) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(stamp.getTime());
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		cal.add(Calendar.WEEK_OF_YEAR, 1);
		return cal.getTimeInMillis();
	}

	/**
	 * 根据时间的得到所对应季度的第一天(0H0M0S)
	 *
	 * @param ms 毫秒数
	 * @return long
	 */
	public static long getFirstDayOfCurrentQuarter(long ms) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(ms);
		int currentMonth = cal.get(Calendar.MONTH) + 1;
		if (currentMonth >= 1 && currentMonth <= 3) {
			cal.set(Calendar.MONTH, 0);
		} else if (currentMonth >= 4 && currentMonth <= 6) {
			cal.set(Calendar.MONTH, 3);
		} else if (currentMonth >= 7 && currentMonth <= 9) {
			cal.set(Calendar.MONTH, 6);
		} else if (currentMonth >= 10 && currentMonth <= 12) {
			cal.set(Calendar.MONTH, 9);
		}
		cal.set(Calendar.DATE, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}

	/**
	 * 根据时间获取下一个季度的第一天(0H0M0S)
	 *
	 * @param ms 毫秒数
	 * @return long
	 */
	public static long getFirstDayOfNextQuarter(long ms) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(ms);
		int currentMonth = cal.get(Calendar.MONTH) + 1;
		if (currentMonth >= 1 && currentMonth <= 3) {
			cal.set(Calendar.MONTH, 2);
			cal.set(Calendar.DATE, 31);
		} else if (currentMonth >= 4 && currentMonth <= 6) {
			cal.set(Calendar.MONTH, 5);
			cal.set(Calendar.DATE, 30);
		} else if (currentMonth >= 7 && currentMonth <= 9) {
			cal.set(Calendar.MONTH, 8);
			cal.set(Calendar.DATE, 30);
		} else if (currentMonth >= 10 && currentMonth <= 12) {
			cal.set(Calendar.MONTH, 11);
			cal.set(Calendar.DATE, 31);
		}
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis() + 86400000L;
	}

	/**
	 * 根据时间获取是周几(中国化)
	 *
	 * @param ms long
	 * @return int
	 */
	public static int getDayOfWeek(long ms) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(ms);
		int a = cal.get(Calendar.DAY_OF_WEEK);
		if (a >= 2) {
			return a - 1;
		} else {
			return 7;
		}
	}

	/**
	 * 创建一个时间并将时分秒都置0
	 *
	 * @return long
	 */
	public static long create0H0M0STime() {
		return setTimeTo0H0M0S(System.currentTimeMillis());
	}

	/**
	 * 判断是否是今天
	 *
	 * @param ms 毫秒数
	 * @return boolean
	 */
	public static boolean isToday(long ms) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTimeInMillis(ms);
		return !isDifferentDay(cal1, cal2);
	}

	/**
	 * 将时间戳转换称友好的时间显示
	 *
	 * @param ms long
	 * @return String
	 */
	public static String friendlyTime(long ms) {
		String ftime = "";
		Calendar cal = Calendar.getInstance();
		if (isDifferentDay(System.currentTimeMillis(), ms)) {
			int hour = (int) ((cal.getTimeInMillis() - ms) / 3600000);
			if (hour == 0) {
				ftime = Math.max((cal.getTimeInMillis() - ms) / 60000, 1) + "分钟前";
			} else {
				ftime = hour + "小时前";
			}
		}
		long lt = ms / 86400000;
		long ct = cal.getTimeInMillis() / 86400000;
		int days = (int) (ct - lt);
		if (days == 0) {
			int hour = (int) ((cal.getTimeInMillis() - ms) / 3600000);
			if (hour == 0) {
				ftime = Math.max((cal.getTimeInMillis() - ms) / 60000, 1) + "分钟前";
			} else {
				ftime = hour + "小时前";
			}
		} else if (days == 1) {
			ftime = "昨天";
		} else if (days == 2) {
			ftime = "前天";
		} else if (days > 2 && days <= 10) {
			ftime = days + "天前";
		} else if (days > 10) {
			ftime = long2Str(ms);
		}
		return ftime;
	}

	public static int getWeeks(long startTime, long endTime) {
		int temp = 0;
		try {
			temp = (int) ((endTime - startTime) / 86400000 / 7);
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		return temp;
	}

	public static String getDateWithWeek(long ms) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(ms);
		int a = cal.get(Calendar.DAY_OF_WEEK);
		String[] weekARR = { "（周日）", "（周一）", "（周二）", "（周三）", "（周四）", "（周五）", "（周六）" };
		return long2Str(ms, "MM月dd日" + weekARR[a - 1]);
	}

	public static String getDateWithWeekAndTime(long ms) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(ms);
		int a = cal.get(Calendar.DAY_OF_WEEK);
		return long2Str(ms, "yyyy年MM月dd日 " + WEEK_ARR[a - 1] + " HH:mm");
	}

	/**
	 * calc age
	 *
	 * @param ms long
	 * @return int
	 */
	public static int getAge(long ms) {
		int age;
		Calendar born = Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		born.setTimeInMillis(ms);
		if (born.after(now)) {
			throw new IllegalArgumentException("Can't be born in the future");
		}
		age = now.get(Calendar.YEAR) - born.get(Calendar.YEAR);
		if (now.get(Calendar.DAY_OF_YEAR) < born.get(Calendar.DAY_OF_YEAR)) {
			age -= 1;
		}
		return age;
	}

	/**
	 * 去年同期
	 *
	 * @param strDate String of date
	 * @param format  time format
	 * @return String
	 */
	public static String getLastYearCommonDay(String strDate, String format) throws Exception {
		Date date = strToDate(strDate, format);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - 1);
		return long2Str(calendar.getTimeInMillis(), format);
	}

	/**
	 * 上月同期,如果是最后一天则重置到月末
	 *
	 * @param strDate strDate
	 * @param format  time format
	 * @return String
	 */
	public static String getLastMonthCommonDay(String strDate, String format) throws Exception {
		Date date = strToDate(strDate, format);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int a = calendar.get(Calendar.DATE);
		int b = getCurrentMonthDays(date.getTime());
		if (a == b) {
			long ms = setToFirstDayOfCurrentMonth(date.getTime()) - DAY_MS;
			return long2Str(ms, format);
		}
		calendar.add(Calendar.MONTH, -1);
		return long2Str(calendar.getTimeInMillis(), format);
	}

	/**
	 * get birthday from id card
	 *
	 * @param idCard idCard
	 * @return Timestamp
	 */
	public static Timestamp getBirthdayFormIdCard(String idCard) throws Exception {
		Timestamp timestamp;
		if (JpfValidateUtil.isIdCard(idCard)) {
			if (idCard.length() == 18) {
				timestamp = strToStamp(idCard.substring(6, 14), "yyyyMMdd");
			} else {
				timestamp = strToStamp(idCard.substring(6, 12), "yyyyMMdd");
			}
		} else {
			throw new Exception("invalid IdChard number:" + idCard);
		}
		return timestamp;
	}

	/**
	 * 判断是否是今年
	 *
	 * @param ms millisecond
	 * @return boolean
	 */
	public static boolean isCurrentYear(long ms) {
		Calendar calTemp = Calendar.getInstance();
		calTemp.setTimeInMillis(ms);
		int yearTemp = calTemp.get(Calendar.YEAR);
		Calendar calNow = Calendar.getInstance();
		int yearNow = calNow.get(Calendar.YEAR);
		if (yearNow == yearTemp) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @return String
	 */
	public static String getCurrFormattedDateTime(String strFormatTo) {
		java.sql.Timestamp date = new java.sql.Timestamp(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat(strFormatTo);
		return formatter.format(date);
	}

	/**
	 * 得到当前日期，格式yyyy-MM-dd。
	 * 
	 * @return String 格式化的日期字符串
	 */
	public static String getToday() {
		Date cDate = new Date();

		SimpleDateFormat cSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return cSimpleDateFormat.format(cDate);
	}

	/**
	 * 
	 * @param strFormat
	 * @param iDays
	 * @return update 2019-9-7
	 */
	public static String getDay(String strFormat, int iDays) {
		Date cDate = new Date();
		cDate = addDays(cDate, iDays);
		SimpleDateFormat cSimpleDateFormat = new SimpleDateFormat(strFormat);
		return cSimpleDateFormat.format(cDate);
	}

	/**
	 * 
	 * @param date Date
	 * @param days int
	 * @return Date
	 */
	public static Date addDays(Date date, int days) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		long lTmp = c.getTimeInMillis();
		c.setTimeInMillis(lTmp + ((long) days) * 24 * 3600 * 1000);
		return c.getTime();
	}

	/**
	 * 
	 * @param dtDate      Date
	 * @param strFormatTo String
	 * @return String
	 */
	public static String getFormattedDateUtil(java.util.Date dtDate, String strFormatTo) {
		if (dtDate == null) {
			return "";
		}
		strFormatTo = strFormatTo.replace('/', '-');
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(strFormatTo);
			return formatter.format(dtDate);
		} catch (Exception e) {
			// logger.error("转换日期字符串格式时出错;" + e.getMessage());
			return "";
		}
	}

	/**
	 * @todo 时间加月
	 * @param month int
	 * @return String
	 */
	public static String addMonths(int month) { // 时间加月

		java.util.Calendar cal = java.util.Calendar.getInstance();
		java.text.SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMM");
		cal.add(Calendar.MONTH, month);
		sDateFormat.format(cal.getTime());
		return sDateFormat.format(cal.getTime());
	}

	/**
	 * 
	 * @category author
	 * @param date
	 * @param hours
	 * @return update 2020年4月16日
	 */
	public static Date addHours(Date date, int hours) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR, hours);
		return calendar.getTime();
	}

	/**
	 * @todo 时间加月
	 * @param inDate String
	 * @param month  int
	 * @return String
	 */
	public static String addMonths(String inDate, int month) { // 时间加月

		Calendar clFrom = new GregorianCalendar();
		int iYear = Integer.parseInt(inDate.substring(0, 4));
		int iMonth = Integer.parseInt(inDate.substring(4, 6));
		int iDay = 1;

		clFrom.set(iYear, iMonth, iDay, 0, 0, 0);
		java.text.SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMM");
		clFrom.add(Calendar.MONTH, month - 1);
		// sDateFormat.format(cal.getTime());
		return sDateFormat.format(clFrom.getTime());
	}

	/**
	 * 得到当前日期，格式yyyy-MM-dd。
	 * 
	 * @return String 格式化的日期字符串
	 */

	public static String getCurrDate() {
		return getFormattedDate(getDateByString(""));
	}

	/**
	 * 对输入的日期字符串按照默认的格式yyyy-MM-dd转换.
	 * 
	 * @param strDate String 需要进行格式化的日期字符串
	 * 
	 * @return String 经过格式化后的字符串
	 * 
	 */

	public static String getFormattedDate(String strDate)

	{

		return getFormattedDate(strDate, "yyyy-MM-dd");

	}

	/**
	 * 对输入的日期按照默认的格式yyyy-MM-dd转换.
	 * 
	 * @param strDate java.sql.Timestamp 需要进行格式化的日期字符串
	 * 
	 * @return String 经过格式化后的字符串
	 */

	public static String getFormattedDate(java.util.Date dtDate) {

		return getFormattedDate(dtDate, "yyyy-MM-dd");

	}

	/**
	 * 得到当前日期时间,格式为yyyy-MM-dd hh:mm:ss.
	 * 
	 * @return String
	 */

	public static String getCurrDateTime() {
		java.sql.Timestamp date = new java.sql.Timestamp(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formatter.format(date);
	}

	/**
	 * 
	 * @category @author
	 * @param dDate
	 * @return update 2020年3月18日
	 */
	public static String getDateTime(Date dDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formatter.format(dDate);
	}

	/**
	 * 得到一个月的最后一工作日
	 * 
	 * @param strDateStart String
	 * @throws Exception
	 * @return Date
	 */
	public static Date getLastWorkDayofMonth(String strDateStart) throws Exception {
		SimpleDateFormat DATA_FORMAT_YYYYMMDD = new SimpleDateFormat("yyyyMMdd");

		Date date_start = DATA_FORMAT_YYYYMMDD.parse(strDateStart);
		Calendar cal_start = Calendar.getInstance();
		cal_start.setTime(date_start);

		int dayOfWeek = cal_start.get(Calendar.DAY_OF_WEEK) - 1;
		Date a = new Date();
		if (dayOfWeek == 1) {
			a = addDays(date_start, -3);
		} else if (dayOfWeek == 7) {
			a = addDays(date_start, -2);
		} else {
			a = addDays(date_start, -1);
		}
		return a;
	}

	/**
	 * 判断是否是最后一个工作日
	 * 
	 * @param date_start Date
	 * @throws Exception
	 * @return boolean
	 */
	public static boolean isLastWorkDayofMonth(Date date_start) throws Exception {
		if (date_start == null) {
			throw new Exception("input param in null");
		}
		String a = getFormattedDateUtil(date_start, "yyyyMM");
		a = addMonths(a, 1);
		a += "01";

		Date b = getLastWorkDayofMonth(a);
		if (date_start.before(b)) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @category @author
	 * @return update 2020年3月18日
	 */
	public static String getCurrentHour() {
		java.sql.Timestamp date = new java.sql.Timestamp(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("HH");
		return formatter.format(date);
	}

	/**
	 * 
	 * @category @author
	 * @param strDate
	 * @return update 2020年3月18日
	 */
	public static String getFormattedDateTime(String strDate)

	{
		if (strDate == null || "".equalsIgnoreCase(strDate)) {
			return "";
		}
		if (strDate.length() > 2) {
			return strDate.substring(0, strDate.length() - 2);
		}
		return strDate;
	}

	/**
	 * 
	 * @category author
	 * @param month
	 * @return update 2020年4月16日
	 */
	public static String getDay(int month) {
		java.util.Calendar cal = java.util.Calendar.getInstance();
		java.text.SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		cal.add(Calendar.MONTH, month);
		sDateFormat.format(cal.getTime());
		return sDateFormat.format(cal.getTime());
	}

	/**
	 * @todo 时间比较
	 * @param DATE1
	 * @param DATE2
	 * @return update 2020年3月13日
	 */
	public static int compare_date(String DATE1, String DATE2) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {

			Date dt1 = df.parse(DATE1);
			Date dt2 = df.parse(DATE2);
			if (dt1.getTime() > dt2.getTime()) {
				return 1;
			} else if (dt1.getTime() < dt2.getTime()) {
				return -1;
			} else {
				return 0;
			}
		} catch (Exception exception) {
			// logger.error("DATE1:{}", DATE1);
			// logger.error("DATE2:{}", DATE2);
			exception.printStackTrace();
		}
		return 0;
	}

	public static long dateToLong(Date date) {
		return date.getTime();
	}

	/**
	 * @todo 返回时间差值天数
	 * @param strStartDate
	 * @param strEndDate
	 * @return
	 * @throws Exception update 2020年3月22日
	 */
	public static long getBetweenDays(String strStartDate, String strEndDate) throws Exception {

		return getBetweenSecond(strStartDate, strEndDate) / (60 * 60 * 24);

	}

	/**
	 * 
	 * @category @author
	 * @param strStartDate
	 * @param strEndDate
	 * @return
	 * @throws Exception update 2020年3月8日
	 */
	public static long getBetweenSecond(String strStartDate, String strEndDate) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = df.parse(strStartDate);
		Date d2 = df.parse(strEndDate);
		long diff = d2.getTime() - d1.getTime();
		return diff / 1000;

	}

	/**
	 * 
	 * @category @author
	 * @param strDate
	 * @param iDays
	 * @return
	 * @throws Exception update 2020年3月18日
	 */
	public static java.util.Date addDays(String strDate, int iDays) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = df.parse(strDate);
		return addDays(d1, iDays);
	}

	/**
	 * 
	 * @category @author
	 * @param strDate
	 * @param iDays
	 * @return
	 * @throws Exception update 2020年3月18日
	 */
	public static java.sql.Date addSqlDate(String strDate, int iDays) throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = df.parse(strDate);
		return new java.sql.Date(addDays(d1, iDays).getTime());
	}

	/**
	 * 
	 * @category @author
	 * @return
	 * @throws Exception update 2020年3月18日
	 */
	public static java.sql.Date getSqlDate() throws Exception {
		Date cDate = new Date();
		return new java.sql.Date(cDate.getTime());
	}

	/**
	 * 
	 * @category author
	 * @param date
	 * @param minutess
	 * @return update 2020年4月16日
	 */
	public static Date addMinutes(Date date, int minutess) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MINUTE, minutess);
		return calendar.getTime();
	}

	/**
	 * @param date
	 * @param addday
	 * @return Date
	 */
	public static Date addMinutess(Date date, int minutess) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MINUTE, minutess);
		return calendar.getTime();
	}

	/**
	 * @param date
	 * @param addMonths
	 * @return Date
	 */
	public static Date addMonths(Date date, int addMonths) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, addMonths);
		return calendar.getTime();
	}

	/**
	 * @param date
	 * @param addMonths
	 * @return Date
	 */
	public static int getMonthLastDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.getActualMaximum(Calendar.DATE);
	}

	/**
	 * 
	 * @category @author
	 * @param date
	 * @return update 2020年3月18日
	 */
	public static Date getMonthFirstTime(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int day = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
		calendar.set(Calendar.DATE, day);
		return getDateFirstTime(calendar.getTime());
	}

	/**
	 * 
	 * @category @author
	 * @param date
	 * @return update 2020年3月18日
	 */
	public static Date getMonthLastTime(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		calendar.set(Calendar.DATE, day);
		return getDateLastTime(calendar.getTime());
	}

	/**
	 * 
	 * @category author
	 * @param date
	 * @return update 2020年3月15日
	 */
	public static Date getWeekFirstTime(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		calendar.add(Calendar.DATE, Calendar.MONDAY - week);
		return getDateFirstTime(calendar.getTime());
	}

	/**
	 * 
	 * @category author
	 * @param date
	 * @return update 2020年3月15日
	 */
	public static Date getWeekLastTime(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		calendar.add(Calendar.DATE, Calendar.SATURDAY - week + 1);
		return getDateLastTime(calendar.getTime());
	}

	/**
	 * 得到给定时间的最小时间23:59:59
	 */
	public static synchronized Date getDateLastTime(Date date) {
		if (date == null) {
			return null;
		}
		try {
			final SimpleDateFormat LASTFORMT = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
			final SimpleDateFormat FORMT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return FORMT.parse(LASTFORMT.format(date));
		} catch (ParseException e) {
			// logger.error("DateUtil.getDateLastTime(+" + date + ")", e);
		}
		return null;
	}

	/**
	 * 得到给定时间的最小时间00:00:00
	 */
	public static synchronized Date getDateFirstTime(Date date) {
		if (date == null) {
			return null;
		}
		try {
			final SimpleDateFormat FIRSTFORMAT = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
			final SimpleDateFormat FORMT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return FORMT.parse(FIRSTFORMAT.format(date));
		} catch (ParseException e) {
			// logger.error("DateUtil.getDateFirstTime(+" + date + ")", e);
		}
		return null;
	}

	/**
	 * 将日期格式化成指定格式
	 * 
	 * @param date
	 * @param format
	 * @return String
	 */
	public static String date2Str(Date date, String format) {
		if (date == null || format == null || "".equals(format)) {
			return "";
		}

		DateFormat d = new SimpleDateFormat(format);
		return d.format(date);
	}

	/**
	 * 
	 * @category author
	 * @param dateStr
	 * @param format
	 * @return update 2020年3月15日
	 */
	public static Date parseDate(String dateStr, String format) {
		DateFormat df = new SimpleDateFormat(format);
		try {
			return df.parse(dateStr);
		} catch (ParseException e) {
			// logger.error("DateUtil.parseDate:", e);
		}
		return null;
	}

	/**
	 * 
	 * @category author
	 * @param sysTime
	 * @return update 2020年3月15日
	 */
	public static synchronized String longToDate(long sysTime) {
		final SimpleDateFormat FIRSTFORMAT = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
		return FIRSTFORMAT.format(new Date(sysTime));
	}

	/**
	 * 
	 * @category author
	 * @param sysTime
	 * @return update 2020年3月15日
	 */
	public static synchronized int longToBillDate(long sysTime) {
		final SimpleDateFormat DATA_FORMAT_YYYYMMDD = new SimpleDateFormat("yyyyMMdd");

		return Integer.parseInt(DATA_FORMAT_YYYYMMDD.format(new Date(sysTime)));
	}

	/**
	 * 
	 * @category author
	 * @param date
	 * @param format
	 * @return update 2020年3月15日
	 */
	public static String format(Date date, SimpleDateFormat format) {
		return format.format(date);
	}

	/**
	 * 返回当前日期的开始时间
	 * 
	 * @param d
	 * @param days
	 * @return
	 */
	public static Date getDateStartTime(Date d, int days) {
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d);
		c1.set(Calendar.HOUR_OF_DAY, 0);
		c1.set(Calendar.MINUTE, 0);
		c1.set(Calendar.SECOND, 0);
		c1.set(Calendar.MILLISECOND, 0);
		c1.add(Calendar.DAY_OF_YEAR, days);
		return c1.getTime();
	}

	/**
	 * @category 日期格式化
	 * 
	 * @param date
	 * @param formatText
	 * @return
	 * @throws Exception
	 */
	public static String format(Date date, String formatText) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat(formatText);
		return format.format(date);
	}

	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String getYYYYMMDDHHMMSS(Date date) {
		if (date == null) {
			return null;
		}
		DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		return dateformat.format(date);
	}

	/**
	 * 将时间格式化为YYMM
	 * 
	 * @param date Date
	 * @return String
	 */
	public static String getYYMM(Date date) {
		if (date == null) {
			return null;
		}
		DateFormat dateformat = new SimpleDateFormat("yyMM");
		return dateformat.format(date);
	}

	/**
	 * 获取某个时间所在月份的第一天凌晨
	 * 
	 * @param date
	 * @return
	 */
	public static Date getMonthStart(Date date) {
		if (date == null) {
			return null;
		}
		Calendar start = Calendar.getInstance();
		start.setTime(date);
		start.set(Calendar.DAY_OF_MONTH, 1);
		start.set(Calendar.HOUR_OF_DAY, 0);
		start.set(Calendar.MINUTE, 0);
		start.set(Calendar.SECOND, 0);
		return start.getTime();
	}

	/**
	 * 得到本月最后一天 add by ouyk
	 * 
	 * @param timest1
	 * @return
	 */
	public static Timestamp getLastDayOfMonth(Timestamp timest1) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(timest1);
		cal.add(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH, 0);
		return new Timestamp(cal.getTimeInMillis());
	}

	/**
	 * 获取几个月后的第day天
	 * 
	 * @param timest1
	 * @param month
	 * @return
	 */
	public static Timestamp DateAddMonth(Timestamp timest1, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(timest1);
		cal.add(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MILLISECOND, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		return new Timestamp(cal.getTimeInMillis());
	}

	/**
	 * @Function: main
	 * @Description: 该函数的功能描述
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * @version: v1.0.0
	 * @author: huanghm
	 * @date: 2019-2-23 下午03:46:36 Modification History: Date Author Version
	 *        Description ---------------------------------------------------------*
	 *        2019-2-23 huanghm v1.0.0 修改原因
	 */

	/*
	 * 获取6+1月最大时间 如最近是2019/6/10,最大历史时间为2019-10-31 23:59:59
	 */
	public static String getSixAddOneMonthTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -8);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		String Str_format = sdf.format(calendar.getTime()).substring(0, 10) + " 23:59:59";
		return Str_format;
	}

	public static boolean isOverSixAddOneMonth(Date StartDate) throws ParseException {
		String Str_Max = getSixAddOneMonthTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date maxDate = sdf.parse(Str_Max);
		if (maxDate.getTime() > StartDate.getTime()) {
			return true;
		}

		return false;
	}

	public static boolean isOverSixAddOneMonth(String Str_StartDate) throws ParseException {
		String Str_Max = getSixAddOneMonthTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date maxDate = sdf.parse(Str_Max);
		Date StartDate = sdf.parse(Str_StartDate);
		if (maxDate.getTime() > StartDate.getTime()) {
			return true;
		}

		return false;
	}

	// firstMonth:YYYYMM
	public static boolean isLargerMonth(String firstMonth, String secondeMonth) {
		if (Long.parseLong(firstMonth) > Long.parseLong(secondeMonth)) {
			return true;
		} else {
			return false;
		}
	}

	// month:YYYYMM
	public static String getLastMonthDate(String month) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, Integer.parseInt(month.substring(0, 4)));
		calendar.set(Calendar.MONTH, Integer.parseInt(month.substring(4, 6)) - 1);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		String Str_format = sdf.format(calendar.getTime()).substring(0, 10) + " 23:59:59";
		return Str_format;
	}

	public static String getLastMonth(String month) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, Integer.parseInt(month.substring(0, 4)));
		calendar.set(Calendar.MONTH, Integer.parseInt(month.substring(4, 6)) - 2);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		String Str_format = sdf.format(calendar.getTime());
		return Str_format;
	}

	public static String getNextMonth(String month) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, Integer.parseInt(month.substring(0, 4)));
		calendar.set(Calendar.MONTH, Integer.parseInt(month.substring(4, 6)));
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		String Str_format = sdf.format(calendar.getTime());
		return Str_format;
	}

	public static String getNextMonthFirstDate(String month) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(Calendar.YEAR, Integer.parseInt(month.substring(0, 4)));
		calendar.set(Calendar.MONTH, Integer.parseInt(month.substring(4, 6)));
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		String Str_format = sdf.format(calendar.getTime()).substring(0, 10) + " 00:00:00";
		return Str_format;
	}

	public static Date getLastMonthDateRtnDate(String month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, Integer.parseInt(month.substring(0, 4)));
		calendar.set(Calendar.MONTH, Integer.parseInt(month.substring(4, 6)) - 1);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		return calendar.getTime();
	}

	public static Date getNextMonthFirstDateRtnDate(String month) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(Calendar.YEAR, Integer.parseInt(month.substring(0, 4)));
		calendar.set(Calendar.MONTH, Integer.parseInt(month.substring(4, 6)));
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		return calendar.getTime();
	}

	public static String[] getLastNMonths(int N) {
		String[] months = new String[N];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		Calendar calendar = Calendar.getInstance();

		for (int i = 0; i < N; i++) {
			months[i] = sdf.format(calendar.getTime());
			calendar.add(Calendar.MONTH, -1);
		}

		return months;
	}

	public static String getYYYY_MM_DD_HH_MM_SS(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (date == null) {
			return null;
		}
		return sdf.format(date);
	}

	public static String getYYYYMMDDHHMMSSFormat(Date date) {
		SimpleDateFormat DATA_FORMAT_YYYYMMDDHHMMSS = new SimpleDateFormat("yyyyMMddHHmmss");
		if (date == null) {
			return null;
		}
		return DATA_FORMAT_YYYYMMDDHHMMSS.format(date);
	}

	/**
	 * 获得本月第一天(例如:2019-12-01 00:00:00)
	 * 
	 * @param dateStr,dateFormat
	 * @description 获得本月第一天(例如:2019-12-01 00:00:00)
	 * @return Timestamp类型日期时间，格式：yyyy-MM-dd HH:mm:ss
	 * @throws ParseException
	 * @author xuezq
	 * @date 2019-02-23
	 */
	public static Timestamp getFirstDayThisMonth() throws ParseException {
		// 本月起始时间
		Calendar calStart = Calendar.getInstance();
		calStart.set(Calendar.DAY_OF_MONTH, 1);
		calStart.set(Calendar.HOUR_OF_DAY, 0);
		calStart.set(Calendar.MINUTE, 0);
		calStart.set(Calendar.SECOND, 0);
		calStart.set(Calendar.MILLISECOND, 000);
		return new Timestamp(calStart.getTime().getTime());
	}

	/**
	 * 获得本月最后一天(例如:2019-02-29 23:59:59)
	 * 
	 * @param
	 * @description 获得本月最后一天(例如:2019-02-29 23:59:59)
	 * @return Timestamp类型日期时间，格式：yyyy-MM-dd HH:mm:ss
	 * @throws ParseException
	 * @author xuezq
	 * @date 2019-02-23
	 */
	public static Timestamp getLastDayThisMonth() throws ParseException {
		// 本月结束时间
		Calendar calEnd = Calendar.getInstance();
		int lastDay = calEnd.getActualMaximum(Calendar.DAY_OF_MONTH);
		calEnd.set(Calendar.DAY_OF_MONTH, lastDay);
		calEnd.set(Calendar.HOUR_OF_DAY, 23);
		calEnd.set(Calendar.MINUTE, 59);
		calEnd.set(Calendar.SECOND, 59);
		calEnd.set(Calendar.MILLISECOND, 999);
		return new Timestamp(calEnd.getTime().getTime());
	}

	/**
	 * @function: getNextMonthDate
	 * @description: 获取下个月
	 * @author: guidy
	 * @created 2020年3月2日 下午11:46:45
	 */
	public static String getNextMonthDate(String month) {
		SimpleDateFormat DATA_FORMAT_YYYYMMDD = new SimpleDateFormat("yyyyMMdd");
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(Calendar.YEAR, Integer.parseInt(month.substring(0, 4)));
		calendar.set(Calendar.MONTH, Integer.parseInt(month.substring(4, 6)));
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		String Str_format = DATA_FORMAT_YYYYMMDD.format(calendar.getTime()).substring(0, 8);
		return Str_format;
	}

//	public static final SimpleDateFormat DATA_FORMAT_YYYY_MM_DD_HH_MM_SS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	// public static final SimpleDateFormat DATA_FORMAT_YYYY_MM_DD = new
	// SimpleDateFormat("yyyy-MM-dd");

	// public static final SimpleDateFormat DATA_FORMAT_YYMMDD = new
	// SimpleDateFormat("yyMMdd");

	// public static final SimpleDateFormat DATA_FORMAT_HHMMSS = new
	// SimpleDateFormat("HHmmss");

	// public static final SimpleDateFormat DATA_FORMAT_HH_MM_SS = new
	// SimpleDateFormat("HH:mm:ss");

	// private static DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd
	// HHmmss");

	public static final int SUNDAY = 1;

	public static final int MONDAY = 2;

	public static final int TUESDAY = 3;

	public static final int WEDNESDAY = 4;

	public static final int THURSDAY = 5;

	public static final int FRIDAY = 6;

	public static final int SATURDAY = 7;

	public static final int LAST_DAY_OF_MONTH = -1;

	public static final long MILLISECONDS_IN_MINUTE = 60L * 1000L;

	public static final long MILLISECONDS_IN_HOUR = 60L * 60L * 1000L;

	public static final long SECONDS_IN_DAY = 24L * 60L * 60L;

	public static final long MILLISECONDS_IN_DAY = SECONDS_IN_DAY * 1000L;

	/**
	 * 对输入的日期进行格式化, 如果输入的日期是null则返回空串. FrameWork使用
	 * 
	 * @param dtDate      java.sql.Timestamp 需要进行格式化的日期字符串
	 * @param strFormatTo String 要转换的日期格式
	 * @return String 经过格式化后的字符串
	 */
	public static String getFormattedDate(java.util.Date dtDate, String strFormatTo) {
		if (dtDate == null) {
			return "";
		}
		if (dtDate.equals(new java.sql.Timestamp(0))) {
			return "";
		}
		strFormatTo = strFormatTo.replace('/', '-');
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
			if (Integer.parseInt(formatter.format(dtDate)) < 1900) {
				return "";
			} else {
				formatter = new SimpleDateFormat(strFormatTo);
				return formatter.format(dtDate);
			}
		} catch (Exception e) {
			// log.error("转换日期字符串格式时出错;" + e.getMessage());
			return "";
		}
	}

	/**
	 * 返回两个日期之间隔了多少天
	 * 
	 * @param date1
	 * @param date2
	 */
	public static int DateDiff(Date date1, Date date2) {
		int i = (int) ((date1.getTime() - date2.getTime()) / 3600 / 24 / 1000);
		return i;
	}

	/**
	 * 月份相加 add by yuanjq
	 * 
	 * @param timest1
	 * @param month
	 * @return
	 */
	public static Timestamp DateAddMonth(Timestamp timest1, int month) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(timest1);
		cal.add(Calendar.MONTH, month);
		return new Timestamp(cal.getTimeInMillis());
	}

	/**
	 * 当前日期增加iDays天后日期 add by liufeng 20191208
	 * 
	 * @param strDate     String
	 * @param iDays       int
	 * @param strFormatTo String
	 * @return String
	 */
	public static String getDateAddDay(String strDate, int iDays, String strFormatTo) {
		Timestamp tsDate = Timestamp.valueOf(strDate);
		Calendar cal = Calendar.getInstance();
		cal.setTime(tsDate);
		cal.add(Calendar.DAY_OF_MONTH, iDays);
		Timestamp tsEndDateAdd = new Timestamp(cal.getTimeInMillis());
		return getFormattedDate(tsEndDateAdd, strFormatTo);
	}

	/**
	 * 当前日期增加iDays天后日期 add by liufeng 20191208
	 * 
	 * @param String
	 * @param iDays  int
	 * @param String
	 * @return String
	 */
	public static Timestamp getDateAddDay(Timestamp tsDate, int iDays) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(tsDate);
		cal.add(Calendar.DAY_OF_MONTH, iDays);
		Timestamp tsEndDateAdd = new Timestamp(cal.getTimeInMillis());
		return tsEndDateAdd;
	}

	/**
	 * 当前日期增加或减去minute分钟后日期 add by zhourh 2019-08-20
	 * 
	 * @param dateTime
	 * @param minute
	 * @return
	 */
	public static Timestamp getDateAddMinute(Timestamp dateTime, int minute) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateTime);
		cal.add(Calendar.MINUTE, minute);
		return new Timestamp(cal.getTimeInMillis());
	}

	/**
	 * 得到今天日期，格式yyyy-MM。
	 * 
	 * @return String 格式化的日期字符串
	 */
	public static String getTodayYM() {
		Date cDate = new Date();
		SimpleDateFormat cSimpleDateFormat = new SimpleDateFormat("yyyyMM");
		return cSimpleDateFormat.format(cDate);
	}

	/**
	 * 得到昨天日期，格式yyyy-MM-dd。
	 * 
	 * @return String 格式化的日期字符串
	 */
	public static String getYesterday() {
		Date cDate = new Date();
		cDate.setTime(cDate.getTime() - 24 * 3600 * 1000);
		SimpleDateFormat cSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return cSimpleDateFormat.format(cDate);
	}

	/**
	 * 得到明天日期，格式yyyy-MM-dd。
	 * 
	 * @return String 格式化的日期字符串
	 */
	public static String getTomorrow() {
		Date cDate = new Date();
		cDate.setTime(cDate.getTime() + 24 * 3600 * 1000);
		SimpleDateFormat cSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return cSimpleDateFormat.format(cDate);
	}

	/**
	 * 得到指定的日期，如一年三个月零九天后(以yyyy/MM/dd格式显示)参数为("yyyy/MM/dd",1,3,9)
	 * 
	 * @param strFormat
	 * @param iYear
	 * @param iMonth
	 * @param iDate
	 * @return
	 */
	public static String getSpecTime(String strFormat, int iYear, int iMonth, int iDate, int iHour, int iMinute,
			int iSecond) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.set(Calendar.YEAR, rightNow.get(Calendar.YEAR) + iYear);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH) + iMonth);
		rightNow.set(Calendar.DATE, rightNow.get(Calendar.DATE) + iDate);
		rightNow.set(Calendar.HOUR, rightNow.get(Calendar.HOUR) + iHour);
		rightNow.set(Calendar.MINUTE, rightNow.get(Calendar.MINUTE) + iMinute);
		rightNow.set(Calendar.SECOND, rightNow.get(Calendar.SECOND) + iSecond);
		SimpleDateFormat df = new SimpleDateFormat(strFormat);
		return df.format(rightNow.getTime());
	}

	/**
	 * 对输入的日期进行默认的格式yyyyMM转换。
	 * 
	 * @return String 经过格式化后的字符串
	 */
	public static String getYearMonth(java.sql.Timestamp dtDate) {
		return getFormattedDate(dtDate, "yyyyMM");
	}

	/**
	 * 渠道使用 修改时间 chg by liufeng 20190714 修改为年、月、日+传入的时、分、秒 统一去掉以前的时、分、秒
	 * 
	 * @param strDate     String
	 * @param strFormat   String
	 * @param iDiffYear   int
	 * @param iDiffMonth  int
	 * @param iDiffDay    int
	 * @param iDiffHour   int
	 * @param iDiffMinute int
	 * @param iDiffSecond int
	 * @return String
	 */
	public static String changeDate(String strDate, String strFormat, int iDiffYear, int iDiffMonth, int iDiffDay,
			int iDiffHour, int iDiffMinute, int iDiffSecond) {
		String strChangedDay = "";
		if (strDate == null || strDate.equals("")) {
			return "";
		}
		strChangedDay += strDate.substring(0, 10) + " " + iDiffHour + ":" + iDiffMinute + ":" + iDiffSecond;
		return strChangedDay;
	}

	/**
	 * add by liufeng 20191031 strFormat值如："yyyy-MM-dd HH:mm:ss"
	 * 
	 * @param strDate   String
	 * @param strFormat String
	 * @return boolean
	 */
	public static boolean isValidDataTime(String strDate, String strFormat) {
		if (strDate == null || strDate.equals("")) {
			return false;
		}
		if (strFormat == null || strFormat.equals("")) {
			return false;
		}
		if (strDate.length() != strFormat.length()) {
			return false;
		}
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(strFormat);
			formatter.parse(strDate);
		} catch (ParseException ex) {
			return false;
		}

		String strTemp = getFormattedDate(strDate, strFormat);
		if (strTemp.equals(strDate)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * add by liufeng 20191122 得到当前时间（前或后）iDays天的日期
	 * 
	 * @param strFormat String 日期格式比如 yyyy-MM-dd
	 * @param iDays     int
	 * @return String
	 */
	public static String getCurenDayAddDay(String strFormat, int iDays) {
		Calendar c = new GregorianCalendar();
		c.add(Calendar.DAY_OF_MONTH, iDays);
		Date cDate = new Date();
		cDate.setTime(c.getTimeInMillis());
		SimpleDateFormat cSimpleDateFormat = new SimpleDateFormat(strFormat);
		return cSimpleDateFormat.format(cDate);
	}

	/**
	 * 
	 * @category @author
	 * @return update 2020年3月18日
	 */
	public static String getCurrentDay(int iDays) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, iDays);
		String yesterday = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
		return yesterday;
	}

	/**
	 * add by liufeng 20191126 得到当前时间前(后)几个月的第一天的日期
	 * 
	 * @return
	 */
	public static String getMonthFrtDate(int iMonth, String strFormat) {
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.MONTH, iMonth);
		Date cDate = new Date();
		cDate.setTime(cal.getTimeInMillis());
		SimpleDateFormat cSimpleDateFormat = new SimpleDateFormat(strFormat);
		String strNewDate = cSimpleDateFormat.format(cDate);
		return strNewDate.subSequence(0, 8) + "01";
	}

	public static void validateDayOfWeek(int dayOfWeek) {
		if (dayOfWeek < SUNDAY || dayOfWeek > SATURDAY) {
			throw new IllegalArgumentException("Invalid day of week.");
		}
	}

	public static void validateHour(int hour) {
		if (hour < 0 || hour > 23) {
			throw new IllegalArgumentException("Invalid hour (must be >= 0 and <= 23).");
		}
	}

	public static void validateMinute(int minute) {
		if (minute < 0 || minute > 59) {
			throw new IllegalArgumentException("Invalid minute (must be >= 0 and <= 59).");
		}
	}

	public static void validateSecond(int second) {
		if (second < 0 || second > 59) {
			throw new IllegalArgumentException("Invalid second (must be >= 0 and <= 59).");
		}
	}

	public static void validateDayOfMonth(int day) {
		if ((day < 1 || day > 31) && day != LAST_DAY_OF_MONTH) {
			throw new IllegalArgumentException("Invalid day of month.");
		}
	}

	public static void validateMonth(int month) {
		if (month < 1 || month > 12) {
			throw new IllegalArgumentException("Invalid month (must be >= 1 and <= 12.");
		}
	}

	public static void validateYear(int year) {
		if (year < 1949 || year > 2099) {
			throw new IllegalArgumentException("Invalid year (must be >= 1949 and <= 2099.");
		}
	}

	public static Date getWholeYearDate(Date date) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_YEAR, 0);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	public static Date getWholeMonthDate(Date date) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 0);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	public static Date getWholeDayDate(Date date) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	public static Date getNextWholeHourDate(Date date) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.setLenient(true);
		c.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY) + 1);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	public static Date getWholeHourDate(Date date) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	public static Date getNextWholeMinuteDate(Date date) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.setLenient(true);
		c.set(Calendar.MINUTE, c.get(Calendar.MINUTE) + 1);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	public static Date getWholeMinuteDate(Date date) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	public static Date getNextWholeSecondDate(Date date) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.setLenient(true);
		c.set(Calendar.SECOND, c.get(Calendar.SECOND) + 1);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	public static Date getWholeSecondDate(Date date) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	/**
	 * 
	 * @category @author
	 * @param date
	 * @param addHour
	 * @return update 2020年3月17日
	 */
	public static Date getAddHourDate(Date date, int addHour) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.setLenient(true);
		if (addHour == 0) {
			return c.getTime();
		}
		int hour = c.get(Calendar.HOUR);
		c.set(Calendar.HOUR_OF_DAY, hour + addHour);
		return c.getTime();
	}

	public static Date getAddMinuteDate(Date date, int addMinute) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.setLenient(true);
		if (addMinute == 0) {
			return c.getTime();
		}
		int minute = c.get(Calendar.MINUTE);
		c.set(Calendar.MINUTE, minute + addMinute);
		return c.getTime();
	}

	public static Date getAddSecondDate(Date date, int addSecond) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.setLenient(true);
		if (addSecond == 0) {
			return c.getTime();
		}
		int second = c.get(Calendar.SECOND);
		c.set(Calendar.SECOND, second + addSecond);
		return c.getTime();
	}

	public static Date getAddHourWholeDate(Date date, int addHour) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.setLenient(true);
		if (addHour == 0) {
			return c.getTime();
		}
		int hour = c.get(Calendar.HOUR);
		c.set(Calendar.HOUR_OF_DAY, hour + addHour);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	public static Date getAddMinuteWholeDate(Date date, int addMinute) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.setLenient(true);
		if (addMinute == 0) {
			return c.getTime();
		}
		int minute = c.get(Calendar.MINUTE);
		c.set(Calendar.MINUTE, minute + addMinute);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	public static Date getAddSecondWholeDate(Date date, int addSecond) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.setLenient(true);
		if (addSecond == 0) {
			return c.getTime();
		}
		int second = c.get(Calendar.SECOND);
		c.set(Calendar.SECOND, second + addSecond);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	public static Date getDateOf(int second, int minute, int hour) {
		validateSecond(second);
		validateMinute(minute);
		validateHour(hour);
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.setLenient(true);
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	public static Date getDateOf(int second, int minute, int hour, int dayOfMonth, int month) {
		validateSecond(second);
		validateMinute(minute);
		validateHour(hour);
		validateDayOfMonth(dayOfMonth);
		validateMonth(month);
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	public static Date getDateOf(int second, int minute, int hour, int dayOfMonth, int month, int year) {
		validateSecond(second);
		validateMinute(minute);
		validateHour(hour);
		validateDayOfMonth(dayOfMonth);
		validateMonth(month);
		validateYear(year);
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, minute);
		c.set(Calendar.SECOND, second);
		c.set(Calendar.MILLISECOND, 0);
		return c.getTime();
	}

	public static Date translateZoneTime(Date date, TimeZone src, TimeZone dest) {
		Date newDate = new Date();
		int offset = (getOffset(date.getTime(), dest) - getOffset(date.getTime(), src));
		newDate.setTime(date.getTime() - offset);
		return newDate;
	}

	public static int getOffset(long date, TimeZone tz) {
		if (tz.inDaylightTime(new Date(date))) {
			return tz.getRawOffset() + getDSTSavings(tz);
		}
		return tz.getRawOffset();
	}

	public static long betweenSecond(Date start, Date end) {
		return ((end.getTime() - start.getTime()) / 1000);
	}

	public static long betweenMinute(Date start, Date end) {
		return ((end.getTime() - start.getTime()) / 60 / 1000);
	}

	public static long betweenHour(Date start, Date end) {
		return ((end.getTime() - start.getTime()) / 3600 / 1000);
	}

	public static long betweenDay(Date start, Date end) {
		return ((end.getTime() - start.getTime()) / 3600 / 24 / 1000);
	}

	public static int getDSTSavings(TimeZone tz) {
		if (tz.useDaylightTime()) {
			return 3600000;
		}
		return 0;
	}

	public static int getLastDayOfMonth(int monthNum, int year) {
		switch (monthNum) {
		case 1:
			return 31;
		case 2:
			return (isLeapYear(year)) ? 29 : 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			throw new IllegalArgumentException("Illegal month number: " + monthNum);
		}
	}

	public static Timestamp dateToTimestamp(Date date) {
		return new Timestamp(date.getTime());
	}

	public static Timestamp getDaysByStartDateAndEndDate(Connection conn, java.sql.Timestamp start,
			java.sql.Timestamp end) throws Exception {
		java.sql.Timestamp endTime = null;
		java.sql.Statement stmt = null;
		java.sql.ResultSet rs = null;
		try {
			DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HHmmss");
			stmt = conn.createStatement();
			String start_str = "to_date('" + dateformat.format(start) + "','yyyy-mm-dd hh24miss')";
			String end_str = "to_date('" + dateformat.format(end) + "','yyyy-mm-dd hh24miss')";
			rs = stmt.executeQuery("select " + end_str + " + " + start_str + " as da from dual");
			if (rs.next()) {
				endTime = rs.getTimestamp("da");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {

			JpfDBUtil.close(rs);
			JpfDBUtil.close(stmt);

		}
		return endTime;
	}

	public static int getDayOfWeek(Date date) throws Exception {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date);
		return cal1.get(Calendar.DAY_OF_WEEK);
	}

	/**
	 * 获得时间的字符串
	 * 
	 * @param ts Timestamp
	 * @return String
	 * @throws Exception
	 */
	public static String getYYYYMMDDHHMMSS(Timestamp ts) throws Exception {
		if (ts == null) {
			return null;
		}
		DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = dateformat.format(ts);
		return str;
	}

	/**
	 * 获得时间的字符串
	 * 
	 * @param ts      Timestamp
	 * @param pattern String
	 * @return String
	 * @throws Exception
	 */
	public static String getYYYYMMDDHHMMSS(Timestamp ts, String pattern) throws Exception {
		if (ts == null) {
			return null;
		}
		DateFormat dateformat = new SimpleDateFormat(pattern);
		String str = dateformat.format(ts);
		return str;
	}

	/**
	 * 根据时间串获得时间对象
	 * 
	 * @param time    String
	 * @param pattern String yyyy-MM-dd HH:mm:ss
	 * @return Timestamp
	 * @throws Exception
	 */
	public static Timestamp getTimestampByYYYYMMDDHHMMSS(String time, String pattern) throws Exception {
		Timestamp rtn = null;
		DateFormat dateformat2 = new SimpleDateFormat(pattern);
		rtn = new Timestamp(dateformat2.parse(time.trim()).getTime());
		return rtn;
	}

	/**
	 * 在一个时间上加上对应的年
	 * 
	 * @param ti long
	 * @param i  int
	 * @return Date
	 * @throws Exception
	 */
	public static Date addOrMinusYear(long ti, int i) throws Exception {
		Date rtn = null;
		GregorianCalendar cal = new GregorianCalendar();
		Date date = new Date(ti);
		cal.setTime(date);
		cal.add(Calendar.YEAR, i);
		rtn = cal.getTime();
		return rtn;
	}

	/**
	 * 在一个时间上加上对应的月份数
	 * 
	 * @param ti long
	 * @param i  int
	 * @return Date
	 * @throws Exception
	 */
	public static Date addOrMinusMonth(long ti, int i) throws Exception {
		Date rtn = null;
		GregorianCalendar cal = new GregorianCalendar();
		Date date = new Date(ti);
		cal.setTime(date);
		cal.add(Calendar.MONTH, i);
		rtn = cal.getTime();
		return rtn;
	}

	/**
	 * 在一个时间上加上或减去周
	 * 
	 * @param ti long
	 * @param i  int
	 * @return Date
	 */
	public static Date addOrMinusWeek(long ti, int i) {
		Date rtn = null;
		GregorianCalendar cal = new GregorianCalendar();
		Date date = new Date(ti);
		cal.setTime(date);
		cal.add(Calendar.WEEK_OF_YEAR, i);
		rtn = cal.getTime();
		return rtn;
	}

	/**
	 * 在一个时间上加上或减去天数
	 * 
	 * @param ti long
	 * @param i  int
	 * @return Date
	 */
	public static Date addOrMinusDays(long ti, int i) {
		Date rtn = null;
		GregorianCalendar cal = new GregorianCalendar();
		Date date = new Date(ti);
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH, i);
		rtn = cal.getTime();
		return rtn;
	}

	/**
	 * 在一个时间上加上或减去小时
	 * 
	 * @param ti long
	 * @param i  int
	 * @return Date
	 */
	public static Date addOrMinusHours(long ti, int i) {
		Date rtn = null;
		GregorianCalendar cal = new GregorianCalendar();
		Date date = new Date(ti);
		cal.setTime(date);
		cal.add(Calendar.HOUR, i);
		rtn = cal.getTime();
		return rtn;
	}

	/**
	 * 在一个时间上加上或减去分钟
	 * 
	 * @param ti long
	 * @param i  int
	 * @return Date
	 */
	public static Date addOrMinusMinutes(long ti, int i) {
		Date rtn = null;
		GregorianCalendar cal = new GregorianCalendar();
		Date date = new Date(ti);
		cal.setTime(date);
		cal.add(Calendar.MINUTE, i);
		rtn = cal.getTime();
		return rtn;
	}

	/**
	 * 在一个时间上加上或减去秒数
	 * 
	 * @param ti long
	 * @param i  int
	 * @return Date
	 */
	public static Date addOrMinusSecond(long ti, int i) {
		Date rtn = null;
		GregorianCalendar cal = new GregorianCalendar();
		Date date = new Date(ti);
		cal.setTime(date);
		cal.add(Calendar.SECOND, i);
		rtn = cal.getTime();
		return rtn;
	}

	/**
	 * 根据指定的日期获取下个月的第一天的时间
	 * 
	 * @param date
	 * @return
	 * @author shaosm
	 */
	public static Timestamp getDateOfNextMonthFirstDay(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.DAY_OF_MONTH, 1);
		rightNow.set(Calendar.HOUR_OF_DAY, 0);
		rightNow.set(Calendar.MILLISECOND, 0);
		rightNow.set(Calendar.SECOND, 0);
		rightNow.set(Calendar.MINUTE, 0);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH) + 1);
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 根据指定的日期获取上个月的第一天的时间
	 * 
	 * @param date
	 * @return
	 */
	public static Timestamp getDateOfPreMonthFirstDay(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.DAY_OF_MONTH, 1);
		rightNow.set(Calendar.HOUR_OF_DAY, 0);
		rightNow.set(Calendar.MILLISECOND, 0);
		rightNow.set(Calendar.SECOND, 0);
		rightNow.set(Calendar.MINUTE, 0);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH) - 1);
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 将带有时间类型的日期转换成不带时间的日期
	 * 
	 * @param date
	 * @return
	 */
	public static Timestamp formatDateTimeToDate(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.HOUR_OF_DAY, 0);
		rightNow.set(Calendar.MILLISECOND, 0);
		rightNow.set(Calendar.SECOND, 0);
		rightNow.set(Calendar.MINUTE, 0);
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * Returns the date in yyyy-MM-dd format.
	 * 
	 * @param date the {@link Date} to format.
	 * @return a formatted string in yyy-MM-dd form.
	 */
	public static String getformatDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());
	}

	/**
	 * 根据指定日期获取该月的最后一天的最后时间点
	 * 
	 * @param date
	 * @return
	 */
	public static Timestamp getDateOfCurrentMonthEndDay(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.DAY_OF_MONTH, rightNow.getActualMaximum(Calendar.DAY_OF_MONTH));
		rightNow.set(Calendar.HOUR_OF_DAY, 23);
		rightNow.set(Calendar.MILLISECOND, 59);
		rightNow.set(Calendar.SECOND, 59);
		rightNow.set(Calendar.MINUTE, 59);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH));
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 根据指定日期获取当天的最后的时间点
	 * 
	 * @param date
	 * @return
	 */
	public static Timestamp getLastDate(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.HOUR_OF_DAY, 23);
		rightNow.set(Calendar.MILLISECOND, 59);
		rightNow.set(Calendar.SECOND, 59);
		rightNow.set(Calendar.MINUTE, 59);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH));
		return new Timestamp(rightNow.getTimeInMillis());
	}

	public static Timestamp getLastHour(Date date) {
		if (date == null) {
			date = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.setLenient(true);
		c.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY) + 1);
		c.set(Calendar.MINUTE, 59);
		c.set(Calendar.SECOND, 59);
		c.set(Calendar.MILLISECOND, 59);
		return new Timestamp(c.getTimeInMillis());
	}

	public static Timestamp getLastDay(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.HOUR_OF_DAY, 23);
		rightNow.set(Calendar.MILLISECOND, 59);
		rightNow.set(Calendar.SECOND, 59);
		rightNow.set(Calendar.MINUTE, 59);
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 根据指定日期获取前一天的最后的时间点
	 * 
	 * @param date
	 * @return
	 */
	public static Timestamp getPreLastDate(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.DAY_OF_MONTH, rightNow.get(Calendar.DAY_OF_MONTH) - 1);
		rightNow.set(Calendar.HOUR_OF_DAY, 23);
		rightNow.set(Calendar.MILLISECOND, 59);
		rightNow.set(Calendar.SECOND, 59);
		rightNow.set(Calendar.MINUTE, 59);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH));
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 根据指定日期获取下一天的开始的时间点
	 * 
	 * @param date
	 * @return
	 */
	public static Timestamp getNextDay(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.DAY_OF_MONTH, rightNow.get(Calendar.DAY_OF_MONTH) + 1);
		rightNow.set(Calendar.HOUR_OF_DAY, 0);
		rightNow.set(Calendar.MILLISECOND, 0);
		rightNow.set(Calendar.SECOND, 0);
		rightNow.set(Calendar.MINUTE, 0);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH));
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 根据指定日期获取某天的开始的时间点
	 * 
	 * @param date
	 * @return
	 */
	public static Timestamp getDay(Date date, int i) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.DAY_OF_MONTH, rightNow.get(Calendar.DAY_OF_MONTH) + i);
		rightNow.set(Calendar.HOUR_OF_DAY, 0);
		rightNow.set(Calendar.MILLISECOND, 0);
		rightNow.set(Calendar.SECOND, 0);
		rightNow.set(Calendar.MINUTE, 0);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH));
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 将时间格式化为YYYY-MM-DD
	 * 
	 * @param date
	 * @return
	 */
	public static String getYYYYMMDD(Date date) {
		if (date == null) {
			return null;
		}
		DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		return dateformat.format(date);
	}

	/**
	 * @category 将时间格式化为YYYY-MM-DD
	 * 
	 * @param date
	 * @return
	 */
	public static String getNoLineYYYYMMDD(Date date) {
		if (date == null) {
			return null;
		}
		DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		return dateformat.format(date);
	}

	/**
	 * 处理计费月时间
	 * 
	 * @return
	 */
	public static Timestamp getBillMonthDate(Date beginDate, Date endDate) {
		if (null == beginDate) {
			return null;
		}
		// 获取结束时间的月底时间
		Timestamp monthEndDate = new Timestamp(
				addOrMinusDays(getDateOfNextMonthFirstDay(endDate).getTime(), -1).getTime());
		return new Timestamp(monthEndDate.getTime());
	}

	/*
	 * public static long getHHMMSSSecond(Date date)throws Exception{ Calendar c =
	 * Calendar.getInstance(); c.setTime(date); return
	 * c.get(Calendar.HOUR_OF_DAY)*60*60 + c.get(Calendar.MINUTE)*60 +
	 * c.get(Calendar.SECOND); }
	 */

	public static long getHHMMSSSecond(String HHmmss) throws Exception {
		String[] sp = HHmmss.split("\\:");
		long hour = Integer.parseInt(sp[0]);
		long minute = Integer.parseInt(sp[1]);
		long second = Integer.parseInt(sp[2]);
		return hour * 60 * 60 + minute * 60 + second;
	}

	/**
	 * 将指定的日期取整
	 * 
	 * @param date
	 * @return
	 * @author shaosm
	 */
	public static Timestamp getTruncDate(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.HOUR_OF_DAY, 0);
		rightNow.set(Calendar.MILLISECOND, 0);
		rightNow.set(Calendar.SECOND, 0);
		rightNow.set(Calendar.MINUTE, 0);
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 根据指定的日期获取月的第一天的时间
	 * 
	 * @param date
	 * @return
	 */
	public static Timestamp getDateOfMonthFirstDay(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.DAY_OF_MONTH, 1);
		rightNow.set(Calendar.HOUR_OF_DAY, 0);
		rightNow.set(Calendar.MILLISECOND, 0);
		rightNow.set(Calendar.SECOND, 0);
		rightNow.set(Calendar.MINUTE, 0);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH));
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 获取当前时间的最后时间点
	 */
	/**
	 * 根据指定日期获取最后时间点
	 * 
	 * @param date
	 * @return
	 */
	public static Timestamp getDateOfCurrentEndDay(Date date) {
		Calendar rightNow = Calendar.getInstance();
		rightNow.setTime(date);
		rightNow.set(Calendar.HOUR_OF_DAY, 23);
		rightNow.set(Calendar.MILLISECOND, 59);
		rightNow.set(Calendar.SECOND, 59);
		rightNow.set(Calendar.MINUTE, 59);
		rightNow.set(Calendar.MONTH, rightNow.get(Calendar.MONTH));
		return new Timestamp(rightNow.getTimeInMillis());
	}

	/**
	 * 在开始时间上增加指定的妙数,考虑非工作时间,周六周日,节假日时间
	 * 
	 * @param start       开始时间
	 * @param addsecond   增加的妙
	 * @param starthhmmss 非工作开始时间
	 * @param endhhmmss   非工作结束时间
	 * @return
	 * @throws Exception
	 */
	/*
	 * public static Date addSpaceTime(Date start, long addsecond, String
	 * starthhmmss, String endhhmmss) throws Exception { Date endTime=null; long ss
	 * = getHHMMSSSecond(starthhmmss); long se = getHHMMSSSecond(endhhmmss);
	 * if(se<ss){//隔天 se=se+24*60*60; } endTime = start; long s1 =
	 * getHHMMSSSecond(endTime); if(s1>= ss && s1 < se){ endTime =
	 * DateTimeUtil.addOrMinusSecond(endTime.getTime(),(int)(se-s1)); } int
	 * curweekindex = DateTimeUtil.getDayOfWeek(endTime); if(curweekindex==7){//星期六
	 * endTime = DateTimeUtil.addOrMinusSecond(endTime.getTime(),(int)(2*24*60*60 -
	 * getHHMMSSSecond(endTime))); } if(curweekindex==1){//星期日 endTime =
	 * DateTimeUtil.addOrMinusSecond(endTime.getTime(),(int)(24*60*60 -
	 * getHHMMSSSecond(endTime))); } long count = addsecond; for(int
	 * i=0;i<count;i++){ endTime =
	 * DateTimeUtil.addOrMinusSecond(endTime.getTime(),1); s1 =
	 * getHHMMSSSecond(endTime); if(s1>= ss && s1 < se){ endTime =
	 * DateTimeUtil.addOrMinusSecond(endTime.getTime(),(int)(se-s1)); } curweekindex
	 * = DateTimeUtil.getDayOfWeek(endTime); if(curweekindex==7){//星期六 endTime =
	 * DateTimeUtil.addOrMinusSecond(endTime.getTime(),(int)(2*24*60*60 -
	 * getHHMMSSSecond(endTime))); } if(curweekindex==1){//星期日 endTime =
	 * DateTimeUtil.addOrMinusSecond(endTime.getTime(),(int)(24*60*60 -
	 * getHHMMSSSecond(endTime))); } }
	 */
	/*
	 * Date endTime = DateTimeUtil.addOrMinusSecond(start.getTime(),(int)addsecond);
	 * //处理非工作时间 long overday = DateTimeUtil.betweenDay(start,endTime); int
	 * weekcount = DateTimeUtil.getCountInWeekDay(start,endTime); int curweekindex =
	 * DateTimeUtil.getDayOfWeek(start); int endweekindex =
	 * DateTimeUtil.getDayOfWeek(endTime); long s1 = getHHMMSSSecond(start); long s2
	 * = getHHMMSSSecond(endTime); long ss =
	 * getHHMMSSSecond(DateTimeUtil.DATA_FORMAT_HH_MM_SS.parse(starthhmmss)); long
	 * se = getHHMMSSSecond(DateTimeUtil.DATA_FORMAT_HH_MM_SS.parse(endhhmmss));
	 * long temp = 0; long cycle = overday; if(curweekindex != 1 && curweekindex !=
	 * 7 && (endweekindex==1 || endweekindex== 7)){ if(endweekindex==7){ temp +=
	 * 24*60*60*(weekcount+1); }else{ temp += 24*60*60*(weekcount); } }else
	 * if((curweekindex==1 || curweekindex==7) && (endweekindex != 1 && endweekindex
	 * !=7)){//开始时间就在周日，周六 temp += 24*60*60*(weekcount-1) + (24*60*60 -
	 * getHHMMSSSecond(start)); }else if((curweekindex==1 || curweekindex==7) &&
	 * (endweekindex == 1 || endweekindex ==7)){ temp += 24*60*60*(weekcount-1) +
	 * (24*60*60 - getHHMMSSSecond(start)); }else{ if(weekcount>0){ temp +=
	 * 24*60*60*weekcount; } } if(se<ss){//隔天 se=se+24*60*60; } temp +=
	 * cycle*(se-ss); if(s2<s1){ s2=s2+24*60*60; } if(s1<ss && s2>=ss && s2<=se){
	 * temp += se-ss; } if(s1<ss && s2>se){ temp += se-ss; } if(s1>=ss && s1<= se){
	 * temp += se-s1; } Date restTime =
	 * DateTimeUtil.addOrMinusSecond(endTime.getTime(),(int)temp);
	 *//*
		 * return endTime; }
		 */

	/**
	 * 求两时间秒差,除去非工作日,周六周日,节假日时间
	 * 
	 * @param start
	 * @param endTime
	 * @param starthhmmss
	 * @param endhhmmss
	 * @return
	 * @throws Exception
	 */
	/*
	 * public static long secondSpaceTime(Date start, Date endTime, String
	 * starthhmmss, String endhhmmss) throws Exception { Date tempDate = start; long
	 * intersecond=0; long ss =
	 * getHHMMSSSecond(DateTimeUtil.DATA_FORMAT_HH_MM_SS.parse(starthhmmss)); long
	 * se = getHHMMSSSecond(DateTimeUtil.DATA_FORMAT_HH_MM_SS.parse(endhhmmss));
	 * if(se<ss){//隔天 se=se+24*60*60; } long s1 = getHHMMSSSecond(tempDate); if(s1>=
	 * ss && s1 < se){ tempDate =
	 * DateTimeUtil.addOrMinusSecond(tempDate.getTime(),(int)(se-s1)); } int
	 * curweekindex = DateTimeUtil.getDayOfWeek(tempDate); if(curweekindex==7){//星期六
	 * tempDate = DateTimeUtil.addOrMinusSecond(tempDate.getTime(),(int)(2*24*60*60
	 * - getHHMMSSSecond(tempDate))); } if(curweekindex==1){//星期日 tempDate =
	 * DateTimeUtil.addOrMinusSecond(tempDate.getTime(),(int)(24*60*60 -
	 * getHHMMSSSecond(tempDate))); } while(tempDate.before(endTime)){ intersecond
	 * += 1; tempDate = DateTimeUtil.addOrMinusSecond(tempDate.getTime(),1); s1 =
	 * getHHMMSSSecond(tempDate); if(s1>= ss && s1 < se){ tempDate =
	 * DateTimeUtil.addOrMinusSecond(tempDate.getTime(),(int)(se-s1)); }
	 * curweekindex = DateTimeUtil.getDayOfWeek(tempDate); if(curweekindex==7){//星期六
	 * tempDate = DateTimeUtil.addOrMinusSecond(tempDate.getTime(),(int)(2*24*60*60
	 * - getHHMMSSSecond(tempDate))); } if(curweekindex==1){//星期日 tempDate =
	 * DateTimeUtil.addOrMinusSecond(tempDate.getTime(),(int)(24*60*60 -
	 * getHHMMSSSecond(tempDate))); } }
	 */
	/*
	 * long dursecond =
	 * DateTimeUtil.betweenSecond(start,endTime);//需要减去非工作时间、周末时间、节假日时间 //处理非工作时间
	 * long overday = DateTimeUtil.betweenDay(start,endTime); int weekcount =
	 * DateTimeUtil.getCountInWeekDay(start,endTime); int curweekindex =
	 * DateTimeUtil.getDayOfWeek(start); int endweekindex =
	 * DateTimeUtil.getDayOfWeek(endTime); long s1 = getHHMMSSSecond(start); long s2
	 * = getHHMMSSSecond(endTime); long ss =
	 * getHHMMSSSecond(DateTimeUtil.DATA_FORMAT_HH_MM_SS.parse(starthhmmss)); long
	 * se = getHHMMSSSecond(DateTimeUtil.DATA_FORMAT_HH_MM_SS.parse(endhhmmss));
	 * long temp = 0; long cycle = overday; if(curweekindex != 1 && curweekindex !=
	 * 7 && (endweekindex==1 || endweekindex== 7)){ cycle = cycle - (weekcount-1);
	 * temp += 24*60*60*(weekcount-1) + (getHHMMSSSecond(endTime)); }else
	 * if((curweekindex==1 || curweekindex==7) && (endweekindex != 1 && endweekindex
	 * !=7)){//开始时间就在周日，周六 cycle = cycle - (weekcount-1); temp +=
	 * 24*60*60*(weekcount-1) + (24*60*60 - getHHMMSSSecond(start)); }else
	 * if((curweekindex==1 || curweekindex==7) && (endweekindex == 1 || endweekindex
	 * ==7)){ cycle = cycle - (weekcount-1); temp += 24*60*60*(weekcount-1) +
	 * (24*60*60 - getHHMMSSSecond(start)); }else{ if(weekcount>0){ cycle = cycle -
	 * (weekcount); temp += 24*60*60*weekcount; } } if(se<ss){//隔天 se=se+24*60*60; }
	 * temp += cycle*(se-ss); if(s2<s1){ s2=s2+24*60*60; } if(s1<ss && s2>=ss &&
	 * s2<=se){ temp += se-ss; } if(s1<ss && s2>se){ temp += se-ss; } if(s1>=ss &&
	 * s1<= se){ temp += se-s1; } return dursecond - temp;
	 *//*
		 * return intersecond; }
		 */

	/**
	 * 起始年月yyyyMM与终止月yyyyMM之间跨度的月数。
	 * 
	 * @param beginMonth 格式为yyyyMM
	 * @param endMonth   格式为yyyyMM
	 * @return 整数
	 */
	public static int getInterval(String beginMonth, String endMonth) {
		int intBeginYear = Integer.parseInt(beginMonth.substring(0, 4));
		int intBeginMonth = Integer.parseInt(beginMonth.substring(4, 6));
		int intEndYear = Integer.parseInt(endMonth.substring(0, 4));
		int intEndMonth = Integer.parseInt(endMonth.substring(4, 6));
		return ((intEndYear - intBeginYear) * 12) + (intEndMonth - intBeginMonth);
	}

	/**
	 * 对输入的日期字符串进行格式化, 如果输入的是0000/00/00 00:00:00则返回空串. FrameWork使用
	 * 
	 * @param strDate     String 需要进行格式化的日期字符串
	 * @param strFormatTo String 要转换的日期格式
	 * @return String 经过格式化后的字符串
	 */
	public static String getFormattedDate(String strDate, String strFormatTo) {
		if ((strDate == null) || strDate.trim().equals("")) {
			return "";
		}
		strDate = strDate.replace('/', '-');
		strFormatTo = strFormatTo.replace('/', '-');
		if (strDate.equals("0000-00-00 00:00:00") || strDate.equals("1800-01-01 00:00:00")) {
			return "";
		}
		String formatStr = strFormatTo; // "yyyyMMdd";
		if ((strDate == null) || strDate.trim().equals("")) {
			return "";
		}
		switch (strDate.trim().length()) {
		case 6:
			if (strDate.substring(0, 1).equals("0")) {
				formatStr = "yyMMdd";
			} else {
				formatStr = "yyyyMM";
			}
			break;
		case 8:
			formatStr = "yyyyMMdd";
			break;
		case 10:
			if (strDate.indexOf("-") == -1) {
				formatStr = "yyyy/MM/dd";
			} else {
				formatStr = "yyyy-MM-dd";
			}
			break;
		case 11:
			if (strDate.getBytes().length == 14) {
				formatStr = "yyyy年MM月dd日";
			} else {
				return "";
			}
			break;
		case 14:
			formatStr = "yyyyMMddHHmmss";
			break;
		case 19:
			if (strDate.indexOf("-") == -1) {
				formatStr = "yyyy/MM/dd HH:mm:ss";
			} else {
				formatStr = "yyyy-MM-dd HH:mm:ss";
			}
			break;
		case 21:
			if (strDate.indexOf("-") == -1) {
				formatStr = "yyyy/MM/dd HH:mm:ss.S";
			} else {
				formatStr = "yyyy-MM-dd HH:mm:ss.S";
			}
			break;
		default:
			return strDate.trim();
		}
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(formatStr);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(formatter.parse(strDate));
			formatter = new SimpleDateFormat(strFormatTo);
			return formatter.format(calendar.getTime());
		} catch (Exception e) {
			// Common.printLog("转换日期字符串格式时出错;" + e.getMessage());
			return "";
		}
	}

	/**
	 * 根据传入的日期字符串转换成相应的日期对象， 如果字符串为空或不符合日期格式，则返回当前时间。 FrameWork使用
	 * 
	 * @param strDate String 日期字符串
	 * @return java.sql.Timestamp 日期对象
	 */
	public static java.sql.Timestamp getDateByString(String strDate) {
		if (strDate.trim().equals("")) {
			return new java.sql.Timestamp(System.currentTimeMillis());
		}
		try {
			strDate = getFormattedDate(strDate, "yyyy-MM-dd HH:mm:ss") + ".000000000";
			return java.sql.Timestamp.valueOf(strDate);
		} catch (Exception ex) {
			// log.error(ex.getMessage());
			return new java.sql.Timestamp(System.currentTimeMillis());
		}
	}

	/**
	 * 得到当前日期时间,格式为yyyyMMddhhmmss. FrameWork使用
	 * 
	 * @return String
	 */
	public static String getCurrDateTime_yyyymmddhhmmss() {
		java.sql.Timestamp date = new java.sql.Timestamp(System.currentTimeMillis());
		SimpleDateFormat DATA_FORMAT_YYYYMMDDHHMMSS = new SimpleDateFormat("yyyyMMddHHmmss");
		return DATA_FORMAT_YYYYMMDDHHMMSS.format(date);
	}

	/**
	 * 日期计算
	 * 
	 * @param timest1
	 * @param day
	 * @return
	 */
	public static Timestamp DateAddDay(Timestamp timest1, int day) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(timest1);
		cal.add(Calendar.DAY_OF_MONTH, day);
		return new Timestamp(cal.getTimeInMillis());
	}

	/**
	 * 获取某年的今日字符串
	 * 
	 * @param year -1：去年 1：明年
	 * @return
	 */
	public static String getYear(int year) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, year);
		java.sql.Timestamp date = new java.sql.Timestamp(cal.getTimeInMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formatter.format(date);
	}

	/**
	 * 得到今天日期，指定格式。
	 * 
	 * @return String 格式化的日期字符串
	 */
	public static String getToday(String format) {
		Date cDate = new Date();
		SimpleDateFormat cSimpleDateFormat = new SimpleDateFormat(format);
		return cSimpleDateFormat.format(cDate);
	}

	/**
	 * 得到指定日期，格式yyyy-MM-dd hh24:mm:ss。
	 * 
	 * @return String 格式化的日期字符串
	 */
	public static String getDateForNeed(long min) {
		Date cDate = new Date();
		cDate.setTime(cDate.getTime() + min * 60 * 1000);
		SimpleDateFormat cSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return cSimpleDateFormat.format(cDate);
	}

	/**
	 * 得到当前日期格式yyyyMM转换。
	 * 
	 * @return String 经过格式化后的字符串
	 */
	public static String getCurrentYearMonth() {
		return getYearMonth(new java.sql.Timestamp(System.currentTimeMillis()));
	}

	/**
	 * 获取当前时间前（后）几个月的那一天日期
	 * 
	 * @param iMonth
	 * @param strFormat
	 * @return
	 */
	public static String getDateBeforeMonths(int iMonth, String strFormat) {
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.MONTH, iMonth);
		Date cDate = new Date();
		cDate.setTime(cal.getTimeInMillis());
		SimpleDateFormat cSimpleDateFormat = new SimpleDateFormat(strFormat);
		String strNewDate = cSimpleDateFormat.format(cDate);
		return strNewDate;
	}

	/**
	 * 门户查询使用
	 * 
	 * @param inputDate String
	 * @return String
	 */
	public static String getRBossQryStartDate(String inputDate) {
		// String rbossQryStartDate="2019-06-01";
		String rbossQryStartDate = getMonthFrtDate(-12 * 1, "yyyy-MM-dd");
		try {
			Timestamp inputTimestamp = Timestamp.valueOf(inputDate + " 00:00:00.000000000");
			Timestamp qryStartTimestamp = Timestamp.valueOf(rbossQryStartDate + " 00:00:00.000000000");
			if (inputTimestamp.before(qryStartTimestamp)) {
				return rbossQryStartDate;
			}
		} catch (Exception e) {
			return inputDate;
		}
		return inputDate;
	}

	public static Timestamp getRBossQryStartDate(Timestamp inputDate) {
		// String rbossQryStartDate="2019-06-01";
		String rbossQryStartDate = getMonthFrtDate(-12 * 1, "yyyy-MM-dd");
		try {
			if (inputDate == null) {
				return Timestamp.valueOf(rbossQryStartDate + " 00:00:00.000000000");
			}
			Timestamp qryStartTimestamp = Timestamp.valueOf(rbossQryStartDate + " 00:00:00.000000000");
			if (inputDate.before(qryStartTimestamp)) {
				return qryStartTimestamp;
			}
		} catch (Exception e) {
			return inputDate;
		}
		return inputDate;
	}

	public static String getRBossQryStartDate(String inputDate, int two) {
		// String rbossQryStartDate="2019-06-01 00:00:00";
		String rbossQryStartDate = getMonthFrtDate(-12 * 1, "yyyy-MM-dd") + " 00:00:00";
		try {
			Timestamp inputTimestamp = Timestamp.valueOf(inputDate + ".000000000");
			Timestamp qryStartTimestamp = Timestamp.valueOf(rbossQryStartDate + ".000000000");
			if (inputTimestamp.before(qryStartTimestamp)) {
				return rbossQryStartDate;
			}
		} catch (Exception e) {
			return inputDate;
		}
		return inputDate;
	}

	/** ******** */

	// public static Timestamp getDate(String dateStr, String format) throws
	// Exception {
	// SimpleDateFormat formatter = new SimpleDateFormat(format);
	// return new Timestamp(formatter.parse(dateStr).getTime());
	// }

	// public static Timestamp getMonthDate(String dateStr) throws Exception {
	// return getDate(dateStr,"yyyyMM");
	// }

	public static Timestamp getNextMonthFirstDay(int month) {
		return getNextMonthFirstDay(new Date(System.currentTimeMillis()), month);
	}

	public static Timestamp getNextMonthFirstDay(Date date, int month) {
		Calendar nextDay = Calendar.getInstance();
		nextDay.setTime(date);
		nextDay.add(Calendar.MONTH, month);
		nextDay.set(Calendar.DATE, 1);
		nextDay.set(Calendar.HOUR_OF_DAY, 0);
		nextDay.set(Calendar.MINUTE, 0);
		nextDay.set(Calendar.SECOND, 0);
		nextDay.set(Calendar.MILLISECOND, 0);
		return new Timestamp(nextDay.getTimeInMillis());
	}

	/**
	 * 获取最大的日期，2099-12-31
	 * 
	 * @return
	 */
	public static Timestamp getMaxOrderDate() {
		Calendar maxDate = Calendar.getInstance();
		maxDate.set(Calendar.YEAR, 2099);
		maxDate.set(Calendar.MONTH, 11);
		maxDate.set(Calendar.DATE, 31);
		maxDate.set(Calendar.HOUR_OF_DAY, 0);
		maxDate.set(Calendar.MINUTE, 0);
		maxDate.set(Calendar.SECOND, 0);
		maxDate.set(Calendar.MILLISECOND, 0);
		return new Timestamp(maxDate.getTimeInMillis());
	}

	/**
	 * 获取当前时间，Timestamp类型
	 * 
	 * @return
	 */
	public static Timestamp getNow() {
		java.sql.Timestamp date = new java.sql.Timestamp(System.currentTimeMillis());
		return date;
	}

	/**
	 * 根据日期timestamp时间戳获取当前几号
	 * 
	 * @param tx
	 * @return
	 */
	public static int getDay(Timestamp tx) {
		String dateStr = getFormattedDate(tx);

		String day = dateStr.substring(dateStr.length() - 2);
		if (day.charAt(0) == '0') {
			return day.charAt(1);
		}
		return Integer.parseInt(day);
	}

	/**
	 * 获得指定日期的前一天
	 * 
	 * @param specifiedDay 指定日期
	 * @param format       指定日期格式
	 * @return
	 * @throws Exception
	 */
	public static String getSpecifiedDayBefore(String specifiedDay, String format) throws Exception {
		// SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		Date date = new SimpleDateFormat(format).parse(specifiedDay);

		c.setTime(date);
		int day = c.get(Calendar.DATE);
		c.set(Calendar.DATE, day - 1);
		String dayBefore = new SimpleDateFormat(format).format(c.getTime());
		return dayBefore;
	}

	/**
	 * 获得指定日期的后一天
	 * 
	 * @param specifiedDay 指定日期
	 * @param format       指定日期格式
	 * @return
	 * @throws Exception
	 */
	public static String getSpecifiedDayAfter(String specifiedDay, String format) throws Exception {
		// SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		Date date = new SimpleDateFormat(format).parse(specifiedDay);

		c.setTime(date);
		int day = c.get(Calendar.DATE);
		c.set(Calendar.DATE, day + 1);
		String dayAfter = new SimpleDateFormat(format).format(c.getTime());
		return dayAfter;
	}

	public static Date getDate(String strDate, String strFormat) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat(strFormat);
		Date date = format.parse(strDate);

		return date;
	}

	public static Timestamp getTimestamp(String strDate, String strFormat) throws ParseException {
		Date date = getDate(strDate, strFormat);
		Timestamp timestamp = new Timestamp(date.getTime());

		return timestamp;
	}

	public static String getStringDate(Date date, String strFormat) throws ParseException {
		if (date == null) {
			return "";
		}
		SimpleDateFormat format = new SimpleDateFormat(strFormat);
		String strDate = format.format(date);

		return strDate;
	}

	public static String getStringTimestamp(Timestamp timestamp, String strFormat) throws ParseException {
		if (timestamp == null) {
			return "";
		}
		String strTimestamp = getStringDate(timestamp, strFormat);
		return strTimestamp;
	}

	public static Timestamp addMonth(Timestamp timestamp, int months) throws ParseException {
		GregorianCalendar grc = new GregorianCalendar();
		grc.setTime(timestamp);

		grc.add(Calendar.MONTH, months);

		return new Timestamp(grc.getTime().getTime());
	}

	public static Timestamp addYear(Timestamp timestamp, int years) throws ParseException {
		GregorianCalendar grc = new GregorianCalendar();
		grc.setTime(timestamp);

		grc.add(Calendar.YEAR, years);

		return new Timestamp(grc.getTime().getTime());
	}

	public static Timestamp addDay(Timestamp timestamp, int days) throws ParseException {
		GregorianCalendar grc = new GregorianCalendar();
		grc.setTime(timestamp);

		grc.add(Calendar.DAY_OF_MONTH, days);

		return new Timestamp(grc.getTime().getTime());
	}

	public static Timestamp addHour(Timestamp timestamp, int hours) throws ParseException {
		GregorianCalendar grc = new GregorianCalendar();
		grc.setTime(timestamp);

		grc.add(Calendar.HOUR_OF_DAY, hours);

		return new Timestamp(grc.getTime().getTime());
	}

	public static Timestamp addMinute(Timestamp timestamp, int minutes) throws ParseException {
		GregorianCalendar grc = new GregorianCalendar();
		grc.setTime(timestamp);

		grc.add(Calendar.MINUTE, minutes);

		return new Timestamp(grc.getTime().getTime());
	}

	public static Timestamp addSecond(Timestamp timestamp, int seconds) throws ParseException {
		GregorianCalendar grc = new GregorianCalendar();
		grc.setTime(timestamp);

		grc.add(Calendar.SECOND, seconds);

		return new Timestamp(grc.getTime().getTime());
	}

	public static String getTime(String time, String strFormat) throws ParseException {
		Timestamp endLogDateFormated = getTimestamp(time, strFormat);
		String sTime = getStringTimestamp(endLogDateFormated, "yyyyMMdd");
		return sTime;
	}

	/**
	 * 
	 * @category 字符串转换成日期
	 * @author
	 * @param str
	 * @return update 2020年3月17日
	 */
	public static Date strToDateTime(String str) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 
	 * @category 字符串转换成日期
	 * @author
	 * @param str
	 * @return update 2020年3月17日
	 */
	public static Date strToDate(String str) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * Returns a duration in HH:mm:ss format.
	 * 
	 * @param duration the {@code duration} to format as {@code float}.
	 * @return a formatted string in HH:mm:ss form.
	 */
	public static String getDateTimeDuration(float duration) {
		long l = (long) (duration * 1000);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
		return "" + sdf.format(new Date(l - TimeZone.getDefault().getRawOffset()));
	}

}
