package com.Final.May.controller;



import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Final.May.DTO.CompDTO;
import com.Final.May.Service.CompanyService;
import com.Final.May.repository.CompanyRepository;

@RestController

public class ComController {
@Autowired
CompanyRepository repository;
@Autowired
CompanyService companyService;

CompDTO CompanyDTO = new CompDTO("elm@sa.sa", "0554334455","riyadh", "udfjkfyuiu","6","Elm",
		Timestamp.valueOf("2018-02-16 04:38:15.123456789"), Timestamp.valueOf("2018-07-16 04:38:15.123456789") );


@RequestMapping("/Com.save")
public String save() {
 companyService.createCompanyDTO(CompanyDTO);
 
 
// repository.save(new Company("kfrjppttdjd","hllyggyfd",Timestamp.valueOf("2018-02-16 04:38:15.123456789"),Timestamp.valueOf("2018-02-16 04:38:15.123456789")));
 // repository.save(new Individual("jhf","hfd","jffhf","kdkf","jfhdjh","May","A","Alrabie","Femle","Singl","d",null,null,"Uugfd","uhfrtre"));
   return "Company save";
 }

// @RequestMapping("/Com.found")
//    public String process() {
//	 companyService.getById("674392832");
//	 
	 
  // repository.save(new Company("kfrjppttdjd","hllyggyfd",Timestamp.valueOf("2018-02-16 04:38:15.123456789"),Timestamp.valueOf("2018-02-16 04:38:15.123456789")));
     // repository.save(new Individual("jhf","hfd","jffhf","kdkf","jfhdjh","May","A","Alrabie","Femle","Singl","d",null,null,"Uugfd","uhfrtre"));
//       return "Company found";
//     }
@RequestMapping("/updateCom")
public CompDTO updatECom() throws Exception

{
	return companyService.updatepassword("6", "76543210");
	
}

 }
      