package com.Final.May.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Final.May.repository.EduRepository;

@RestController


public class EduController {
@Autowired
EduRepository repository;
 @RequestMapping("/Edu.save")
    public String process() {

 //  repository.save(new Education("kjdjdjjh","hfhhhhd"));
     // repository.save(new Individual("jhf","hfd","jffhf","kdkf","jfhdjh","May","A","Alrabie","Femle","Singl","d",null,null,"Uugfd","uhfrtre"));
       return "Edu Done";
     }
 
 
}
      