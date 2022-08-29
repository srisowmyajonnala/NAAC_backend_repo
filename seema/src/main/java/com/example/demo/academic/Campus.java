package com.example.demo.academic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="campus")
public class Campus
{
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long campus_id;
	
	@Column(name="campustype")
	private String campustype;
	
	@Column(name="campusaddress")
	private String campusaddress;
	
	@Column(name="campuslocation")
	private String campuslocation;
	
	@Column(name="campusareainacres")
	private String campusareainacres;
	
	@Column(name="builtupareainsqmts")
	private String builtupareainsqmts;
	
	public String getCampustype() {
		return campustype;
	}

	public void setCampustype(String campustype) {
		this.campustype = campustype;
	}

	public String getCampusaddress() {
		return campusaddress;
	}

	public void setCampusaddress(String campusaddress) {
		this.campusaddress = campusaddress;
	}

	public String getCampuslocation() {
		return campuslocation;
	}

	public void setCampuslocation(String campuslocation) {
		this.campuslocation = campuslocation;
	}

	public String getCampusareainacres() {
		return campusareainacres;
	}

	public void setCampusareainacres(String campusareainacres) {
		this.campusareainacres = campusareainacres;
	}

	public String getBuiltupareainsqmts() {
		return builtupareainsqmts;
	}

	public void setBuiltupareainsqmts(String builtupareainsqmts) {
		this.builtupareainsqmts = builtupareainsqmts;
	}

}
