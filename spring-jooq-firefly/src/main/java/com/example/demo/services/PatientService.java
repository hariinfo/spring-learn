package com.example.demo.services;

import com.example.demo.data.PatientDTO;
import org.jooq.DSLContext;
import org.jooq.example.flyway.db.psql.tables.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
   @Autowired
   private DSLContext jooqDSL;


   public List<PatientDTO> getPatient(int PatientID) {
      return jooqDSL.select()
              .from(Patient.PATIENT)
              .where(Patient.PATIENT.PATIENT_ID.equal(PatientID))
              .fetchInto(PatientDTO.class);
   }

   public PatientDTO createPatient(PatientDTO patient){
      return  jooqDSL.insertInto(Patient.PATIENT,
              Patient.PATIENT.PATIENT_ID,
              Patient.PATIENT.FIRST_NAME,
              Patient.PATIENT.LAST_NAME)
              .values(
                      patient.getPatient_id(),
                      patient.getFirstName(),
                      patient.getLastName()
      ).returningResult(Patient.PATIENT.PATIENT_ID,
              Patient.PATIENT.FIRST_NAME,
              Patient.PATIENT.LAST_NAME)
              .fetchOneInto(PatientDTO.class);
   }
}
