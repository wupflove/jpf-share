/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.dbsql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * 
 * @author wupf
 *
 */
public final class DbInfoWork {
	/**
	 * 获取表的主键
	 * @param conn
	 * @param TableName
	 * @return
	 * @throws Exception
	 */
	public String GetTablePK(Connection conn, String TableName) throws Exception {
		StringBuilder sb = new StringBuilder();
		String strSql = "select * from user_cons_columns where constraint_name=(select constraint_name from user_constraints where table_name=upper('"
				+ TableName + "') and constraint_type   ='P')";

		ResultSet rs = JpfDBUtil.execSqlQuery(conn, strSql);
		while (rs.next()) {
			sb.append(rs.getString("COLUMN_NAME")).append(",");
		}
		rs.close();
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}

	/**
	 * 获取表的列名
	 * 
	 * @return
	 */
	public String GetTableColumn(Connection conn, String TableName) throws Exception {
		StringBuilder sb = new StringBuilder();

		String strSql = "select * from " + TableName;

		ResultSet rs = JpfDBUtil.execSqlQuery(conn, strSql);
		ResultSetMetaData rsmd = rs.getMetaData();
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			sb.append(rsmd.getColumnName(i)).append(",");
		}
		rs.close();

		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}
}
