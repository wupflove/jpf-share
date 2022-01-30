/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.dbsql;

/**
 * 
 * @author wupf
 *
 */
public class SqlParam {
	public String strParam;
	public long lParam;
	public int iType; // 0:long 1 string

	public SqlParam(String strParam) {
		this.iType = 1;
		this.strParam = strParam;
	}

	public SqlParam(long lParam) {
		this.iType = 0;
		this.lParam = lParam;
	}

	public SqlParam(int iParam) {
		this.iType = 2;
		lParam = iParam;
	}

	public SqlParam() {
		this.iType = -1;
	}
}
