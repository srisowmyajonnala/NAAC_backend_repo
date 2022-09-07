
package com.example.criteria3.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name ="criteria3_info")
public class FieldInfo {
	
	@Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long field_id;
	@Column(name = "responseValue")
    private String responseValue;
	@Column(name = "responseValue312")
    private String responseValue312;
	@Column(name = "responseValue313")
    private String responseValue313;
	@Column(name = "responseValue321")
    private String responseValue321;
	@Column(name = "responseValue322")
    private String responseValue322;
	@Column(name = "responseValue323")
    private String responseValue323;
	@Column(name = "input3231t1")
    private String input3231t1;
	@Column(name = "responseValue324")
    private String responseValue324;
	@Column(name = "responseValue331")
    private String responseValue331;
	@Column(name = "responseValue332")
    private String responseValue332;
	@Column(name = "responseValue341")
    private String responseValue341;
	@Column(name = "responseValue342")
    private String responseValue342;
	@Column(name = "input3421t1")
    private String input3421t1;
	@Column(name = "input3422t1")
    private String input3422t1;
	@Column(name = "responseValue343")
    private String responseValue343;
	@Column(name = "responseValue344")
    private String responseValue344;
	@Column(name = "responseValue345")
    private String responseValue345;
	@Column(name = "input3451t1")
    private String input3451t1;
	@Column(name = "input3452t1")
    private String input3452t1;
	@Column(name = "responseValue346")
    private String responseValue346;
	@Column(name = "input3461t1")
    private String input3461t1;
	@Column(name = "responseValue351")
    private String responseValue351;
	@Column(name = "responseValue352")
    private String responseValue352;
	@Column(name = "responseValue361")
    private String responseValue361;
	@Column(name = "responseValue362")
    private String responseValue362;
	@Column(name = "responseValue363")
    private String responseValue363;
	@Column(name = "responseValue364")
    private String responseValue364;
	@Column(name = "responseValue371")
    private String responseValue371;
	@Column(name = "responseValue372")
    private String responseValue372;
	
	
	@OneToMany(mappedBy = "fieldInfo")
	private List<FileUpload> fileUpload;
	
	@OneToMany(mappedBy = "fieldInfo")
	private List<YearInfo> yearInfo;
	
	public List<FileUpload> getFileUpload() {
		return fileUpload;
	}
	public void setFileUpload(List<FileUpload> fileUpload) {
		this.fileUpload = fileUpload;
	}
	
	public List<YearInfo> getYearInfo() {
		return yearInfo;
	}
	public void setYearInfo(List<YearInfo> yearInfo) {
		this.yearInfo = yearInfo;
	}
	public Long getField_id() {
		return field_id;
	}
	public void setField_id(Long field_id) {
		this.field_id = field_id;
	}
	public String getResponseValue() {
		return responseValue;
	}


	public void setResponseValue(String responseValue) {
		this.responseValue = responseValue;
	}


	public String getResponseValue312() {
		return responseValue312;
	}


	public void setResponseValue312(String responseValue312) {
		this.responseValue312 = responseValue312;
	}


	public String getResponseValue313() {
		return responseValue313;
	}


	public void setResponseValue313(String responseValue313) {
		this.responseValue313 = responseValue313;
	}


	public String getResponseValue321() {
		return responseValue321;
	}


	public void setResponseValue321(String responseValue321) {
		this.responseValue321 = responseValue321;
	}


	public String getResponseValue322() {
		return responseValue322;
	}


	public void setResponseValue322(String responseValue322) {
		this.responseValue322 = responseValue322;
	}


	public String getResponseValue323() {
		return responseValue323;
	}


	public void setResponseValue323(String responseValue323) {
		this.responseValue323 = responseValue323;
	}


	public String getInput3231t1() {
		return input3231t1;
	}


	public void setInput3231t1(String input3231t1) {
		this.input3231t1 = input3231t1;
	}


	public String getResponseValue324() {
		return responseValue324;
	}


	public void setResponseValue324(String responseValue324) {
		this.responseValue324 = responseValue324;
	}


	public String getResponseValue331() {
		return responseValue331;
	}


	public void setResponseValue331(String responseValue331) {
		this.responseValue331 = responseValue331;
	}


	public String getResponseValue332() {
		return responseValue332;
	}


	public void setResponseValue332(String responseValue332) {
		this.responseValue332 = responseValue332;
	}


	public String getResponseValue341() {
		return responseValue341;
	}


	public void setResponseValue341(String responseValue341) {
		this.responseValue341 = responseValue341;
	}


	public String getResponseValue342() {
		return responseValue342;
	}


	public void setResponseValue342(String responseValue342) {
		this.responseValue342 = responseValue342;
	}


	public String getInput3421t1() {
		return input3421t1;
	}


	public void setInput3421t1(String input3421t1) {
		this.input3421t1 = input3421t1;
	}


	public String getInput3422t1() {
		return input3422t1;
	}


	public void setInput3422t1(String input3422t1) {
		this.input3422t1 = input3422t1;
	}


	public String getResponseValue343() {
		return responseValue343;
	}


	public void setResponseValue343(String responseValue343) {
		this.responseValue343 = responseValue343;
	}


	public String getResponseValue344() {
		return responseValue344;
	}


	public void setResponseValue344(String responseValue344) {
		this.responseValue344 = responseValue344;
	}


	public String getResponseValue345() {
		return responseValue345;
	}


	public void setResponseValue345(String responseValue345) {
		this.responseValue345 = responseValue345;
	}


	public String getInput3451t1() {
		return input3451t1;
	}


	public void setInput3451t1(String input3451t1) {
		this.input3451t1 = input3451t1;
	}


	public String getInput3452t1() {
		return input3452t1;
	}


	public void setInput3452t1(String input3452t1) {
		this.input3452t1 = input3452t1;
	}


	public String getResponseValue346() {
		return responseValue346;
	}


	public void setResponseValue346(String responseValue346) {
		this.responseValue346 = responseValue346;
	}


	public String getInput3461t1() {
		return input3461t1;
	}


	public void setInput3461t1(String input3461t1) {
		this.input3461t1 = input3461t1;
	}


	public String getResponseValue351() {
		return responseValue351;
	}


	public void setResponseValue351(String responseValue351) {
		this.responseValue351 = responseValue351;
	}


	public String getResponseValue352() {
		return responseValue352;
	}


	public void setResponseValue352(String responseValue352) {
		this.responseValue352 = responseValue352;
	}


	public String getResponseValue361() {
		return responseValue361;
	}


	public void setResponseValue361(String responseValue361) {
		this.responseValue361 = responseValue361;
	}


	public String getResponseValue362() {
		return responseValue362;
	}


	public void setResponseValue362(String responseValue362) {
		this.responseValue362 = responseValue362;
	}


	public String getResponseValue363() {
		return responseValue363;
	}


	public void setResponseValue363(String responseValue363) {
		this.responseValue363 = responseValue363;
	}


	public String getResponseValue364() {
		return responseValue364;
	}


	public void setResponseValue364(String responseValue364) {
		this.responseValue364 = responseValue364;
	}


	public String getResponseValue371() {
		return responseValue371;
	}


	public void setResponseValue371(String responseValue371) {
		this.responseValue371 = responseValue371;
	}


	public String getResponseValue372() {
		return responseValue372;
	}


	public void setResponseValue372(String responseValue372) {
		this.responseValue372 = responseValue372;
	}
	
	public FieldInfo()
	{
		
	}
	

	
	
	
//	@OneToMany(targetEntity = YearInfo.class,cascade=CascadeType.ALL)
//	  @JoinColumn(name="fi_fk",referencedColumnName="field_id")
//	  private List<YearInfo> yearInfo;
//	
//	
//	@OneToMany(targetEntity = FileUpload.class,cascade=CascadeType.ALL)
//	  @JoinColumn(name="fu_fk",referencedColumnName="field_id")
//	  private List<FileUpload> fileUpload;

}
