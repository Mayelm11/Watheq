package com.Final.MayDTO;

import java.sql.Timestamp;


public class CouDTO {
	 private String courseID;
	   
	   
	   private String nameCourse;
	   
	   private String addedBy;
	   
	   private String nameInstittion;
	   
	   private String courseAttch;

	   private Timestamp startDate;
	   
	   private Timestamp endDate;
	   
	   public String getNameInstittion() {
	  return nameInstittion;
	 }

	 public void setNameInstittion(String nameInstittion) {
	  this.nameInstittion = nameInstittion;
	 }

	 public String getCourseAttch() {
	  return courseAttch;
	 }

	 public void setCourseAttch(String courseAttch) {
	  this.courseAttch = courseAttch;
	 }



	 public String getCourseID() {
	  return courseID;
	 }

	 public void setCourseID(String courseID) {
	  this.courseID = courseID;
	 }

	 public String getNameCourse() {
	  return nameCourse;
	 }

	 public void setNameCourse(String nameCourse) {
	  this.nameCourse = nameCourse;
	 }

	 public String getAddedBy() {
	  return addedBy;
	 }

	 public void setAddedBy(String addedBy) {
	  this.addedBy = addedBy;
	 }

	 public Timestamp getStartDate() {
	  return startDate;
	 }

	 public void setStartDate(Timestamp startDate) {
	  this.startDate = startDate;
	 }

	 public Timestamp getEndDate() {
	  return endDate;
	 }

	 public void setEndDate(Timestamp endDate) {
	  this.endDate = endDate;
	 }

	public CouDTO(String courseID, String nameCourse, String addedBy, String nameInstittion, String courseAttch,
			Timestamp startDate, Timestamp endDate) {
		super();
		this.courseID = courseID;
		this.nameCourse = nameCourse;
		this.addedBy = addedBy;
		this.nameInstittion = nameInstittion;
		this.courseAttch = courseAttch;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public CouDTO() {
		super();
	}

}
