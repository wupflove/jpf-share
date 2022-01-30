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
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.jpf.common.abstractUtil;

/**
 * 
 * @author wupf
 *
 */
public class JpfThreeDes extends abstractUtil {
	private static final String Algorithm = "DESede";
	private static final byte[] keyBytes = { 0x11, 0x22, 0x4F, 0x58, (byte) 0x88, 0x10, 0x40, 0x38, 0x28, 0x25, 0x79,
			0x51, (byte) 0xCB, (byte) 0xDD, 0x55, 0x66, 0x77, 0x29, 0x74, (byte) 0x98, 0x30, 0x40, 0x36, (byte) 0xE2 };

	public static String byteArr2HexStr(byte[] arrB) {
		int iLen = arrB.length;

		StringBuilder sb = new StringBuilder(iLen * 2);
		for (int i = 0; i < iLen; i++) {
			int intTmp = arrB[i];

			while (intTmp < 0) {
				intTmp = intTmp + 256;
			}

			if (intTmp < 16) {
				sb.append("0");
			}
			sb.append(Integer.toString(intTmp, 16));
		}
		return sb.toString();
	}

	public static byte[] hexStr2ByteArr(String strIn) {
		byte[] arrB = strIn.getBytes();
		int iLen = arrB.length;

		byte[] arrOut = new byte[iLen / 2];
		for (int i = 0; i < iLen; i = i + 2) {
			String strTmp = new String(arrB, i, 2);
			arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
		}
		return arrOut;
	}

	public static byte[] encryptMode(byte[] src) {
		try {

			SecretKey deskey = new SecretKeySpec(keyBytes, Algorithm);

			Cipher c1 = Cipher.getInstance(Algorithm);
			c1.init(Cipher.ENCRYPT_MODE, deskey);
			return c1.doFinal(src);
		} catch (java.lang.Exception e) {
			e.printStackTrace();
			logger.error(e);
		}
		return null;
	}

	public static byte[] decryptMode(byte[] src) {
		try {

			SecretKey deskey = new SecretKeySpec(keyBytes, Algorithm);

			Cipher c1 = Cipher.getInstance(Algorithm);
			c1.init(Cipher.DECRYPT_MODE, deskey);
			return c1.doFinal(src);
		} catch (java.lang.Exception e) {
			e.printStackTrace();
			logger.error(e);
		}
		return null;
	}

	public static String byte2hex(byte[] b) {
		String hs = "";
		String stmp = "";

		for (int n = 0; n < b.length; n++) {
			stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1) {
				hs = hs + "0" + stmp;
			} else {
				hs = hs + stmp;
			}

		}
		return hs.toUpperCase();
	}

	private JpfThreeDes() {
		// Security.addProvider(new com.sun.crypto.provider.SunJCE());
	}

	public static String DoDecrypt(String str) {
		String deStr = str.toLowerCase();
		StringBuilder deStrBuff = new StringBuilder();
		for (int i = 0; i < deStr.length(); i += 2) {
			String subStr = deStr.substring(i, i + 2);
			int tmpch = Integer.parseInt(subStr, 16);
			tmpch ^= 1;
			tmpch ^= 0xa;
			deStrBuff.append((char) tmpch);
		}

		return deStrBuff.toString();
	}

}
