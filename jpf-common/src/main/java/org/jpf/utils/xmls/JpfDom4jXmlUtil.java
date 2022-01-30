/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.xmls;

import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Element;

/**
 * @author wupf
 *
 */
public class JpfDom4jXmlUtil {

	/**
	 * 
	 */
	public JpfDom4jXmlUtil() {
	}
	// 遍历当前节点下的所有节点
	public void listNodes(Element node) {
		System.out.println("当前节点的名称：" + node.getName());
		// 首先获取当前节点的所有属性节点
		List<Attribute> list = node.attributes();
		// 遍历属性节点
		for (Attribute attribute : list) {
			System.out.println("属性" + attribute.getName() + ":" + attribute.getValue());
		}
		// 如果当前节点内容不为空，则输出
		if (!(node.getTextTrim().equals(""))) {
			System.out.println(node.getName() + "：" + node.getText());
		}
		// 同时迭代当前节点下面的所有子节点
		// 使用递归
		Iterator<Element> iterator = node.elementIterator();
		while (iterator.hasNext()) {
			Element e = iterator.next();
			listNodes(e);
		}
	}
}
