package com.aliacar.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.aliacar.entites.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
