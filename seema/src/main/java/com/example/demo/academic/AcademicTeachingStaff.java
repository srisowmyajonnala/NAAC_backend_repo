package com.example.demo.academic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teaching_staff_qualification")
public class AcademicTeachingStaff
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="staff_id")
	private Long staff_id;
	
	@Column(name="teachers_qualification")
	private String qualification;
	
	@Column(name="permanent_professor_male")
	private String ppmale;
	@Column(name="permanent_professor_female")
	private String ppfemale;
	@Column(name="permanent_professor_others")
	private String ppothers;

	@Column(name="permanent_associate_male")
	private String pamale;
	@Column(name="permanent_associate_female")
	private String pafemale;
	@Column(name="permanent_associate_others")
	private String paothers;
	
	@Column(name="permanent_assistant_male")
	private String qpamale;
	@Column(name="permanent_assistant_female")
	private String qpafemale;
	@Column(name="permanent_assistant_others")
	private String qpaothers;
	
	@Column(name="permanent_total")
	private String qptotal;
	
	
	@Column(name="temporary_professor_male")
	private String tpmale;
	@Column(name="temporary_professor_female")
	private String tpfemale;
	@Column(name="temporary_professor_others")
	private String tpothers;

	@Column(name="temporary_associate_male")
	private String tamale;
	@Column(name="temporary_associate_female")
	private String tafemale;
	@Column(name="temporary_associate_others")
	private String taothers;
	
	@Column(name="temporary_assistant_male")
	private String qtamale;
	@Column(name="temporary_assistant_female")
	private String qtafemale;
	@Column(name="temporary_assistant_others")
	private String qtaothers;
	
	@Column(name="temporary_total")
	private String qttotal;
	
	
	@Column(name="parttime_professor_male")
	private String ptpmale;
	@Column(name="parttime_professor_female")
	private String ptpfemale;
	@Column(name="parttime_professor_others")
	private String ptpothers;

	@Column(name="parttime_associate_male")
	private String ptamale;
	@Column(name="parttime_associate_female")
	private String ptafemale;
	@Column(name="parttime_associate_others")
	private String ptaothers;
	
	@Column(name="parttime_assistant_male")
	private String qptamale;
	@Column(name="parttime_assistant_female")
	private String qptafemale;
	@Column(name="parttime_assistant_others")
	private String qptaothers;
	
	@Column(name="parttime_total")
	private String qpttotal;

	public Long getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(Long staff_id) {
		this.staff_id = staff_id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPpmale() {
		return ppmale;
	}

	public void setPpmale(String ppmale) {
		this.ppmale = ppmale;
	}

	public String getPpfemale() {
		return ppfemale;
	}

	public void setPpfemale(String ppfemale) {
		this.ppfemale = ppfemale;
	}

	public String getPpothers() {
		return ppothers;
	}

	public void setPpothers(String ppothers) {
		this.ppothers = ppothers;
	}

	public String getPamale() {
		return pamale;
	}

	public void setPamale(String pamale) {
		this.pamale = pamale;
	}

	public String getPafemale() {
		return pafemale;
	}

	public void setPafemale(String pafemale) {
		this.pafemale = pafemale;
	}

	public String getPaothers() {
		return paothers;
	}

	public void setPaothers(String paothers) {
		this.paothers = paothers;
	}

	public String getQpamale() {
		return qpamale;
	}

	public void setQpamale(String qpamale) {
		this.qpamale = qpamale;
	}

	public String getQpafemale() {
		return qpafemale;
	}

	public void setQpafemale(String qpafemale) {
		this.qpafemale = qpafemale;
	}

	public String getQpaothers() {
		return qpaothers;
	}

	public void setQpaothers(String qpaothers) {
		this.qpaothers = qpaothers;
	}

	public String getQptotal() {
		return qptotal;
	}

	public void setQptotal(String qptotal) {
		this.qptotal = qptotal;
	}

	public String getTpmale() {
		return tpmale;
	}

	public void setTpmale(String tpmale) {
		this.tpmale = tpmale;
	}

	public String getTpfemale() {
		return tpfemale;
	}

	public void setTpfemale(String tpfemale) {
		this.tpfemale = tpfemale;
	}

	public String getTpothers() {
		return tpothers;
	}

	public void setTpothers(String tpothers) {
		this.tpothers = tpothers;
	}

	public String getTamale() {
		return tamale;
	}

	public void setTamale(String tamale) {
		this.tamale = tamale;
	}

	public String getTafemale() {
		return tafemale;
	}

	public void setTafemale(String tafemale) {
		this.tafemale = tafemale;
	}

	public String getTaothers() {
		return taothers;
	}

	public void setTaothers(String taothers) {
		this.taothers = taothers;
	}

	public String getQtamale() {
		return qtamale;
	}

	public void setQtamale(String qtamale) {
		this.qtamale = qtamale;
	}

	public String getQtafemale() {
		return qtafemale;
	}

	public void setQtafemale(String qtafemale) {
		this.qtafemale = qtafemale;
	}

	public String getQtaothers() {
		return qtaothers;
	}

	public void setQtaothers(String qtaothers) {
		this.qtaothers = qtaothers;
	}

	public String getQttotal() {
		return qttotal;
	}

	public void setQttotal(String qttotal) {
		this.qttotal = qttotal;
	}

	public String getPtpmale() {
		return ptpmale;
	}

	public void setPtpmale(String ptpmale) {
		this.ptpmale = ptpmale;
	}

	public String getPtpfemale() {
		return ptpfemale;
	}

	public void setPtpfemale(String ptpfemale) {
		this.ptpfemale = ptpfemale;
	}

	public String getPtpothers() {
		return ptpothers;
	}

	public void setPtpothers(String ptpothers) {
		this.ptpothers = ptpothers;
	}

	public String getPtamale() {
		return ptamale;
	}

	public void setPtamale(String ptamale) {
		this.ptamale = ptamale;
	}

	public String getPtafemale() {
		return ptafemale;
	}

	public void setPtafemale(String ptafemale) {
		this.ptafemale = ptafemale;
	}

	public String getPtaothers() {
		return ptaothers;
	}

	public void setPtaothers(String ptaothers) {
		this.ptaothers = ptaothers;
	}

	public String getQptamale() {
		return qptamale;
	}

	public void setQptamale(String qptamale) {
		this.qptamale = qptamale;
	}

	public String getQptafemale() {
		return qptafemale;
	}

	public void setQptafemale(String qptafemale) {
		this.qptafemale = qptafemale;
	}

	public String getQptaothers() {
		return qptaothers;
	}

	public void setQptaothers(String qptaothers) {
		this.qptaothers = qptaothers;
	}

	public String getQpttotal() {
		return qpttotal;
	}

	public void setQpttotal(String qpttotal) {
		this.qpttotal = qpttotal;
	}

	
		
}
