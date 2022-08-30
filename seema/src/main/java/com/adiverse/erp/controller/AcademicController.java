package com.adiverse.erp.controller;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.adiverse.erp.model.BasicProfile;
import com.adiverse.erp.repository.AcademicRepository;
import com.adiverse.erp.repository.AcademicRepositoryTwo;
import com.adiverse.erp.repository.AcademicStudentsAdmittedRepository;
import com.adiverse.erp.repository.AcademicStudentsEnrolledRepository;
import com.adiverse.erp.repository.BasicProfileRepository;
import com.adiverse.erp.repository.BasicRepository;
import com.adiverse.erp.repository.CampusRepository;
import com.adiverse.erp.repository.ExtendedProfileRepository;
import com.adiverse.erp.repository.InstituteRepository;
import com.adiverse.erp.repository.RecognitionRepository;
import com.adiverse.erp.repository.TeachingStaffRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class AcademicController	
{
	
	@Autowired
	BasicRepository basicRepository;
	
	 @Autowired
	 RecognitionRepository recognitionRepository;
	 
	 @Autowired
	 BasicProfileRepository basicprofileRepository;
	 
	 @Autowired
	 CampusRepository campusRepository;
	
	 @Autowired
	  AcademicRepository academicRepository;
	 
	 @Autowired
	 AcademicRepositoryTwo academicRepositoryTwo;
	 
	 @Autowired
	 TeachingStaffRepository teachingstaffRepository; 
	
	 
	 @Autowired
	 AcademicStudentsEnrolledRepository academicstudentsenrolledRepository;
	 
	 @Autowired
	 AcademicStudentsAdmittedRepository academicstudentsadmittedRepository;
	 
	 @Autowired
	 InstituteRepository instituteRepository;
	 
	 @Autowired
	 ExtendedProfileRepository extendedprofileRepository;
	 
	  @PostMapping("/academicinfo")
	  public ResponseEntity<BasicProfile> createTutorial(@RequestBody BasicProfile basicProfile) {
	    try {
	    	BasicProfile academicinfo = basicRepository
	          .save(basicProfile);
	      return new ResponseEntity<>(academicinfo, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }

	  @GetMapping("/academy")
	  public ResponseEntity<List<BasicProfile>> getAllTutorials(@RequestParam(required = false) String name) {
	    try {
	      List<BasicProfile> tutorials = new ArrayList<BasicProfile>();
	      if (name == null)
	        basicRepository.findAll().forEach(tutorials::add);
	      else
	        basicRepository.findByNameContaining(name).forEach(tutorials::add);
	      if (tutorials.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(tutorials, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  @GetMapping("/tutorials/{id}")
	  public ResponseEntity<BasicProfile> getTutorialById(@PathVariable("id") long id) {
	    Optional<BasicProfile> tutorialData = basicRepository.findById(id);
	    if (tutorialData.isPresent()) {
	      return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
}
