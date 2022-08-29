package com.example.demo.academic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GenerationType;
//import javax.persistence.OneToOne;
//import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="academicinstitution")
public class AcademicInstitution 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="insti_id")
	private long institute_id;
	
	
	@Column(name="Contract")
	private String contract;
	
	@Column(name="Professior_male")
	private String pmale;
	@Column(name="Professior_Female")
	private String pfemale;
	@Column(name="Professior_Others")
	private String pothers;
	@Column(name="Professior_Total")
	private String ptotal;
	
	@Column(name="AssociateProfessior_male")
	private String amale;
	@Column(name="AssociateProfessior_Female")
	private String afemale;
	@Column(name="AssociateProfessior_Others")
	private String aothers;
	@Column(name="AssociateProfessior_Total")
	private String atotal;
	
	@Column(name="AssistantProfessior_male")
	private String apmale;
	@Column(name="AssistantProfessior_Female")
	private String apfemale;
	@Column(name="AssistantProfessior_Others")
	private String apothers;
	@Column(name="AssistantProfessior_Total")
	private String aptotal;
	
	@Column(name="Non_teaching_male")
	private String ntmale;
	@Column(name="Non_teaching_Female")
	private String ntfemale;
	@Column(name="Non_teaching_Others")
	private String ntothers;
	@Column(name="Non_teaching_Total")
	private String nttotal;
	
	@Column(name="Technical_male")
	private String tmale;
	@Column(name="Technical_Female")
	private String tfemale;
	@Column(name="Technical_Others")
	private String tothers;
	@Column(name="Technical_Total")
	private String ttotal;
	public long getInstitute_id() {
		return institute_id;
	}
	public void setInstitute_id(long institute_id) {
		this.institute_id = institute_id;
	}
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	public String getPmale() {
		return pmale;
	}
	public void setPmale(String pmale) {
		this.pmale = pmale;
	}
	public String getPfemale() {
		return pfemale;
	}
	public void setPfemale(String pfemale) {
		this.pfemale = pfemale;
	}
	public String getPothers() {
		return pothers;
	}
	public void setPothers(String pothers) {
		this.pothers = pothers;
	}
	public String getPtotal() {
		return ptotal;
	}
	public void setPtotal(String ptotal) {
		this.ptotal = ptotal;
	}
	public String getAmale() {
		return amale;
	}
	public void setAmale(String amale) {
		this.amale = amale;
	}
	public String getAfemale() {
		return afemale;
	}
	public void setAfemale(String afemale) {
		this.afemale = afemale;
	}
	public String getAothers() {
		return aothers;
	}
	public void setAothers(String aothers) {
		this.aothers = aothers;
	}
	public String getAtotal() {
		return atotal;
	}
	public void setAtotal(String atotal) {
		this.atotal = atotal;
	}
	public String getApmale() {
		return apmale;
	}
	public void setApmale(String apmale) {
		this.apmale = apmale;
	}
	public String getApfemale() {
		return apfemale;
	}
	public void setApfemale(String apfemale) {
		this.apfemale = apfemale;
	}
	public String getApothers() {
		return apothers;
	}
	public void setApothers(String apothers) {
		this.apothers = apothers;
	}
	public String getAptotal() {
		return aptotal;
	}
	public void setAptotal(String aptotal) {
		this.aptotal = aptotal;
	}
	public String getNtmale() {
		return ntmale;
	}
	public void setNtmale(String ntmale) {
		this.ntmale = ntmale;
	}
	public String getNtfemale() {
		return ntfemale;
	}
	public void setNtfemale(String ntfemale) {
		this.ntfemale = ntfemale;
	}
	public String getNtothers() {
		return ntothers;
	}
	public void setNtothers(String ntothers) {
		this.ntothers = ntothers;
	}
	public String getNttotal() {
		return nttotal;
	}
	public void setNttotal(String nttotal) {
		this.nttotal = nttotal;
	}
	public String getTmale() {
		return tmale;
	}
	public void setTmale(String tmale) {
		this.tmale = tmale;
	}
	public String getTfemale() {
		return tfemale;
	}
	public void setTfemale(String tfemale) {
		this.tfemale = tfemale;
	}
	public String getTothers() {
		return tothers;
	}
	public void setTothers(String tothers) {
		this.tothers = tothers;
	}
	public String getTtotal() {
		return ttotal;
	}
	public void setTtotal(String ttotal) {
		this.ttotal = ttotal;
	}
	
	
}