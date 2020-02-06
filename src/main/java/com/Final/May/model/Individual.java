package com.Final.May.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Builder;

 
@Entity
@Table(name = "Individual")
public class Individual extends W_User implements Serializable {
 
  private static final long serialVersionUID = -3009157732242241606L;
  //@Id
  @Column(name = "NationalID",unique=true, nullable = false)
  @NotNull(message = " cannot be Empty ")
  @Min(value = 10, message = "Nationa should not be less than 18")
  @Max(value = 10, message = "Nationa should not be greater than 150")
  private String NationalID;
  
  
  @Column(name = "Firstname", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String Firstname;
  
  @Column(name = "MName", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String MName;
 
  @Column(name = "Lastname", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String Lastname;
  
 
  @Column(name = "Gender", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private Boolean Gender;
  
  @Column(name = "Status")
  @NotNull(message = " cannot be Empty ")
  private String Status;
  
  @Column(name = "Skills")
  @NotNull(message = " cannot be Empty ")
  private String Skills;
  
  
  @Column(name = "DOB", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private Timestamp DOB;
  
  @Column(name = "MAJOR",  nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String MAJOR;
  
  @Column(name = "Attachments",  nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String Attachments;
  

  
  @Column(name = "JOP",  nullable = false)
  private String JOP;



public String getNationalID() {
	return NationalID;
}



public void setNationalID(String nationalID) {
	NationalID = nationalID;
}



public String getFirstname() {
	return Firstname;
}



public void setFirstname(String firstname) {
	Firstname = firstname;
}



public String getMName() {
	return MName;
}



public void setMName(String mName) {
	MName = mName;
}



public String getLastname() {
	return Lastname;
}



public void setLastname(String lastname) {
	Lastname = lastname;
}



public Boolean getGender() {
	return Gender;
}



public void setGender(Boolean gender) {
	Gender = gender;
}



public String getStatus() {
	return Status;
}



public void setStatus(String status) {
	Status = status;
}



public String getSkills() {
	return Skills;
}



public void setSkills(String skills) {
	Skills = skills;
}



public Timestamp getDOB() {
	return DOB;
}



public void setDOB(Timestamp dOB) {
	DOB = dOB;
}



public String getMAJOR() {
	return MAJOR;
}



public void setMAJOR(String mAJOR) {
	MAJOR = mAJOR;
}



public String getAttachments() {
	return Attachments;
}



public void setAttachments(String attachments) {
	Attachments = attachments;
}



public String getJOP() {
	return JOP;
}



public void setJOP(String jOP) {
	JOP = jOP;
}



@Override
public String toString() {
	return "Individual [NationalID=" + NationalID + ", Firstname=" + Firstname + ", MName=" + MName + ", Lastname="
			+ Lastname + ", Gender=" + Gender + ", Status=" + Status + ", Skills=" + Skills + ", DOB=" + DOB
			+ ", MAJOR=" + MAJOR + ", Attachments=" + Attachments + ", JOP=" + JOP + ", toString()=" + super.toString()
			+ "]";
}



public Individual() {
	super();
}


@Builder
public Individual(String email, String phone_number, String address, String password, String nationalID,
		String firstname, String mName, String lastname, Boolean gender, String status, String skills, Timestamp dOB,
		String mAJOR, String attachments, String jOP) {
	super(email, phone_number, address, password);
	NationalID = nationalID;
	Firstname = firstname;
	MName = mName;
	Lastname = lastname;
	Gender = gender;
	Status = status;
	Skills = skills;
	DOB = dOB;
	MAJOR = mAJOR;
	Attachments = attachments;
	JOP = jOP;
}






  
}