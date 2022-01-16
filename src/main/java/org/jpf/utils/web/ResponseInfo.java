/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.web;

/**
 * @author wupf
 *
 */
public class ResponseInfo {

	/**
	 * @category 定义页面返回值
	 */
	private ResponseInfo() {

	}

	// 请求返回成功
	public final static int REQUEST_SUCESS = 0;
	// 定义页面返回错误值，设置的值必须小于0
	public final static int REQUEST_FAIL = -1;
	public final static int REQUEST_FAIL_SQL_INSERT = -2;
	public final static int REQUEST_FAIL_SQL_UPDATE = -3;
	public final static int REQUEST_FAIL_SQL_DELETE = -4;
	public final static int REQUEST_FAIL_SQL_SELECT = -5;
	public final static int REQUEST_FAIL_SQL_PK = -6;
	public final static int REQUEST_FAIL_SQL_COM = -7;
	public final static int REQUEST_FAIL_COND_FAIL = -8;
	public final static int REQUEST_FAIL_PARAM_FAIL = -9;
	public final static int REQUEST_FAIL_SQL_FK = -10;
	public final static int REQUEST_FAIL_FILE_UPLOAD = -11;
	public final static int REQUEST_FAIL_FILE_UNKNOWN = -12;

	/************************************************************************
	 * 定义标准页面返回字符串
	 ***********************************************************************/

	public static final String RESP_SUCCESS = "命令执行成功";
	public static final String RESP_FAIL_ERR_ACTIONCODE = "错误的命令参数";
	public static final String RESP_FAIL = "命令执行失败";
}
