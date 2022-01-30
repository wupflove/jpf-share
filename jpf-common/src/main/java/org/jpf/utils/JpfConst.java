/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils;

/**
 * @author wupf
 *
 */
public class JpfConst {

	/**
	 * 
	 */
	private JpfConst() {
	}

	public final static String SRC_MAIN_JAVA_PATH = "src" + java.io.File.separator + "main" + java.io.File.separator
			+ "java";
	public final static String SRC_TEST_JAVA_PATH = "src" + java.io.File.separator + "test" + java.io.File.separator
			+ "java";
	

	// 传递进程参数
	public final static String JAVA_HOME = "app.java.home";
	public final static String MVN_HOME = "app.mvn.home";
	public final static String MVN_SETTINGS = "app.settings";
	public final static String MVN_REPO = "app.mvn.repo";
	public final static String MVN_POM = "app.pom";
	public final static String JACOCO_OFFLINE = "app.jacoco.offline";
}
