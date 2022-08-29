package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.academic.Multidisciplinaryinterdisciplinary;

public interface InstituteRepository extends JpaRepository<Multidisciplinaryinterdisciplinary,Long>
{

	List<Multidisciplinaryinterdisciplinary> findByMultidisciplinaryContaining(String multidisciplinary);
	
}