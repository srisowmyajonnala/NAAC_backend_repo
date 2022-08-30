package com.adiverse.erp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="academicstudentsadmitted")
public class AcademicStudentsAdmitted
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="admitted_id")
	private long admitted_id;
	
	 @Column(name="admittedProgramme")
	  private String admitted_programme;
	 
	 @Column(name="admittedYear1")
	  private String admitted_Year1;
	 
	 @Column(name="admittedYear2")
	  private String admitted_Year2;
	 
	 @Column(name="admittedYear3")
	  private String admitted_Year3;
	 
	 @Column(name="admittedYear4")
	  private String admitted_Year4;

	public long getAdmitted_id() {
		return admitted_id;
	}

	public void setAdmitted_id(long admitted_id) {
		this.admitted_id = admitted_id;
	}

	public String getAdmitted_programme() {
		return admitted_programme;
	}

	public void setAdmitted_programme(String admitted_programme) {
		this.admitted_programme = admitted_programme;
	}

	public String getAdmitted_Year1() {
		return admitted_Year1;
	}

	public void setAdmitted_Year1(String admitted_Year1) {
		this.admitted_Year1 = admitted_Year1;
	}

	public String getAdmitted_Year2() {
		return admitted_Year2;
	}

	public void setAdmitted_Year2(String admitted_Year2) {
		this.admitted_Year2 = admitted_Year2;
	}

	public String getAdmitted_Year3() {
		return admitted_Year3;
	}

	public void setAdmitted_Year3(String admitted_Year3) {
		this.admitted_Year3 = admitted_Year3;
	}

	public String getAdmitted_Year4() {
		return admitted_Year4;
	}

	public void setAdmitted_Year4(String admitted_Year4) {
		this.admitted_Year4 = admitted_Year4;
	}
	 
	 

}
