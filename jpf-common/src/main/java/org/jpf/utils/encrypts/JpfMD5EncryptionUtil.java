/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.encrypts;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.jpf.common.abstractUtil;

/**
 * 
 * @author wupf
 *
 */
public class JpfMD5EncryptionUtil extends abstractUtil {

	private JpfMD5EncryptionUtil() {}
	
	public static String getEncryption(String originString) {
		String result = "";
		if (originString != null) {
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				byte bytes[] = md.digest(originString.getBytes());
				for (int i = 0; i < bytes.length; i++) {
					String str = Integer.toHexString(bytes[i] & 0xFF);
					if (str.length() == 1) {
						str += "F";
					}
					result += str;
				}
				result = result.toUpperCase();
			} catch (NoSuchAlgorithmException e) {
				logger.error("No such algorithmException.", e);
				return originString;
			}
		}
		return result;
	}
}
