package com.aliacar.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliacar.dto.DtoAddress;
import com.aliacar.dto.DtoCustomer;
import com.aliacar.entites.Address;
import com.aliacar.repository.AddressRepository;
import com.aliacar.services.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService {
    
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public DtoAddress finAddressById(Long id) {
        
        DtoAddress dtoAddress=new DtoAddress();

        Optional<Address> optional= addressRepository.findById(id);
        if(optional.isEmpty()){
            return null;
        }
        Address address=optional.get();
        BeanUtils.copyProperties(address, dtoAddress);
        
        DtoCustomer dtoCustomer=new  DtoCustomer();
        dtoCustomer.setId(address.getCustomer().getId());
        dtoCustomer.setName(address.getCustomer().getName());


        dtoAddress.setCustomer(dtoCustomer);

        return dtoAddress;
    }


}
