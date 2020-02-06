package com.Final.May.Service;

import org.springframework.stereotype.Service;

import com.Final.May.ModelMapper.IndividualMapperIm;
import com.Final.May.model.Individual;
import com.Final.May.repository.IndividualRepository;
import com.Final.MayDTO.IndivDTO;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class IndividualService {
	private IndividualRepository individualRepository;
	 private static final IndividualMapperIm individualMapper = new IndividualMapperIm();
	 public IndivDTO createIndividualDTO(IndivDTO individualDTO) {
	  
	  Individual individual = Individual.builder()
	                 .email(individualDTO.getEmail())
	                .phone_number(individualDTO.getPhone_number())
	                .address(individualDTO.getAddress())
	                .password(individualDTO.getPassword())
	                .nationalID(individualDTO.getNationalID())
	                .firstname(individualDTO.getFirstName())
	                .mName(individualDTO.getLastName())
	                .lastname(individualDTO.getMName())
	                .gender(individualDTO.getGender())
	                .status(individualDTO.getStatus())
	                .skills(individualDTO.getSkills())
	                .dOB(individualDTO.getDOB())
	                .attachments(individualDTO.getAttachments())
	                .jOP(individualDTO.getJop())
	                .mAJOR(individualDTO.getMajor())


	                .build();
	  Individual saveIndividual = individualRepository.save(individual);
	        return individualMapper.domainToDto(saveIndividual);
	        
	    }

}
