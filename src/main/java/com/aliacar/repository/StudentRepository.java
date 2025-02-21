package com.aliacar.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aliacar.entites.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer > {
    
    @Query(value="from Student",nativeQuery = false)
    List<Student> findAllStudents();

    @Query(value = "from Student s where s.id=:studentId")
    Optional<Student> findbyStudentById(Integer studentId);
    
}
