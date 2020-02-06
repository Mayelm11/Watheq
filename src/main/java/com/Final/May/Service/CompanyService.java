package com.Final.May.Service;

import org.springframework.stereotype.Service;

import com.Final.May.ModelMapper.CompanyMapperImp;
import com.Final.May.model.Company;
import com.Final.May.repository.CompanyRepository;
import com.Final.MayDTO.CompDTO;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class CompanyService {

	private CompanyRepository companyRepository;
	private static final CompanyMapperImp ComMapper = new CompanyMapperImp();

	public CompDTO createCompanyDTO(CompDTO companyDTO) {

		Company company = Company.builder()
				.email(companyDTO.getEmail())              
				.phone_number(companyDTO.getPhone_number())
				.address(companyDTO.getAddress())
				.password(companyDTO.getPassword())
				.companyName(companyDTO.getCompanyName())
				.cR(companyDTO.getCR())
				.startDate(companyDTO.getStartDate())
				.endDate(companyDTO.getEndDate())
				.build();

		Company saveCompany = companyRepository.save(company);
		return ComMapper.domainToDto(saveCompany);

	}

}



