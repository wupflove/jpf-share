/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.javapreader;

import java.io.File;

import org.jpf.utils.JpfProcssWork;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wupf
 *
 */
public class JavapReader {
	private static final Logger logger = LoggerFactory.getLogger(JavapReader.class);

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			logger.info("JavapReader");
			String strClassFileName = "";
			JavapReader cJavapReader = new JavapReader();
			JavapInfo cJavapInfo = cJavapReader.getJavapInfo(strClassFileName);
			logger.info(cJavapInfo.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("over");
	}

	/**
	 * 
	 * @param strClassFileName
	 * @return
	 * @throws Exception
	 */
	private JavapInfo getJavapInfo(final String strClassFileName) throws Exception {
		JavapInfo cJavapInfo = new JavapInfo();

		String[] msgs = getJavapResult(strClassFileName);
		return cJavapInfo;
	}

	/**
	 * 
	 * @param strClassFileName
	 * @return
	 * @throws Exception
	 */
	private String[] getJavapResult(final String strClassFileName) throws Exception {
		logger.info("getGenericInfoFromClassFile:{}", strClassFileName);

		File f = new File(strClassFileName);
		if (!f.exists()) {
			logger.warn("FileNotExist:" + strClassFileName);
			return null;
		}

		String strCmd = "javap.exe -v -p " + f.getAbsoluteFile().toString();

		logger.info("strCmd:{}", strCmd);

		StringBuilder sbMsg = new StringBuilder();
		new JpfProcssWork().runexecWithResult("", strCmd, sbMsg);
		return sbMsg.toString().split(System.getProperty("line.separator"));
	}
}
