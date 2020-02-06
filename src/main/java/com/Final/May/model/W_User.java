package com.Final.May.model;


import java.io.Serializable;

import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@MappedSuperclass
public class W_User implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column (name="userId")
  @NotNull(message = " cannot be Empty ")
  @Min(value = 10, message = "Nationa should not be less than 18")
  @Max(value = 10, message = "Nationa should not be greater than 150")
   private long userId;
 
  
  @Column(name = "email", nullable = false, unique=true)
  @Email(message = "email should be a valid email")
private String email;
  
  @Column(name = "phoneNumber" ,nullable = false, unique=true)
  @NotNull(message = " cannot be Empty ")
   private String phoneNumber;
  
  @Column(name = "address" ,nullable = false)
  @NotNull(message = " cannot be Empty ")
   private String address;
  
  @Column(name = "password" ,nullable = false)
  @Min(value = 10, message = "Nationa should not be less than 10")
  @Max(value = 10, message = "Nationa should not be greater than 18")
  @NotNull(message = " cannot be Empty ")
   private String password;


 public W_User() {
  super();
 }//end User()

 public W_User( String email, String phone_number, String address, String password) {
  super();
  this.email = email;
  this.phoneNumber = phone_number;
  this.address = address;
  this.password = password;
 }//end User()


 public long getUser_id() {
  return userId;
 }


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


 @Override
 public String toString() {
  return "User [userId=" + userId + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address="
    + address + ", password=" + password + "]";
 }


  

}

