package com.adiverse.erp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="academicstudentsenrolled")
public class AcademicStudentsEnrolled
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="enrolled_id")
	private long enrolled_id;
	
	 @Column(name="enrolledProgramme")
	  private String enrolled_programme;
	 
	 @Column(name="locatedCollege")
	  private String located_college;
	 
	 @Column(name="statesOfindia")
	  private String states_of_india;
	 
	 @Column(name="nriStudents")
	  private String nri_students;
	 
	 @Column(name="foreignStudents")
	  private String foreign_students;
	 
	 @Column(name="enrolledTotal")
	  private String enrolled_total;

	public long getEnrolled_id() {
		return enrolled_id;
	}

	public void setEnrolled_id(long enrolled_id) {
		this.enrolled_id = enrolled_id;
	}

	public String getEnrolled_programme() {
		return enrolled_programme;
	}

	public void setEnrolled_programme(String enrolled_programme) {
		this.enrolled_programme = enrolled_programme;
	}

	public String getLocated_college() {
		return located_college;
	}

	public void setLocated_college(String located_college) {
		this.located_college = located_college;
	}

	public String getStates_of_india() {
		return states_of_india;
	}

	public void setStates_of_india(String states_of_india) {
		this.states_of_india = states_of_india;
	}

	public String getNri_students() {
		return nri_students;
	}

	public void setNri_students(String nri_students) {
		this.nri_students = nri_students;
	}

	public String getForeign_students() {
		return foreign_students;
	}

	public void setForeign_students(String foreign_students) {
		this.foreign_students = foreign_students;
	}

	public String getEnrolled_total() {
		return enrolled_total;
	}

	public void setEnrolled_total(String enrolled_total) {
		this.enrolled_total = enrolled_total;
	}
	 
	 
}
