package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.academic.AcademicInformation;

public interface AcademicRepository extends JpaRepository<AcademicInformation,Long>
{
	List<AcademicInformation> findByLevprogramContaining(String levprogram);
	
}