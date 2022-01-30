/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.dbsql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.Logger;
import org.jpf.common.abstractUtil;

/**
 * 
 * @author wupf
 *
 */
public final class JpfDBUtil extends abstractUtil {
	private JpfDBUtil() {
	}

	/**
	 * @todo: call proc
	 * @param cLogger Logger
	 * @param conn    Connection
	 * @param strSql  String
	 * @param strParm String
	 * @return boolean
	 * @throws Exception
	 */
	public static boolean execProc(final Logger cLogger /* IN */, Connection conn /* IN */,
			final String strProcName /* IN */, final SqlParam[] cSqlParam /* IN */) throws Exception {
		CallableStatement proc = null;
		try {
			cLogger.debug("call proc:" + strProcName);
			proc = conn.prepareCall(strProcName);
			for (int i = 0; i < cSqlParam.length; i++) {
				// for String
				if (1 == cSqlParam[i].iType) {
					proc.setString(i + 1, cSqlParam[i].strParam);
					cLogger.debug("param=" + cSqlParam[i].strParam);
				} else
				// for long
				{
					proc.setLong(i + 1, cSqlParam[i].lParam);
					cLogger.debug("param=" + cSqlParam[i].lParam);
				}
			}
			return proc.execute();
		} finally {
			close(proc);
		}

	}

	/**
	 *
	 * @param cLogger     Logger
	 * @param conn        Connection
	 * @param strProcName String
	 * @return boolean
	 * @throws Exception
	 */
	public static boolean execProc(final Logger cLogger /* IN */, Connection conn, final String strProcName /* IN */)
			throws Exception {
		CallableStatement proc = null;
		cLogger.debug("strProcName=" + strProcName);
		try {

			proc = conn.prepareCall(strProcName);
			return proc.execute();
		} finally {
			close(proc);
		}
	}

	/**
	 *
	 * @param cLogger     Logger
	 * @param conn        Connection
	 * @param strProcName String
	 * @param strParams   String[]
	 * @return boolean
	 * @throws Exception
	 */
	public static boolean execProc(final Logger cLogger /* IN */, Connection conn /* IN */,
			final String strProcName /* IN */, final String[] strParams /* IN */) throws Exception {
		CallableStatement proc = null;
		try {
			cLogger.debug(strProcName);
			proc = conn.prepareCall(strProcName);
			for (int i = 0; i < strParams.length; i++) {
				proc.setString(i + 1, strParams[i]);
				cLogger.debug("param=" + strParams[i]);
			}

			return proc.execute();
		} finally {
			close(proc);
		}
	}

	/**
	 *
	 * @param cLogger Logger
	 * @param conn    Connection
	 * @param strSql  String
	 * @param strParm String
	 * @return ResultSet
	 * @throws Exception
	 */
	public static ResultSet execSqlQuery(final Logger cLogger /* IN */, Connection conn /* IN */,
			final String strSql /* IN */, final String strParm /* IN */) throws Exception {
		cLogger.debug(strSql);
		PreparedStatement pStmt = conn.prepareStatement(strSql);
		cLogger.debug("param=" + strParm);
		pStmt.setString(1, strParm);
		return pStmt.executeQuery();
	}

	public static ResultSet execSqlQuery(final Logger cLogger /* IN */, Connection conn /* IN */,
			final String strSql /* IN */, final SqlParam[] cSqlParams /* IN */) throws Exception {
		cLogger.debug(strSql);
		PreparedStatement pStmt = conn.prepareStatement(strSql);
		for (int i = 0; i < cSqlParams.length; i++) {
			// for String
			if (1 == cSqlParams[i].iType) {
				pStmt.setString(i + 1, cSqlParams[i].strParam);
				cLogger.debug("param=" + cSqlParams[i].strParam);
			} else
			// for long
			{
				pStmt.setLong(i + 1, cSqlParams[i].lParam);
				cLogger.debug("param=" + cSqlParams[i].lParam);
			}
		}

		return pStmt.executeQuery();
	}

	/**
	 *
	 * @param cLogger Logger
	 * @param conn    Connection
	 * @param strSql  String
	 * @param strParm String
	 * @return ResultSet
	 * @throws Exception
	 */
	public static ResultSet execSqlQuery(final Logger cLogger /* IN */, Connection conn /* IN */,
			final String strSql /* IN */, final long iParam /* IN */) throws Exception {

		cLogger.debug(strSql);
		PreparedStatement pStmt = conn.prepareStatement(strSql);
		cLogger.debug("param=" + iParam);
		pStmt.setLong(1, iParam);
		return pStmt.executeQuery();
	}

	/**
	 *
	 * @param cLogger Logger
	 * @param conn    Connection
	 * @param strSql  String
	 * @param iParm   int
	 * @return ResultSet
	 * @throws Exception
	 */
	public static ResultSet execSqlQuery(final Logger cLogger /* IN */, Connection conn /* IN */,
			final String strSql /* IN */, final int iParam /* IN */
	) throws Exception {
		cLogger.debug(strSql);
		PreparedStatement pStmt = conn.prepareStatement(strSql);
		cLogger.debug("param=" + iParam);
		pStmt.setInt(1, iParam);
		return pStmt.executeQuery();
	}

	/**
	 *
	 * @param cLogger Logger
	 * @param conn    Connection
	 * @param strSql  String
	 * @param strParm String
	 * @return int
	 * @throws Exception
	 */

	public static int execSqlUpdate(final Logger cLogger /* IN */, Connection conn /* IN */,
			final String strSql /* IN */, final String strParam /* IN */) throws Exception {
		PreparedStatement pStmt = null;
		try {
			cLogger.debug(strSql);
			pStmt = conn.prepareStatement(strSql);
			cLogger.debug("param=" + strParam);
			pStmt.setString(1, strParam);
			return pStmt.executeUpdate();
		} finally {
			JpfDBUtil.close(pStmt);
		}
	}

	/**
	 *
	 * @param cLogger    Logger
	 * @param conn       Connection
	 * @param strSql     String
	 * @param cSqlParams SqlParam[]
	 * @return int
	 * @throws Exception
	 */
	public static int execSqlUpdate(final Logger cLogger /* IN */, Connection conn /* IN */,
			final String strSql /* IN */, final SqlParam[] cSqlParams /* IN */) throws Exception {
		PreparedStatement pStmt = null;
		try {
			cLogger.debug(strSql);
			pStmt = conn.prepareStatement(strSql);
			for (int i = 0; i < cSqlParams.length; i++) {
				if (0 == cSqlParams[i].iType) {
					pStmt.setLong(i + 1, cSqlParams[i].lParam);
					cLogger.debug("param:=" + cSqlParams[i].lParam);
				} else {
					pStmt.setString(i + 1, cSqlParams[i].strParam);
					cLogger.debug("param:=" + cSqlParams[i].strParam);
				}
			}

			return pStmt.executeUpdate();
		} finally {
			JpfDBUtil.close(pStmt);
		}
	}

	/**
	 * @todo exec sql update
	 * @param cLogger Logger
	 * @param conn    Connection
	 * @param strSql  String
	 * @param lParm   long
	 * @return int
	 * @throws Exception
	 */
	public static int execSqlUpdate(final Logger cLogger /* IN */, Connection conn /* IN */,
			final String strSql /* IN */, final long lParam /* IN */) throws Exception {
		PreparedStatement pStmt = null;
		try {
			cLogger.debug(strSql);
			cLogger.debug("param=" + lParam);
			pStmt = conn.prepareStatement(strSql);
			pStmt.setLong(1, lParam);
			return pStmt.executeUpdate();
		} finally {
			close(pStmt);
		}
	}

	/**
	 * 
	 * @param cLogger
	 * @param conn
	 * @param strSql
	 * @param iParam
	 * @return
	 * @throws Exception
	 */
	public static int execSqlUpdate(final Logger cLogger /* IN */, Connection conn /* IN */,
			final String strSql /* IN */, final int iParam /* IN */) throws Exception {
		PreparedStatement pStmt = null;
		try {
			cLogger.debug(strSql);
			cLogger.debug("param=" + iParam);
			pStmt = conn.prepareStatement(strSql);
			pStmt.setInt(1, iParam);
			return pStmt.executeUpdate();
		} finally {
			JpfDBUtil.close(pStmt);
		}
	}

	/**
	 *
	 * @param proc CallableStatement
	 */
	public static void close(CallableStatement proc) {
		try {
			if (null != proc) {
				proc.close();
			}
		} catch (Exception ex) {
		}
	}

	/**
	 *
	 * @param proc CallableStatement
	 */
	public static void close(PreparedStatement pstmt) {
		try {
			if (null != pstmt) {
				pstmt.close();
			}
		} catch (Exception ex) {
		}
	}

	/**
	 *
	 * @param cLogger Logger
	 * @param conn    Connection
	 * @param in_sql  String
	 * @return int
	 * @throws Exception
	 */
	public static int execSqlUpdate(Logger cLogger, Connection conn, String in_sql) throws Exception {
		PreparedStatement pStmt = null;
		try {
			cLogger.debug(in_sql);
			pStmt = conn.prepareStatement(in_sql);
			return pStmt.executeUpdate();
		} finally {
			close(pStmt);
		}
	}

	/**
	 *
	 * @param cLogger Logger
	 * @param conn    Connection
	 * @param in_sql  String
	 * @return ResultSet
	 * @throws Exception
	 */
	public static ResultSet execSqlQuery(Logger cLogger, Connection conn, String in_sql) throws Exception {
		cLogger.debug(in_sql);
		PreparedStatement

		pStmt = conn.prepareStatement(in_sql);
		return pStmt.executeQuery();

	}

	/**
	 *
	 * @param cLogger Logger
	 * @param conn    Connection
	 * @param strSql  String
	 * @param lParam  long -1 表示没有该参数
	 * @return ResultSet
	 * @throws Exception
	 */
	public static ResultSet execSqlQueryForBsr(Logger cLogger, Connection conn, String strSql, long lParam)
			throws Exception {

		cLogger.debug(strSql);
		PreparedStatement pStmt = conn.prepareStatement(strSql, ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
		if (lParam >= 0) {
			if (cLogger.isDebugEnabled()) {
				cLogger.debug("param=" + lParam);
			}
			pStmt.setLong(1, lParam);
		}
		return pStmt.executeQuery();
	}

	/**
	 * 
	 * @category @author 
	 * @param conn
	 * @param tablename
	 * @param condition
	 * @return
	 * @throws Exception update 2020年3月9日
	 */
	public static int deleteTableData(Connection conn, String tablename, String condition) throws Exception {
		int iResult = 0;
		String strSql = "delete from  " + tablename + " where " + condition;
		logger.info(strSql);
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(strSql);
			iResult = pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(tablename, e);
			throw e;
		} finally {
			close(pStmt);
		}
		return iResult;
	}

	/**
	 * 
	 * @category @author 
	 * @param conn update 2020年3月2日
	 */
	public static void close(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception ex) {
		}
	}

	public final static int EXECSQLTIMEOUT = 1200;

	/**
	 * 
	 * @category 功能
	 * @param conn
	 * @param strSql
	 * @throws Exception
	 * @author wupf
	 * @Date :2021年3月21日下午6:09:42
	 */
	public static void execUpdateSql(Connection conn, String strSql) throws Exception {
		Statement stmt = null;
		try {
			if (!strSql.toUpperCase().trim().equalsIgnoreCase("DROP")) {
				stmt = conn.createStatement();
				stmt.setQueryTimeout(EXECSQLTIMEOUT);

				// LOGGER.info(strSql);
				int i = stmt.executeUpdate(strSql);
				logger.debug("rows count={}", i);
				if (conn.getAutoCommit() == false) {
					conn.commit();
				}
			}

		} catch (SQLException ex) {
			logger.error(strSql, ex);
			ex.printStackTrace();
			throw ex;

		} finally {
			close(stmt);
		}

	}

	/**
	 * 
	 * @param conn
	 * @param strSql
	 * @param iLogLevel
	 * @throws Exception
	 */
	public static void execUpdateSql(Connection conn, String strSql, int iLogLevel) throws Exception {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			stmt.setQueryTimeout(EXECSQLTIMEOUT);
			if (1 == iLogLevel) {
				logger.info(strSql);
			}
			int i = stmt.executeUpdate(strSql);
			if (1 == iLogLevel) {
				logger.debug("rows count={}", i);
			}

			if (conn.getAutoCommit() == false) {
				conn.commit();
			}
		} catch (Exception ex) {
			logger.error(strSql, ex);
			ex.printStackTrace();
			throw ex;
		} finally {
			close(stmt);
		}
	}

	/**
	 * 
	 * @category 功能
	 * @param conn
	 * @param strSql
	 * @return
	 * @throws Exception
	 * @author wupf
	 * @Date :2021年3月21日下午6:09:35
	 */
	public static ResultSet execSqlQuery(Connection conn /* IN */, final String strSql /* IN */) throws Exception {

		PreparedStatement pStmt = conn.prepareStatement(strSql);
		pStmt.setQueryTimeout(EXECSQLTIMEOUT);
		return pStmt.executeQuery();
	}

	/**
	 * @category 关闭ResultSet
	 * @param rs
	 */
	public static void close(ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (Exception e) {
		}
	}

	/**
	 * @category 关闭Statement
	 * @param stmt
	 */
	public static void close(Statement stmt) {
		try {
			if (stmt != null)
				stmt.close();
		} catch (Exception e) {
		}
	}

	/**
	 * 
	 * @param strSqlText
	 * @return
	 */
	public static String removeSqlNote(String strSqlText) {
		Pattern pattern = Pattern.compile("[///*].*[//*/ ]");
		Matcher matcher = pattern.matcher(strSqlText);
		strSqlText = matcher.replaceAll("");
		strSqlText = strSqlText.trim();
		if (logger.isDebugEnabled()) {
			logger.debug("FormatSql:={}", strSqlText);
		}
		return strSqlText;
	}

}
