/*
 * This file was automatically generated by wupf@
 * Thu Nov 28 11:18:10 GMT 2019
 */

package org.jpf.utils.dbsql;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jpf.utils.dbsql.SqlParam;

public class SqlParam_WETest {

	@Test(timeout = 1000)
	public void testCreatesSqlParamTakingLong() throws Throwable {
		SqlParam sqlParam0 = new SqlParam(2156L);
		assertEquals(2156L, sqlParam0.lParam);
		assertEquals(0, sqlParam0.iType);
	}

	@Test(timeout = 1000)
	public void testCreatesSqlParamTakingInt() throws Throwable {
		SqlParam sqlParam0 = new SqlParam(0);
		assertEquals(2, sqlParam0.iType);
		assertEquals(0L, sqlParam0.lParam);
	}

	@Test(timeout = 1000)
	public void testCreatesSqlParamTakingNoArguments() throws Throwable {
		SqlParam sqlParam0 = new SqlParam();
		assertEquals((-1), sqlParam0.iType);
	}

	@Test(timeout = 1000)
	public void testCreatesSqlParamTakingString() throws Throwable {
		SqlParam sqlParam0 = new SqlParam("");
		assertEquals(1, sqlParam0.iType);
	}
}
