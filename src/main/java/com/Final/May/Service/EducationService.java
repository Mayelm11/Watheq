package com.Final.May.Service;


import org.springframework.stereotype.Service;
import com.Final.May.ModelMapper.EducationMapperImp;
import com.Final.May.model.Education;
import com.Final.May.repository.EduRepository;
import com.Final.MayDTO.EduDTO;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor


public class EducationService {

	private EduRepository educationRepository;

	private static final EducationMapperImp educationMapperImp = new EducationMapperImp();


	public EduDTO createEducationDTO(EduDTO educationDTO) {

		Education education = Education.builder()
				.email(educationDTO.getEmail())              
				.phone_number(educationDTO.getPhone_number())              
				.address(educationDTO.getAddress())
				.password(educationDTO.getPassword())
				.edu_iD(educationDTO.getEdu_iD())
				.eDU_NAME(educationDTO.getEDU_NAME())

				.build();

		Education saveEducation = educationRepository.save(education);  
		return educationMapperImp.domainToDto(saveEducation);

	}
}

