package com.Final.MayDTO;

import java.sql.Timestamp;



public class CompDTO  extends UserDTO {
	   private String CR;
	   private String CompanyName;
	   private Timestamp StartDate;
	   private Timestamp EndDate;

	   
	   
	public String getCR() {
		return CR;
	}

	public void setCR(String cR) {
		CR = cR;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public Timestamp getStartDate() {
		return StartDate;
	}

	public void setStartDate(Timestamp startDate) {
		StartDate = startDate;
	}

	public Timestamp getEndDate() {
		return EndDate;
	}

	public void setEndDate(Timestamp endDate) {
		EndDate = endDate;
	}


	public CompDTO(String email, String phoneNumber, String address, String password, String cR, String companyName,
			Timestamp startDate, Timestamp endDate) {
		super(email, phoneNumber, address, password);
		CR = cR;
		CompanyName = companyName;
		StartDate = startDate;
		EndDate = endDate;
	}

	public CompDTO() {
		super();
		
	}
}
	   
	