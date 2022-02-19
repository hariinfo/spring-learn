package com.example.demo.controller;

import com.example.demo.data.AppointmentDTO;
import com.example.demo.services.AppointmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
@Slf4j
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @GetMapping("{patientID}")
    public ResponseEntity<List<AppointmentDTO>> getAppointment(@PathVariable Integer patientID){
        log.info("Patient id is" + patientID);
        return new ResponseEntity<>(appointmentService.getPatientAppointment(patientID), HttpStatus.OK);
        //return new ResponseEntity<>(patientID, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<AppointmentDTO> addAppointment(@RequestBody AppointmentDTO appointmentDTO){
        log.info("Patient id is" + appointmentDTO);

        Long id = appointmentService.addAppointment(appointmentDTO);
        if (id != null) {
            appointmentDTO.setAppointment_id(id);
            return new ResponseEntity<>(appointmentDTO, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(appointmentDTO, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
