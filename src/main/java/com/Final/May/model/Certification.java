package com.Final.May.model;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Builder;

	@Entity
	@Table(name = "Certification")
	public class Certification implements Serializable {

	  private static final long serialVersionUID = -3009157732242241606L;
	
	  
	  @ManyToOne(fetch=FetchType.LAZY,optional=false)
      @JoinColumn(name="NationalID",nullable=false)
      private Individual NationalID; 
	  
	  @ManyToOne(fetch=FetchType.LAZY,optional=false)
	  @JoinColumn(name="Edu_iD",nullable=false)
	  private Education Edu_iD; 
	  
	  @Id
	  @Column(name = "CERT_id")
	  @NotNull(message = " cannot be Empty ")
	  @Min(value = 10, message = "Nationa should not be less than 18")
	  @Max(value = 10, message = "Nationa should not be greater than 150")
	private String CERT_id; 
	  
	  @Column(name = "UNI_NAME", nullable = false)
	  @NotNull(message = " cannot be Empty ")
	  private String UNI_NAME;
	 
	  
	  @Column(name = "ADDBY", nullable = false)
	  @NotNull(message = " cannot be Empty ")
	  private String ADDBY; 
	  
	  @Column(name = "CERT_DATE", nullable = false)
	  @NotNull(message = " cannot be Empty ")
	 private Timestamp CERT_DATE;
	  
	  @Column(name = "GPA", nullable = false)
	  @NotNull(message = " cannot be Empty ")
		 private double GPA ;
	  
	  @Column(name = "DEGREE", nullable = false)
	  @NotNull(message = " cannot be Empty ")
		 private String DEGREE;
	  
	  @Column(name = "MAJOR")
	  @NotNull(message = " cannot be Empty ")
		 private String MAJOR;
	  
	  @Column(name = "ATTACH", nullable = false)
	  @NotNull(message = " cannot be Empty ")
		 private String ATTACH;


	public String getCERT_id() {
		return CERT_id;
	}

	public void setCERT_id(String cERT_id) {
		CERT_id = cERT_id;
	}

	public String getUNI_NAME() {
		return UNI_NAME;
	}

	public void setUNI_NAME(String uNI_NAME) {
		UNI_NAME = uNI_NAME;
	}

	public String getADDBY() {
		return ADDBY;
	}

	public void setADDBY(String aDDBY) {
		ADDBY = aDDBY;
	}

	public Timestamp getCERT_DATE() {
		return CERT_DATE;
	}

	public void setCERT_DATE(Timestamp cERT_DATE) {
		CERT_DATE = cERT_DATE;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public String getDEGREE() {
		return DEGREE;
	}

	public void setDEGREE(String dEGREE) {
		DEGREE = dEGREE;
	}

	public String getMAJOR() {
		return MAJOR;
	}

	public void setMAJOR(String mAJOR) {
		MAJOR = mAJOR;
	}

	public String getATTACH() {
		return ATTACH;
	}

	public void setATTACH(String aTTACH) {
		ATTACH = aTTACH;
	}

	@Override
	public String toString() {
		return "Certification [NationalID=" + NationalID + ", Edu_iD=" + Edu_iD + ", CERT_id=" + CERT_id + ", UNI_NAME="
				+ UNI_NAME + ", ADDBY=" + ADDBY + ", CERT_DATE=" + CERT_DATE + ", GPA=" + GPA + ", DEGREE=" + DEGREE
				+ ", MAJOR=" + MAJOR + ", ATTACH=" + ATTACH + ", toString()=" + super.toString() + "]";
	}
@Builder
	public Certification(Individual nationalID, Education edu_iD, String cERT_id, String uNI_NAME, String aDDBY,
			Timestamp cERT_DATE, double gPA, String dEGREE, String mAJOR, String aTTACH) {
		super();
		NationalID = nationalID;
		Edu_iD = edu_iD;
		CERT_id = cERT_id;
		UNI_NAME = uNI_NAME;
		ADDBY = aDDBY;
		CERT_DATE = cERT_DATE;
		GPA = gPA;
		DEGREE = dEGREE;
		MAJOR = mAJOR;
		ATTACH = aTTACH;
	}

public Certification() {
	super();
}

	
	  
	}