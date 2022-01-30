/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.xmls;

import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.jpf.utils.ios.JpfFileUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 * @author wupf
 *
 */
public final class Jpfw3cXmlUtil {

	private Jpfw3cXmlUtil() {
	}

	/**
	 * <p>
	 * Description:取string类型值
	 * </p>
	 * 
	 * @throws Exception
	 */
	public static String getParStrValue(Element in_el, String in_ParName) {
		NodeList fields = in_el.getElementsByTagName(in_ParName);
		String m_value = "";
		if (fields.getLength() == 1) {
			if (fields.item(0).getFirstChild() != null) {
				m_value = fields.item(0).getFirstChild().getNodeValue();
			}
		}
		if (m_value == null) {
			m_value = "";
		}
		return m_value;
	}

	/**
	 * <p>
	 * Description:取INT类型值
	 * </p>
	 * 
	 * @throws Exception
	 */
	public static int getParIntValue(Element in_el, String in_ParName, int defaultValue) {
		try {
			return Integer.parseInt(getParStrValue(in_el, in_ParName));
		} catch (Exception ex) {

		}
		return defaultValue;
	}

	/**
	 * <p>
	 * Description:取BOOL类型值
	 * </p>
	 * 
	 * @throws Exception
	 */
	public static boolean getParBoolValue(Element in_el, String in_ParName) {
		String m_value = getParStrValue(in_el, in_ParName);
		if (m_value.equalsIgnoreCase("0")) {
			return false;
		}
		return true;
	}

	/**
	 * <p>
	 * Description:从XML读取参数
	 * </p>
	 * 
	 * @throws Exception
	 */
	public static Element readXMLFile2(String in_FileName, String in_TagName, String strSecondNode) throws Exception {
		Element ell = paraseXMLFile(in_TagName, in_FileName);
		NodeList childfields = ell.getElementsByTagName(strSecondNode);
		if (childfields.getLength() != 1) {
			throw new Exception("读取配置文件出错!没有找到节点" + strSecondNode);
		}
		return (Element) childfields.item(0);

	}

	/**
	 * 
	 * @param in_FileName
	 * @param in_TagName
	 * @return
	 * @throws Exception
	 */
	public static String getRootElementAttribute(String in_AttributeName, String in_FileName) throws Exception {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		String FEATURE = null;
		FEATURE = "http://javax.xml.XMLConstants/feature/secure-processing";
		dbf.setFeature(FEATURE, true);
		FEATURE = "http://apache.org/xml/features/disallow-doctype-decl";
		dbf.setFeature(FEATURE, true);
		FEATURE = "http://xml.org/sax/features/external-parameter-entities";
		dbf.setFeature(FEATURE, false);
		FEATURE = "http://xml.org/sax/features/external-general-entities";
		dbf.setFeature(FEATURE, false);
		FEATURE = "http://apache.org/xml/features/nonvalidating/load-external-dtd";
		dbf.setFeature(FEATURE, false);
		dbf.setXIncludeAware(false);
		dbf.setExpandEntityReferences(false);
		DocumentBuilder builder = dbf.newDocumentBuilder();
		// 读取xml文件内容
		FileInputStream fis = new FileInputStream(in_FileName);
		InputSource is = new InputSource(fis);
		Document doc = builder.parse(is);

		Element root = doc.getDocumentElement();

		return root.getAttribute(in_AttributeName);

	}

	/**
	 * 
	 * @category @author
	 * @param in_FileName
	 * @param in_TagName
	 * @return
	 * @throws Exception update 2020年4月15日
	 */
	public static String readXMLFile3(String in_FileName, String in_TagName) throws Exception {
		String strOut = "";
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(in_FileName);
		Element root = doc.getDocumentElement();
		NodeList books = root.getChildNodes();
		if (books != null) {
			for (int i = 0; i < books.getLength(); i++) {
				Node book = books.item(i);
				if (book.getNodeType() == Node.ELEMENT_NODE) {
					if (book.getNodeName().equals(in_TagName)) {
						strOut = book.getFirstChild().getNodeValue();
					}
				}
			}
		}
		return strOut;

	}

	/**
	 * @todo 一级解析
	 * @param in_TagName  String
	 * @param in_FileName String
	 * @throws Exception
	 * @return Element
	 */
	public static Element paraseXMLFile(String in_TagName, String in_FileName) throws Exception {
		// System.out.println(in_FileName);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(in_FileName);
		Element root = doc.getDocumentElement();
		NodeList fields = root.getElementsByTagName(in_TagName);
		if (fields.getLength() != 1) {
			throw new Exception("读取配置文件出错!没有找到节点" + in_TagName);
		}
		return (Element) fields.item(0);

	}

	/**
	 * 
	 * @category @author
	 * @param in_Tag
	 * @param in_FileName
	 * @return
	 * @throws Exception update 2020年4月15日
	 */
	public static NodeList getNodeList(String in_Tag, String in_FileName) throws Exception {
		// 得到 DOM 解析器的工厂实例
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// 然后从 DOM 工厂获得 DOM 解析器
		DocumentBuilder db = dbf.newDocumentBuilder();
		// 解析 XML 文档的输入流，得到一个 Document
		Document doc = db.parse("file:///" + in_FileName);
		// 得到 XML 文档的根节点
		Element root = doc.getDocumentElement();
		return root.getElementsByTagName(in_Tag);
	}

	/**
	 * 
	 * @category @author
	 * @param in_el
	 * @param in_ParName
	 * @return update 2020年4月15日
	 */
	public static String getParStrValue2(Element in_el, String in_ParName) {
		NodeList nodeList = in_el.getElementsByTagName(in_ParName);

		return nodeList.item(0).getChildNodes().item(0).getNodeValue();
	}

	/**
	 * 
	 * @category 取INT类型值
	 * @author
	 * @param in_el
	 * @param in_ParName
	 * @return update 2020年4月15日
	 */
	public static int getParIntValue(Element in_el, String in_ParName) {

		String tmpString = getParStrValue2(in_el, in_ParName);
		int iResult = Integer.parseInt(tmpString);
		return iResult;

	}

	/**
	 * 
	 * @category @author
	 * @param in_FirstTagName
	 * @param in_SecondTagName
	 * @param in_FileName
	 * @return
	 * @throws Exception update 2020年4月15日
	 */
	public static Element readXMLFile(String in_FirstTagName, String in_SecondTagName, String in_FileName)
			throws Exception {
		Element ell = paraseXMLFile(in_FirstTagName, in_FileName);
		NodeList childfields = ell.getElementsByTagName(in_SecondTagName);
		if (childfields.getLength() != 1) {
			throw new Exception("the tag size =" + childfields.getLength() + " with tag:" + in_SecondTagName);
		}
		return (Element) childfields.item(0);
	}

	/*
	 * 
	 */
	public static Element getElementFromXml(String TagsName, String in_FileName) throws Exception {

		if (TagsName == null || TagsName.trim().length() == 0) {
			return null;
		}
		String[] tagNames = TagsName.split("/");
		Element mElement = null;
		for (String tagName : tagNames) {
			// System.out.println(tagName);
			if (mElement == null) {
				mElement = paraseXMLFile(tagName, in_FileName);
			} else {
				mElement = getChildElement(mElement, tagName);
			}
		}
		return mElement;

	}

	/**
	 * 
	 * @category:
	 * @Title: getElementFromElement
	 * @Author:wupf@
	 * @date:2020年3月14日
	 * @param mElement
	 * @param strTagName
	 * @return
	 * @throws Exception
	 */
	public static Element getChildElement(Element mElement, String strTagName) throws Exception {

		NodeList childfields = mElement.getElementsByTagName(strTagName);
		if (childfields.getLength() != 1) {
			throw new Exception("the tag size =" + childfields.getLength() + " with tag:" + strTagName);
		}
		return (Element) childfields.item(0);
	}

	/**
	// 过滤非法字符
	// 注意，以下正则表达式过滤不全面，过滤范围为
	// 0x00 - 0x08
	// 0x0b - 0x0c
	// 0x0e - 0x1f
	 * @category
	 * @param strFileName
	 * @since 2020年2月15日 
	 * @author wupf
	 */
	public static void stripNonValidXMLChars(String strFileName) throws Exception {

		String strData = JpfFileUtil.getFileTxt(strFileName);

		if (strData == null || "".equals(strData)) {
			return;
		}
		strData = strData.replaceAll("[\\x00-\\x08\\x0b-\\x0c\\x0e-\\x1f]", "");
		JpfFileUtil.saveFile(strFileName, strData);

	}

}
