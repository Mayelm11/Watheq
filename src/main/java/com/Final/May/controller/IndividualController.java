package com.Final.May.controller;


import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Final.May.DTO.IndivDTO;
import com.Final.May.Service.IndividualService;

@RestController

public class IndividualController {
	@Autowired
	//IndividualRepository repository;
	IndividualService individualService;
	//@RequestMapping("/save")
	//  public String process() {

	// repository.save(new Individual("mayalrttaee@hotmail.com","05690956651","mayyaqy","mayyy234q","mmuuii77q","Maqiiy","Aiibdqulmo","hfqiihf",true,"oqio","dqsiss",Timestamp.valueOf("2018-02-16 04:38:15.123456789"),"Uuologfd","uhfrlltre","ollo"));
	//repository.deleteAll();
	//   return "Done";
	// } g
	IndivDTO individualDTO = new IndivDTO("ylrjuhyyytttgtsa@gmail.com","0560345987089095","marrufffjffjjqy","maykgggdyegggfffyhgfdq","1776766478","Maqllsdssgfdllihhy","Aiidbddhdqulmo","hfqhiigfdhf",true,"ohdfffffffqio","dhqswdsiss",
			Timestamp.valueOf("2018-02-16 04:38:15.123456789"),"Uhhuolssogfd","uhfhhrlltssre","ollhsso");

	@RequestMapping("/create")
	public String create() {

		individualService.createIndividualDTO(individualDTO);
		return "Create Done"; 
	
	
}}



