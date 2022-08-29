package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import com.example.demo.dito.InputRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.academic.AcademicInformation;
import com.example.demo.repository.AcademicRepository;
import com.example.demo.repository.AcademicRepositoryTwo;
import com.example.demo.repository.TeachingStaffRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class AcademicController	
{
	 @Autowired
	  AcademicRepository academicRepository;
	 
	 @Autowired
	 AcademicRepositoryTwo academicRepositoryTwo;
	 
	 @Autowired
	 TeachingStaffRepository teachingstaffRepository; 
	 
	  @PostMapping("/academicinfo")
	  public ResponseEntity<AcademicInformation> createTutorial(@RequestBody AcademicInformation academicInformation) {
	    try {
	    	AcademicInformation academicinfo = academicRepository
	          .save(academicInformation);
	      return new ResponseEntity<>(academicinfo, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }

	  @GetMapping("/academy")
	  public ResponseEntity<List<AcademicInformation>> getAllTutorials(@RequestParam(required = false) String levprogram) {
	    try {
	      List<AcademicInformation> tutorials = new ArrayList<AcademicInformation>();
	      if (levprogram == null)
	        academicRepository.findAll().forEach(tutorials::add);
	      else
	        academicRepository.findByLevprogramContaining(levprogram).forEach(tutorials::add);
	      if (tutorials.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(tutorials, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  @GetMapping("/tutorials/{id}")
	  public ResponseEntity<AcademicInformation> getTutorialById(@PathVariable("id") long id) {
	    Optional<AcademicInformation> tutorialData = academicRepository.findById(id);
	    if (tutorialData.isPresent()) {
	      return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
}
