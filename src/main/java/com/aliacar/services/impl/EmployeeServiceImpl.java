package com.aliacar.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliacar.dto.DtoDepartment;
import com.aliacar.dto.DtoEmployee;
import com.aliacar.entites.Employee;
import com.aliacar.repository.EmployeeRepository;
import com.aliacar.services.IEmployeService;

@Service
public class EmployeeServiceImpl implements IEmployeService{
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<DtoEmployee> findAllEmployees() {
        List<DtoEmployee> dtoEmployeeList= new ArrayList<>();
        List<Employee> employeeList=employeeRepository.findAll();
        if(employeeList!=null && !employeeList.isEmpty()){
            for (Employee employee : employeeList) {
                DtoEmployee dtoEmployee=new DtoEmployee();
                BeanUtils.copyProperties(employee,dtoEmployee );

                dtoEmployee.setDepartment(new DtoDepartment(employee.getDepartment().getId(),employee.getDepartment().getDepartmentName()));

                dtoEmployeeList.add(dtoEmployee);
            }
        }
        return dtoEmployeeList;
    }

    
}
