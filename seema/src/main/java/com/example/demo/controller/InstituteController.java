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

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.academic.Multidisciplinaryinterdisciplinary;

import com.example.demo.repository.InstituteRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class InstituteController	
{
	 @Autowired
	 InstituteRepository instituteRepository;

	  @GetMapping("/institute_academy")
	  public ResponseEntity<List<Multidisciplinaryinterdisciplinary>> getAllInstituteTutorials(@RequestParam(required = false) String multidisciplinary) {
	    try {
	      List<Multidisciplinaryinterdisciplinary> institute_tutorial = new ArrayList<Multidisciplinaryinterdisciplinary>();
	      if (multidisciplinary == null)
	    	  instituteRepository.findAll().forEach(institute_tutorial::add);
	      else
	    	  instituteRepository.findByMultidisciplinaryContaining(multidisciplinary).forEach(institute_tutorial::add);
	      if (institute_tutorial.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(institute_tutorial, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  @GetMapping("/institute_tutorials/{id}")
	  public ResponseEntity<Multidisciplinaryinterdisciplinary> getBasicTutorialById(@PathVariable("id") long id) {
	    Optional<Multidisciplinaryinterdisciplinary> tutorial_Data = instituteRepository.findById(id);
	    if (tutorial_Data.isPresent()) {
	      return new ResponseEntity<>(tutorial_Data.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
}
