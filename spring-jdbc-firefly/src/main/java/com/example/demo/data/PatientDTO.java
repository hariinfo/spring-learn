package com.example.demo.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {
    Long patient_id;
    String firstName;
    String lastName;
    String primary_email;
    Integer insurance_id;
    String phone;
}