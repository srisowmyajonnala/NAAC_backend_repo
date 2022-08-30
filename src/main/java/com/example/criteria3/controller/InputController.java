package com.example.criteria3.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.criteria3.model.FieldInfo;
import com.example.criteria3.repository.InputRepository;


@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("/api/v1/")
public class InputController {


   
    
    @Autowired
    private InputRepository inputRepository;

    @GetMapping("/fieldinformation")
	public List<FieldInfo> getAllEmployees(){
		return inputRepository.findAll();
	}	
    
    @PostMapping("/fieldinfo")
	public FieldInfo createEmployee(@RequestBody FieldInfo employee) {
		return inputRepository.save(employee);
	}
}
