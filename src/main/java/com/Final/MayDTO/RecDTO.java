package com.Final.MayDTO;

import java.sql.Timestamp;




public class RecDTO {
	  private long reco_id ;
	  private String Reco_From;
	  
	  private Timestamp Reco_Date;
	  
	  private String Reco_AddBy;
	  
	  private String Reco_Attach;
	  
	  private String Reco_Institute_Name;

	public long getReco_id() {
		return reco_id;
	}

	public void setReco_id(long reco_id) {
		this.reco_id = reco_id;
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

	public RecDTO(long reco_id, String reco_From, Timestamp reco_Date, String reco_AddBy, String reco_Attach,
			String reco_Institute_Name) {
		super();
		this.reco_id = reco_id;
		Reco_From = reco_From;
		Reco_Date = reco_Date;
		Reco_AddBy = reco_AddBy;
		Reco_Attach = reco_Attach;
		Reco_Institute_Name = reco_Institute_Name;
	}

	public RecDTO() {
		super();
	}
	  
	 
	


}
