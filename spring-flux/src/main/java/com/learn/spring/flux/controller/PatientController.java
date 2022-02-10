package com.learn.spring.flux.controller;

import com.learn.spring.flux.entity.Patient;
import com.learn.spring.flux.service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/patient")
@Slf4j
public class PatientController {
    
    @Autowired
    PatientService patientService;

    @GetMapping(value = "{patientID}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Patient> getPatient(@PathVariable(required = true, name = "patientID") Integer patientID){
        log.info("inside getPatient controller");
        return patientService.getPatient(patientID);
        //Patient sample = new Patient(1,"","");
        //return Mono.just(sample);
    }
}
