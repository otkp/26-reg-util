package org.epragati.motordrivingschool.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.epragati.images.vo.InputVO;
import org.epragati.master.vo.ApplicantSearchWithOutIdInput;
import org.epragati.master.vo.DriverDetailsVO;
import org.epragati.master.vo.MotorDrivingSchoolVO;
import org.epragati.regservice.vo.MobileApplicationStatusVO;
import org.epragati.service.enclosure.vo.CitizenImagesInput;
import org.springframework.web.multipart.MultipartFile;

public interface MotorDrivingSchoolService {
	

	DriverDetailsVO getDriverDetails(ApplicantSearchWithOutIdInput input, String schoolType);

	void getRepresentativeDetails(String aadharNo);

	Optional<MotorDrivingSchoolVO> convertJsonToMotorDrivingSchoolObject(String userVO);

	Optional<MotorDrivingSchoolVO> motorDrivingSchoolSave(MotorDrivingSchoolVO vo, MultipartFile[] uploadfiles) throws IOException;

	MotorDrivingSchoolVO getVehicleDetails(List<String> prNo, String schoolType);

	Optional<InputVO> getListOfSupportedEnclosers(CitizenImagesInput input);

	MotorDrivingSchoolVO checkStatus(String applicationNo, String schoolRegNumber);
	

}
