package com.aliacar.controller;

import com.aliacar.dto.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer findCustomerById(Long id);
}
