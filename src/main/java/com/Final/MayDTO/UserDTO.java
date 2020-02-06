package com.Final.MayDTO;


public class UserDTO {
	
	
	
	 
	  
	   private String email;
	  
	   private String phoneNumber;
	  
	   private String address;
	  
	   private String password;



	 public String getEmail() {
	  return email;
	 }//end getEmail()


	 public void setEmail(String email) {
	  this.email = email;
	 }//end setEmail()


	 public String getPhone_number() {
	  return phoneNumber;
	 }//end getPhone_number()


	 public void setPhone_number(String phone_number) {
	  this.phoneNumber = phone_number;
	 }//end setPhone_number()


	 public String getAddress() {
	  return address;
	 }//end getAddress()


	 public void setAddress(String address) {
	  this.address = address;
	 }//end setAddress()


	 public String getPassword() {
	  return password;
	 }//end getPassword()


	 public void setPassword(String password) {
	  this.password = password;
	 }//end setPassword()


	public UserDTO(String email, String phoneNumber, String address, String password) {
		super();
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.password = password;
	}


	public UserDTO() {
		super();
	}


}
