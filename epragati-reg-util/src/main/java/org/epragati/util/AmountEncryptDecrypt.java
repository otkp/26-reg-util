package org.epragati.util;


import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author saroj.sahoo
 *
 */
public class AmountEncryptDecrypt {
	
	private final static Logger logger = LoggerFactory.getLogger(EncryptDecryptUtil.class);
	
	private static String SECRET_KEY_1 = "ssdkF$ANy2A#D%kd";
	
	private static IvParameterSpec ivParameterSpec;
	
	private static SecretKeySpec secretKeySpec;
	
	private static Cipher cipher;
	
	private static String APPEND_CHAR = "enc_";

	public static void init() {
		try {
			secretKeySpec = new SecretKeySpec(SECRET_KEY_1.getBytes(), "AES");
			cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			byte[] iv = new byte[cipher.getBlockSize()];
			ivParameterSpec = new IvParameterSpec(iv);
		} catch (Exception e) {
			logger.error("Exception while AmountEncryptDecrypt .init() execution [{}]", e);
		}
	}
	
	public static String encryptAmount(Double toBeEncrypt) {
		String encryptedData = String.valueOf(toBeEncrypt);
		byte[] encrypted = null;
		try {
			init();
			cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
			encrypted = cipher.doFinal(encryptedData.getBytes());
		} catch (Exception e) {
			logger.error("Exception while AmountEncryptDecrypt .encryptAmount() execution [{}]", e);
		}
		return APPEND_CHAR + Base64.encodeBase64String(encrypted);

	}

	public static String encryptAmount(String toBeEncrypt) {
		byte[] encrypted = null;
		try {
			init();
			cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
			encrypted = cipher.doFinal(toBeEncrypt.getBytes());
		} catch (Exception e) {
			logger.error("Exception while AmountEncryptDecrypt .encryptAmount() execution [{}]", e);
		}
		return APPEND_CHAR + Base64.encodeBase64String(encrypted);

	}

	public static Double decryptAmount(String encrypted) {
		if (encrypted.startsWith(APPEND_CHAR)) {
			String encrypt = encrypted.replace(APPEND_CHAR, "");
			byte[] decryptedBytes = null;
			try {
				init();
				cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
				decryptedBytes = cipher.doFinal(Base64.decodeBase64(encrypt));
			} catch (Exception e) {
				logger.error("Exception while AmountEncryptDecrypt .decryptAmount() execution [{}]", e);
			}
			String decryptedString = new String(decryptedBytes);
			return Double.parseDouble(decryptedString);
		}
		return Double.parseDouble(encrypted);
	}

}
