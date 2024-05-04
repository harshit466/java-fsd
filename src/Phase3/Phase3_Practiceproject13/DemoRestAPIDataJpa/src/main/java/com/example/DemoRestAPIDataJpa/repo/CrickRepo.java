package com.example.DemoRestAPIDataJpa.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DemoRestAPIDataJpa.models.CricInfo;



@Repository
public interface CrickRepo extends JpaRepository<CricInfo, Integer> {

}