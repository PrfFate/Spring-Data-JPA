package com.aliacar.services;

import java.util.List;

import com.aliacar.entites.Student;

public interface IStudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
