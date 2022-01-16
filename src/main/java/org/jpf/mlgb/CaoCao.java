/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/

package org.jpf.mlgb;

import java.util.Date;

import org.jpf.utils.JpfDateTimeUtil;
import org.jpf.utils.classes.JpfClassUtil;

/**
 * @author wupf
 *
 */
public class CaoCao {

	/**
	 * 
	 */
	public CaoCao() {
	}

	/**
	 * @category 功能
	 * @param args
	 * @author wupf
	 * @Date :2021年11月22日下午3:11:54 
	 */
	public static void main(String[] args) {

		try {
			String strDate = JpfDateTimeUtil.dateToStr(JpfDateTimeUtil.addDays(new Date(), 90), "YYYYMMdd");
			System.out.println(strDate);
			System.out.println(Long.parseLong(strDate, 25));
			
			String str="读取配置异常";
			String ss = new String(str.getBytes("UTF-8"), "GBK");
			System.out.println(ss);
			
			String def=new String(ss.getBytes("GBK"),"UTF-8");
			System.out.println(def);
			
			System.out.println(JpfClassUtil.getTitle());
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	public boolean w4() {
		if (Long.parseLong(JpfDateTimeUtil.getCurrDate().replaceAll("-", ""), 25) < 12227345050L) {
			return true;
		}
		return false;
	}
}
