package com.example.demo.services;

import com.example.demo.data.PatientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    //We use BeanPropertyRowMapper instead of a custom row mapper here.
    public List<PatientDTO> getAllPatients(){
        String SQL = "select * from patient";
        return jdbcTemplate.query(SQL,
                new BeanPropertyRowMapper<>(PatientDTO.class)
                );
    }

    public PatientDTO getPatient(int patientID){
        String SQL = "select * from patient where patient_id= ?";
        return (PatientDTO)  jdbcTemplate.queryForObject(SQL,
                new BeanPropertyRowMapper<>(PatientDTO.class),
                new Object[]{patientID}
                );
    }



}
