package com.example.demo.academic;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GenerationType;
//import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
//import javax.persistence.SecondaryTable;
import javax.persistence.Table;


@Entity
@Table(name="Academic")
//@SecondaryTable(name = "AcademicInstitution", pkJoinColumns = @PrimaryKeyJoinColumn(name = "insti_id"))
public class AcademicInformation
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="college_id")
	private long college_id;
	
	  @Column(name="Level_of_Programme")
	  private String levprogram;
	  
	  @Column(name="Name_of_Programme_Course")
	  private String coursename;
	  
	  @Column(name="Duration_of_Months")
	  private String dum;
	  
	  @Column(name="Entry_Qualification") 
	  private String qualification;
	  
	  @Column(name="Medium_of_Instruction")
	  private String minstruction;
	  
	  @Column(name="Sanctioned_Strength")
	  private String sanstrength;
	  
	  @Column(name="No_Of_Students_Admitted")
	  private String sadmitted;
	  
	  @Column(name="Visting_Male")
	  private String vmale;
	  
	  @Column(name="Visting_Female")
	  private String vfmale;
	 
	  @Column(name="Visting_Others")
	  private String vothers;
	  @Column(name="Visting_Total")
	  private String vtotal;
	
	  @Column(name="Department_Name")
	  private String dname;
	  @Column(name="Upload_Report")
	  private String uploadreport;
	  
	  @OneToMany(targetEntity = AcademicInstitution.class,cascade=CascadeType.ALL)
	  @JoinColumn(name="ai_fk",referencedColumnName="college_id")
	  private List<AcademicInstitution> academicinstitution;
	  
	  @OneToMany(targetEntity=AcademicTeachingStaff.class,cascade=CascadeType.ALL)
	  @JoinColumn(name="tq_fk",referencedColumnName="college_id")
	  private List<AcademicTeachingStaff> academicTeachingStaff;

	public long getCollege_id() {
		return college_id;
	}

	public void setCollege_id(long college_id) {
		this.college_id = college_id;
	}

	public String getLevprogram() {
		return levprogram;
	}

	public void setLevprogram(String levprogram) {
		this.levprogram = levprogram;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getDum() {
		return dum;
	}

	public void setDum(String dum) {
		this.dum = dum;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getMinstruction() {
		return minstruction;
	}

	public void setMinstruction(String minstruction) {
		this.minstruction = minstruction;
	}

	public String getSanstrength() {
		return sanstrength;
	}

	public void setSanstrength(String sanstrength) {
		this.sanstrength = sanstrength;
	}

	public String getSadmitted() {
		return sadmitted;
	}

	public void setSadmitted(String sadmitted) {
		this.sadmitted = sadmitted;
	}

	public String getVmale() {
		return vmale;
	}

	public void setVmale(String vmale) {
		this.vmale = vmale;
	}

	public String getVfmale() {
		return vfmale;
	}

	public void setVfmale(String vfmale) {
		this.vfmale = vfmale;
	}

	public String getVothers() {
		return vothers;
	}

	public void setVothers(String vothers) {
		this.vothers = vothers;
	}

	public String getVtotal() {
		return vtotal;
	}

	public void setVtotal(String vtotal) {
		this.vtotal = vtotal;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getUploadreport() {
		return uploadreport;
	}

	public void setUploadreport(String uploadreport) {
		this.uploadreport = uploadreport;
	}

	public List<AcademicInstitution> getAcademicinstitution() {
		return academicinstitution;
	}

	public void setAcademicinstitution(List<AcademicInstitution> academicinstitution) {
		this.academicinstitution = academicinstitution;
	}  
	  
	  
	  
}


