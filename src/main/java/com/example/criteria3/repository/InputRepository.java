package com.example.criteria3.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.criteria3.model.*;


@Repository
public interface InputRepository extends JpaRepository<FieldInfo, Long>
{
	List<FieldInfo> findByResponseValueContaining(String responseValue);
}

