/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.infos;

/**
 * @author wupf
 *
 */
public class IdeaMvnInfo {

	private String userSettingString=null;
	
	private String mavenHomePath=null;
	
	private String localRepository=null;
	
	/**
	 * 
	 */
	public IdeaMvnInfo() {
	}

	public String getUserSettingString() {
		return userSettingString;
	}

	public void setUserSettingString(String userSettingString) {
		this.userSettingString = userSettingString;
	}

	public String getMavenHomePath() {
		return mavenHomePath;
	}

	public void setMavenHomePath(String mavenHomePath) {
		this.mavenHomePath = mavenHomePath;
	}

	public String getLocalRepository() {
		return localRepository;
	}

	public void setLocalRepository(String localRepository) {
		this.localRepository = localRepository;
	}

}
