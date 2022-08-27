
  package com.example.demo.Recognition.controller;
  
  import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import  org.springframework.web.bind.annotation.CrossOrigin;
import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import  org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RequestParam;
import  org.springframework.web.bind.annotation.RestController;

import com.example.demo.Recognition.basic.Recognition;
import com.example.demo.Recognition.repository.RecognitionRepository;
  
  @CrossOrigin(origins = "http://localhost:8081")
  @RestController
  @RequestMapping("/api")
  public class Controller {
	  @Autowired
	  Repository repository;
	  @Autowired
	  Recognition recognition;
	  @Autowired
	 RecognitionRepository  repo;
	  @GetMapping("/tutorials")
	  public ResponseEntity<List<Recognition>> getAllTutorials(@RequestParam(required = false) String recogRegulatory) {
	    try {
	    	System.out.println("is recogRegulatory empty ==>"+recogRegulatory);
	      List<Recognition> recognition = new ArrayList<Recognition>();
	      if (recogRegulatory == null) {
	    	  System.out.println("repo.findAll()==>"+repo.findAll());
	    	  repo.findAll().forEach(recognition::add);
	      }
	      else
	      {
	    	  System.out.println("leeter");
	      }
	      if (recognition.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      Recognition rec = recognition.get(0);
	      System.out.println("rec re==>"+rec.getBuiltupareainsqmts());
	      System.out.println("recognition is==>"+recognition.get(0));
	      return new ResponseEntity<>(recognition, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  @GetMapping("/tutorials/{id}")
	  public ResponseEntity<Recognition> getTutorialById(@PathVariable("id") long id) {
	    Optional< Recognition> tutorialData =repo.findById(id);
	    if (tutorialData.isPresent()) {
	      return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	  @PostMapping("/tutorials")
	  public ResponseEntity<Recognition> createTutorial(@RequestBody Recognition recognition) {
	    try {
	    	Recognition _tutorial = repo
	          .save(recognition);
	      return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
  }

 

