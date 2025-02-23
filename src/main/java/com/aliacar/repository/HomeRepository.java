package com.aliacar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aliacar.entites.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home,Long> {

}
