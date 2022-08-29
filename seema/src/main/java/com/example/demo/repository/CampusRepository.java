package com.example.demo.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.academic.Campus;



public interface CampusRepository extends JpaRepository<Campus,Long>
{

//	List<Campus> findByCampustypeContaining(String campustype);
	
}