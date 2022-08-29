package com.example.demo.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.academic.Recognition;


public interface RecognitionRepository extends JpaRepository<Recognition,Long>
{

//	List<Recognition> findByRegulatoryContaining(String regulatory);
	
}