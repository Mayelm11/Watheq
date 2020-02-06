package com.Final.May.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Final.May.repository.CompanyRepository;

@RestController

public class ComController {
@Autowired
CompanyRepository repository;
 @RequestMapping("/Com.save")
    public String process() {

  // repository.save(new Company("kfrjppttdjd","hllyggyfd",Timestamp.valueOf("2018-02-16 04:38:15.123456789"),Timestamp.valueOf("2018-02-16 04:38:15.123456789")));
     // repository.save(new Individual("jhf","hfd","jffhf","kdkf","jfhdjh","May","A","Alrabie","Femle","Singl","d",null,null,"Uugfd","uhfrtre"));
       return "Company Done";
     }} 
      