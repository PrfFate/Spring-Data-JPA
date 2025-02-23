package com.aliacar.services;

import java.util.List;

import com.aliacar.dto.DtoEmployee;

public interface IEmployeService {

    public List<DtoEmployee> findAllEmployees();
}
