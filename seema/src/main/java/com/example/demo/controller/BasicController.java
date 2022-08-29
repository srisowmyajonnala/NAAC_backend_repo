package com.example.demo.controller;

import java.util.*;

//import java.util.ArrayList;
//
//import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.academic.AcademicInformation;
import com.example.demo.academic.BasicProfile;

import com.example.demo.repository.BasicRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class BasicController	
{
	 @Autowired
	 BasicRepository basicRepository;
	 
	 
//	  @PostMapping("/academicinfo")
//	  public ResponseEntity<AcademicInformation> createTutorial(@RequestBody AcademicInformation academicInformation) {
//	    try {
//	    	AcademicInformation academicinfo = academicRepository
//	          .save(academicInformation);
//	      return new ResponseEntity<>(academicinfo, HttpStatus.CREATED);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }
	  @GetMapping("/basic_academy")
	  public ResponseEntity<List<BasicProfile>> getAllBasicTutorials(@RequestParam(required = false) String name) {
	    try {
	      List<BasicProfile> basic_tutorial = new ArrayList<BasicProfile>();
	      if (name == null)
	    	  basicRepository.findAll().forEach(basic_tutorial::add);
	      else
	    	  basicRepository.findByNameContaining(name).forEach(basic_tutorial::add);
	      if (basic_tutorial.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(basic_tutorial, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  @GetMapping("/basic_tutorials/{id}")
	  public ResponseEntity<BasicProfile> getBasicTutorialById(@PathVariable("id") long id) {
	    Optional<BasicProfile> tutorial_Data = basicRepository.findById(id);
	    if (tutorial_Data.isPresent()) {
	      return new ResponseEntity<>(tutorial_Data.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
}
