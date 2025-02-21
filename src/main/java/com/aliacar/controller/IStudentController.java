package com.aliacar.controller;

import java.util.List;

import com.aliacar.dto.DtoStudent;
import com.aliacar.dto.DtoStudentIU;


public interface IStudentController {

    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public DtoStudent updateStudent(Integer id,DtoStudentIU DtoStudentIU);


    
}
