package com.Final.May.Service;

import org.springframework.stereotype.Service;

import com.Final.May.DTO.IndivDTO;
import com.Final.May.ModelMapper.IndividualMapperIm;
import com.Final.May.model.Individual;
import com.Final.May.repository.IndividualRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class IndividualService {
	private IndividualRepository individualRepository;
	 private static final IndividualMapperIm individualMapper = new IndividualMapperIm();
	 public IndivDTO createIndividualDTO(IndivDTO individualDTO) {
	  
	  Individual individual = Individual.builder()
	                 .email(individualDTO.getEmail())
	                .phone_number(individualDTO.getPhoneNumber())
	                .address(individualDTO.getAddress())
	                .password(individualDTO.getPassword())
	                .NationalID(individualDTO.getNationalID())
	                .Firstname(individualDTO.getFirstName())
	                .MName(individualDTO.getMName())
	                .Lastname(individualDTO.getLastName())
	                .Gender(individualDTO.getGender())
	                .Status(individualDTO.getStatus())
	                .Skills(individualDTO.getSkills())
	                .DOB(individualDTO.getDOB())
	                .Attachments(individualDTO.getAttachments())
	                .JOP(individualDTO.getJOP())
	                .MAJOR(individualDTO.getMAJOR())


	                .build();
	  Individual saveIndividual = individualRepository.save(individual);
	        return individualMapper.domainToDto(saveIndividual);
	        
	    }

}
