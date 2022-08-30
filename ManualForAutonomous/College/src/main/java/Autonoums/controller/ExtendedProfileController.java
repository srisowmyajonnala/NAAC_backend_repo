package Autonoums.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Autonoums.ExtendedProfile;
import Autonoums.repository.ExtendedProfileRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class ExtendedProfileController {
	
	@Autowired
	ExtendedProfile extendedProfile; 
	
	 @Autowired
	 ExtendedProfileRepository extendedProfileRepository; 
	 
	 @GetMapping("/getExtendedProfile")
	  public ResponseEntity<List<ExtendedProfile>> getAllExtendedProfile(@RequestParam(required = false) String programmeYear) {
	    try {
	    	System.out.println("is programmeyear empty ==>"+programmeYear);
	      List<ExtendedProfile> extendedProfile = new ArrayList<ExtendedProfile>();
	      if (programmeYear == null) {
	    	  System.out.println("programmeYear.findAll()==>"+extendedProfileRepository.findAll());
	    	  extendedProfileRepository.findAll().forEach(extendedProfile::add);
	      }
	      else {
	    	  System.out.println("ygthghjgg");
	      }
	      if (extendedProfile.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      ExtendedProfile rec = extendedProfile.get(0);
	      System.out.println("extendedprofile is==>"+extendedProfile.get(0));
	      return new ResponseEntity<>(extendedProfile, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  @GetMapping("/tutorials/{id}")
	  public ResponseEntity<ExtendedProfile> getTutorialById(@PathVariable("id") long id) {
	    Optional<ExtendedProfile> tutorialData =extendedProfileRepository.findById(id);
	    if (tutorialData.isPresent()) {
	      return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	  @PostMapping("/tutorials")
	  public ResponseEntity<ExtendedProfile> createTutorial(@RequestBody ExtendedProfile extendedprofile) {
	    try {
	    	ExtendedProfile _tutorial = extendedProfileRepository
	          .save(extendedprofile);
	      return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
}