package org.epragati.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class RCBase64EncoderDecoderUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(RCBase64EncoderDecoderUtil.class);
	
	@Autowired
	private ResourceLoader resourceLoader;
	
	public String getFileName(String value) {
		String base64String = "";
		Resource resource = resourceLoader.getResource("classpath:" + "images\\" + value);
		String encodstring = null;
		try {
			encodstring = encodeFileToBase64Binary(resource.getFile());
			return base64String = encodstring;
		} catch (IOException e) {
			e.printStackTrace();
			return base64String;
		}
	}
	public String encodeFileToBase64Binary(File file) {
		String encodedfile = null;
		FileInputStream fileInputStreamReader = null;
		try {
			fileInputStreamReader = new FileInputStream(file);
			byte bytes[] = new byte[(int) file.length()];
			fileInputStreamReader.read(bytes);
			//encodedfile = Base64.encodeBase64URLSafeString(bytes);
			encodedfile = new String(Base64.encodeBase64(bytes), "UTF-8");
			return encodedfile;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(fileInputStreamReader);
		}
		return encodedfile;
	}
	// converting String to localdatetime
	public static LocalDateTime convertingStringToLocalDateTime(String localDateTime) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.parse(localDateTime, formatter);
		return dateTime;
	}
	// converting localdate format to dd-mm-yyyy format.
	public static String convertLocalDateFormat(LocalDate date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return date.format(formatter);
	}
}
