package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.academic.BasicProfile;

public interface BasicRepository extends JpaRepository<BasicProfile,Long>
{

	List<BasicProfile> findByNameContaining(String name);
	
}