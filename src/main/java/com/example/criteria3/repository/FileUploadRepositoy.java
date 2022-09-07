package com.example.criteria3.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.criteria3.model.FileUpload;


public interface FileUploadRepositoy extends JpaRepository<FileUpload, Long>
{
//	 List<FileUpload> findByFieldId(Long fileId);
	  
//	  @Transactional
//	  void deleteByFieldId(long field_id);
}
