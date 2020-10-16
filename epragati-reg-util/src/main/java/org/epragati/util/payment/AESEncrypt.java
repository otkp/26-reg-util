package org.epragati.util.payment;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.crypto.provider.SunJCE;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class AESEncrypt {
	private String secretKey;
	private static final Logger logger = LoggerFactory.getLogger(AESEncrypt.class);

	public AESEncrypt() {
		this.secretKey = null;
	}

	static {
		Security.addProvider(new SunJCE());

		Security.insertProviderAt(new SunJCE(), 1);
	}

	public String decryptFile(String s) {
		String decdata = null;
		byte[] key = (byte[]) null;
		try {
			key = returnbyte(this.secretKey);
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
			logger.info("Provider Info {}", cipher.getProvider().getInfo());
			byte[] keyBytes = new byte[16];

			int len = key.length;
			if (len > keyBytes.length) {
				len = keyBytes.length;
			}
			System.arraycopy(key, 0, keyBytes, 0, len);
			SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
			IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);
			cipher.init(2, keySpec, ivSpec);
			BASE64Decoder decoder = new BASE64Decoder();
			byte[] results = decoder.decodeBuffer(s);
			byte[] ciphertext = cipher.doFinal(results);
			decdata = new String(ciphertext, "UTF-8");
		} catch (IOException e) {
			logger.error(" Encryption key file is not found in the location {}",secretKey);
		} catch (Exception ex) {
			logger.info("Exception occured : {}" , ex);
		}
		return decdata;
	}

	public String encryptFile(String s) {
		byte[] key = (byte[]) null;
		String encData = null;
		try {
			key = returnbyte(this.secretKey);
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
			logger.info("Provider Info {} " , cipher.getProvider().getInfo());
			byte[] keyBytes = new byte[16];
			int len = key.length;
			if (len > keyBytes.length) {
				len = keyBytes.length;
			}
			System.arraycopy(key, 0, keyBytes, 0, len);
			SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
			IvParameterSpec ivSpec = new IvParameterSpec(keyBytes);
			cipher.init(1, keySpec, ivSpec);
			byte[] results = cipher.doFinal(s.getBytes("UTF-8"));
			BASE64Encoder encoder = new BASE64Encoder();
			encData = encoder.encode(results);
		} catch (IOException e) {
			logger.error(" Encryption key file is not found in the location  {}",secretKey);
		} catch (Exception ex) {
			logger.info("Exception occured : {}" ,ex);
		}
		return encData;
	}

	byte[] returnbyte(String path) throws IOException {
		FileInputStream fileinputstream = new FileInputStream(path);
		byte[] abyte = new byte[fileinputstream.available()];
		fileinputstream.read(abyte);
		fileinputstream.close();
		return abyte;
	}

	public void setSecretKey(String s) {
		this.secretKey = s;
	}

	public void setLog4Path(String s) {
		PropertyConfigurator.configure(s);
	}
}
