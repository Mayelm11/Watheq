package com.Final.MayDTO;

import java.security.Timestamp;



public class LangDTO {
	   private long id;

	   private String languge_ID;
	  
	   private String languge_name;
	 
	   private Timestamp languge_date;
	   
	   private String languge_attach;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLanguge_ID() {
		return languge_ID;
	}

	public void setLanguge_ID(String languge_ID) {
		this.languge_ID = languge_ID;
	}

	public String getLanguge_name() {
		return languge_name;
	}

	public void setLanguge_name(String languge_name) {
		this.languge_name = languge_name;
	}

	public Timestamp getLanguge_date() {
		return languge_date;
	}

	public void setLanguge_date(Timestamp languge_date) {
		this.languge_date = languge_date;
	}

	public String getLanguge_attach() {
		return languge_attach;
	}

	public void setLanguge_attach(String languge_attach) {
		this.languge_attach = languge_attach;
	}

	public LangDTO(long id, String languge_ID, String languge_name, Timestamp languge_date, String languge_attach) {
		super();
		this.id = id;
		this.languge_ID = languge_ID;
		this.languge_name = languge_name;
		this.languge_date = languge_date;
		this.languge_attach = languge_attach;
	}

	public LangDTO() {
		super();
	}



	
}