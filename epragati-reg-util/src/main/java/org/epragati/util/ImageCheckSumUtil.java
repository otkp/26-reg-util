package org.epragati.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.Base64;

import org.apache.commons.io.IOUtils;
import org.springframework.web.multipart.MultipartFile;

public class ImageCheckSumUtil {
	
	public static String encoder(String imagePath) {
		String base64Image = "";
		File file = new File(imagePath);
		try (FileInputStream imageInFile = new FileInputStream(file)) {
			// Reading a Image file from file system
			byte imageData[] = new byte[(int) file.length()];
			imageInFile.read(imageData);
			base64Image = Base64.getEncoder().encodeToString(imageData);
			IOUtils.closeQuietly(imageInFile);
		} catch (FileNotFoundException e) {
			//System.out.println("Image not found" + e);
		} catch (IOException ioe) {
			//System.out.println("Exception while reading the Image " + ioe);
		}
		return base64Image;
	}
	
	public static String encoder(MultipartFile file) {
		String base64Image = "";
		try {
			// Reading a Image file from file system
			byte imageData[] = file.getBytes();
			base64Image = Base64.getEncoder().encodeToString(imageData);
		} catch (IOException ioe) {
			//System.out.println("Exception while reading the Image " + ioe);
		}
		return base64Image;
	}

	public static void decoder(String base64Image, String pathFile) {
		try (FileOutputStream imageOutFile = new FileOutputStream(pathFile)) {
			// Converting a Base64 String into Image byte array
			byte[] imageByteArray = Base64.getDecoder().decode(base64Image);
			imageOutFile.write(imageByteArray);
		} catch (FileNotFoundException e) {
		//	System.out.println("Image not found" + e);
		} catch (IOException ioe) {
			//System.out.println("Exception while reading the Image " + ioe);
		}
	}
	
	public static void decoder(String base64Image, OutputStream output) throws IOException {
		
		byte[] imageByteArray = Base64.getDecoder().decode(base64Image);
		output.write(imageByteArray);
	}

	public static String hashFile(File file, String algorithm)
	        throws Exception {
	    try (FileInputStream inputStream = new FileInputStream(file)) {
	        MessageDigest digest = MessageDigest.getInstance(algorithm);
	 
	        byte[] bytesBuffer = new byte[1024];
	        int bytesRead = -1;
	 
	        while ((bytesRead = inputStream.read(bytesBuffer)) != -1) {
	            digest.update(bytesBuffer, 0, bytesRead);
	        }
	 
	        byte[] hashedBytes = digest.digest();
	        IOUtils.closeQuietly(inputStream);
	        return convertByteArrayToHexString(hashedBytes);
	    } catch (Exception ex) {
	        throw new Exception(
	                "Could not generate hash from file", ex);
	    }
	}
	
	public static String hashFile(MultipartFile file, String algorithm)
	        throws Exception {
	    try {
	        MessageDigest digest = MessageDigest.getInstance(algorithm);
	        
	        digest.update(file.getBytes());
	        
	        byte[] hashedBytes = digest.digest();
	 
	        return convertByteArrayToHexString(hashedBytes);
	    } catch (Exception ex) {
	        throw new Exception(
	                "Could not generate hash from file", ex);
	    }
	}
	
	public static String convertByteArrayToHexString(byte[] arrayBytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayBytes.length; i++) {
            stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16)
                    .substring(1));
        }
        return stringBuffer.toString();
    }
	
	public static String generateMD5(File file) throws Exception {
	    return hashFile(file, "MD5");
	}
	 
	public static String generateMD5(MultipartFile file)  {
		try {
			return hashFile(file, "MD5");
		} catch (Exception e) {
			return "";
		}
	}
	
	public static String generateSHA1(File file) throws Exception {
	    return hashFile(file, "SHA-1");
	}
	
	public static String generateSHA1(MultipartFile file)  {
		
		try {
			return hashFile(file, "SHA-1");
		} catch (Exception exception) {
			return "";
		}
	}
	 
	public static String generateSHA256(File file) throws Exception {
	    return hashFile(file, "SHA-256");
	}
}
