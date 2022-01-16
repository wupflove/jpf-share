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
import java.sql.DriverManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jpf.utils.xmls.Jpfw3cXmlUtil;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * 
 * @author wupf
 *
 */
public class AppConn {

	private AppConn() {

	}

	private static final Logger logger = LogManager.getLogger();
	private static AppConn cAppConn = new AppConn();

	public static AppConn getInstance() {
		return cAppConn;
	}

	private final static String DB_CONFIG_XML = "jpf_db_config.xml";

	/**
	 * 
	 * @category @author
	 * @param strNodeName
	 * @return update 2020年4月15日
	 */
	public Connection getConn(String strNodeName) {
		Connection conn = null;

		try {
			// AiFileUtil.checkFile(DB_CONFIG_XML);
			NodeList n = Jpfw3cXmlUtil.getNodeList(strNodeName, DB_CONFIG_XML);
			if (1 == n.getLength()) {
				Element el = (Element) n.item(0);
				String driver = Jpfw3cXmlUtil.getParStrValue(el, "driver");//
				String dburl = Jpfw3cXmlUtil.getParStrValue(el, "dburl");//
				String dbusr = Jpfw3cXmlUtil.getParStrValue(el, "dbusr");//
				String dbpwd = Jpfw3cXmlUtil.getParStrValue(el, "dbpwd");//
				logger.info("DB URL:" + driver);
				logger.info("DB URL:" + dburl);
				Class.forName(driver).newInstance();

				conn = DriverManager.getConnection(dburl, dbusr, dbpwd);
			} else {
				logger.error("no db config find in xml");
			}

		} catch (Exception ex) {

			ex.printStackTrace();
			logger.error(ex);
			return null;

		}
		return conn;
	}

}
