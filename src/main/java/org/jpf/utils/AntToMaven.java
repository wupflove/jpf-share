/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils;

import java.util.Vector;

import org.jpf.common.abstractWork;
import org.jpf.utils.ios.JpfFileUtil;

/**
 * 
 * @author wupf
 *
 */
public class AntToMaven extends abstractWork {

	private static final String GroupIdStr = "org.jpf.lib";
	private static final String ArtifactIdStr = "channel";

	/**
	 * 
	 * @author wupf@aliyun.com
	 * @param strFileName
	 * @return 2020年3月14日
	 */
	public String getArtifactId(final String strFileName) {
		String strArtifactId = JpfFileUtil.getFileName(strFileName);
		strArtifactId = strArtifactId.substring(0, strArtifactId.length() - 4);
		int i = strArtifactId.indexOf("-");
		if (i > 0) {
			strArtifactId = strArtifactId.substring(0, i);
		}
		return strArtifactId;
	}

	/**
	 * 
	 * @author wupf@aliyun.com
	 * @param strFileName
	 * @return 2020年3月14日
	 */
	public String getVersion(final String strFileName) {
		String strVersion = JpfFileUtil.getFileName(strFileName);
		strVersion = strVersion.substring(0, strVersion.length() - 4);
		int i = strVersion.lastIndexOf("-");
		if (i > 0) {
			strVersion = strVersion.substring(i + 1, strVersion.length());
		} else {
			strVersion = "4.0";
		}
		return strVersion;
	}

	/**
	 * 
	 * @author wupf@aliyun.com
	 * @param strFilePath
	 * @param strPomPath
	 * @return 2020年3月14日
	 */
	public String getRelativePath(String strFilePath, String strPomPath) {
		return strFilePath.substring(strPomPath.length(), strFilePath.length());

	}

	public void addHeader(StringBuilder sb) {
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + "\r\n"
				+ "<project xmlns=\"http://maven.apache.org/POM/4.0.0\"\r\n"
				+ "	xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\r\n"
				+ "	xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\r\n"
				+ "	<modelVersion>4.0.0</modelVersion>\r\n" + "	<groupId>" + GroupIdStr + "</groupId>\r\n"
				+ "	<artifactId>" + ArtifactIdStr + "</artifactId>\r\n" + "	<version>1.0.0-SNAPSHOT</version>\r\n"
				+ "	<packaging>jar</packaging>\r\n" + "	<name>cls</name>\r\n"
				+ "	<description>20190619</description>\r\n" + "	<properties>\r\n"
				+ "		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>\r\n"
				+ "		<maven.compiler.encoding>UTF-8</maven.compiler.encoding>\r\n"
				+ "		<maven.compiler.target>1.8</maven.compiler.target>\r\n"
				+ "		<maven.compiler.source>1.8</maven.compiler.source>\r\n" + "	</properties>");
	}

	public void addUnit(StringBuilder sb) {
		sb.append("		<dependency>\r\n" + "			<groupId>junit</groupId>\r\n"
				+ "			<artifactId>junit</artifactId>\r\n" + "			<version>4.12</version>\r\n"
				+ "			<scope>test</scope>\r\n" + "		</dependency>\r\n" + "		<dependency>\r\n"
				+ "			<groupId>com.wupf.sqp</groupId>\r\n"
				+ "			<artifactId>sqp-runtime</artifactId>\r\n" + "			<version>1.3</version>\r\n"
				+ "			<scope>system</scope>\r\n"
				+ "			<systemPath>${basedir}/lib/sqp-runtime-1.3.jar</systemPath>\r\n"
				+ "		</dependency>\r\n" + "		<dependency>\r\n" + "			<groupId>org.easymock</groupId>\r\n"
				+ "			<artifactId>easymock</artifactId>\r\n" + "			<version>4.0.2</version>\r\n"
				+ "			<scope>test</scope>\r\n" + "		</dependency>\r\n" + "		<dependency>\r\n"
				+ "			<groupId>org.mockito</groupId>\r\n" + "			<artifactId>mockito-core</artifactId>\r\n"
				+ "			<version>2.27.0</version>\r\n" + "			<scope>test</scope>\r\n"
				+ "		</dependency>\r\n" + "		<dependency>\r\n" + "			<groupId>org.mockito</groupId>\r\n"
				+ "			<artifactId>mockito-inline</artifactId>\r\n" + "			<version>2.27.0</version>\r\n"
				+ "			<scope>test</scope>\r\n" + "		</dependency>\r\n" + "		<dependency>\r\n"
				+ "			<groupId>com.alibaba</groupId>\r\n" + "			<artifactId>fastjson</artifactId>\r\n"
				+ "			<version>1.2.60</version>\r\n" + "		</dependency>\r\n" + "	</dependencies>\r\n"
				+ "	<build>\r\n" + "		<plugins>\r\n" + "			<plugin>\r\n"
				+ "				<groupId>org.jacoco</groupId>\r\n"
				+ "				<artifactId>jacoco-maven-plugin</artifactId>\r\n"
				+ "				<version>0.8.4</version>\r\n" + "				<executions>\r\n"
				+ "					<execution>\r\n" + "						<id>pre-test</id>\r\n"
				+ "						<goals>\r\n" + "							<goal>prepare-agent</goal>\r\n"
				+ "						</goals>\r\n" + "					</execution>\r\n"
				+ "					<execution>\r\n" + "						<id>post-test</id>\r\n"
				+ "						<phase>test</phase>\r\n" + "						<goals>\r\n"
				+ "							<goal>report</goal>\r\n" + "						</goals>\r\n"
				+ "					</execution>\r\n" + "				</executions>\r\n" + "			</plugin>\r\n"
				+ "		</plugins>\r\n" + "	</build>\r\n" + "</project>");
	}

	/**
	 * 
	 * @param strFilePath
	 * @param strPomPath
	 */
	public AntToMaven(String strFilePath, String strPomPath) {

		/*
		 * <dependency> <groupId>com.cmbchina.cc</groupId>
		 * <artifactId>CreditsFront7</artifactId> <version>4.0.0</version>
		 * <scope>system</scope>
		 * <systemPath>${basedir}/src/main/webapp/WEB-INF/lib/commons-codec-1.6.jar</
		 * systemPath> </dependency>
		 */
		
		if (!JpfFileUtil.isDirectory(strFilePath)) {
			return;
		}
		
		if (!JpfFileUtil.isDirectory(strPomPath)) {
			return;
		}
		logger.info(strFilePath);
		try {
			StringBuilder sb = new StringBuilder();
			addHeader(sb);
			sb.append("<dependencies>\n");

			Vector<String> v = new Vector<String>();
			JpfFileUtil.getFiles(strFilePath, v, ".jar");
			for (int i = 0; i < v.size(); i++) {
				String strFileName = v.get(i);
				sb.append("<dependency>\n");
				sb.append("<groupId>").append(GroupIdStr).append(i).append("</groupId>\n");
				sb.append("<artifactId>").append(getArtifactId(strFileName)).append("</artifactId>\n");
				sb.append("<version>").append(getVersion(strFileName)).append("</version>\n");
				sb.append("<scope>system</scope>\n");
				sb.append("<systemPath>${basedir}").append(getRelativePath(strFileName, strPomPath))
						.append("</systemPath>\n");
				sb.append("</dependency>\n");

			}

			addUnit(sb);
			System.out.println(sb);
			JpfFileUtil.saveFile(JpfFileUtil.joinPath(strPomPath, "pom.xml"), sb.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
