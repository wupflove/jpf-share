/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.encrypts;

import java.security.SecureRandom;
import java.util.Random;

import org.apache.commons.codec.digest.DigestUtils;
import org.jpf.common.abstractUtil;

/**
 * md6算法
 * 
 * @author wupf
 */
public class MD6Util extends abstractUtil {

	private MD6Util() {}
	
	private static final String CHS_STR = "0123456789abcdefghijklmnopqrstuvwxyz";

	/**
	 * MD6字符串
	 * 
	 * @param content 待加密字符串
	 * @return String
	 */
	public static String md6(String content) {
		Random random1 = new SecureRandom();
		int rd1 = random1.nextInt(35);
		Random random2 = new SecureRandom();
		int rd2 = random2.nextInt(35);
		String rdStr = String.valueOf(CHS_STR.charAt(rd1)) + String.valueOf(CHS_STR.charAt(rd2));
		String str = DigestUtils.md5Hex(rdStr + content);
		str = rdStr + str.substring(0, 30);
		return str;
	}

	/**
	 * 比较待加密的字符串加密后和加密串是否相同
	 * 
	 * @param md6Str md6加密串
	 * @param content 待加密串
	 * @return boolean
	 */
	public static boolean isEqual(String md6Str, String content) {
		if (md6Str == null || md6Str.length() != 32) {
			return false;
		}
		String rdStr = md6Str.substring(0, 2);
		String str = DigestUtils.md5Hex(rdStr + content);
		str = rdStr + str.substring(0, 30);
		if (str.equals(md6Str)) {
			return true;
		}
		return false;
	}

}
