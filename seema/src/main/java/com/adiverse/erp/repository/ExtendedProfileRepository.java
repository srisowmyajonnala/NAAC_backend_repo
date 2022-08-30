package com.adiverse.erp.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adiverse.erp.model.ExtendedProfile;



public interface ExtendedProfileRepository extends JpaRepository<ExtendedProfile,Long>
{

//	List<AcademicInformation> findByLevprogramContaining(String levprogram);
	
}