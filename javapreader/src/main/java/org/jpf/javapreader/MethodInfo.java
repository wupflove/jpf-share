/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.javapreader;

/**
 * @author wupf
 *
 */
public class MethodInfo {
	private String descriptor;
	private String flags;
	private String code;
	private String LocalVariableTypeTable;
	public String getDescriptor() {
		return descriptor;
	}
	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}
	public String getFlags() {
		return flags;
	}
	public void setFlags(String flags) {
		this.flags = flags;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLocalVariableTypeTable() {
		return LocalVariableTypeTable;
	}
	public void setLocalVariableTypeTable(String localVariableTypeTable) {
		LocalVariableTypeTable = localVariableTypeTable;
	}
	
	
}
