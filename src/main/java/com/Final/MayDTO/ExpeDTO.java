package com.Final.MayDTO;

import java.sql.Timestamp;



public class ExpeDTO {
	private long Exp_id;

    
    private String e_position;

    private String name_company;

    private Timestamp s_date;

    private Timestamp e_date;

    private String add_by;
    
    private String ref_name;
    
    private String ref_email;

	public long getExp_id() {
		return Exp_id;
	}

	public void setExp_id(long exp_id) {
		Exp_id = exp_id;
	}


	public String getE_position() {
		return e_position;
	}

	public void setE_position(String e_position) {
		this.e_position = e_position;
	}

	public String getName_company() {
		return name_company;
	}

	public void setName_company(String name_company) {
		this.name_company = name_company;
	}

	public Timestamp getS_date() {
		return s_date;
	}

	public void setS_date(Timestamp s_date) {
		this.s_date = s_date;
	}

	public Timestamp getE_date() {
		return e_date;
	}

	public void setE_date(Timestamp e_date) {
		this.e_date = e_date;
	}

	public String getAdd_by() {
		return add_by;
	}

	public void setAdd_by(String add_by) {
		this.add_by = add_by;
	}

	public String getRef_name() {
		return ref_name;
	}

	public void setRef_name(String ref_name) {
		this.ref_name = ref_name;
	}

	public String getRef_email() {
		return ref_email;
	}

	public void setRef_email(String ref_email) {
		this.ref_email = ref_email;
	}

	public ExpeDTO(long exp_id, String e_position, String name_company, Timestamp s_date, Timestamp e_date,
			String add_by, String ref_name, String ref_email) {
		super();
		Exp_id = exp_id;
		this.e_position = e_position;
		this.name_company = name_company;
		this.s_date = s_date;
		this.e_date = e_date;
		this.add_by = add_by;
		this.ref_name = ref_name;
		this.ref_email = ref_email;
	}

	public ExpeDTO() {
		super();
	}

}
