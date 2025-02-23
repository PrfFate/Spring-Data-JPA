package com.aliacar.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aliacar.controller.IEmployeeController;
import com.aliacar.dto.DtoEmployee;
import com.aliacar.services.IEmployeService;

@RestController
@RequestMapping(path = "/rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController {

    @Autowired
    private IEmployeService employeeService;

    @GetMapping(path = "/list")
    @Override
    public List<DtoEmployee> findAllEmployees() {
      return employeeService.findAllEmployees();
        
    }

    
}
