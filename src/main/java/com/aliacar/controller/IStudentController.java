package com.aliacar.controller;

import java.util.List;

import com.aliacar.entites.Student;

public interface IStudentController {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

    
}
