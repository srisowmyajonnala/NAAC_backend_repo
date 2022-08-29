package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.academic.AcademicTeachingStaff;

public interface TeachingStaffRepository extends JpaRepository<AcademicTeachingStaff,Long>
{

}
