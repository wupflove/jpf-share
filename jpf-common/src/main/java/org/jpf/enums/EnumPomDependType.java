/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.enums;

/**
 * @author wupf
 *
 */
public enum EnumPomDependType {
	Denpend("depend"), plugin("plugin");

	private String typeName;

	EnumPomDependType(String typeName) {
		this.typeName = typeName;
	}

	/**
	 * 根据类型的名称，返回类型的枚举实例。
	 *
	 * @param typeName 类型名称
	 */
	public static EnumPomDependType fromTypeName(String typeName) {
		typeName = typeName.toLowerCase();
		for (EnumPomDependType type : EnumPomDependType.values()) {
			if (type.getTypeName().equals(typeName)) {
				return type;
			}
		}
		return null;
	}

	public String getTypeName() {
		return this.typeName;
	}
}
