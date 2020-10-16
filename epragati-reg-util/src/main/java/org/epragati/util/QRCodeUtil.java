package org.epragati.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
/**
 * 
 * @author saroj.sahoo
 *
 */
@Component
public class QRCodeUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(QRCodeUtil.class);
	
	public String createQRCode(String qrData) throws  IOException, WriterException {
		String charset = "UTF-8";
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		BufferedImage bi = createQRCode(qrData, charset, 200, 200);
		ImageIO.write(bi, "png", baos);
		baos.flush();
		byte[] imageInByte = baos.toByteArray();
		baos.close();
		return Base64.encodeBase64String(imageInByte);

	}
	public BufferedImage createQRCode(String qrCodeData, String charset, int qrCodeheight, int qrCodewidth)
			throws IOException, WriterException {
		int BLACK = 0xFF000000;
		int WHITE = 0xFFFFFFFF;

		// Generate BitMatrix
		BitMatrix matrix = new MultiFormatWriter().encode(new String(qrCodeData.getBytes(charset), charset),
				BarcodeFormat.QR_CODE, qrCodewidth, qrCodeheight);
		int width = matrix.getWidth();
		int height = matrix.getHeight();

		// Converting BitMatrix to Buffered Image
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				image.setRGB(x, y, matrix.get(x, y) ? BLACK : WHITE);
			}
		}
		return image;
	}

}
