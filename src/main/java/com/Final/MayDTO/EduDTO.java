package com.Final.MayDTO;


public class EduDTO  extends UserDTO {
	
	  private String Edu_iD;
	  private String EDU_NAME;
	public String getEdu_iD() {
		return Edu_iD;
	}
	public void setEdu_iD(String edu_iD) {
		Edu_iD = edu_iD;
	}
	public String getEDU_NAME() {
		return EDU_NAME;
	}
	public void setEDU_NAME(String eDU_NAME) {
		EDU_NAME = eDU_NAME;
	}
	public EduDTO(String email, String phoneNumber, String address, String password, String edu_iD, String eDU_NAME) {
		super(email, phoneNumber, address, password);
		Edu_iD = edu_iD;
		EDU_NAME = eDU_NAME;
	}
	public EduDTO() {
		super();
	}
	


}
