package com.adiverse.erp.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="basic_profile")
public class BasicProfile 
{
	
		@Id	
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long basicprop_id;
		
		@Column(name="Name")
		private String name;
		@Column(name="Address")
		private String address;
		@Column(name="City")
		private String city;
		@Column(name="state_status")
		private String state;
		@Column(name="Pin")
		private String pin;
		@Column(name="Website")
		private String website;
		@Column(name="Contacts_Designation")
		private String designation;
		@Column(name="Contacts_Name")
		private String contactname;
		@Column(name="telephone_code")
		private String telephone_code;
		@Column(name="mobile_number")
		private String mobile_no;
		@Column(name="fax")
		private String fax;
		@Column(name="e_mail")
		private String email;
		@Column(name="institution_status")
		private String institution_status;
		@Column(name="By_gender")
		private String gender;
		@Column(name="By_Shift")
		private String Shift;
		@Column(name="Dateof_Establishment")
		private String establishment;
		@Column(name="Dateof_grant")
		private String Dateof_grant;
		@Column(name="Establishment_date")
		private String Establish_date;
		@Column(name="institution_name")
		private String institution_name;
		@Column(name="view_Document")
		private String view_Document;
		@Column(name="recogized_minority")
		private String recogized_minority;
		@Column(name="specify_minority")
		private String specify_minority;
		@Column(name="religious")
		private String religious;
		@Column(name="any_other")
		private String any_other;
		@Column(name="UGC_OF_2f")
		private String ugcof2f;
		@Column(name="UGC_OF_12B")
		private String ugcof12b;
		@Column(name="programmes_no")
		private String programmes_no;
		@Column(name="programmes_name")
		private String programmes_name;
		@Column(name="programs_ug")
		private String programs_ug;
		@Column(name="programs_pg")
		private String programs_pg;
		@Column(name="Aided")
		private String aided;
		@Column(name="self_financed")
		private String self_financed;
		@Column(name="programmes_offered")
		private String programmes_offered;
		
		  @OneToMany(targetEntity=Recognition.class,cascade=CascadeType.ALL)
		  @JoinColumn(name="rb_fk",referencedColumnName="basicprop_id")
		  private List<Recognition> recognition;
		
		  @OneToMany(targetEntity = basicprofile_2.class,cascade=CascadeType.ALL)
		  @JoinColumn(name="bp_fk",referencedColumnName="basicprop_id")
		  private List<basicprofile_2> basicprofile2;
		  
		  @OneToMany(targetEntity=Campus.class,cascade=CascadeType.ALL)
		  @JoinColumn(name="cp_fk",referencedColumnName="basicprop_id")
		  private List<Campus> campus;
		  
		  @OneToMany(targetEntity=AcademicInformation.class,cascade=CascadeType.ALL)
		  @JoinColumn(name="ai_fk",referencedColumnName="basicprop_id")
		  private List<AcademicInformation> academicinformation;
		  
		  
		  @OneToMany(targetEntity=Multidisciplinaryinterdisciplinary.class,cascade=CascadeType.ALL)
		  @JoinColumn(name="mi_fk",referencedColumnName="basicprop_id")
		  private List<Multidisciplinaryinterdisciplinary> multidisciplinaryInterdisciplinary;
		  
		  @OneToMany(targetEntity=ExtendedProfile.class,cascade=CascadeType.ALL)
		  @JoinColumn(name="ep_fk",referencedColumnName="basicprop_id")
		  private List<ExtendedProfile> extendedProfile;
		
		public long getBasicprop_id() {
			return basicprop_id;
		}
		public void setBasicprop_id(long basicprop_id) {
			this.basicprop_id = basicprop_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPin() {
			return pin;
		}
		public void setPin(String pin) {
			this.pin = pin;
		}
		public String getWebsite() {
			return website;
		}
		public void setWebsite(String website) {
			this.website = website;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getContactname() {
			return contactname;
		}
		public void setContactname(String contactname) {
			this.contactname = contactname;
		}
		public String getTelephone_code() {
			return telephone_code;
		}
		public void setTelephone_code(String telephone_code) {
			this.telephone_code = telephone_code;
		}
		public String getMobile_no() {
			return mobile_no;
		}
		public void setMobile_no(String mobile_no) {
			this.mobile_no = mobile_no;
		}
		public String getFax() {
			return fax;
		}
		public void setFax(String fax) {
			this.fax = fax;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getInstitution_status() {
			return institution_status;
		}
		public void setInstitution_status(String institution_status) {
			this.institution_status = institution_status;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getShift() {
			return Shift;
		}
		public void setShift(String shift) {
			Shift = shift;
		}
		public String getEstablishment() {
			return establishment;
		}
		public void setEstablishment(String establishment) {
			this.establishment = establishment;
		}
		public String getDateof_grant() {
			return Dateof_grant;
		}
		public void setDateof_grant(String dateof_grant) {
			Dateof_grant = dateof_grant;
		}
		public String getEstablish_date() {
			return Establish_date;
		}
		public void setEstablish_date(String establish_date) {
			Establish_date = establish_date;
		}
		public String getInstitution_name() {
			return institution_name;
		}
		public void setInstitution_name(String institution_name) {
			this.institution_name = institution_name;
		}
		public String getView_Document() {
			return view_Document;
		}
		public void setView_Document(String view_Document) {
			this.view_Document = view_Document;
		}
		public String getRecogized_minority() {
			return recogized_minority;
		}
		public void setRecogized_minority(String recogized_minority) {
			this.recogized_minority = recogized_minority;
		}
		public String getSpecify_minority() {
			return specify_minority;
		}
		public void setSpecify_minority(String specify_minority) {
			this.specify_minority = specify_minority;
		}
		public String getReligious() {
			return religious;
		}
		public void setReligious(String religious) {
			this.religious = religious;
		}
		public String getAny_other() {
			return any_other;
		}
		public void setAny_other(String any_other) {
			this.any_other = any_other;
		}
		public String getUgcof2f() {
			return ugcof2f;
		}
		public void setUgcof2f(String ugcof2f) {
			this.ugcof2f = ugcof2f;
		}
		public String getUgcof12b() {
			return ugcof12b;
		}
		public void setUgcof12b(String ugcof12b) {
			this.ugcof12b = ugcof12b;
		}
		public String getProgrammes_no() {
			return programmes_no;
		}
		public void setProgrammes_no(String programmes_no) {
			this.programmes_no = programmes_no;
		}
		public String getProgrammes_name() {
			return programmes_name;
		}
		public void setProgrammes_name(String programmes_name) {
			this.programmes_name = programmes_name;
		}
		public String getPrograms_ug() {
			return programs_ug;
		}
		public void setPrograms_ug(String programs_ug) {
			this.programs_ug = programs_ug;
		}
		public String getPrograms_pg() {
			return programs_pg;
		}
		public void setPrograms_pg(String programs_pg) {
			this.programs_pg = programs_pg;
		}
		public String getAided() {
			return aided;
		}
		public void setAided(String aided) {
			this.aided = aided;
		}
		public String getSelf_financed() {
			return self_financed;
		}
		public void setSelf_financed(String self_financed) {
			this.self_financed = self_financed;
		}
		public String getProgrammes_offered() {
			return programmes_offered;
		}
		public void setProgrammes_offered(String programmes_offered) {
			this.programmes_offered = programmes_offered;
		}
		
		
		
	}




