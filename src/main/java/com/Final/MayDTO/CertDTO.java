package com.Final.MayDTO;

import java.sql.Timestamp;

import javax.persistence.Column;


public class CertDTO {
		 private String CERT_id ;
	  
	  private String UNI_NAME;
	 
	  
	  private String ADDBY; 
	  
	 private Timestamp CERT_DATE;
	  
		 private double GPA ;
	  
		 private String DEGREE;
	  
		 private String MAJOR;
	  
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


		public CertDTO(String cERT_id, String uNI_NAME, String aDDBY, Timestamp cERT_DATE, double gPA, String dEGREE,
				String mAJOR, String aTTACH) {
			super();
			CERT_id = cERT_id;
			UNI_NAME = uNI_NAME;
			ADDBY = aDDBY;
			CERT_DATE = cERT_DATE;
			GPA = gPA;
			DEGREE = dEGREE;
			MAJOR = mAJOR;
			ATTACH = aTTACH;
		}

		public CertDTO() {
			super();
		}


}