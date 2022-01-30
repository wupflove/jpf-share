/**
 * Copyright (C) 2020-2021 wupingfu
 *
 * This file is part of wupingfu.
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.javapreader;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wupf
 *
 */
public class JavapInfo {
	private String Classfile;
	private String ClassName;

	private Set<FieldInfo> setField = new HashSet<FieldInfo>();

	private Set<MethodInfo> setMethod = new HashSet<MethodInfo>();

	public String getClassfile() {
		return Classfile;
	}

	public void setClassfile(String classfile) {
		Classfile = classfile;
	}

	public String getClassName() {
		return ClassName;
	}

	public void setClassName(String className) {
		ClassName = className;
	}

	public Set<FieldInfo> getSetField() {
		return setField;
	}

	public void setSetField(Set<FieldInfo> setField) {
		this.setField = setField;
	}

	public Set<MethodInfo> getSetMethod() {
		return setMethod;
	}

	public void setSetMethod(Set<MethodInfo> setMethod) {
		this.setMethod = setMethod;
	}

}
