package com.aliacar.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aliacar.controller.IAddressController;
import com.aliacar.dto.DtoAddress;
import com.aliacar.services.IAddressService;


@RestController
@RequestMapping("/rest/api/address")
public class AddressControllerImpl implements IAddressController {

    @Autowired
    private IAddressService addressService;

    @GetMapping("/list/{id}")
    @Override
    public DtoAddress finAddressById(@PathVariable(name = "id")Long id) {
        return addressService.finAddressById(id);
    }

    
}
