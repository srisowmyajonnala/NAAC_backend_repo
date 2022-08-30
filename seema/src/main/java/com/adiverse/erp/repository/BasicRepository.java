package com.adiverse.erp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adiverse.erp.model.BasicProfile;

public interface BasicRepository extends JpaRepository<BasicProfile,Long>
{

	List<BasicProfile> findByNameContaining(String name);
	
}