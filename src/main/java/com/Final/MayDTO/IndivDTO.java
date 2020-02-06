package com.Final.MayDTO;

	import java.sql.Timestamp;


	public class IndivDTO extends UserDTO {
		 private String NationalID;
		  
		  
		  private String FirstName;
		  
		  private String MName;
		 
		  private String LastName;
		  
		 
		  private Boolean Gender;
		  
		  private String Status;
		  
		  private String Skills;
		  
		  
		  private Timestamp DOB;
		  
		  private String MAJOR;
		  
		  private String Attachments;
		  

		  
		  private String JOP;
		  
		  


		public String getFirstName() {
			return FirstName;
		}

		public void setFirstName(String firstName) {
			this.FirstName = firstName;
		}

		public String getMName() {
			return MName;
		}

		public void setMName(String mName) {
			MName = mName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			this.LastName = lastName;
		}

		public String getNationalID() {
			return NationalID;
		}

		public void setNationalID(String nationalID) {
			NationalID = nationalID;
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

		public String getMajor() {
			return MAJOR;
		}

		public void setMajor(String major) {
			this.MAJOR = major;
		}

		public String getAttachments() {
			return Attachments;
		}

		public void setAttachments(String attachments) {
			Attachments = attachments;
		}

		public Boolean getGender() {
			return Gender;
		}

		public void setGender(Boolean gender) {
			this.Gender = gender;
		}

		public String getJop() {
			return JOP;
		}

		public void setJop(String jop) {
			this.JOP = jop;
		}

		public IndivDTO( String email, String phoneNumber, String address, String password,
				String nationalID, String firstName, String mName, String lastName, Boolean gender, String status,
				String skills, Timestamp dOB, String major, String attachments, String jop) {
			super( email, phoneNumber, address, password);
			NationalID = nationalID;
			FirstName = firstName;
			MName = mName;
			LastName = lastName;
			Gender = gender;
			Status = status;
			Skills = skills;
			DOB = dOB;
			MAJOR = major;
			Attachments = attachments;
			JOP = jop;
		}

		public IndivDTO() {
			super();
		}

		
		
	}



