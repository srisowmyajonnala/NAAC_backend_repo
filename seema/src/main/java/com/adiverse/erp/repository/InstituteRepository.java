package com.adiverse.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adiverse.erp.model.Multidisciplinaryinterdisciplinary;

public interface InstituteRepository extends JpaRepository<Multidisciplinaryinterdisciplinary,Long>
{

	List<Multidisciplinaryinterdisciplinary> findByMultidisciplinaryContaining(String multidisciplinary);
	
}