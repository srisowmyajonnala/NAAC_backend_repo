package com.example.criteria3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="year_info")
public class YearInfo
{
	@Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long yearid;
	
	@Column(name = "year")
    private String input3121t1;
	@Column(name = "seed_money")
    private String input3121t2;
	@Column(name = "teacher_awarded")
    private String input3131t1;
	@Column(name = "grant12")
    private String input3211t1;
	@Column(name = "research_projects")
    private String input3221t1;
	@Column(name = "research_gov_projects")
    private String input3241t1;
	@Column(name = "workshop")
    private String input3321t1;
	@Column(name = "research_papers")
    private String input3431t1;
	@Column(name = "books")
    private String input3441t1;
	@Column(name = "amount_generated")
    private String input3511t1;
	@Column(name = "amount_spent")
    private String input3521t1;
	@Column(name = "awards_recognition")
    private String input3621t1;
	@Column(name = "extension_outreach")
    private String input3631t1;
	@Column(name = "extension_activities")
    private String input3641t1;
	@Column(name = "collaborative_activities")
    private String input3711t1;
	@Column(name = "mous")
    private String input3721t1;
	
//	@ManyToMany
//    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "field_id"), inverseJoinColumns = @JoinColumn(name = "roleid", referencedColumnName = "year_id"))
//    private List<YearInfo> yearInfo;
	
	 @ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name = "field_id")
	  @OnDelete(action = OnDeleteAction.CASCADE)
	  @JsonIgnore
	  private FieldInfo fieldInfo;

	
//	public List<YearInfo> getYearInfo() {
//		return yearInfo;
//	}
//	public void setYearInfo(List<YearInfo> yearInfo) {
//		this.yearInfo = yearInfo;
//	}
	
	public String getInput3121t1() {
		return input3121t1;
	}
	public Long getYearid() {
		return yearid;
	}
	public void setYearid(Long yearid) {
		this.yearid = yearid;
	}
	public void setInput3121t1(String input3121t1) {
		this.input3121t1 = input3121t1;
	}
	public String getInput3121t2() {
		return input3121t2;
	}
	public void setInput3121t2(String input3121t2) {
		this.input3121t2 = input3121t2;
	}
	public String getInput3131t1() {
		return input3131t1;
	}
	public void setInput3131t1(String input3131t1) {
		this.input3131t1 = input3131t1;
	}
	public String getInput3211t1() {
		return input3211t1;
	}
	public void setInput3211t1(String input3211t1) {
		this.input3211t1 = input3211t1;
	}
	public String getInput3221t1() {
		return input3221t1;
	}
	public void setInput3221t1(String input3221t1) {
		this.input3221t1 = input3221t1;
	}
	public String getInput3241t1() {
		return input3241t1;
	}
	public void setInput3241t1(String input3241t1) {
		this.input3241t1 = input3241t1;
	}
	public String getInput3321t1() {
		return input3321t1;
	}
	public void setInput3321t1(String input3321t1) {
		this.input3321t1 = input3321t1;
	}
	public String getInput3431t1() {
		return input3431t1;
	}
	public void setInput3431t1(String input3431t1) {
		this.input3431t1 = input3431t1;
	}
	public String getInput3441t1() {
		return input3441t1;
	}
	public void setInput3441t1(String input3441t1) {
		this.input3441t1 = input3441t1;
	}
	public String getInput3511t1() {
		return input3511t1;
	}
	public void setInput3511t1(String input3511t1) {
		this.input3511t1 = input3511t1;
	}
	public String getInput3521t1() {
		return input3521t1;
	}
	public void setInput3521t1(String input3521t1) {
		this.input3521t1 = input3521t1;
	}
	public String getInput3621t1() {
		return input3621t1;
	}
	public void setInput3621t1(String input3621t1) {
		this.input3621t1 = input3621t1;
	}
	public String getInput3631t1() {
		return input3631t1;
	}
	public void setInput3631t1(String input3631t1) {
		this.input3631t1 = input3631t1;
	}
	public String getInput3641t1() {
		return input3641t1;
	}
	public void setInput3641t1(String input3641t1) {
		this.input3641t1 = input3641t1;
	}
	public String getInput3711t1() {
		return input3711t1;
	}
	public void setInput3711t1(String input3711t1) {
		this.input3711t1 = input3711t1;
	}
	public String getInput3721t1() {
		return input3721t1;
	}
	public void setInput3721t1(String input3721t1) {
		this.input3721t1 = input3721t1;
	}
	public FieldInfo getFieldInfo() {
		return fieldInfo;
	}
	public void setFieldInfo(FieldInfo fieldInfo) {
		this.fieldInfo = fieldInfo;
	}

	
}
