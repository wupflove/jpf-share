/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.infos;

import org.jpf.enums.EnumPomDependType;

/**
 * @author
 *
 */
public class MavenDependInfo {

	/**
	 * 
	 */
	public MavenDependInfo() {
		
	}

	private String groupId;
	private String artifactId;
	private String version;
	private String scope;
	private String type;
	private EnumPomDependType cPomDependTypeEnum=EnumPomDependType.Denpend;
	private boolean bExist=false;

	/**
	 * 
	 * @return
	 *
	 */
	public String getGroupId() {
		return this.groupId;
	}

	/**
	 * 
	 * @param groupId
	 *
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * 
	 * @return
	 *
	 */
	public String getArtifactId() {
		return this.artifactId;
	}

	/**
	 * 
	 * @param artifactId
	 *
	 */
	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	/**
	 * 
	 * @return
	 *
	 */
	public String getVersion() {
		return this.version;
	}

	/**
	 * 
	 * @param version
	 *
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * 
	 * @return
	 *
	 */
	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}


	public boolean isbExist() {
		return bExist;
	}

	public void setbExist(boolean bExist) {
		this.bExist = bExist;
	}

	public EnumPomDependType getPomDependTypeEnum() {
		return cPomDependTypeEnum;
	}

	public void setPomDependTypeEnum(EnumPomDependType cPomDependTypeEnum) {
		this.cPomDependTypeEnum = cPomDependTypeEnum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
