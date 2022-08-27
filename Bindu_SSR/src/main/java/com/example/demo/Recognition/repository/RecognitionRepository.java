
  package com.example.demo.Recognition.repository; 
  import java.util.List;
  
  import org.springframework.data.jpa.repository.JpaRepository;
  
  import com.example.demo.Recognition.basic.Recognition;
  
  
  public interface RecognitionRepository extends JpaRepository<Recognition,Long> 
  { 
	  
  }
 