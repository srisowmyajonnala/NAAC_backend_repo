package com.adiverse.erp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="recognition")
public class Recognition {
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long recog_id;

	@Column(name="recognitionRegulatory")
	private String regulatory;
	
	@Column(name="recognitionApproval")
	private String recognition_approval;
	
	@Column(name="daymonthyear")
	private String daymonthyear;
	
	@Column(name="validityinmonths")
	private String validityinmonths;
	
	@Column(name="remarks")
	private String remarks;
	


	public long getRecog_id() {
		return recog_id;
	}

	public void setRecog_id(long recog_id) {
		this.recog_id = recog_id;
	}



	public String getRegulatory() {
		return regulatory;
	}

	public void setRegulatory(String regulatory) {
		this.regulatory = regulatory;
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



	}