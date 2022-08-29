package com.example.demo.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.academic.AcademicInstitution;



public interface AcademicRepositoryTwo extends JpaRepository<AcademicInstitution,Long>
{

//	List<AcademicInformation> findByLevprogramContaining(String levprogram);
	
}