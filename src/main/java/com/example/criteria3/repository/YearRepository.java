package com.example.criteria3.repository;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.criteria3.model.YearInfo;


@Repository
public interface YearRepository extends JpaRepository<YearInfo, Long>
{
//	 List<YearInfo> findByFieldId(Long yearid);
	  
//	  @Transactional
//	  void deleteByFieldId(long field_id);
}

