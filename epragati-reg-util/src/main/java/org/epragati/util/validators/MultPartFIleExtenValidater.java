package org.epragati.util.validators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.validation.ConstraintValidatorContext;

import org.epragati.exception.BadRequestException;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author yugandhar
 *
 */
@Component
public class MultPartFIleExtenValidater {
	public static String[] whitListextentions = { "JPEG", "JPG", "PDF", "PNG" };

	public Optional<String> getExtensionByStringHandling(String filename) {
		return Optional.ofNullable(filename).filter(f -> f.contains("."))
				.map(f -> f.substring(filename.lastIndexOf(".") + 1));
	}

	public boolean extentionValidater(String fileName) {
		Optional<String> extention = this.getExtensionByStringHandling(fileName);
		List<String> list = Arrays.asList(whitListextentions);
		if (!list.contains(extention.get())) {
			throw new BadRequestException("Only PNG or JPG or PDF type documents are allowed.");
		}
		return true;

	}
	

	    public boolean isValidDoucment(MultipartFile multipartFile) {

	            String fileName=multipartFile.getOriginalFilename();
	            boolean result=this.extentionValidater(fileName);
	            return result;
	    }

	    private boolean isSupportedContentType(String contentType) {
	        return contentType.equals("image/png")
	                || contentType.equals("image/jpg")
	                || contentType.equals("image/jpeg");
	    }

}
