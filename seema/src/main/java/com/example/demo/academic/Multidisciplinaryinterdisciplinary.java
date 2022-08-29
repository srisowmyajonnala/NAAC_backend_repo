package com.example.demo.academic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity

@Table(name = "Institute") 
public class Multidisciplinaryinterdisciplinary {
	 
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long college_id;
	 
	  @Lob
	  @Column(name = "Multidisciplinary_name",  columnDefinition="TEXT")
	  private String multidisciplinary; 
	  @Lob
	  @Column(name= "ABC_title",  columnDefinition="TEXT")
	  private String ABC_tiltle;
	  @Lob
	  @Column(name="Skill_development",  columnDefinition="TEXT")
	  private String Skill_development;
	  @Lob
	  @Column(name="Knowledge_a",  columnDefinition="TEXT")
	  private String Knowledge_a ;
	  @Lob
	  @Column(name="education_OBE",  columnDefinition="TEXT")
	  private String education_OBE;
	  @Lob
	  @Column(name="online_education",  columnDefinition="TEXT")
	  private String online_education;	
	@Override
	public String toString() {
		return "Multidisciplinaryinterdisciplinary [Multidisciplinary_name=" + multidisciplinary+ ", ABC_tiltle="
				+ ABC_tiltle + ", Skill_development=" + Skill_development + ", Knowledge_a=" + Knowledge_a
				+ ", education_OBE=" + education_OBE + ", online_education=" + online_education + "]";
	}

	public long College_id() {
		return college_id;
	}
	public String getMultidisciplinary_name() {
		return multidisciplinary;
	}  
}