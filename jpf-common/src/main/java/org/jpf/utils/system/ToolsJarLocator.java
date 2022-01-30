/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.system;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wupf
 *
 */
public class ToolsJarLocator  {

	/**
	 * 
	 */
	public ToolsJarLocator() {

		try {
			getLoad();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ClassLoader getLoad() {
		String javaHome = System.getProperty("java.home");

		List<String> locations = new ArrayList<>(Arrays.asList(
				javaHome + java.io.File.separator + ".." + java.io.File.separator + "lib" + java.io.File.separator
						+ "tools.jar",
				javaHome + java.io.File.separator + "lib" + java.io.File.separator + "tools.jar",
				javaHome + java.io.File.separator + ".." + java.io.File.separator + "Classes" + java.io.File.separator
						+ "classes.jar" /* this for example happens in Mac */
		));


		String javaHomeEnv = System.getenv("JAVA_HOME");

		if (javaHomeEnv != null && !javaHomeEnv.equals(javaHome)) {
			locations.addAll(Arrays.asList(
					javaHomeEnv + java.io.File.separator + ".." + java.io.File.separator + "lib"
							+ java.io.File.separator + "tools.jar",
					javaHomeEnv + java.io.File.separator + "lib" + java.io.File.separator + "tools.jar",
					javaHomeEnv + java.io.File.separator + ".." + java.io.File.separator + "Classes"
							+ java.io.File.separator + "classes.jar"));
		}

		for (String location : locations) {

			File file = new File(location);
			if (file.exists()) {

				return validateAndGetLoader(location);
			}
		}
		return null;
	}

	private final String EXAMPLE_CLASS = "com.sun.tools.attach.VirtualMachine";
	private String locationNotOnClasspath;

	private ClassLoader validateAndGetLoader(String location) {

		ClassLoader loader = null;
		try {
			loader = URLClassLoader.newInstance(new URL[] { new File(location).toURI().toURL() },
					// ClassLoader.getSystemClassLoader()
					null);
		} catch (MalformedURLException e) {
			throw new RuntimeException("Malformed URL: " + location, e);
		}

		try {
			Class class1 = Class.forName(EXAMPLE_CLASS, true, loader);
			System.out.println(class1.getName());
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Missing " + EXAMPLE_CLASS + " in " + location);
		}

		locationNotOnClasspath = location;

		return loader;
	}
}
