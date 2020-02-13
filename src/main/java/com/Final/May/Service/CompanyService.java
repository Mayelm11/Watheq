package com.Final.May.Service;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.Final.May.DTO.CompDTO;
import com.Final.May.ExceptionHandler.NotFoundException;
import com.Final.May.ModelMapper.CompanyMapperImp;
import com.Final.May.model.Company;
import com.Final.May.repository.CompanyRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class CompanyService {

	private CompanyRepository companyRepository;
	private static final CompanyMapperImp ComMapper = new CompanyMapperImp();

	public CompDTO createCompanyDTO(CompDTO companyDTO) {

		Company company = Company.builder()
				.email(companyDTO.getEmail())              
				.phone_number(companyDTO.getPhoneNumber())
				.address(companyDTO.getAddress())
				.password(companyDTO.getPassword())
				.cR(companyDTO.getCR())
				.companyName(companyDTO.getCompanyName())
				.startDate(companyDTO.getStartDate())
				.endDate(companyDTO.getEndDate())
				.build();

		Company saveCompany = companyRepository.save(company);
		return ComMapper.domainToDto(saveCompany);

	}
//	public Company getById(String id) {
//        try {
//            return companyRepository.findById(id).get();
//        }catch (NoSuchElementException ex) {
//            throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", id));
//        }
//    }
	 public CompDTO updatepassword(String CR, String password){
			try { 
				companyRepository.updatePassword(CR, password);
			return companyRepository.findById(CR)
					 .map(ComMapper::domainToDto).get(); 
			}catch (NoSuchElementException ex)
			{
				throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", CR ));
			
			}

	 }}



