package com.example.demo.Recognition.basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="recognition")
public class Recognition {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long college_id;

	@Column(name="recognitionRegulatory")
	private String recognition_regulatory;
	
	@Column(name="recognitionApproval")
	private String recognition_approval;
	
	@Column(name="daymonthyear")
	private String daymonthyear;
	
	@Column(name="validityinmonths")
	private String validityinmonths;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="campustype")
	private String campustype;
	
	@Column(name="campusaddress")
	private String campusaddress;
	
	@Column(name="campuslocation")
	private String campuslocation;
	
	@Column(name="campusareainacres")
	private String campusareainacres;
	
	@Column(name="builtupareainsqmts")
	private String builtupareainsqmts;

	public long getCollege_id() {
		return college_id;
	}

	public void setCollege_id(long college_id) {
		this.college_id = college_id;
	}

	public String getRecognition_regulatory() {
		return recognition_regulatory;
	}

	public void setRecognition_regulatory(String recognition_regulatory) {
		this.recognition_regulatory = recognition_regulatory;
	}

	public String getRecognition_approval() {
		return recognition_approval;
	}

	public void setRecognition_approval(String recognition_approval) {
		this.recognition_approval = recognition_approval;
	}

	public String getDaymonthyear() {
		return daymonthyear;
	}

	public void setDaymonthyear(String daymonthyear) {
		this.daymonthyear = daymonthyear;
	}

	public String getValidityinmonths() {
		return validityinmonths;
	}

	public void setValidityinmonths(String validityinmonths) {
		this.validityinmonths = validityinmonths;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCampustype() {
		return campustype;
	}

	public void setCampustype(String campustype) {
		this.campustype = campustype;
	}

	public String getCampusaddress() {
		return campusaddress;
	}

	public void setCampusaddress(String campusaddress) {
		this.campusaddress = campusaddress;
	}

	public String getCampuslocation() {
		return campuslocation;
	}

	public void setCampuslocation(String campuslocation) {
		this.campuslocation = campuslocation;
	}

	public String getCampusareainacres() {
		return campusareainacres;
	}

	public void setCampusareainacres(String campusareainacres) {
		this.campusareainacres = campusareainacres;
	}

	public String getBuiltupareainsqmts() {
		return builtupareainsqmts;
	}

	public void setBuiltupareainsqmts(String builtupareainsqmts) {
		this.builtupareainsqmts = builtupareainsqmts;
	}
	
	
		
	
	}

