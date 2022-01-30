/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.web;

import java.awt.Desktop;
import java.net.URI;

import org.jpf.common.abstractWork;
import org.jpf.utils.ios.JpfOsUtil;

/**
 * @author wupf
 *
 */
public class JpfBrowerOpenWork  extends abstractWork{

	/**
	 * 
	 */
	public JpfBrowerOpenWork() {

	}

	/**
	 * 
	 * @category 功能
	 * @param strUrl
	 * @author wupf
	 * @Date :2021年4月27日下午9:58:06
	 */
	public void openFileUrl(String strUrl) {
//		"file:///F:/prj_code/xnh/dcit-auth/target/site/jacoco/index.html"
		try {

			if (!JpfOsUtil.isWindows()) {
				return;
			}
			strUrl = strUrl.replaceAll("\\\\", "/");

			if (!strUrl.startsWith("file:///")) {
				strUrl = "file:///" + strUrl;
			}

			URI uri = new URI(strUrl);
			Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @category
	 * @param strUrl
	 * @Author:wupf
	 * @date 2020年9月12日
	 */
	public void openWebUrl(String strUrl) {
		try {
			URI uri = new URI(strUrl);
			Desktop.getDesktop().browse(uri);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
