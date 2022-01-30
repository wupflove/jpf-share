/**
 * Copyright (C) 1997-2022 
 *
 * This file is part of org.jpf
 * @author wupingfu
 * @version 1.0.0
 * 
 **/
package org.jpf.utils.encrypts;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;

import org.apache.commons.codec.binary.Base64;
import org.jpf.common.abstractUtil;
import org.jpf.utils.JpfCloseUtil;

/**
 * RSA 工具类。提供加密，解密，生成密钥对等方法。
 * @author wupf
 */
public class RSAUtil extends abstractUtil {
	private RSAUtil() {
	}

	private static final String RSA_ECB_PADDING = "RSA/ECB/PKCS1Padding";

	public static final String PUBLIC_KEY = "publicKey";

	public static final String PRIVATE_KEY = "privateKey";

	private static final String KEY_ALGORITHM = "RSA";

	public static final String CHARSET = "UTF-8";

	public static final int KEY_SIZE = 2048;

	/**
	 * * 生成密钥对 *
	 *
	 * @param keySize key size
	 * @return KeyPair 密钥对
	 * @throws NoSuchAlgorithmException NoSuchAlgorithmException
	 */
	public static KeyPair generateKeyPair(int keySize) throws NoSuchAlgorithmException {
		KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance(KEY_ALGORITHM);
		keyPairGen.initialize(keySize, new SecureRandom());
		KeyPair keyPair = keyPairGen.generateKeyPair();
		System.out.println("privateKey:" + keyPair.getPrivate());
		System.out.println("publicKey:" + keyPair.getPublic());
		return keyPair;

	}

	/**
	 * map中的公钥和私钥都经过base64编码
	 * 
	 * @param keySize size of key
	 * @return map
	 */
	public static Map<String, String> createKeys(int keySize) {
		try {
			KeyPair keyPair = RSAUtil.generateKeyPair(keySize);
			Key publicKey = keyPair.getPublic();
			String publicKeyStr = Base64.encodeBase64URLSafeString(publicKey.getEncoded());
			Key privateKey = keyPair.getPrivate();
			String privateKeyStr = Base64.encodeBase64URLSafeString(privateKey.getEncoded());
			Map<String, String> keyPairMap = new HashMap<>();
			keyPairMap.put(PUBLIC_KEY, publicKeyStr);
			keyPairMap.put(PRIVATE_KEY, privateKeyStr);
			return keyPairMap;
		} catch (Exception e) {

			e.printStackTrace();
			logger.error(e);
		}
		return null;
	}

	/**
	 * 根据秘钥对KeyPair获取公钥
	 * 
	 * @param keyPair KeyPair
	 * @return String
	 */
	public static String getPublicKey(KeyPair keyPair) {
		Key publicKey = keyPair.getPublic();
		return Base64.encodeBase64URLSafeString(publicKey.getEncoded());
	}

	/**
	 * 根据秘钥对KeyPair获取私钥
	 * 
	 * @param keyPair KeyPair
	 * @return String
	 */
	public static String getPrivateKey(KeyPair keyPair) {
		Key privateKey = keyPair.getPrivate();
		return Base64.encodeBase64URLSafeString(privateKey.getEncoded());
	}

	/**
	 * @category 从文件中获取RSA的密钥对
	 *
	 * @param filePath 文件路径
	 * @return KeyPair KeyPair
	 * @throws Exception Exception
	 */
	public static KeyPair getKeyPair(String filePath) throws Exception {
		FileInputStream fis = null;
		ObjectInputStream oos = null;
		try {
			fis = new FileInputStream(filePath);
			oos = new ObjectInputStream(fis);
			KeyPair kp = (KeyPair) oos.readObject();
			return kp;
		} finally {
			JpfCloseUtil.close(oos);
			JpfCloseUtil.close(fis);
		}

	}

	/**
	 * 保存秘钥到文件中
	 *
	 * @param kp       秘钥对
	 * @param filePath 保存秘钥的文件路径
	 * @throws Exception Exception
	 */
	public static void saveKeyPair(KeyPair kp, String filePath) throws Exception {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			File file = new File(filePath);
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			// 生成密钥
			oos.writeObject(kp);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
		} finally {
			JpfCloseUtil.close(oos);
			JpfCloseUtil.close(fos);
		}

	}

	/**
	 * 根据以保存的私密对已加密的字符串进行解密
	 *
	 * @param plaintext  待解密的字符串
	 * @param privateKey 字符串私钥
	 * @return 返回解密后对的字符串
	 */
	public static String decryptString(String plaintext, String privateKey) {
		return RSAUtil.privateDecrypt(plaintext, RSAUtil.getPrivateKey(privateKey));
	}

	/**
	 * 根据公匙加密字符串
	 *
	 * @param plaintext 待加密的字符串
	 * @param publicKey 字符串公钥
	 * @return String
	 */
	public static String encryptString(String plaintext, String publicKey) throws Exception {
		if (publicKey == null || plaintext == null) {
			return null;
		}
		return RSAUtil.publicEncrypt(plaintext, RSAUtil.getPublicKey(publicKey));
	}

	/**
	 * 得到公钥
	 *
	 * @param publicKey 密钥字符串（经过base64编码）
	 * @return RSAPublicKey
	 */
	public static RSAPublicKey getPublicKey(String publicKey) {
		try {
			KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
			X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(Base64.decodeBase64(publicKey));
			RSAPublicKey key = (RSAPublicKey) keyFactory.generatePublic(x509KeySpec);
			return key;
		} catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
			e.printStackTrace();
			logger.error(e);
		}
		return null;
	}

	/**
	 * 得到私钥
	 *
	 * @param privateKey 密钥字符串（经过base64编码）
	 * @return RSAPrivateKey
	 */
	public static RSAPrivateKey getPrivateKey(String privateKey) {
		try {
			KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
			PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(Base64.decodeBase64(privateKey));
			RSAPrivateKey key = (RSAPrivateKey) keyFactory.generatePrivate(pkcs8KeySpec);
			return key;
		} catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
			e.printStackTrace();
			logger.error(e);
		}
		return null;
	}

	/**
	 * 公钥加密
	 *
	 * @param plaintext 待加密的字符串
	 * @param publicKey 字符串公钥
	 * @return String
	 */
	public static String publicEncrypt(String plaintext, RSAPublicKey publicKey) {
		try {
			Cipher cipher = Cipher.getInstance(KEY_ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			return Base64.encodeBase64URLSafeString(rsaSplitCodec(cipher, Cipher.ENCRYPT_MODE,
					plaintext.getBytes(CHARSET), publicKey.getModulus().bitLength()));
		} catch (Exception e) {
			throw new RuntimeException("An exception occurred while encrypting the string [" + plaintext + "]", e);
		}
	}

	/**
	 * 私钥解密
	 *
	 * @param plaintext  待加密的字符串
	 * @param privateKey 字符串公钥
	 * @return String
	 */

	public static String privateDecrypt(String plaintext, RSAPrivateKey privateKey) {
		try {
			Cipher cipher = Cipher.getInstance(KEY_ALGORITHM);
			cipher.init(Cipher.DECRYPT_MODE, privateKey);
			return new String(rsaSplitCodec(cipher, Cipher.DECRYPT_MODE, Base64.decodeBase64(plaintext),
					privateKey.getModulus().bitLength()), CHARSET);
		} catch (Exception e) {
			throw new RuntimeException("An exception occurred while decrypting the string [" + plaintext + "]", e);
		}
	}

	/**
	 * 
	 * @param cipher
	 * @param opmode
	 * @param datas
	 * @param keySize
	 * @return
	 * @throws Exception
	 */
	public static byte[] rsaSplitCodec(Cipher cipher, int opmode, byte[] datas, int keySize) throws Exception {
		ByteArrayOutputStream out = null;
		try {
			int maxBlock;
			if (opmode == Cipher.DECRYPT_MODE) {
				maxBlock = keySize / 8;
			} else {
				maxBlock = keySize / 8 - 11;
			}
			out = new ByteArrayOutputStream();
			int offSet = 0;
			byte[] buff;
			int i = 0;
			try {
				while (datas.length > offSet) {
					if (datas.length - offSet > maxBlock) {
						buff = cipher.doFinal(datas, offSet, maxBlock);
					} else {
						buff = cipher.doFinal(datas, offSet, datas.length - offSet);
					}
					out.write(buff, 0, buff.length);
					i++;
					offSet = i * maxBlock;
				}
			} catch (Exception e) {
				throw new RuntimeException(
						"An exception occurred when the encryption and decryption threshold was [" + maxBlock + "]", e);
			}
			byte[] resultDatas = out.toByteArray();

			return resultDatas;
		} finally {
			JpfCloseUtil.close(out);
		}

	}

}
