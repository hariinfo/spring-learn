package com.example.demo.services;

import com.example.demo.data.Patient;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
   @Autowired
   private DSLContext jooqDSL;


   public List<Patient> getPatient(int PatientID) {
      return jooqDSL.select()
              .from(org.jooq.example.flyway.db.psql.tables.Patient.PATIENT)
              .where(org.jooq.example.flyway.db.psql.tables.Patient.PATIENT.PATIENT_ID.equal(PatientID))
              .fetchInto(Patient.class);
   }

   public Patient createPatient(Patient patient){
      return  jooqDSL.insertInto(org.jooq.example.flyway.db.psql.tables.Patient.PATIENT,
              org.jooq.example.flyway.db.psql.tables.Patient.PATIENT.PATIENT_ID,
              org.jooq.example.flyway.db.psql.tables.Patient.PATIENT.FIRST_NAME,
              org.jooq.example.flyway.db.psql.tables.Patient.PATIENT.LAST_NAME).values(
                      patient.getPatient_id(),patient.getFirstName(),patient.getLastName()
      ).returningResult(org.jooq.example.flyway.db.psql.tables.Patient.PATIENT.PATIENT_ID,
              org.jooq.example.flyway.db.psql.tables.Patient.PATIENT.FIRST_NAME,
              org.jooq.example.flyway.db.psql.tables.Patient.PATIENT.LAST_NAME)
              .fetchOneInto(Patient.class);
   }


}
