package com.example.criteria3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name ="field_info11")
public class FieldInfo {
	
	@Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
	@Column(name = "input311t1")
    private String input311t1;
	@Column(name = "input3121t1")
    private String input3121t1;
	@Column(name = "input3121t2")
    private String input3121t2;
	@Column(name = "input3121t3")
    private String input3121t3;
	@Column(name = "input3121t4")
    private String input3121t4;
	@Column(name = "input3121t5")
    private String input3121t5;
	@Column(name = "input3121t6")
    private String input3121t6;
	@Column(name = "input3121t7")
    private String input3121t7;
	@Column(name = "input3121t8")
    private String input3121t8;
	@Column(name = "input3121t9")
    private String input3121t9;
	@Column(name = "input3121t10")
    private String input3121t10;
	@Column(name = "input3131t1")
    private String input3131t1;
	@Column(name = "input3131t2")
    private String input3131t2;
	@Column(name = "input3131t3")
    private String input3131t3;
	@Column(name = "input3131t4")
    private String input3131t4;
	@Column(name = "input3131t5")
    private String input3131t5;
	@Column(name = "input3131t6")
    private String input3131t6;
	@Column(name = "input3131t7")
    private String input3131t7;
	@Column(name = "input3131t8")
    private String input3131t8;
	@Column(name = "input3131t9")
    private String input3131t9;
	@Column(name = "input3131t10")
    private String input3131t10;
	
	
	
	
	public FieldInfo() {
		
	}
	
	public FieldInfo(String input311t1, String input3121t1, String input3121t2, String input3121t3, String input3121t4, String input3121t5, String input3121t6, String input3121t7,String input3121t8, String input3121t9, String input3121t10,String input3131t1, String input3131t2, String input3131t3, String input3131t4, String input3131t5, String input3131t6, String input3131t7,String input3131t8, String input3131t9, String input3131t10) {
		super();
		this.input311t1 = input311t1;
		this.input3121t1 = input3121t1;
		this.input3121t2 = input3121t2;
		this.input3121t3 = input3121t3;
		this.input3121t4= input3121t4;
		this.input3121t5 = input3121t5;
		this.input3121t6 = input3121t6;
		this.input3121t7 = input3121t7;
		this.input3121t8 = input3121t8;
		this.input3121t9 = input3121t9;
		this.input3121t10 = input3121t10;
		this.input3131t1 = input3131t1;
		this.input3131t2 = input3131t2;
		this.input3131t3 = input3131t3;
		this.input3131t4 = input3131t4;
		this.input3131t5 = input3131t5;
		this.input3131t6 = input3131t6;
		this.input3131t7 = input3131t7;
		this.input3131t8 = input3131t8;
		this.input3131t9 = input3131t9;
		this.input3131t10 = input3131t10;
		

	}

	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInput311t1() {
		return input311t1;
	}

	public void setInput311t1(String input311t1) {
		this.input311t1 = input311t1;
	}

	public String getInput3121t1() {
		return input3121t1;
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

	public String getInput3121t3() {
		return input3121t3;
	}

	public void setInput3121t3(String input3121t3) {
		this.input3121t3 = input3121t3;
	}

	public String getInput3121t4() {
		return input3121t4;
	}

	public void setInput3121t4(String input3121t4) {
		this.input3121t4 = input3121t4;
	}

	public String getInput3121t5() {
		return input3121t5;
	}

	public void setInput3121t5(String input3121t5) {
		this.input3121t5 = input3121t5;
	}

	public String getInput3121t6() {
		return input3121t6;
	}

	public void setInput3121t6(String input3121t6) {
		this.input3121t6 = input3121t6;
	}

	public String getInput3121t7() {
		return input3121t7;
	}

	public void setInput3121t7(String input3121t7) {
		this.input3121t7 = input3121t7;
	}

	public String getInput3121t8() {
		return input3121t8;
	}

	public void setInput3121t8(String input3121t8) {
		this.input3121t8 = input3121t8;
	}

	public String getInput3121t9() {
		return input3121t9;
	}

	public void setInput3121t9(String input3121t9) {
		this.input3121t9 = input3121t9;
	}

	public String getInput3121t10() {
		return input3121t10;
	}

	public void setInput3121t10(String input3121t10) {
		this.input3121t10 = input3121t10;
	}

	public String getInput3131t1() {
		return input3131t1;
	}

	public void setInput3131t1(String input3131t1) {
		this.input3131t1 = input3131t1;
	}

	public String getInput3131t2() {
		return input3131t2;
	}

	public void setInput3131t2(String input3131t2) {
		this.input3131t2 = input3131t2;
	}

	public String getInput3131t3() {
		return input3131t3;
	}

	public void setInput3131t3(String input3131t3) {
		this.input3131t3 = input3131t3;
	}

	public String getInput3131t4() {
		return input3131t4;
	}

	public void setInput3131t4(String input3131t4) {
		this.input3131t4 = input3131t4;
	}

	public String getInput3131t5() {
		return input3131t5;
	}

	public void setInput3131t5(String input3131t5) {
		this.input3131t5 = input3131t5;
	}

	public String getInput3131t6() {
		return input3131t6;
	}

	public void setInput3131t6(String input3131t6) {
		this.input3131t6 = input3131t6;
	}

	public String getInput3131t7() {
		return input3131t7;
	}

	public void setInput3131t7(String input3131t7) {
		this.input3131t7 = input3131t7;
	}

	public String getInput3131t8() {
		return input3131t8;
	}

	public void setInput3131t8(String input3131t8) {
		this.input3131t8 = input3131t8;
	}

	public String getInput3131t9() {
		return input3131t9;
	}

	public void setInput3131t9(String input3131t9) {
		this.input3131t9 = input3131t9;
	}

	public String getInput3131t10() {
		return input3131t10;
	}

	public void setInput3131t10(String input3131t10) {
		this.input3131t10 = input3131t10;
	}

	

	

   

    
}
