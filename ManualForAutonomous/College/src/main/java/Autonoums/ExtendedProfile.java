package Autonoums;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
@Entity
@Table(name="Extended_profile")
public class ExtendedProfile {
     @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="collegeId")
	private long college_id;

	@Column(name="programmeYear")
	private String programme_year;
	
	@Column(name="programmeNumber")
	private String programme_number;
	
	@Column(name="studentYear")
	private String student_year;
	
	@Column(name="studentNumberLast")
	private String student_number_last;
	
	@Column(name="studentOutgoingYear")
	private String student_outgoing_year;
	
	@Column(name="studentOutgoingNumber")
	private String student_outgoing_number;
	
	@Column(name="studentAppearedexaminationYear")
	private String student_appearedexamination_year;
	
	@Column(name="studentAppearedexaminationNumber")
	private String student_appearedexamination_number;
	
	@Column(name="studentRevalutionYear")
	private String student_revalution_year;
	
	@Column(name="studentRevalutionNumber")
	private String student_revalution_number;
	
    @Column(name="academiccourseYear")
     private String academiccourse_year;
    
    @Column(name="academicprogrammerNumber")
    private String academicprogrammer_number;
    
    @Column(name="academicfulltimeYear")
    private String academictime_year;
    
    @Column(name="academicteacherNumber")
    private String academicteacher_number;
    
    @Column(name="academicsanctionedYear")
    private String sanctionedsanctioned_year;
    
    @Column(name="academicsanctionedNumber")
    private String academicsanctioned_number;
    
    @Column(name="institutionapplicationreceivedYear")
    private String institutionapplicationReceived_year;
    
    @Column(name="institionadmissionNumber")
    private String institionaladmission_number;
    
    @Column(name="institutionearnmarksYear")
    private String institutionearnmarks_year;
    
    @Column(name= "institutioncategorNumber")
    private String institutioncategor_number;
  
    @Column(name="classroomsSeminarhalls")
    private String classrooms_seminar;
    
   @Column(name="campusforacademicPurpose")
   private String campusforacademic_purpose;
   
   @Column(name="totalyearexpenditureYear")
   private String totalyearexpenditure_year;
   
   @Column(name="totalnumbersalaryNumber")
   private String totalnumbersalary_number;

public long getCollege_id() {
	return college_id;
}

public void setCollege_id(long college_id) {
	this.college_id = college_id;
}

public String getProgramme_year() {
	return programme_year;
}

public void setProgramme_year(String programme_year) {
	this.programme_year = programme_year;
}

public String getProgramme_number() {
	return programme_number;
}

public void setProgramme_number(String programme_number) {
	this.programme_number = programme_number;
}

public String getStudent_year() {
	return student_year;
}

public void setStudent_year(String student_year) {
	this.student_year = student_year;
}

public String getStudent_number_last() {
	return student_number_last;
}

public void setStudent_number_last(String student_number_last) {
	this.student_number_last = student_number_last;
}

public String getStudent_outgoing_year() {
	return student_outgoing_year;
}

public void setStudent_outgoing_year(String student_outgoing_year) {
	this.student_outgoing_year = student_outgoing_year;
}

public String getStudent_outgoing_number() {
	return student_outgoing_number;
}

public void setStudent_outgoing_number(String student_outgoing_number) {
	this.student_outgoing_number = student_outgoing_number;
}

public String getStudent_appearedexamination_year() {
	return student_appearedexamination_year;
}

public void setStudent_appearedexamination_year(String student_appearedexamination_year) {
	this.student_appearedexamination_year = student_appearedexamination_year;
}

public String getStudent_appearedexamination_number() {
	return student_appearedexamination_number;
}

public void setStudent_appearedexamination_number(String student_appearedexamination_number) {
	this.student_appearedexamination_number = student_appearedexamination_number;
}

public String getStudent_revalution_year() {
	return student_revalution_year;
}

public void setStudent_revalution_year(String student_revalution_year) {
	this.student_revalution_year = student_revalution_year;
}

public String getStudent_revalution_number() {
	return student_revalution_number;
}

public void setStudent_revalution_number(String student_revalution_number) {
	this.student_revalution_number = student_revalution_number;
}

public String getAcademiccourse_year() {
	return academiccourse_year;
}

public void setAcademiccourse_year(String academiccourse_year) {
	this.academiccourse_year = academiccourse_year;
}

public String getAcademicprogrammer_number() {
	return academicprogrammer_number;
}

public void setAcademicprogrammer_number(String academicprogrammer_number) {
	this.academicprogrammer_number = academicprogrammer_number;
}

public String getAcademictime_year() {
	return academictime_year;
}

public void setAcademictime_year(String academictime_year) {
	this.academictime_year = academictime_year;
}

public String getAcademicteacher_number() {
	return academicteacher_number;
}

public void setAcademicteacher_number(String academicteacher_number) {
	this.academicteacher_number = academicteacher_number;
}

public String getSanctionedsanctioned_year() {
	return sanctionedsanctioned_year;
}

public void setSanctionedsanctioned_year(String sanctionedsanctioned_year) {
	this.sanctionedsanctioned_year = sanctionedsanctioned_year;
}

public String getAcademicsanctioned_number() {
	return academicsanctioned_number;
}

public void setAcademicsanctioned_number(String academicsanctioned_number) {
	this.academicsanctioned_number = academicsanctioned_number;
}

public String getInstitutionapplicationReceived_year() {
	return institutionapplicationReceived_year;
}

public void setInstitutionapplicationReceived_year(String institutionapplicationReceived_year) {
	this.institutionapplicationReceived_year = institutionapplicationReceived_year;
}

public String getInstitionaladmission_number() {
	return institionaladmission_number;
}

public void setInstitionaladmission_number(String institionaladmission_number) {
	this.institionaladmission_number = institionaladmission_number;
}

public String getInstitutionearnmarks_year() {
	return institutionearnmarks_year;
}

public void setInstitutionearnmarks_year(String institutionearnmarks_year) {
	this.institutionearnmarks_year = institutionearnmarks_year;
}

public String getInstitutioncategor_number() {
	return institutioncategor_number;
}

public void setInstitutioncategor_number(String institutioncategor_number) {
	this.institutioncategor_number = institutioncategor_number;
}

public String getClassrooms_seminar() {
	return classrooms_seminar;
}

public void setClassrooms_seminar(String classrooms_seminar) {
	this.classrooms_seminar = classrooms_seminar;
}

public String getCampusforacademic_purpose() {
	return campusforacademic_purpose;
}

public void setCampusforacademic_purpose(String campusforacademic_purpose) {
	this.campusforacademic_purpose = campusforacademic_purpose;
}

public String getTotalyearexpenditure_year() {
	return totalyearexpenditure_year;
}

public void setTotalyearexpenditure_year(String totalyearexpenditure_year) {
	this.totalyearexpenditure_year = totalyearexpenditure_year;
}

public String getTotalnumbersalary_number() {
	return totalnumbersalary_number;
}

public void setTotalnumbersalary_number(String totalnumbersalary_number) {
	this.totalnumbersalary_number = totalnumbersalary_number;
}


	
	
}