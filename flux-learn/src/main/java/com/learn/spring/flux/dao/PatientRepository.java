package com.learn.spring.flux.dao;



import com.learn.spring.flux.entity.Patient;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends ReactiveCrudRepository<Patient, Integer>{
    

}
