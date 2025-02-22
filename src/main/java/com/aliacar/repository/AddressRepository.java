package com.aliacar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliacar.entites.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
