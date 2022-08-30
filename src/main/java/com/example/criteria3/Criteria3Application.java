package com.example.criteria3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import org.springframework.boot.CommandLineRunner;

import com.example.criteria3.service.FilesStorageService;
@SpringBootApplication


public class Criteria3Application implements CommandLineRunner {
	
	  @Resource
	  FilesStorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(Criteria3Application.class, args);
		
	}
	
	  @Override
	  public void run(String... arg) throws Exception {
	    storageService.deleteAll();
	    storageService.init();
	  }


}
