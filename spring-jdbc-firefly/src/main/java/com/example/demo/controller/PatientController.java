package com.example.demo.controller;

import com.example.demo.data.AppointmentDTO;
import com.example.demo.data.Book;
import com.example.demo.data.PatientDTO;
import com.example.demo.exception.PatientAlreadyExistsException;
import com.example.demo.services.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/patient")
@Slf4j
public class PatientController {
    @Autowired
    PatientService patientService;

    //Get all patient
    @GetMapping
    public ResponseEntity<List<PatientDTO>> getPatients(){
        //return patientService.getAllPatients();
        return new ResponseEntity<>(patientService.getAllPatients(), HttpStatus.OK);
    }

    @GetMapping("{patientID}")
    public ResponseEntity<Optional<PatientDTO>> getPatient(@PathVariable Integer patientID){
        Optional<PatientDTO> patientDTO = patientService.getPatient(patientID);
        if (patientDTO != null) {
            log.info("Record found" + patientDTO);
            return new ResponseEntity<>(patientDTO, HttpStatus.OK);
        }
        else {
            log.info("Record not found");
            return new ResponseEntity<>(patientDTO, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<PatientDTO> addPatient(@RequestBody PatientDTO patientDTO) throws PatientAlreadyExistsException {
        //Check if Patient with the same email id exists and throw an exception prior to creating a new patient record
        //TODO:

        Long id = patientService.addPatient(patientDTO);
        if (id != null) {
            patientDTO.setPatient_id(id);
            return new ResponseEntity<>(patientDTO, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(patientDTO, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
/*
    @GetMapping("/dashboard/{patientID}")
    public ResponseEntity<List<AppointmentDTO>> getDashBoard(@PathVariable Integer patientID){
        return new ResponseEntity<>(patientService.getPatientAppointment(patientID), HttpStatus.OK);
        //throw new UnsupportedOperationException("Yet to implement");
    }
*/
}

