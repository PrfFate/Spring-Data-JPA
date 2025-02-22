package com.aliacar.services;

import com.aliacar.dto.DtoCustomer;

public interface ICustomerService {

    public DtoCustomer findCustomerById(Long id);
}
