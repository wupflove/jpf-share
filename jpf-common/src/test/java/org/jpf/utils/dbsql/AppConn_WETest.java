/*
 * This file was automatically generated by wupf@
 * Thu Nov 28 11:16:22 GMT 2019
 */

package org.jpf.utils.dbsql;

import static org.junit.Assert.assertNull;

import java.sql.Connection;

import org.junit.Test;

public class AppConn_WETest {


	@Test(timeout = 1000)
	public void testGetConnThrowsNoClassDefFoundError() throws Throwable {
		AppConn appConn0 = AppConn.getInstance();
		Connection connection0 = appConn0.getConn("");
		assertNull(connection0);
	}
}
