package com.example.demo.controller;

import com.example.demo.data.PatientDTO;
import com.example.demo.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("{patientID}")
    ResponseEntity<Iterable<PatientDTO>> getPatient(@PathVariable Integer patientID){
        List<PatientDTO> patient = patientService.getPatient(patientID);
        return new ResponseEntity<>(patient, HttpStatus.ACCEPTED);
    }

    @PostMapping
    ResponseEntity<PatientDTO> createPatient(@RequestBody PatientDTO patient){
        PatientDTO patientOut = patientService.createPatient(patient);
        return new ResponseEntity<>(patientOut, HttpStatus.ACCEPTED);
    }

}
