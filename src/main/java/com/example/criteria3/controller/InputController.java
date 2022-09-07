package com.example.criteria3.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.criteria3.model.FieldInfo;
import com.example.criteria3.model.FileUpload;
import com.example.criteria3.repository.FileUploadRepositoy;
import com.example.criteria3.repository.InputRepository;
import com.example.criteria3.repository.YearRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class InputController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private InputRepository inputRepository;
    
    @Autowired
	private FileUploadRepositoy fileUploadRepositoy;
    
    @Autowired
    private YearRepository yearRepository;

//    @GetMapping("/fieldinformation")
//	public List<FieldInfo> getAllEmployees(){
//		return inputRepository.findAll();
//	}
    
	  @GetMapping("/fieldinformation")
	  public ResponseEntity<List<FieldInfo>> getAllTutorials(@RequestParam(required = false) String responseValue) {
	    try {
	      List<FieldInfo> tutorials = new ArrayList<FieldInfo>();
//	      List<FileUpload> tutorials1 = new ArrayList<FileUpload>();
	      if (responseValue == null)
	      {
	        inputRepository.findAll().forEach(tutorials::add);
//	      fileUploadRepositoy.findAll().forEach(tutorials1::add);
	      }
	      else
	      {
	        inputRepository.findByResponseValueContaining(responseValue).forEach(tutorials::add);
	      }
	      if (tutorials.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(tutorials, HttpStatus.OK);
//	      return new ReponseEntity<>(tutorials1,HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  @PostMapping("/tutorials")
	  public ResponseEntity<FieldInfo> createTutorial(@RequestBody FieldInfo tutorial) {
		  FieldInfo _tutorial = inputRepository.save(tutorial);
	    return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
	  }
    @PostMapping("/fieldinfo")
   	public FieldInfo createEmployee(@RequestBody FieldInfo employee) {
   		return inputRepository.save(employee);
   	} 
    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public FieldInfo createEmployee(@RequestPart(name="uploadfile") MultipartFile[] uploadfile, @RequestPart(name = "employee") FieldInfo employee  ) {
//    	FieldInfo _tutorial=null;
    	try {
    		log.info("uploadfile========="+uploadfile.length);
    		log.info("employee info==="+employee);
    		for (int i = 0; i < uploadfile.length; i++) {
    		
    			
    		
    			// Get the filename and build the local file path
    			String filename = uploadfile[i].getOriginalFilename();
    			log.info("File name is"+filename);
    			String directory = "C:\\seema\\FileUpload";
    			String filepath = Paths.get(directory, filename).toString();	   
    			
    			// =============Save the file locally====================
    			BufferedOutputStream stream =
    					new BufferedOutputStream(new FileOutputStream(new File(filepath)));
    			
    				stream.write(uploadfile[i].getBytes());
    			
    			stream.close();
    			
    			// save it into file_upload_details table DB
    			//String path = "C:\\Users\\risha\\Desktop\\uploads\\";
    			FileUpload fileUpload = new FileUpload();
    			fileUpload.setFileName(filename);
    			fileUpload.setFilePath(filepath);
    			fileUpload.setFileType(uploadfile[i].getContentType());
    			
    			fileUploadRepositoy.save(fileUpload); 
    		}
    		
//    		log.info("employee details are"+employee);
//    		_tutorial = inputRepository.save(employee);
    		}catch (Exception e) {
    			System.out.println(e.getMessage());
    		}
    	return inputRepository.save(employee);
	}
}



































//@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
//	@ResponseBody
//	public ResponseEntity<?> uploadFile(
//			@RequestParam("uploadfile") MultipartFile[] uploadfile) throws IOException  {
//		
//		try {
//			
//		
//		for (int i = 0; i < uploadfile.length; i++) {
//		
//			
//		
//			// Get the filename and build the local file path
//			String filename = uploadfile[i].getOriginalFilename();
//			String directory = "C:\\seema\\FileUpload";
//			String filepath = Paths.get(directory, filename).toString();	   
//			
//			// =============Save the file locally====================
//			BufferedOutputStream stream =
//					new BufferedOutputStream(new FileOutputStream(new File(filepath)));
//			
//				stream.write(uploadfile[i].getBytes());
//			
//			stream.close();
//			
//			// save it into file_upload_details table DB
//			//String path = "C:\\Users\\risha\\Desktop\\uploads\\";
//			FileUpload fileUpload = new FileUpload();
//			fileUpload.setFileName(filename);
//			fileUpload.setFilePath(filepath);
//			fileUpload.setFileType(uploadfile[i].getContentType());
//			
//			fileUploadRepositoy.save(fileUpload); 
//			
//		
//		}
//		}
//		
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//
//		return new ResponseEntity<>(HttpStatus.OK);
//	}
    
    
