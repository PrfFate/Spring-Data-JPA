package com.aliacar.controller;

import java.util.List;

import com.aliacar.dto.DtoEmployee;

public interface IEmployeeController {

    public List<DtoEmployee> findAllEmployees();
}
