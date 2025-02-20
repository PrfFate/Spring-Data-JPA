package com.aliacar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliacar.entites.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer > {
    
    
}
