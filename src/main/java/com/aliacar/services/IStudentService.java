package com.aliacar.services;

import java.util.List;

import com.aliacar.dto.DtoStudent;
import com.aliacar.dto.DtoStudentIU;


public interface IStudentService {

    public DtoStudent saveStudent(DtoStudentIU  student);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU);
}
