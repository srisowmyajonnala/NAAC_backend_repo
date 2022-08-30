package com.adiverse.erp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="basic_profile2")
public class basicprofile_2 
{
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long basic_id;
	@Column(name="ugcpotentialfor_excellence")
	private String excellence;
	@Column(name="CPE")
	private String CPE;
	@Column(name="dateofrecognition_date")
	private String  dateofrecognition_date;
	@Column(name="government_agency")
	private String government_agency;
	@Column(name="nametheagency_name")
	private String nametheagency_name;
	@Column(name="recognition_date")
	private String recognition_date;
	
	
	public long getBasic_id() {
		return basic_id;
	}
	public void setBasic_id(long basic_id) {
		this.basic_id = basic_id;
	}
	
	public String getExcellence() {
		return excellence;
	}
	public void setExcellence(String excellence) {
		this.excellence = excellence;
	}
	public String getCPE() {
		return CPE;
	}
	public void setCPE(String cPE) {
		CPE = cPE;
	}
	public String getDateofrecognition_date() {
		return dateofrecognition_date;
	}
	public void setDateofrecognition_date(String dateofrecognition_date) {
		this.dateofrecognition_date = dateofrecognition_date;
	}
	public String getGovernment_agency() {
		return government_agency;
	}
	public void setGovernment_agency(String government_agency) {
		this.government_agency = government_agency;
	}
	public String getNametheagency_name() {
		return nametheagency_name;
	}
	public void setNametheagency_name(String nametheagency_name) {
		this.nametheagency_name = nametheagency_name;
	}
	public String getRecognition_date() {
		return recognition_date;
	}
	public void setRecognition_date(String recognition_date) {
		this.recognition_date = recognition_date;
	}
	
	
}