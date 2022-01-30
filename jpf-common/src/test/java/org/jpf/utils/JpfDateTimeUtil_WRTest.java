/*
 this file is write by wupf
 */
package org.jpf.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import com.alibaba.fastjson.JSON;

/**
 * The class <code>JpfDateTimeUtilTest</code> contains tests for the class
 * <code>{@link JpfDateTimeUtil}</code>.
 * <p>
 * Copyright (c) 2019
 * 
 * @generatedBy wupf at 2019-11-28 19:49:46
 * @author Administrator
 * @version $Revision: 1.3.0
 */

public class JpfDateTimeUtil_WRTest {

	/**
	 * Run the dateToStr method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String dateToStr(Date date,String format)
	 */
	@Test(timeout = 1000)
	public void test_dateToStr_R3() throws Throwable {

		Date date = new java.util.Date();
		String format = "";

		String wupf_result = JpfDateTimeUtil.dateToStr(date, format);

		System.out.println("jpf_check:dateToStr:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the sqlDateToStr method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String sqlDateToStr(java.sql.Date date,String format)
	 */
	@Test(timeout = 1000)
	public void test_sqlDateToStr_R16() throws Throwable {

		java.sql.Date date = new java.sql.Date(1);
		String format = "";

		String wupf_result = JpfDateTimeUtil.sqlDateToStr(date, format);

		System.out.println("jpf_check:sqlDateToStr:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the strToStamp method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp strToStamp(String date)
	 */
	@Test(timeout = 1000)
	public void test_strToStamp_R36() throws Throwable {

		String date = null;

		Timestamp wupf_result = JpfDateTimeUtil.strToStamp(date);

		System.out.println("jpf_check:strToStamp:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the strToStamp method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp strToStamp(String date,String format)
	 */
	@Test(timeout = 1000)
	public void test_strToStamp_R44() throws Throwable {

		String date = "abc123";
		String format = "";

		Timestamp wupf_result = JpfDateTimeUtil.strToStamp(date, format);

		System.out.println("jpf_check:strToStamp:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the strToStamp method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp strToStamp(String date,String format)
	 */
	@Test(timeout = 1000)
	public void test_strToStamp_R48() throws Throwable {

		String date = null;
		String format = "abc123";

		Timestamp wupf_result = JpfDateTimeUtil.strToStamp(date, format);

		System.out.println("jpf_check:strToStamp:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the printRunTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static void printRunTime(long beganTime,long endTime)
	 */
	@Test(timeout = 1000)
	public void test_printRunTime_R70() throws Throwable {

		long beganTime = Long.MAX_VALUE;
		long endTime = Long.MAX_VALUE;

		JpfDateTimeUtil.printRunTime(beganTime, endTime);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the getNowTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Long getNowTime()
	 */
	@Test(timeout = 1000)
	public void test_getNowTime_NP79() throws Throwable {

		Long wupf_result = JpfDateTimeUtil.getNowTime();

		System.out.println("jpf_check:getNowTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDistanceOfTwoDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long getDistanceOfTwoDate(Date before,Date after)
	 */
	@Test(timeout = 1000)
	public void test_getDistanceOfTwoDate_R81() throws Throwable {

		Date before = new java.util.Date();
		Date after = new java.util.Date();
		long wupf_result = JpfDateTimeUtil.getDistanceOfTwoDate(before, after);

		System.out.println("jpf_check:getDistanceOfTwoDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the isLeapYear method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static boolean isLeapYear(int year)
	 */
	@Test(timeout = 1000)
	public void test_isLeapYear_R85() throws Throwable {

		int year = Integer.MAX_VALUE;

		boolean wupf_result = JpfDateTimeUtil.isLeapYear(year);

		System.out.println("jpf_check:isLeapYear:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));
		assertEquals(false, wupf_result);

	}

	/**
	 * Run the isLeapYear method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static boolean isLeapYear(int year)
	 */
	@Test(timeout = 1000)
	public void test_isLeapYear_R86() throws Throwable {

		int year = Integer.MIN_VALUE;

		boolean wupf_result = JpfDateTimeUtil.isLeapYear(year);

		System.out.println("jpf_check:isLeapYear:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));
		assertEquals(true, wupf_result);

	}

	/**
	 * Run the isLeapYear method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static boolean isLeapYear(int year)
	 */
	@Test(timeout = 1000)
	public void test_isLeapYear_R87() throws Throwable {

		int year = 0;

		boolean wupf_result = JpfDateTimeUtil.isLeapYear(year);

		System.out.println("jpf_check:isLeapYear:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));
		assertEquals(true, wupf_result);

	}

	/**
	 * Run the timestampToString method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String timestampToString(Timestamp time,String fmt)
	 */
	@Test(timeout = 1000)
	public void test_timestampToString_R92() throws Throwable {

		Timestamp time = new Timestamp(System.currentTimeMillis());
		String fmt = "";

		String wupf_result = JpfDateTimeUtil.timestampToString(time, fmt);

		System.out.println("jpf_check:timestampToString:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the setTimeToNextDay0H0M0S method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long setTimeToNextDay0H0M0S(Timestamp time)
	 */
	@Test(timeout = 1000)
	public void test_setTimeToNextDay0H0M0S_R97() throws Throwable {

		Timestamp time = new Timestamp(System.currentTimeMillis());
		long wupf_result = JpfDateTimeUtil.setTimeToNextDay0H0M0S(time);

		System.out.println("jpf_check:setTimeToNextDay0H0M0S:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the setTimeToNextDay0H0M0S method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long setTimeToNextDay0H0M0S(long millis)
	 */
	@Test(timeout = 1000)
	public void test_setTimeToNextDay0H0M0S_R100() throws Throwable {

		long millis = Long.MIN_VALUE;

		long wupf_result = JpfDateTimeUtil.setTimeToNextDay0H0M0S(millis);

		System.out.println("jpf_check:setTimeToNextDay0H0M0S:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the setToNextDay0H0M0SExceptToday method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long setToNextDay0H0M0SExceptToday(long millis)
	 */
	@Test(timeout = 1000)
	public void test_setToNextDay0H0M0SExceptToday_R103() throws Throwable {

		long millis = Long.MAX_VALUE;

		long wupf_result = JpfDateTimeUtil.setToNextDay0H0M0SExceptToday(millis);

		System.out.println("jpf_check:setToNextDay0H0M0SExceptToday:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the setToNextDay0H0M0SExceptToday method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long setToNextDay0H0M0SExceptToday(Timestamp stamp)
	 */
	@Test(timeout = 1000)
	public void test_setToNextDay0H0M0SExceptToday_R107() throws Throwable {

		Timestamp stamp = new Timestamp(System.currentTimeMillis());
		long wupf_result = JpfDateTimeUtil.setToNextDay0H0M0SExceptToday(stamp);

		System.out.println("jpf_check:setToNextDay0H0M0SExceptToday:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the setTimeTo0H0M0S method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long setTimeTo0H0M0S(Timestamp time)
	 */
	@Test(timeout = 1000)
	public void test_setTimeTo0H0M0S_R109() throws Throwable {

		Timestamp time = new Timestamp(System.currentTimeMillis());
		long wupf_result = JpfDateTimeUtil.setTimeTo0H0M0S(time);

		System.out.println("jpf_check:setTimeTo0H0M0S:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the setTimeTo0H0M0S method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long setTimeTo0H0M0S(long millis)
	 */
	@Test(timeout = 1000)
	public void test_setTimeTo0H0M0S_R111() throws Throwable {

		long millis = Long.MAX_VALUE;

		long wupf_result = JpfDateTimeUtil.setTimeTo0H0M0S(millis);

		System.out.println("jpf_check:setTimeTo0H0M0S:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the setTimeToLastDay0H0M0S method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static void setTimeToLastDay0H0M0S(Timestamp time)
	 */
	@Test(timeout = 1000)
	public void test_setTimeToLastDay0H0M0S_R115() throws Throwable {

		Timestamp time = new Timestamp(System.currentTimeMillis());
		JpfDateTimeUtil.setTimeToLastDay0H0M0S(time);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the isDifferentDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static boolean isDifferentDay(Calendar calendar1,Calendar
	 *      calendar2)
	 */
	@Test(timeout = 1000)
	public void test_isDifferentDay_R117() throws Throwable {

		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		boolean wupf_result = JpfDateTimeUtil.isDifferentDay(calendar1, calendar2);

		System.out.println("jpf_check:isDifferentDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));
		assertEquals(false, wupf_result);

	}

	/**
	 * Run the isDifferentDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static boolean isDifferentDay(Timestamp timestamp0,Timestamp
	 *      timestamp1)
	 */
	@Test(timeout = 1000)
	public void test_isDifferentDay_R119() throws Throwable {

		Timestamp timestamp0 = new Timestamp(System.currentTimeMillis());
		Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
		boolean wupf_result = JpfDateTimeUtil.isDifferentDay(timestamp0, timestamp1);

		System.out.println("jpf_check:isDifferentDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));
		assertEquals(false, wupf_result);

	}

	/**
	 * Run the isDifferentDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static boolean isDifferentDay(long millis0,long millis1)
	 */
	@Test(timeout = 1000)
	public void test_isDifferentDay_R122() throws Throwable {

		long millis0 = Long.MAX_VALUE;
		long millis1 = Long.MIN_VALUE;

		boolean wupf_result = JpfDateTimeUtil.isDifferentDay(millis0, millis1);

		System.out.println("jpf_check:isDifferentDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));
		assertEquals(true, wupf_result);

	}

	/**
	 * Run the long2Str method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String long2Str(long millSec,String format)
	 */
	@Test(timeout = 1000)
	public void test_long2Str_R137() throws Throwable {

		long millSec = Long.MAX_VALUE;
		String format = "";

		String wupf_result = JpfDateTimeUtil.long2Str(millSec, format);

		System.out.println("jpf_check:long2Str:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the strToLong method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long strToLong(String dateFormat,String strDate)
	 */
	@Test(timeout = 1000)
	public void test_strToLong_R161() throws Throwable {

		String dateFormat = "abc123";
		String strDate = null;

		long wupf_result = JpfDateTimeUtil.strToLong(dateFormat, strDate);

		System.out.println("jpf_check:strToLong:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the todayPastMillisecond method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long todayPastMillisecond(long millions)
	 */
	@Test(timeout = 1000)
	public void test_todayPastMillisecond_R173() throws Throwable {

		long millions = Long.MAX_VALUE;

		long wupf_result = JpfDateTimeUtil.todayPastMillisecond(millions);

		System.out.println("jpf_check:todayPastMillisecond:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getCurrentMonthDays method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static int getCurrentMonthDays()
	 */
	@Test(timeout = 1000)
	public void test_getCurrentMonthDays_NP176() throws Throwable {

		int wupf_result = JpfDateTimeUtil.getCurrentMonthDays();

		System.out.println("jpf_check:getCurrentMonthDays:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getCurrentMonthDays method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static int getCurrentMonthDays(Timestamp stamp)
	 */
	@Test(timeout = 1000)
	public void test_getCurrentMonthDays_R178() throws Throwable {

		Timestamp stamp = new Timestamp(System.currentTimeMillis());
		int wupf_result = JpfDateTimeUtil.getCurrentMonthDays(stamp);

		System.out.println("jpf_check:getCurrentMonthDays:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getCurrentMonthDays method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static int getCurrentMonthDays(long ms)
	 */
	@Test(timeout = 1000)
	public void test_getCurrentMonthDays_R180() throws Throwable {

		long ms = Long.MAX_VALUE;

		int wupf_result = JpfDateTimeUtil.getCurrentMonthDays(ms);

		System.out.println("jpf_check:getCurrentMonthDays:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getCurrentMonthDays method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static int getCurrentMonthDays(Calendar cal)
	 */
	@Test(timeout = 1000)
	public void test_getCurrentMonthDays_R184() throws Throwable {

		Calendar cal = Calendar.getInstance();
		int wupf_result = JpfDateTimeUtil.getCurrentMonthDays(cal);

		System.out.println("jpf_check:getCurrentMonthDays:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFirstDayOfCurrentWeek method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long getFirstDayOfCurrentWeek(Timestamp stamp)
	 */
	@Test(timeout = 1000)
	public void test_getFirstDayOfCurrentWeek_R186() throws Throwable {

		Timestamp stamp = new Timestamp(System.currentTimeMillis());
		long wupf_result = JpfDateTimeUtil.getFirstDayOfCurrentWeek(stamp);

		System.out.println("jpf_check:getFirstDayOfCurrentWeek:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFirstDayOfCurrentWeek method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long getFirstDayOfCurrentWeek(long ms)
	 */
	@Test(timeout = 1000)
	public void test_getFirstDayOfCurrentWeek_R188() throws Throwable {

		long ms = Long.MAX_VALUE;

		long wupf_result = JpfDateTimeUtil.getFirstDayOfCurrentWeek(ms);

		System.out.println("jpf_check:getFirstDayOfCurrentWeek:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFirstDayOfCurrentWeek method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long getFirstDayOfCurrentWeek(long ms)
	 */
	@Test(timeout = 1000)
	public void test_getFirstDayOfCurrentWeek_R190() throws Throwable {

		long ms = 0L;

		long wupf_result = JpfDateTimeUtil.getFirstDayOfCurrentWeek(ms);

		System.out.println("jpf_check:getFirstDayOfCurrentWeek:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the setToFirstDayOfCurrentYear method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long setToFirstDayOfCurrentYear(long millis)
	 */
	@Test(timeout = 1000)
	public void test_setToFirstDayOfCurrentYear_R192() throws Throwable {

		long millis = Long.MAX_VALUE;

		long wupf_result = JpfDateTimeUtil.setToFirstDayOfCurrentYear(millis);

		System.out.println("jpf_check:setToFirstDayOfCurrentYear:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the setToFirstDayOfLastMonth method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long setToFirstDayOfLastMonth(long ms)
	 */
	@Test(timeout = 1000)
	public void test_setToFirstDayOfLastMonth_R200() throws Throwable {

		long ms = Long.MAX_VALUE;

		long wupf_result = JpfDateTimeUtil.setToFirstDayOfLastMonth(ms);

		System.out.println("jpf_check:setToFirstDayOfLastMonth:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the setToFirstDayOfCurrentMonth method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long setToFirstDayOfCurrentMonth(long millis)
	 */
	@Test(timeout = 1000)
	public void test_setToFirstDayOfCurrentMonth_R208() throws Throwable {

		long millis = Long.MAX_VALUE;

		long wupf_result = JpfDateTimeUtil.setToFirstDayOfCurrentMonth(millis);

		System.out.println("jpf_check:setToFirstDayOfCurrentMonth:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the setToFirstDayOfNextMonth method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long setToFirstDayOfNextMonth(long millis)
	 */
	@Test(timeout = 1000)
	public void test_setToFirstDayOfNextMonth_R212() throws Throwable {

		long millis = Long.MAX_VALUE;

		long wupf_result = JpfDateTimeUtil.setToFirstDayOfNextMonth(millis);

		System.out.println("jpf_check:setToFirstDayOfNextMonth:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the setToNextYearCommonDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long setToNextYearCommonDay(long millis)
	 */
	@Test(timeout = 1000)
	public void test_setToNextYearCommonDay_R216() throws Throwable {

		long millis = Long.MAX_VALUE;

		long wupf_result = JpfDateTimeUtil.setToNextYearCommonDay(millis);

		System.out.println("jpf_check:setToNextYearCommonDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the setToLastYearCommonDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long setToLastYearCommonDay(long millis)
	 */
	@Test(timeout = 1000)
	public void test_setToLastYearCommonDay_R220() throws Throwable {

		long millis = Long.MAX_VALUE;

		long wupf_result = JpfDateTimeUtil.setToLastYearCommonDay(millis);

		System.out.println("jpf_check:setToLastYearCommonDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getLastDayOfCurrentWeek method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long getLastDayOfCurrentWeek(Timestamp stamp)
	 */
	@Test(timeout = 1000)
	public void test_getLastDayOfCurrentWeek_R224() throws Throwable {

		Timestamp stamp = new Timestamp(System.currentTimeMillis());
		long wupf_result = JpfDateTimeUtil.getLastDayOfCurrentWeek(stamp);

		System.out.println("jpf_check:getLastDayOfCurrentWeek:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFirstDayOfCurrentQuarter method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long getFirstDayOfCurrentQuarter(long ms)
	 */
	@Test(timeout = 1000)
	public void test_getFirstDayOfCurrentQuarter_R226() throws Throwable {

		long ms = Long.MAX_VALUE;

		long wupf_result = JpfDateTimeUtil.getFirstDayOfCurrentQuarter(ms);

		System.out.println("jpf_check:getFirstDayOfCurrentQuarter:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFirstDayOfCurrentQuarter method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long getFirstDayOfCurrentQuarter(long ms)
	 */
	@Test(timeout = 1000)
	public void test_getFirstDayOfCurrentQuarter_R227() throws Throwable {

		long ms = Long.MIN_VALUE;

		long wupf_result = JpfDateTimeUtil.getFirstDayOfCurrentQuarter(ms);

		System.out.println("jpf_check:getFirstDayOfCurrentQuarter:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFirstDayOfCurrentQuarter method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long getFirstDayOfCurrentQuarter(long ms)
	 */
	@Test(timeout = 1000)
	public void test_getFirstDayOfCurrentQuarter_R228() throws Throwable {

		long ms = 0L;

		long wupf_result = JpfDateTimeUtil.getFirstDayOfCurrentQuarter(ms);

		System.out.println("jpf_check:getFirstDayOfCurrentQuarter:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFirstDayOfNextQuarter method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long getFirstDayOfNextQuarter(long ms)
	 */
	@Test(timeout = 1000)
	public void test_getFirstDayOfNextQuarter_R230() throws Throwable {

		long ms = Long.MAX_VALUE;

		long wupf_result = JpfDateTimeUtil.getFirstDayOfNextQuarter(ms);

		System.out.println("jpf_check:getFirstDayOfNextQuarter:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFirstDayOfNextQuarter method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long getFirstDayOfNextQuarter(long ms)
	 */
	@Test(timeout = 1000)
	public void test_getFirstDayOfNextQuarter_R231() throws Throwable {

		long ms = Long.MIN_VALUE;

		long wupf_result = JpfDateTimeUtil.getFirstDayOfNextQuarter(ms);

		System.out.println("jpf_check:getFirstDayOfNextQuarter:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFirstDayOfNextQuarter method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long getFirstDayOfNextQuarter(long ms)
	 */
	@Test(timeout = 1000)
	public void test_getFirstDayOfNextQuarter_R232() throws Throwable {

		long ms = 0L;

		long wupf_result = JpfDateTimeUtil.getFirstDayOfNextQuarter(ms);

		System.out.println("jpf_check:getFirstDayOfNextQuarter:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDayOfWeek method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static int getDayOfWeek(long ms)
	 */
	@Test(timeout = 1000)
	public void test_getDayOfWeek_R234() throws Throwable {

		long ms = Long.MAX_VALUE;

		int wupf_result = JpfDateTimeUtil.getDayOfWeek(ms);

		System.out.println("jpf_check:getDayOfWeek:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDayOfWeek method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static int getDayOfWeek(long ms)
	 */
	@Test(timeout = 1000)
	public void test_getDayOfWeek_R235() throws Throwable {

		long ms = Long.MIN_VALUE;

		int wupf_result = JpfDateTimeUtil.getDayOfWeek(ms);

		System.out.println("jpf_check:getDayOfWeek:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the create0H0M0STime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long create0H0M0STime()
	 */
	@Test(timeout = 1000)
	public void test_create0H0M0STime_NP237() throws Throwable {

		long wupf_result = JpfDateTimeUtil.create0H0M0STime();

		System.out.println("jpf_check:create0H0M0STime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the friendlyTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String friendlyTime(long ms)
	 */
	@Test(timeout = 1000)
	public void test_friendlyTime_R243() throws Throwable {

		long ms = Long.MAX_VALUE;

		String wupf_result = JpfDateTimeUtil.friendlyTime(ms);

		System.out.println("jpf_check:friendlyTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the friendlyTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String friendlyTime(long ms)
	 */
	@Test(timeout = 1000)
	public void test_friendlyTime_R244() throws Throwable {

		long ms = Long.MIN_VALUE;

		String wupf_result = JpfDateTimeUtil.friendlyTime(ms);

		System.out.println("jpf_check:friendlyTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getWeeks method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static int getWeeks(long startTime,long endTime)
	 */
	@Test(timeout = 1000)
	public void test_getWeeks_R246() throws Throwable {

		long startTime = Long.MAX_VALUE;
		long endTime = Long.MAX_VALUE;

		int wupf_result = JpfDateTimeUtil.getWeeks(startTime, endTime);

		System.out.println("jpf_check:getWeeks:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateWithWeek method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getDateWithWeek(long ms)
	 */
	@Test(timeout = 1000)
	public void test_getDateWithWeek_R255() throws Throwable {

		long ms = Long.MAX_VALUE;

		String wupf_result = JpfDateTimeUtil.getDateWithWeek(ms);

		System.out.println("jpf_check:getDateWithWeek:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateWithWeekAndTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getDateWithWeekAndTime(long ms)
	 */
	@Test(timeout = 1000)
	public void test_getDateWithWeekAndTime_R258() throws Throwable {

		long ms = Long.MAX_VALUE;

		String wupf_result = JpfDateTimeUtil.getDateWithWeekAndTime(ms);

		System.out.println("jpf_check:getDateWithWeekAndTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getAge method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static int getAge(long ms)
	 */
	@Test(timeout = 1000)
	public void test_getAge_R263() throws Throwable {

		long ms = Long.MIN_VALUE;

		int wupf_result = JpfDateTimeUtil.getAge(ms);

		System.out.println("jpf_check:getAge:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getAge method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static int getAge(long ms)
	 */
	@Test(timeout = 1000)
	public void test_getAge_R264() throws Throwable {

		long ms = 0L;

		int wupf_result = JpfDateTimeUtil.getAge(ms);

		System.out.println("jpf_check:getAge:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getLastMonthCommonDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getLastMonthCommonDay(String strDate,String format)
	 *      throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getLastMonthCommonDay_Doc278() throws Throwable {

		try {

			String strDate = JSON.parseObject("strDate", String.class);
			String format = JSON.parseObject("time format", String.class);

			String wupf_result = JpfDateTimeUtil.getLastMonthCommonDay(strDate, format);

			String expected_result = JSON.parseObject("String", String.class);
			System.out.println(wupf_result);
			assertEquals(wupf_result, expected_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getLastMonthCommonDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getLastMonthCommonDay(String strDate,String format)
	 *      throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getLastMonthCommonDay_R279() throws Throwable {

		try {

			String strDate = "abc123";
			String format = "abc123";

			String wupf_result = JpfDateTimeUtil.getLastMonthCommonDay(strDate, format);

			System.out.println("jpf_check:getLastMonthCommonDay:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getLastMonthCommonDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getLastMonthCommonDay(String strDate,String format)
	 *      throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getLastMonthCommonDay_R280() throws Throwable {

		try {

			String strDate = "abc123";
			String format = null;

			String wupf_result = JpfDateTimeUtil.getLastMonthCommonDay(strDate, format);

			System.out.println("jpf_check:getLastMonthCommonDay:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getLastMonthCommonDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getLastMonthCommonDay(String strDate,String format)
	 *      throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getLastMonthCommonDay_R284() throws Throwable {

		try {

			String strDate = "abc123";
			String format = "娑擃厽鏋�123abc";

			String wupf_result = JpfDateTimeUtil.getLastMonthCommonDay(strDate, format);

			System.out.println("jpf_check:getLastMonthCommonDay:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getLastMonthCommonDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getLastMonthCommonDay(String strDate,String format)
	 *      throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getLastMonthCommonDay_R285() throws Throwable {

		try {

			String strDate = null;
			String format = "abc123";

			String wupf_result = JpfDateTimeUtil.getLastMonthCommonDay(strDate, format);

			System.out.println("jpf_check:getLastMonthCommonDay:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getLastMonthCommonDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getLastMonthCommonDay(String strDate,String format)
	 *      throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getLastMonthCommonDay_R286() throws Throwable {

		try {

			String strDate = null;
			String format = null;

			String wupf_result = JpfDateTimeUtil.getLastMonthCommonDay(strDate, format);

			System.out.println("jpf_check:getLastMonthCommonDay:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getLastMonthCommonDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getLastMonthCommonDay(String strDate,String format)
	 *      throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getLastMonthCommonDay_R287() throws Throwable {

		try {

			String strDate = null;
			String format = "";

			String wupf_result = JpfDateTimeUtil.getLastMonthCommonDay(strDate, format);

			System.out.println("jpf_check:getLastMonthCommonDay:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getLastMonthCommonDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getLastMonthCommonDay(String strDate,String format)
	 *      throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getLastMonthCommonDay_R290() throws Throwable {

		try {

			String strDate = null;
			String format = "娑擃厽鏋�123abc";

			String wupf_result = JpfDateTimeUtil.getLastMonthCommonDay(strDate, format);

			System.out.println("jpf_check:getLastMonthCommonDay:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getBirthdayFormIdCard method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getBirthdayFormIdCard(String idCard) throws
	 *      JpfException
	 */
	@Test(timeout = 1000)
	public void test_getBirthdayFormIdCard_R292() throws Throwable {

		try {

			String idCard = "abc123";

			Timestamp wupf_result = JpfDateTimeUtil.getBirthdayFormIdCard(idCard);

			System.out.println("jpf_check:getBirthdayFormIdCard:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getCurrFormattedDateTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getCurrFormattedDateTime(String strFormatTo)
	 */
	@Test(timeout = 1000)
	public void test_getCurrFormattedDateTime_R304() throws Throwable {

		String strFormatTo = "";

		String wupf_result = JpfDateTimeUtil.getCurrFormattedDateTime(strFormatTo);

		System.out.println("jpf_check:getCurrFormattedDateTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getToday method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getToday()
	 */
	@Test(timeout = 1000)
	public void test_getToday_NP308() throws Throwable {

		String wupf_result = JpfDateTimeUtil.getToday();

		System.out.println("jpf_check:getToday:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getDay(String strFormat,int iDays)
	 */
	@Test(timeout = 1000)
	public void test_getDay_R317() throws Throwable {

		String strFormat = "";
		int iDays = Integer.MAX_VALUE;

		String wupf_result = JpfDateTimeUtil.getDay(strFormat, iDays);

		System.out.println("jpf_check:getDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the addDays method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date addDays(Date date,int days)
	 */
	@Test(timeout = 1000)
	public void test_addDays_R322() throws Throwable {

		Date date = new java.util.Date();
		int days = Integer.MAX_VALUE;

		Date wupf_result = JpfDateTimeUtil.addDays(date, days);

		System.out.println("jpf_check:addDays:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFormattedDateUtil method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getFormattedDateUtil(java.util.Date dtDate,String
	 *      strFormatTo)
	 */
	@Test(timeout = 1000)
	public void test_getFormattedDateUtil_R331() throws Throwable {

		java.util.Date dtDate = new java.util.Date();
		String strFormatTo = "abc123";

		String wupf_result = JpfDateTimeUtil.getFormattedDateUtil(dtDate, strFormatTo);

		System.out.println("jpf_check:getFormattedDateUtil:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFormattedDateUtil method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getFormattedDateUtil(java.util.Date dtDate,String
	 *      strFormatTo)
	 */
	@Test(timeout = 1000)
	public void test_getFormattedDateUtil_R333() throws Throwable {

		java.util.Date dtDate = new java.util.Date();
		String strFormatTo = "";

		String wupf_result = JpfDateTimeUtil.getFormattedDateUtil(dtDate, strFormatTo);

		System.out.println("jpf_check:getFormattedDateUtil:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the addMonths method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String addMonths(int month)
	 */
	@Test(timeout = 1000)
	public void test_addMonths_R344() throws Throwable {

		int month = Integer.MAX_VALUE;

		String wupf_result = JpfDateTimeUtil.addMonths(month);

		System.out.println("jpf_check:addMonths:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the addHours method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date addHours(Date date,int hours)
	 */
	@Test(timeout = 1000)
	public void test_addHours_R348() throws Throwable {

		Date date = new java.util.Date();
		int hours = Integer.MAX_VALUE;

		Date wupf_result = JpfDateTimeUtil.addHours(date, hours);

		System.out.println("jpf_check:addHours:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getCurrDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getCurrDate()
	 */
	@Test(timeout = 1000)
	public void test_getCurrDate_NP369() throws Throwable {

		String wupf_result = JpfDateTimeUtil.getCurrDate();

		System.out.println("jpf_check:getCurrDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFormattedDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getFormattedDate(String strDate)
	 */
	@Test(timeout = 1000)
	public void test_getFormattedDate_R371() throws Throwable {

		String strDate = "abc123";

		String wupf_result = JpfDateTimeUtil.getFormattedDate(strDate);

		System.out.println("jpf_check:getFormattedDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFormattedDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getFormattedDate(String strDate)
	 */
	@Test(timeout = 1000)
	public void test_getFormattedDate_R372() throws Throwable {

		String strDate = null;

		String wupf_result = JpfDateTimeUtil.getFormattedDate(strDate);

		System.out.println("jpf_check:getFormattedDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFormattedDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getFormattedDate(String strDate)
	 */
	@Test(timeout = 1000)
	public void test_getFormattedDate_R373() throws Throwable {

		String strDate = "";

		String wupf_result = JpfDateTimeUtil.getFormattedDate(strDate);

		System.out.println("jpf_check:getFormattedDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFormattedDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getFormattedDate(String strDate)
	 */
	@Test(timeout = 1000)
	public void test_getFormattedDate_R374() throws Throwable {

		String strDate = "123";

		String wupf_result = JpfDateTimeUtil.getFormattedDate(strDate);

		System.out.println("jpf_check:getFormattedDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFormattedDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getFormattedDate(String strDate)
	 */
	@Test(timeout = 1000)
	public void test_getFormattedDate_R376() throws Throwable {

		String strDate = "娑擃厽鏋�123abc";

		String wupf_result = JpfDateTimeUtil.getFormattedDate(strDate);

		System.out.println("jpf_check:getFormattedDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFormattedDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getFormattedDate(java.sql.Timestamp dtDate)
	 */
	@Test(timeout = 1000)
	public void test_getFormattedDate_R377() throws Throwable {

		java.sql.Timestamp dtDate = null;

		String wupf_result = JpfDateTimeUtil.getFormattedDate(dtDate);

		System.out.println("jpf_check:getFormattedDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getCurrDateTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getCurrDateTime()
	 */
	@Test(timeout = 1000)
	public void test_getCurrDateTime_NP379() throws Throwable {

		String wupf_result = JpfDateTimeUtil.getCurrDateTime();

		System.out.println("jpf_check:getCurrDateTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getDateTime(Date dDate)
	 */
	@Test(timeout = 1000)
	public void test_getDateTime_R380() throws Throwable {

		Date dDate = new java.util.Date();
		String wupf_result = JpfDateTimeUtil.getDateTime(dDate);

		System.out.println("jpf_check:getDateTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the isLastWorkDayofMonth method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static boolean isLastWorkDayofMonth(Date date_start) throws
	 *      Exception
	 */
	@Test(timeout = 1000)
	public void test_isLastWorkDayofMonth_R388() throws Throwable {

		try {

			Date date_start = new java.util.Date();
			boolean wupf_result = JpfDateTimeUtil.isLastWorkDayofMonth(date_start);

			System.out.println("jpf_check:isLastWorkDayofMonth:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));
			assertEquals(true, wupf_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the isLastWorkDayofMonth method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static boolean isLastWorkDayofMonth(Date date_start) throws
	 *      Exception
	 */
	@Test(timeout = 1000)
	public void test_isLastWorkDayofMonth_R389() throws Throwable {

		try {

			Date date_start = new java.util.Date(2019);
			boolean wupf_result = JpfDateTimeUtil.isLastWorkDayofMonth(date_start);

			System.out.println("jpf_check:isLastWorkDayofMonth:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));
			assertEquals(true, wupf_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getCurrentHour method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getCurrentHour()
	 */
	@Test(timeout = 1000)
	public void test_getCurrentHour_NP390() throws Throwable {

		String wupf_result = JpfDateTimeUtil.getCurrentHour();

		System.out.println("jpf_check:getCurrentHour:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFormattedDateTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getFormattedDateTime(String strDate)
	 */
	@Test(timeout = 1000)
	public void test_getFormattedDateTime_R391() throws Throwable {

		String strDate = "abc123";

		String wupf_result = JpfDateTimeUtil.getFormattedDateTime(strDate);

		System.out.println("jpf_check:getFormattedDateTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFormattedDateTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getFormattedDateTime(String strDate)
	 */
	@Test(timeout = 1000)
	public void test_getFormattedDateTime_R392() throws Throwable {

		String strDate = null;

		String wupf_result = JpfDateTimeUtil.getFormattedDateTime(strDate);

		System.out.println("jpf_check:getFormattedDateTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getDay(int month)
	 */
	@Test(timeout = 1000)
	public void test_getDay_R397() throws Throwable {

		int month = Integer.MAX_VALUE;

		String wupf_result = JpfDateTimeUtil.getDay(month);

		System.out.println("jpf_check:getDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the compare_date method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static int compare_date(String DATE1,String DATE2)
	 */
	@Test(timeout = 1000)
	public void test_compare_date_R401() throws Throwable {

		String DATE1 = "abc123";
		String DATE2 = "abc123";

		int wupf_result = JpfDateTimeUtil.compare_date(DATE1, DATE2);

		System.out.println("jpf_check:compare_date:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the dateToLong method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long dateToLong(Date date)
	 */
	@Test(timeout = 1000)
	public void test_dateToLong_R413() throws Throwable {

		Date date = new java.util.Date();
		long wupf_result = JpfDateTimeUtil.dateToLong(date);

		System.out.println("jpf_check:dateToLong:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the addSqlDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static java.sql.Date addSqlDate(String strDate,int iDays) throws
	 *      Exception
	 */
	@Test(timeout = 1000)
	public void test_addSqlDate_R451() throws Throwable {

		try {

			String strDate = "abc123";
			int iDays = Integer.MAX_VALUE;

			java.sql.Date wupf_result = JpfDateTimeUtil.addSqlDate(strDate, iDays);

			System.out.println("jpf_check:addSqlDate:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the addMinutes method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date addMinutes(Date date,int minutess)
	 */
	@Test(timeout = 1000)
	public void test_addMinutes_R464() throws Throwable {

		Date date = new java.util.Date();
		int minutess = Integer.MAX_VALUE;

		Date wupf_result = JpfDateTimeUtil.addMinutes(date, minutess);

		System.out.println("jpf_check:addMinutes:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the addMonths method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date addMonths(Date date,int addMonths)
	 */
	@Test(timeout = 1000)
	public void test_addMonths_R480() throws Throwable {

		Date date = new java.util.Date();
		int addMonths = Integer.MAX_VALUE;

		Date wupf_result = JpfDateTimeUtil.addMonths(date, addMonths);

		System.out.println("jpf_check:addMonths:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getMonthLastDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static int getMonthLastDay(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getMonthLastDay_R488() throws Throwable {

		Date date = new java.util.Date();
		int wupf_result = JpfDateTimeUtil.getMonthLastDay(date);

		System.out.println("jpf_check:getMonthLastDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getMonthFirstTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getMonthFirstTime(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getMonthFirstTime_R490() throws Throwable {

		Date date = new java.util.Date();
		Date wupf_result = JpfDateTimeUtil.getMonthFirstTime(date);

		System.out.println("jpf_check:getMonthFirstTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getMonthLastTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getMonthLastTime(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getMonthLastTime_R492() throws Throwable {

		Date date = new java.util.Date();
		Date wupf_result = JpfDateTimeUtil.getMonthLastTime(date);

		System.out.println("jpf_check:getMonthLastTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getWeekFirstTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getWeekFirstTime(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getWeekFirstTime_R494() throws Throwable {

		Date date = new java.util.Date();
		Date wupf_result = JpfDateTimeUtil.getWeekFirstTime(date);

		System.out.println("jpf_check:getWeekFirstTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the date2Str method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String date2Str(Date date,String format)
	 */
	@Test(timeout = 1000)
	public void test_date2Str_R499() throws Throwable {

		Date date = new java.util.Date();
		String format = null;

		String wupf_result = JpfDateTimeUtil.date2Str(date, format);

		System.out.println("jpf_check:date2Str:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the date2Str method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String date2Str(Date date,String format)
	 */
	@Test(timeout = 1000)
	public void test_date2Str_R500() throws Throwable {

		Date date = new java.util.Date();
		String format = "";

		String wupf_result = JpfDateTimeUtil.date2Str(date, format);

		System.out.println("jpf_check:date2Str:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the date2Str method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String date2Str(Date date,String format)
	 */
	@Test(timeout = 1000)
	public void test_date2Str_R501() throws Throwable {

		Date date = new java.util.Date();
		String format = "123";

		String wupf_result = JpfDateTimeUtil.date2Str(date, format);

		System.out.println("jpf_check:date2Str:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the format method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String format(Date date,SimpleDateFormat format)
	 */
	@Test(timeout = 1000)
	public void test_format_R523() throws Throwable {

		Date date = new java.util.Date();
		SimpleDateFormat format = new SimpleDateFormat();

		String wupf_result = JpfDateTimeUtil.format(date, format);

		System.out.println("jpf_check:format:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateStartTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getDateStartTime(Date d,int days)
	 */
	@Test(timeout = 1000)
	public void test_getDateStartTime_R526() throws Throwable {

		Date d = new java.util.Date();
		int days = Integer.MAX_VALUE;

		Date wupf_result = JpfDateTimeUtil.getDateStartTime(d, days);

		System.out.println("jpf_check:getDateStartTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the format method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String format(Date date,String formatText) throws
	 *      Exception
	 */
	@Test(timeout = 1000)
	public void test_format_R534() throws Throwable {

		try {

			Date date = new java.util.Date();
			String formatText = "abc123";

			String wupf_result = JpfDateTimeUtil.format(date, formatText);

			System.out.println("jpf_check:format:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the format method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String format(Date date,String formatText) throws
	 *      Exception
	 */
	@Test(timeout = 1000)
	public void test_format_R535() throws Throwable {

		try {

			Date date = new java.util.Date();
			String formatText = null;

			String wupf_result = JpfDateTimeUtil.format(date, formatText);

			System.out.println("jpf_check:format:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the format method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String format(Date date,String formatText) throws
	 *      Exception
	 */
	@Test(timeout = 1000)
	public void test_format_R539() throws Throwable {

		try {

			Date date = new java.util.Date();
			String formatText = "娑擃厽鏋�123abc";

			String wupf_result = JpfDateTimeUtil.format(date, formatText);

			System.out.println("jpf_check:format:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the format method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String format(Date date,String formatText) throws
	 *      Exception
	 */
	@Test(timeout = 1000)
	public void test_format_R540() throws Throwable {

		try {

			Date date = new java.util.Date(2019);
			String formatText = "abc123";

			String wupf_result = JpfDateTimeUtil.format(date, formatText);

			System.out.println("jpf_check:format:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the format method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String format(Date date,String formatText) throws
	 *      Exception
	 */
	@Test(timeout = 1000)
	public void test_format_R541() throws Throwable {

		try {

			Date date = new java.util.Date(2019);
			String formatText = null;

			String wupf_result = JpfDateTimeUtil.format(date, formatText);

			System.out.println("jpf_check:format:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the format method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String format(Date date,String formatText) throws
	 *      Exception
	 */
	@Test(timeout = 1000)
	public void test_format_R545() throws Throwable {

		try {

			Date date = new java.util.Date(2019);
			String formatText = "娑擃厽鏋�123abc";

			String wupf_result = JpfDateTimeUtil.format(date, formatText);

			System.out.println("jpf_check:format:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getYYYYMMDDHHMMSS method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getYYYYMMDDHHMMSS(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getYYYYMMDDHHMMSS_R546() throws Throwable {

		Date date = new java.util.Date();
		String wupf_result = JpfDateTimeUtil.getYYYYMMDDHHMMSS(date);

		System.out.println("jpf_check:getYYYYMMDDHHMMSS:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getYYMM method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getYYMM(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getYYMM_R549() throws Throwable {

		Date date = new java.util.Date();
		String wupf_result = JpfDateTimeUtil.getYYMM(date);

		System.out.println("jpf_check:getYYMM:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getMonthStart method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getMonthStart(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getMonthStart_R551() throws Throwable {

		Date date = new java.util.Date();
		Date wupf_result = JpfDateTimeUtil.getMonthStart(date);

		System.out.println("jpf_check:getMonthStart:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the DateAddMonth method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp DateAddMonth(Timestamp timest1,int month,int
	 *      day)
	 */
	@Test(timeout = 1000)
	public void test_DateAddMonth_R554() throws Throwable {

		Timestamp timest1 = new Timestamp(System.currentTimeMillis());
		int month = Integer.MAX_VALUE;
		int day = Integer.MAX_VALUE;

		Timestamp wupf_result = JpfDateTimeUtil.DateAddMonth(timest1, month, day);

		System.out.println("jpf_check:DateAddMonth:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the isOverSixAddOneMonth method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static boolean isOverSixAddOneMonth(Date StartDate) throws
	 *      ParseException
	 */
	@Test(timeout = 1000)
	public void test_isOverSixAddOneMonth_R567() throws Throwable {

		try {

			Date StartDate = new java.util.Date();
			boolean wupf_result = JpfDateTimeUtil.isOverSixAddOneMonth(StartDate);

			System.out.println("jpf_check:isOverSixAddOneMonth:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));
			assertEquals(false, wupf_result);

		} catch (ParseException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the isOverSixAddOneMonth method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static boolean isOverSixAddOneMonth(Date StartDate) throws
	 *      ParseException
	 */
	@Test(timeout = 1000)
	public void test_isOverSixAddOneMonth_R568() throws Throwable {

		try {

			Date StartDate = new java.util.Date(2019);
			boolean wupf_result = JpfDateTimeUtil.isOverSixAddOneMonth(StartDate);

			System.out.println("jpf_check:isOverSixAddOneMonth:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));
			assertEquals(true, wupf_result);

		} catch (ParseException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getLastNMonths method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String[] getLastNMonths(int N)
	 */
	@Test(timeout = 1000)
	public void test_getLastNMonths_R625() throws Throwable {

		int N = 0;

		String[] wupf_result = JpfDateTimeUtil.getLastNMonths(N);

		System.out.println("jpf_check:getLastNMonths:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getYYYYMMDDHHMMSSFormat method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getYYYYMMDDHHMMSSFormat(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getYYYYMMDDHHMMSSFormat_R629() throws Throwable {

		Date date = new java.util.Date();
		String wupf_result = JpfDateTimeUtil.getYYYYMMDDHHMMSSFormat(date);

		System.out.println("jpf_check:getYYYYMMDDHHMMSSFormat:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFirstDayThisMonth method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getFirstDayThisMonth() throws ParseException
	 */
	@Test(timeout = 1000)
	public void test_getFirstDayThisMonth_NP631() throws Throwable {

		try {

			Timestamp wupf_result = JpfDateTimeUtil.getFirstDayThisMonth();

			System.out.println("jpf_check:getFirstDayThisMonth:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (ParseException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getLastDayThisMonth method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getLastDayThisMonth() throws ParseException
	 */
	@Test(timeout = 1000)
	public void test_getLastDayThisMonth_NP632() throws Throwable {

		try {

			Timestamp wupf_result = JpfDateTimeUtil.getLastDayThisMonth();

			System.out.println("jpf_check:getLastDayThisMonth:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (ParseException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getFormattedDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getFormattedDate(java.sql.Timestamp dtDate,String
	 *      strFormatTo)
	 */
	@Test(timeout = 1000)
	public void test_getFormattedDate_R640() throws Throwable {

		java.sql.Timestamp dtDate = null;
		String strFormatTo = "abc123";

		String wupf_result = JpfDateTimeUtil.getFormattedDate(dtDate, strFormatTo);

		System.out.println("jpf_check:getFormattedDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the DateDiff method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static int DateDiff(Date date1,Date date2)
	 */
	@Test(timeout = 1000)
	public void test_DateDiff_R652() throws Throwable {

		Date date1 = new java.util.Date();
		Date date2 = new java.util.Date();
		int wupf_result = JpfDateTimeUtil.DateDiff(date1, date2);

		System.out.println("jpf_check:DateDiff:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the DateAddMonth method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp DateAddMonth(Timestamp timest1,int month)
	 */
	@Test(timeout = 1000)
	public void test_DateAddMonth_R656() throws Throwable {

		Timestamp timest1 = new Timestamp(System.currentTimeMillis());
		int month = Integer.MAX_VALUE;

		Timestamp wupf_result = JpfDateTimeUtil.DateAddMonth(timest1, month);

		System.out.println("jpf_check:DateAddMonth:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateAddDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getDateAddDay(Timestamp tsDate,int iDays)
	 */
	@Test(timeout = 1000)
	public void test_getDateAddDay_R672() throws Throwable {

		Timestamp tsDate = new Timestamp(System.currentTimeMillis());
		int iDays = Integer.MAX_VALUE;

		Timestamp wupf_result = JpfDateTimeUtil.getDateAddDay(tsDate, iDays);

		System.out.println("jpf_check:getDateAddDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateAddMinute method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getDateAddMinute(Timestamp dateTime,int minute)
	 */
	@Test(timeout = 1000)
	public void test_getDateAddMinute_R676() throws Throwable {

		Timestamp dateTime = new Timestamp(System.currentTimeMillis());
		int minute = Integer.MAX_VALUE;

		Timestamp wupf_result = JpfDateTimeUtil.getDateAddMinute(dateTime, minute);

		System.out.println("jpf_check:getDateAddMinute:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getTodayYM method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getTodayYM()
	 */
	@Test(timeout = 1000)
	public void test_getTodayYM_NP680() throws Throwable {

		String wupf_result = JpfDateTimeUtil.getTodayYM();

		System.out.println("jpf_check:getTodayYM:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getYesterday method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getYesterday()
	 */
	@Test(timeout = 1000)
	public void test_getYesterday_NP681() throws Throwable {

		String wupf_result = JpfDateTimeUtil.getYesterday();

		System.out.println("jpf_check:getYesterday:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getTomorrow method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getTomorrow()
	 */
	@Test(timeout = 1000)
	public void test_getTomorrow_NP682() throws Throwable {

		String wupf_result = JpfDateTimeUtil.getTomorrow();

		System.out.println("jpf_check:getTomorrow:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getYearMonth method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getYearMonth(java.sql.Timestamp dtDate)
	 */
	@Test(timeout = 1000)
	public void test_getYearMonth_R695() throws Throwable {

		java.sql.Timestamp dtDate = null;

		String wupf_result = JpfDateTimeUtil.getYearMonth(dtDate);

		System.out.println("jpf_check:getYearMonth:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the isValidDataTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static boolean isValidDataTime(String strDate,String strFormat)
	 */
	@Test(timeout = 1000)
	public void test_isValidDataTime_R711() throws Throwable {

		String strDate = "abc123";
		String strFormat = null;

		boolean wupf_result = JpfDateTimeUtil.isValidDataTime(strDate, strFormat);

		System.out.println("jpf_check:isValidDataTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));
		assertEquals(false, wupf_result);

	}

	/**
	 * Run the isValidDataTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static boolean isValidDataTime(String strDate,String strFormat)
	 */
	@Test(timeout = 1000)
	public void test_isValidDataTime_R712() throws Throwable {

		String strDate = "abc123";
		String strFormat = "";

		boolean wupf_result = JpfDateTimeUtil.isValidDataTime(strDate, strFormat);

		System.out.println("jpf_check:isValidDataTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));
		assertEquals(false, wupf_result);

	}

	/**
	 * Run the isValidDataTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static boolean isValidDataTime(String strDate,String strFormat)
	 */
	@Test(timeout = 1000)
	public void test_isValidDataTime_R713() throws Throwable {

		String strDate = "abc123";
		String strFormat = "123";

		boolean wupf_result = JpfDateTimeUtil.isValidDataTime(strDate, strFormat);

		System.out.println("jpf_check:isValidDataTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));
		assertEquals(false, wupf_result);

	}

	/**
	 * Run the isValidDataTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static boolean isValidDataTime(String strDate,String strFormat)
	 */
	@Test(timeout = 1000)
	public void test_isValidDataTime_R716() throws Throwable {

		String strDate = null;
		String strFormat = "abc123";

		boolean wupf_result = JpfDateTimeUtil.isValidDataTime(strDate, strFormat);

		System.out.println("jpf_check:isValidDataTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));
		assertEquals(false, wupf_result);

	}

	/**
	 * Run the getCurrentDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getCurrentDay(int iDays)
	 */
	@Test(timeout = 1000)
	public void test_getCurrentDay_R735() throws Throwable {

		int iDays = Integer.MAX_VALUE;

		String wupf_result = JpfDateTimeUtil.getCurrentDay(iDays);

		System.out.println("jpf_check:getCurrentDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the validateHour method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static void validateHour(int hour)
	 */
	@Test(timeout = 1000)
	public void test_validateHour_R757() throws Throwable {

		int hour = 0;

		JpfDateTimeUtil.validateHour(hour);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the validateMinute method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static void validateMinute(int minute)
	 */
	@Test(timeout = 1000)
	public void test_validateMinute_R761() throws Throwable {

		int minute = 0;

		JpfDateTimeUtil.validateMinute(minute);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the validateSecond method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static void validateSecond(int second)
	 */
	@Test(timeout = 1000)
	public void test_validateSecond_R765() throws Throwable {

		int second = 0;

		JpfDateTimeUtil.validateSecond(second);

		// add check point here, sample: assertEquals(true, wupf_result);

	}

	/**
	 * Run the getWholeYearDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getWholeYearDate(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getWholeYearDate_R779() throws Throwable {

		Date date = new java.util.Date();
		Date wupf_result = JpfDateTimeUtil.getWholeYearDate(date);

		System.out.println("jpf_check:getWholeYearDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getWholeMonthDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getWholeMonthDate(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getWholeMonthDate_R781() throws Throwable {

		Date date = new java.util.Date();
		Date wupf_result = JpfDateTimeUtil.getWholeMonthDate(date);

		System.out.println("jpf_check:getWholeMonthDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getWholeDayDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getWholeDayDate(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getWholeDayDate_R783() throws Throwable {

		Date date = new java.util.Date();
		Date wupf_result = JpfDateTimeUtil.getWholeDayDate(date);

		System.out.println("jpf_check:getWholeDayDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getWholeHourDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getWholeHourDate(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getWholeHourDate_R787() throws Throwable {

		Date date = new java.util.Date();
		Date wupf_result = JpfDateTimeUtil.getWholeHourDate(date);

		System.out.println("jpf_check:getWholeHourDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getWholeMinuteDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getWholeMinuteDate(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getWholeMinuteDate_R791() throws Throwable {

		Date date = new java.util.Date();
		Date wupf_result = JpfDateTimeUtil.getWholeMinuteDate(date);

		System.out.println("jpf_check:getWholeMinuteDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getNextWholeSecondDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getNextWholeSecondDate(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getNextWholeSecondDate_R793() throws Throwable {

		Date date = new java.util.Date();
		Date wupf_result = JpfDateTimeUtil.getNextWholeSecondDate(date);

		System.out.println("jpf_check:getNextWholeSecondDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getWholeSecondDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getWholeSecondDate(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getWholeSecondDate_R795() throws Throwable {

		Date date = new java.util.Date();
		Date wupf_result = JpfDateTimeUtil.getWholeSecondDate(date);

		System.out.println("jpf_check:getWholeSecondDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getAddHourDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getAddHourDate(Date date,int addHour)
	 */
	@Test(timeout = 1000)
	public void test_getAddHourDate_R799() throws Throwable {

		Date date = new java.util.Date();
		int addHour = 0;

		Date wupf_result = JpfDateTimeUtil.getAddHourDate(date, addHour);

		System.out.println("jpf_check:getAddHourDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getAddMinuteDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getAddMinuteDate(Date date,int addMinute)
	 */
	@Test(timeout = 1000)
	public void test_getAddMinuteDate_R807() throws Throwable {

		Date date = new java.util.Date();
		int addMinute = 0;

		Date wupf_result = JpfDateTimeUtil.getAddMinuteDate(date, addMinute);

		System.out.println("jpf_check:getAddMinuteDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getAddSecondDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getAddSecondDate(Date date,int addSecond)
	 */
	@Test(timeout = 1000)
	public void test_getAddSecondDate_R815() throws Throwable {

		Date date = new java.util.Date();
		int addSecond = 0;

		Date wupf_result = JpfDateTimeUtil.getAddSecondDate(date, addSecond);

		System.out.println("jpf_check:getAddSecondDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getAddHourWholeDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getAddHourWholeDate(Date date,int addHour)
	 */
	@Test(timeout = 1000)
	public void test_getAddHourWholeDate_R821() throws Throwable {

		Date date = new java.util.Date();
		int addHour = Integer.MAX_VALUE;

		Date wupf_result = JpfDateTimeUtil.getAddHourWholeDate(date, addHour);

		System.out.println("jpf_check:getAddHourWholeDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getAddHourWholeDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getAddHourWholeDate(Date date,int addHour)
	 */
	@Test(timeout = 1000)
	public void test_getAddHourWholeDate_R823() throws Throwable {

		Date date = new java.util.Date();
		int addHour = 0;

		Date wupf_result = JpfDateTimeUtil.getAddHourWholeDate(date, addHour);

		System.out.println("jpf_check:getAddHourWholeDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getAddMinuteWholeDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getAddMinuteWholeDate(Date date,int addMinute)
	 */
	@Test(timeout = 1000)
	public void test_getAddMinuteWholeDate_R829() throws Throwable {

		Date date = new java.util.Date();
		int addMinute = Integer.MAX_VALUE;

		Date wupf_result = JpfDateTimeUtil.getAddMinuteWholeDate(date, addMinute);

		System.out.println("jpf_check:getAddMinuteWholeDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getAddMinuteWholeDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getAddMinuteWholeDate(Date date,int addMinute)
	 */
	@Test(timeout = 1000)
	public void test_getAddMinuteWholeDate_R831() throws Throwable {

		Date date = new java.util.Date();
		int addMinute = 0;

		Date wupf_result = JpfDateTimeUtil.getAddMinuteWholeDate(date, addMinute);

		System.out.println("jpf_check:getAddMinuteWholeDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getAddSecondWholeDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getAddSecondWholeDate(Date date,int addSecond)
	 */
	@Test(timeout = 1000)
	public void test_getAddSecondWholeDate_R837() throws Throwable {

		Date date = new java.util.Date();
		int addSecond = Integer.MAX_VALUE;

		Date wupf_result = JpfDateTimeUtil.getAddSecondWholeDate(date, addSecond);

		System.out.println("jpf_check:getAddSecondWholeDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getAddSecondWholeDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date getAddSecondWholeDate(Date date,int addSecond)
	 */
	@Test(timeout = 1000)
	public void test_getAddSecondWholeDate_R839() throws Throwable {

		Date date = new java.util.Date();
		int addSecond = 0;

		Date wupf_result = JpfDateTimeUtil.getAddSecondWholeDate(date, addSecond);

		System.out.println("jpf_check:getAddSecondWholeDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the betweenSecond method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long betweenSecond(Date start,Date end)
	 */
	@Test(timeout = 1000)
	public void test_betweenSecond_R895() throws Throwable {

		Date start = new java.util.Date();
		Date end = new java.util.Date();
		long wupf_result = JpfDateTimeUtil.betweenSecond(start, end);

		System.out.println("jpf_check:betweenSecond:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the betweenMinute method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long betweenMinute(Date start,Date end)
	 */
	@Test(timeout = 1000)
	public void test_betweenMinute_R899() throws Throwable {

		Date start = new java.util.Date();
		Date end = new java.util.Date();
		long wupf_result = JpfDateTimeUtil.betweenMinute(start, end);

		System.out.println("jpf_check:betweenMinute:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the betweenHour method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long betweenHour(Date start,Date end)
	 */
	@Test(timeout = 1000)
	public void test_betweenHour_R903() throws Throwable {

		Date start = new java.util.Date();
		Date end = new java.util.Date();
		long wupf_result = JpfDateTimeUtil.betweenHour(start, end);

		System.out.println("jpf_check:betweenHour:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the betweenDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long betweenDay(Date start,Date end)
	 */
	@Test(timeout = 1000)
	public void test_betweenDay_R907() throws Throwable {

		Date start = new java.util.Date();
		Date end = new java.util.Date();
		long wupf_result = JpfDateTimeUtil.betweenDay(start, end);

		System.out.println("jpf_check:betweenDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the dateToTimestamp method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp dateToTimestamp(Date date)
	 */
	@Test(timeout = 1000)
	public void test_dateToTimestamp_R925() throws Throwable {

		Date date = new java.util.Date();
		Timestamp wupf_result = JpfDateTimeUtil.dateToTimestamp(date);

		System.out.println("jpf_check:dateToTimestamp:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDaysByStartDateAndEndDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getDaysByStartDateAndEndDate(Connection
	 *      conn,java.sql.Timestamp start,java.sql.Timestamp end) throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getDaysByStartDateAndEndDate_R927() throws Throwable {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			java.sql.Timestamp start = null;
			java.sql.Timestamp end = null;

			Timestamp wupf_result = JpfDateTimeUtil.getDaysByStartDateAndEndDate(conn, start, end);

			System.out.println("jpf_check:getDaysByStartDateAndEndDate:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getDayOfWeek method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static int getDayOfWeek(Date date) throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getDayOfWeek_R931() throws Throwable {

		try {

			Date date = new java.util.Date();
			int wupf_result = JpfDateTimeUtil.getDayOfWeek(date);

			System.out.println("jpf_check:getDayOfWeek:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getYYYYMMDDHHMMSS method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getYYYYMMDDHHMMSS(Timestamp ts) throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getYYYYMMDDHHMMSS_Doc933() throws Throwable {

		try {

			Timestamp ts = JSON.parseObject("Timestamp", Timestamp.class);

			String wupf_result = JpfDateTimeUtil.getYYYYMMDDHHMMSS(ts);

			String expected_result = JSON.parseObject("String", String.class);
			System.out.println(wupf_result);
			assertEquals(wupf_result, expected_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getYYYYMMDDHHMMSS method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getYYYYMMDDHHMMSS(Timestamp ts,String pattern)
	 *      throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getYYYYMMDDHHMMSS_Doc935() throws Throwable {

		try {

			Timestamp ts = JSON.parseObject("Timestamp", Timestamp.class);
			String pattern = JSON.parseObject("String", String.class);

			String wupf_result = JpfDateTimeUtil.getYYYYMMDDHHMMSS(ts, pattern);

			String expected_result = JSON.parseObject("String", String.class);
			System.out.println(wupf_result);
			assertEquals(wupf_result, expected_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getYYYYMMDDHHMMSS method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getYYYYMMDDHHMMSS(Timestamp ts,String pattern)
	 *      throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getYYYYMMDDHHMMSS_R936() throws Throwable {

		try {

			Timestamp ts = new Timestamp(System.currentTimeMillis());
			String pattern = "abc123";

			String wupf_result = JpfDateTimeUtil.getYYYYMMDDHHMMSS(ts, pattern);

			System.out.println("jpf_check:getYYYYMMDDHHMMSS:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getYYYYMMDDHHMMSS method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getYYYYMMDDHHMMSS(Timestamp ts,String pattern)
	 *      throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getYYYYMMDDHHMMSS_R937() throws Throwable {

		try {

			Timestamp ts = new Timestamp(System.currentTimeMillis());
			String pattern = null;

			String wupf_result = JpfDateTimeUtil.getYYYYMMDDHHMMSS(ts, pattern);

			System.out.println("jpf_check:getYYYYMMDDHHMMSS:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getYYYYMMDDHHMMSS method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getYYYYMMDDHHMMSS(Timestamp ts,String pattern)
	 *      throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getYYYYMMDDHHMMSS_R938() throws Throwable {

		try {

			Timestamp ts = new Timestamp(System.currentTimeMillis());
			String pattern = "";

			String wupf_result = JpfDateTimeUtil.getYYYYMMDDHHMMSS(ts, pattern);

			System.out.println("jpf_check:getYYYYMMDDHHMMSS:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getYYYYMMDDHHMMSS method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getYYYYMMDDHHMMSS(Timestamp ts,String pattern)
	 *      throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getYYYYMMDDHHMMSS_R941() throws Throwable {

		try {

			Timestamp ts = new Timestamp(System.currentTimeMillis());
			String pattern = "娑擃厽鏋�123abc";

			String wupf_result = JpfDateTimeUtil.getYYYYMMDDHHMMSS(ts, pattern);

			System.out.println("jpf_check:getYYYYMMDDHHMMSS:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getTimestampByYYYYMMDDHHMMSS method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getTimestampByYYYYMMDDHHMMSS(String time,String
	 *      pattern) throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getTimestampByYYYYMMDDHHMMSS_Doc942() throws Throwable {

		try {

			String time = JSON.parseObject("String", String.class);
			String pattern = JSON.parseObject("String yyyy-MM-dd HH:mm:ss", String.class);

			Timestamp wupf_result = JpfDateTimeUtil.getTimestampByYYYYMMDDHHMMSS(time, pattern);

			Timestamp expected_result = JSON.parseObject("Timestamp", Timestamp.class);
			System.out.println(wupf_result);
			assertEquals(wupf_result, expected_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the addOrMinusYear method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date addOrMinusYear(long ti,int i) throws Exception
	 */
	@Test(timeout = 1000)
	public void test_addOrMinusYear_Doc955() throws Throwable {

		try {

			long ti = JSON.parseObject("long", long.class);
			int i = JSON.parseObject("int", int.class);

			Date wupf_result = JpfDateTimeUtil.addOrMinusYear(ti, i);

			Date expected_result = JSON.parseObject("Date", Date.class);
			System.out.println(wupf_result);
			assertEquals(wupf_result, expected_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the addOrMinusYear method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date addOrMinusYear(long ti,int i) throws Exception
	 */
	@Test(timeout = 1000)
	public void test_addOrMinusYear_R956() throws Throwable {

		try {

			long ti = Long.MAX_VALUE;
			int i = Integer.MAX_VALUE;

			Date wupf_result = JpfDateTimeUtil.addOrMinusYear(ti, i);

			System.out.println("jpf_check:addOrMinusYear:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the addOrMinusMonth method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date addOrMinusMonth(long ti,int i) throws Exception
	 */
	@Test(timeout = 1000)
	public void test_addOrMinusMonth_Doc968() throws Throwable {

		try {

			long ti = JSON.parseObject("long", long.class);
			int i = JSON.parseObject("int", int.class);

			Date wupf_result = JpfDateTimeUtil.addOrMinusMonth(ti, i);

			Date expected_result = JSON.parseObject("Date", Date.class);
			System.out.println(wupf_result);
			assertEquals(wupf_result, expected_result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the addOrMinusMonth method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date addOrMinusMonth(long ti,int i) throws Exception
	 */
	@Test(timeout = 1000)
	public void test_addOrMinusMonth_R969() throws Throwable {

		try {

			long ti = Long.MAX_VALUE;
			int i = Integer.MAX_VALUE;

			Date wupf_result = JpfDateTimeUtil.addOrMinusMonth(ti, i);

			System.out.println("jpf_check:addOrMinusMonth:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the addOrMinusDays method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date addOrMinusDays(long ti,int i)
	 */
	@Test(timeout = 1000)
	public void test_addOrMinusDays_R1000() throws Throwable {

		long ti = Long.MIN_VALUE;
		int i = Integer.MIN_VALUE;

		Date wupf_result = JpfDateTimeUtil.addOrMinusDays(ti, i);

		System.out.println("jpf_check:addOrMinusDays:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the addOrMinusSecond method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date addOrMinusSecond(long ti,int i)
	 */
	@Test(timeout = 1000)
	public void test_addOrMinusSecond_R1034() throws Throwable {

		long ti = Long.MAX_VALUE;
		int i = Integer.MAX_VALUE;

		Date wupf_result = JpfDateTimeUtil.addOrMinusSecond(ti, i);

		System.out.println("jpf_check:addOrMinusSecond:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateOfNextMonthFirstDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getDateOfNextMonthFirstDay(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getDateOfNextMonthFirstDay_R1046() throws Throwable {

		Date date = new java.util.Date();
		Timestamp wupf_result = JpfDateTimeUtil.getDateOfNextMonthFirstDay(date);

		System.out.println("jpf_check:getDateOfNextMonthFirstDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateOfPreMonthFirstDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getDateOfPreMonthFirstDay(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getDateOfPreMonthFirstDay_R1048() throws Throwable {

		Date date = new java.util.Date();
		Timestamp wupf_result = JpfDateTimeUtil.getDateOfPreMonthFirstDay(date);

		System.out.println("jpf_check:getDateOfPreMonthFirstDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the formatDateTimeToDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp formatDateTimeToDate(Date date)
	 */
	@Test(timeout = 1000)
	public void test_formatDateTimeToDate_R1050() throws Throwable {

		Date date = new java.util.Date();
		Timestamp wupf_result = JpfDateTimeUtil.formatDateTimeToDate(date);

		System.out.println("jpf_check:formatDateTimeToDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getformatDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getformatDate()
	 */
	@Test(timeout = 1000)
	public void test_getformatDate_NP1052() throws Throwable {

		String wupf_result = JpfDateTimeUtil.getformatDate();

		System.out.println("jpf_check:getformatDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateOfCurrentMonthEndDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getDateOfCurrentMonthEndDay(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getDateOfCurrentMonthEndDay_R1053() throws Throwable {

		Date date = new java.util.Date();
		Timestamp wupf_result = JpfDateTimeUtil.getDateOfCurrentMonthEndDay(date);

		System.out.println("jpf_check:getDateOfCurrentMonthEndDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getLastDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getLastDate(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getLastDate_R1055() throws Throwable {

		Date date = new java.util.Date();
		Timestamp wupf_result = JpfDateTimeUtil.getLastDate(date);

		System.out.println("jpf_check:getLastDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getLastHour method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getLastHour(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getLastHour_R1057() throws Throwable {

		Date date = new java.util.Date();
		Timestamp wupf_result = JpfDateTimeUtil.getLastHour(date);

		System.out.println("jpf_check:getLastHour:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getLastDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getLastDay(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getLastDay_R1059() throws Throwable {

		Date date = new java.util.Date();
		Timestamp wupf_result = JpfDateTimeUtil.getLastDay(date);

		System.out.println("jpf_check:getLastDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getPreLastDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getPreLastDate(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getPreLastDate_R1061() throws Throwable {

		Date date = new java.util.Date();
		Timestamp wupf_result = JpfDateTimeUtil.getPreLastDate(date);

		System.out.println("jpf_check:getPreLastDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getNextDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getNextDay(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getNextDay_R1063() throws Throwable {

		Date date = new java.util.Date();
		Timestamp wupf_result = JpfDateTimeUtil.getNextDay(date);

		System.out.println("jpf_check:getNextDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getDay(Date date,int i)
	 */
	@Test(timeout = 1000)
	public void test_getDay_R1065() throws Throwable {

		Date date = new java.util.Date();
		int i = Integer.MAX_VALUE;

		Timestamp wupf_result = JpfDateTimeUtil.getDay(date, i);

		System.out.println("jpf_check:getDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getYYYYMMDD method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getYYYYMMDD(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getYYYYMMDD_R1073() throws Throwable {

		Date date = new java.util.Date();
		String wupf_result = JpfDateTimeUtil.getYYYYMMDD(date);

		System.out.println("jpf_check:getYYYYMMDD:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getNoLineYYYYMMDD method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getNoLineYYYYMMDD(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getNoLineYYYYMMDD_R1075() throws Throwable {

		Date date = new java.util.Date();
		String wupf_result = JpfDateTimeUtil.getNoLineYYYYMMDD(date);

		System.out.println("jpf_check:getNoLineYYYYMMDD:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getBillMonthDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getBillMonthDate(Date beginDate,Date endDate)
	 */
	@Test(timeout = 1000)
	public void test_getBillMonthDate_R1077() throws Throwable {

		Date beginDate = new java.util.Date();
		Date endDate = new java.util.Date();
		Timestamp wupf_result = JpfDateTimeUtil.getBillMonthDate(beginDate, endDate);

		System.out.println("jpf_check:getBillMonthDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getHHMMSSSecond method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long getHHMMSSSecond(String HHmmss) throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getHHMMSSSecond_R1082() throws Throwable {

		try {

			String HHmmss = null;

			long wupf_result = JpfDateTimeUtil.getHHMMSSSecond(HHmmss);

			System.out.println("jpf_check:getHHMMSSSecond:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getHHMMSSSecond method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static long getHHMMSSSecond(String HHmmss) throws Exception
	 */
	@Test(timeout = 1000)
	public void test_getHHMMSSSecond_R1084() throws Throwable {

		try {

			String HHmmss = "123";

			long wupf_result = JpfDateTimeUtil.getHHMMSSSecond(HHmmss);

			System.out.println("jpf_check:getHHMMSSSecond:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getTruncDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getTruncDate(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getTruncDate_R1087() throws Throwable {

		Date date = new java.util.Date();
		Timestamp wupf_result = JpfDateTimeUtil.getTruncDate(date);

		System.out.println("jpf_check:getTruncDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateOfMonthFirstDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getDateOfMonthFirstDay(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getDateOfMonthFirstDay_R1089() throws Throwable {

		Date date = new java.util.Date();
		Timestamp wupf_result = JpfDateTimeUtil.getDateOfMonthFirstDay(date);

		System.out.println("jpf_check:getDateOfMonthFirstDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateOfCurrentEndDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getDateOfCurrentEndDay(Date date)
	 */
	@Test(timeout = 1000)
	public void test_getDateOfCurrentEndDay_R1091() throws Throwable {

		Date date = new java.util.Date();
		Timestamp wupf_result = JpfDateTimeUtil.getDateOfCurrentEndDay(date);

		System.out.println("jpf_check:getDateOfCurrentEndDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFormattedDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getFormattedDate(String strDate,String strFormatTo)
	 */
	@Test(timeout = 1000)
	public void test_getFormattedDate_R1114() throws Throwable {

		String strDate = "abc123";
		String strFormatTo = "abc123";

		String wupf_result = JpfDateTimeUtil.getFormattedDate(strDate, strFormatTo);

		System.out.println("jpf_check:getFormattedDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getFormattedDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getFormattedDate(String strDate,String strFormatTo)
	 */
	@Test(timeout = 1000)
	public void test_getFormattedDate_R1120() throws Throwable {

		String strDate = null;
		String strFormatTo = "abc123";

		String wupf_result = JpfDateTimeUtil.getFormattedDate(strDate, strFormatTo);

		System.out.println("jpf_check:getFormattedDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateByString method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static java.sql.Timestamp getDateByString(String strDate)
	 */
	@Test(timeout = 1000)
	public void test_getDateByString_R1127() throws Throwable {

		String strDate = "abc123";

		java.sql.Timestamp wupf_result = JpfDateTimeUtil.getDateByString(strDate);

		System.out.println("jpf_check:getDateByString:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateByString method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static java.sql.Timestamp getDateByString(String strDate)
	 */
	@Test(timeout = 1000)
	public void test_getDateByString_R1130() throws Throwable {

		String strDate = "123";

		java.sql.Timestamp wupf_result = JpfDateTimeUtil.getDateByString(strDate);

		System.out.println("jpf_check:getDateByString:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateByString method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static java.sql.Timestamp getDateByString(String strDate)
	 */
	@Test(timeout = 1000)
	public void test_getDateByString_R1132() throws Throwable {

		String strDate = "娑擃厽鏋�123abc";

		java.sql.Timestamp wupf_result = JpfDateTimeUtil.getDateByString(strDate);

		System.out.println("jpf_check:getDateByString:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getCurrDateTime_yyyymmddhhmmss method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getCurrDateTime_yyyymmddhhmmss()
	 */
	@Test(timeout = 1000)
	public void test_getCurrDateTime_yyyymmddhhmmss_NP1133() throws Throwable {

		String wupf_result = JpfDateTimeUtil.getCurrDateTime_yyyymmddhhmmss();

		System.out.println("jpf_check:getCurrDateTime_yyyymmddhhmmss:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the DateAddDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp DateAddDay(Timestamp timest1,int day)
	 */
	@Test(timeout = 1000)
	public void test_DateAddDay_R1134() throws Throwable {

		Timestamp timest1 = new Timestamp(System.currentTimeMillis());
		int day = Integer.MAX_VALUE;

		Timestamp wupf_result = JpfDateTimeUtil.DateAddDay(timest1, day);

		System.out.println("jpf_check:DateAddDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getYear method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getYear(int year)
	 */
	@Test(timeout = 1000)
	public void test_getYear_R1138() throws Throwable {

		int year = Integer.MAX_VALUE;

		String wupf_result = JpfDateTimeUtil.getYear(year);

		System.out.println("jpf_check:getYear:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getToday method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getToday(String format)
	 */
	@Test(timeout = 1000)
	public void test_getToday_R1144() throws Throwable {

		String format = "";

		String wupf_result = JpfDateTimeUtil.getToday(format);

		System.out.println("jpf_check:getToday:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateForNeed method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getDateForNeed(long min)
	 */
	@Test(timeout = 1000)
	public void test_getDateForNeed_R1148() throws Throwable {

		long min = Long.MAX_VALUE;

		String wupf_result = JpfDateTimeUtil.getDateForNeed(min);

		System.out.println("jpf_check:getDateForNeed:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getCurrentYearMonth method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getCurrentYearMonth()
	 */
	@Test(timeout = 1000)
	public void test_getCurrentYearMonth_NP1151() throws Throwable {

		String wupf_result = JpfDateTimeUtil.getCurrentYearMonth();

		System.out.println("jpf_check:getCurrentYearMonth:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateBeforeMonths method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getDateBeforeMonths(int iMonth,String strFormat)
	 */
	@Test(timeout = 1000)
	public void test_getDateBeforeMonths_R1154() throws Throwable {

		int iMonth = Integer.MAX_VALUE;
		String strFormat = "";

		String wupf_result = JpfDateTimeUtil.getDateBeforeMonths(iMonth, strFormat);

		System.out.println("jpf_check:getDateBeforeMonths:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getRBossQryStartDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getRBossQryStartDate(String inputDate)
	 */
	@Test(timeout = 1000)
	public void test_getRBossQryStartDate_R1165() throws Throwable {

		String inputDate = "abc123";

		String wupf_result = JpfDateTimeUtil.getRBossQryStartDate(inputDate);

		System.out.println("jpf_check:getRBossQryStartDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getRBossQryStartDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getRBossQryStartDate(Timestamp inputDate)
	 */
	@Test(timeout = 1000)
	public void test_getRBossQryStartDate_R1171() throws Throwable {

		Timestamp inputDate = new Timestamp(System.currentTimeMillis());
		Timestamp wupf_result = JpfDateTimeUtil.getRBossQryStartDate(inputDate);

		System.out.println("jpf_check:getRBossQryStartDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getRBossQryStartDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getRBossQryStartDate(String inputDate,int two)
	 */
	@Test(timeout = 1000)
	public void test_getRBossQryStartDate_R1172() throws Throwable {

		String inputDate = "abc123";
		int two = Integer.MAX_VALUE;

		String wupf_result = JpfDateTimeUtil.getRBossQryStartDate(inputDate, two);

		System.out.println("jpf_check:getRBossQryStartDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getNextMonthFirstDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getNextMonthFirstDay(int month)
	 */
	@Test(timeout = 1000)
	public void test_getNextMonthFirstDay_R1184() throws Throwable {

		int month = Integer.MAX_VALUE;

		Timestamp wupf_result = JpfDateTimeUtil.getNextMonthFirstDay(month);

		System.out.println("jpf_check:getNextMonthFirstDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getNextMonthFirstDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getNextMonthFirstDay(Date date,int month)
	 */
	@Test(timeout = 1000)
	public void test_getNextMonthFirstDay_R1188() throws Throwable {

		Date date = new java.util.Date();
		int month = Integer.MAX_VALUE;

		Timestamp wupf_result = JpfDateTimeUtil.getNextMonthFirstDay(date, month);

		System.out.println("jpf_check:getNextMonthFirstDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getMaxOrderDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp getMaxOrderDate()
	 */
	@Test(timeout = 1000)
	public void test_getMaxOrderDate_NP1196() throws Throwable {

		Timestamp wupf_result = JpfDateTimeUtil.getMaxOrderDate();

		System.out.println("jpf_check:getMaxOrderDate:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static int getDay(Timestamp tx)
	 */
	@Test(timeout = 1000)
	public void test_getDay_R1198() throws Throwable {

		Timestamp tx = new Timestamp(System.currentTimeMillis());
		int wupf_result = JpfDateTimeUtil.getDay(tx);

		System.out.println("jpf_check:getDay:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getStringDate method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getStringDate(Date date,String strFormat) throws
	 *      ParseException
	 */
	@Test(timeout = 1000)
	public void test_getStringDate_R1249() throws Throwable {

		try {

			Date date = new java.util.Date();
			String strFormat = "";

			String wupf_result = JpfDateTimeUtil.getStringDate(date, strFormat);

			System.out.println("jpf_check:getStringDate:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (ParseException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the getStringTimestamp method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getStringTimestamp(Timestamp timestamp,String
	 *      strFormat) throws ParseException
	 */
	@Test(timeout = 1000)
	public void test_getStringTimestamp_R1261() throws Throwable {

		try {

			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			String strFormat = "";

			String wupf_result = JpfDateTimeUtil.getStringTimestamp(timestamp, strFormat);

			System.out.println("jpf_check:getStringTimestamp:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (ParseException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the addYear method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp addYear(Timestamp timestamp,int years) throws
	 *      ParseException
	 */
	@Test(timeout = 1000)
	public void test_addYear_R1269() throws Throwable {

		try {

			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			int years = Integer.MAX_VALUE;

			Timestamp wupf_result = JpfDateTimeUtil.addYear(timestamp, years);

			System.out.println("jpf_check:addYear:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (ParseException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the addDay method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp addDay(Timestamp timestamp,int days) throws
	 *      ParseException
	 */
	@Test(timeout = 1000)
	public void test_addDay_R1273() throws Throwable {

		try {

			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			int days = Integer.MAX_VALUE;

			Timestamp wupf_result = JpfDateTimeUtil.addDay(timestamp, days);

			System.out.println("jpf_check:addDay:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (ParseException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the addHour method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp addHour(Timestamp timestamp,int hours) throws
	 *      ParseException
	 */
	@Test(timeout = 1000)
	public void test_addHour_R1277() throws Throwable {

		try {

			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			int hours = Integer.MAX_VALUE;

			Timestamp wupf_result = JpfDateTimeUtil.addHour(timestamp, hours);

			System.out.println("jpf_check:addHour:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (ParseException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the addSecond method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Timestamp addSecond(Timestamp timestamp,int seconds)
	 *      throws ParseException
	 */
	@Test(timeout = 1000)
	public void test_addSecond_R1285() throws Throwable {

		try {

			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			int seconds = Integer.MAX_VALUE;

			Timestamp wupf_result = JpfDateTimeUtil.addSecond(timestamp, seconds);

			System.out.println("jpf_check:addSecond:" + JSON.toJSONString(wupf_result));
			assertNotNull(JSON.toJSONString(wupf_result));

		} catch (ParseException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Run the strToDateTime method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static Date strToDateTime(String str)
	 */
	@Test(timeout = 1000)
	public void test_strToDateTime_R1301() throws Throwable {

		String str = "abc123";

		Date wupf_result = JpfDateTimeUtil.strToDateTime(str);

		System.out.println("jpf_check:strToDateTime:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * Run the getDateTimeDuration method test.
	 *
	 * @throws Exception
	 * 
	 * @generatedBy wupf @2019-11-28 19:49:47
	 * @see public static String getDateTimeDuration(float duration)
	 */
	@Test(timeout = 1000)
	public void test_getDateTimeDuration_R1314() throws Throwable {

		float duration = Float.MAX_VALUE;

		String wupf_result = JpfDateTimeUtil.getDateTimeDuration(duration);

		System.out.println("jpf_check:getDateTimeDuration:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	 * 濞村鐦弬瑙勭《閸掓繂顫愰崠锟�.
	 * 
	 * @throws Exception if the initialization fails for some reason
	 * 
	 * @generatedBy wupf at 2019-11-28 19:49:46
	 */
	@Before
	public void setUp() throws Exception {
		// TODO: add additional set up code here
		try {
			MockitoAnnotations.initMocks(this);
		} catch (Exception ex) {
		}
	}

}
