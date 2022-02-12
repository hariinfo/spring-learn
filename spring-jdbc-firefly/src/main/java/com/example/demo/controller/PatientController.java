package com.example.demo.controller;

import com.example.demo.data.Book;
import com.example.demo.data.PatientDTO;
import com.example.demo.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;

    //Get all patient
    @GetMapping
    public List<PatientDTO> getPatients(){
        return patientService.getAllPatients();
    }

    @GetMapping("{patientID}")
    public PatientDTO getPatient(@PathVariable Integer patientID){
        return patientService.getPatient(patientID);
    }
}
