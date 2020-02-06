package com.Final.May.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Builder;

@Entity
@Table(name = "Recommendation")
public class Recommendation implements Serializable {
 
  private static final long serialVersionUID = -3009157732242241606L;
  
  //Recommendation ID
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @NotNull(message = " cannot be Empty ")
  @Min(value = 10, message = "Nationa should not be less than 18")
  @Max(value = 10, message = "Nationa should not be greater than 150")
  private long reco_id ;
    
  @ManyToOne(fetch=FetchType.LAZY,optional=false)
  @JoinColumn(name="Edu_iD",nullable=false)
  private Education Edu_iD; 
  
  @ManyToOne(fetch=FetchType.LAZY,optional=false)
  @JoinColumn(name="CR",nullable=false)
  private Company CR; 
  
  //Person who write it
  @Column(name = "Reco_From", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String Reco_From;
  
  //Recommendation Creation date
  @Column(name = "Reco_Date", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private Timestamp Reco_Date;
  
  //User Who added Recommendation 
  @Column(name = "Reco_AddBy", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String Reco_AddBy;
  
  //URL Recommendation attachment
  @Column(name = "Reco_Attach", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String Reco_Attach;
  
  //The name of the institute Who added Recommendation 
  @Column(name = "Reco_Institute_Name", nullable = false)
  @NotNull(message = " cannot be Empty ")
  private String Reco_Institute_Name;

public long getReco_id() {
	return reco_id;
}

public void setReco_id(long reco_id) {
	this.reco_id = reco_id;
}

public Education getEdu_iD() {
	return Edu_iD;
}

public void setEdu_iD(Education edu_iD) {
	Edu_iD = edu_iD;
}

public Company getCr() {
	return CR;
}

public void setCr(Company cr) {
	this.CR = cr;
}

public String getReco_From() {
	return Reco_From;
}

public void setReco_From(String reco_From) {
	Reco_From = reco_From;
}

public Timestamp getReco_Date() {
	return Reco_Date;
}

public void setReco_Date(Timestamp reco_Date) {
	Reco_Date = reco_Date;
}

public String getReco_AddBy() {
	return Reco_AddBy;
}

public void setReco_AddBy(String reco_AddBy) {
	Reco_AddBy = reco_AddBy;
}

public String getReco_Attach() {
	return Reco_Attach;
}

public void setReco_Attach(String reco_Attach) {
	Reco_Attach = reco_Attach;
}

public String getReco_Institute_Name() {
	return Reco_Institute_Name;
}

public void setReco_Institute_Name(String reco_Institute_Name) {
	Reco_Institute_Name = reco_Institute_Name;
}
@Builder
public Recommendation(long reco_id, Education edu_iD, Company cr, String reco_From, Timestamp reco_Date,
		String reco_AddBy, String reco_Attach, String reco_Institute_Name) {
	super();
	this.reco_id = reco_id;
	Edu_iD = edu_iD;
	this.CR = cr;
	Reco_From = reco_From;
	Reco_Date = reco_Date;
	Reco_AddBy = reco_AddBy;
	Reco_Attach = reco_Attach;
	Reco_Institute_Name = reco_Institute_Name;
}

@Override
public String toString() {
	return "Recommendation [reco_id=" + reco_id + ", Edu_iD=" + Edu_iD + ", cr=" + CR + ", Reco_From=" + Reco_From
			+ ", Reco_Date=" + Reco_Date + ", Reco_AddBy=" + Reco_AddBy + ", Reco_Attach=" + Reco_Attach
			+ ", Reco_Institute_Name=" + Reco_Institute_Name + ", toString()=" + super.toString() + "]";
}

public Recommendation() {
	super();
}



}