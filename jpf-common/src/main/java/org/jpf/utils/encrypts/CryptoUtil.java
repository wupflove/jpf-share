/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.encrypts;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.jpf.common.abstractUtil;

/**
 * @see 数据库密码加解密方法
 * @author wupf
 */
public class CryptoUtil extends abstractUtil {
	
	
	private CryptoUtil() {}
	// 私钥，不可更改，否则会导致解密失败
	public final static String AES_KEY = "bladtestcloudaes";

	public final static String ENCODING = "utf-8";

	/**
	 * 加密
	 * 
	 * @param content
	 *            需要加密的内容
	 * @param password
	 *            加密密码
	 * @return
	 */
	@SuppressWarnings("restriction")
	public static String Encrypt(String sSrc, String sKey) {
		try {
			Base64 base64encoder = new Base64(true);
			if (sKey == null) {
				logger.error("数据库密码加密的key为空!");
				return null;
			}
			// 判断Key是否为16位
			if (sKey.length() != 16) {
				logger.error("数据库密码加密的key长度不是16位!");
				return null;
			}
			byte[] raw = sKey.getBytes(ENCODING);
			SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
			Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");// "算法/模式/补码方式"
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
			byte[] encrypted = cipher.doFinal(sSrc.getBytes(ENCODING));
			return new String(base64encoder.encode(encrypted), ENCODING);// 此处使用BASE64做转码功能，同时能起到2次加密的作用。
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return null;
		}
	}

	/**
	 * 
	 * @category
	 * @param sSrc
	 * @param sKey
	 * @return
	 * @since 2020年1月28日 
	 * @author wupf
	 */
	public static String Decrypt(String sSrc, String sKey) {
		try {
			Base64 base64decoder = new Base64(true);
			// 判断Key是否正确
			if (sKey == null) {
				logger.error("数据库密码加密的key为空!");
				return null;
			}
			// 判断Key是否为16位
			if (sKey.length() != 16) {
				logger.error("数据库密码加密的key长度不是16位!");
				return null;
			}
			byte[] raw = sKey.getBytes(ENCODING);
			SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
			Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
			cipher.init(Cipher.DECRYPT_MODE, skeySpec);
			byte[] encrypted1 = base64decoder.decode(sSrc);// 先用base64解密
			byte[] original = cipher.doFinal(encrypted1);
			return new String(original, ENCODING);
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
			return null;
		}
	}

}
