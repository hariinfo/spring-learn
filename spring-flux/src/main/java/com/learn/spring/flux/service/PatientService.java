package com.learn.spring.flux.service;

import com.learn.spring.flux.dao.PatientRepository;
import com.learn.spring.flux.entity.Patient;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class PatientService {
    
    
    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public Mono<Patient> getPatient(int patientID){
        return repository.findById(patientID);
    }

}
