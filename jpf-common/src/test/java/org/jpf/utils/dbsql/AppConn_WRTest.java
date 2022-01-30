/*
 this file is write by wupf
 */
package org.jpf.utils.dbsql;

import java.sql.Connection;
import org.w3c.dom.NodeList;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Element;
import org.jpf.utils.xmls.Jpfw3cXmlUtil;
import org.apache.logging.log4j.LogManager;
import java.sql.DriverManager;

import org.mockito.InjectMocks;
import org.jpf.utils.dbsql.AppConn;
import org.mockito.Mock;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;
import com.alibaba.fastjson.JSON;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

/**
* The class <code>AppConnTest</code> contains tests for the class <code>{@link AppConn}</code>.
* <p>
* Copyright (c) 2019
* 
* @generatedBy wupf at 2019-11-28 19:15:12
* @author Administrator
* @version $Revision: 1.3.0
*/

public class AppConn_WRTest {

	/**
	* Run the getConn method test.
	*
	* @throws Exception
	* 
	* @generatedBy wupf 
	* @2019-11-28 19:15:12
	* @see public  Connection getConn(String strNodeName)   
	*/
	@Test(timeout = 1000)
	public void test_getConn_R1() throws Throwable {

		String strNodeName = "abc123";

		AppConn wupf_fixture = AppConn.getInstance();

		Connection wupf_result = wupf_fixture.getConn(strNodeName);

		System.out.println("jpf_check:getConn:" + JSON.toJSONString(wupf_result));
		assertNotNull(JSON.toJSONString(wupf_result));

	}

	/**
	* 测试方法初始化.
	* 
	* @throws Exception 
	*         if the initialization fails for some reason 
	*  
	* @generatedBy wupf at 2019-11-28 19:15:12
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
