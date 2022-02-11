/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.flyway.db.psql.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.example.flyway.db.psql.tables.Patient;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PatientRecord extends UpdatableRecordImpl<PatientRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>dummy.patient.patient_id</code>.
     */
    public void setPatientId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dummy.patient.patient_id</code>.
     */
    public Integer getPatientId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dummy.patient.first_name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dummy.patient.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dummy.patient.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dummy.patient.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Patient.PATIENT.PATIENT_ID;
    }

    @Override
    public Field<String> field2() {
        return Patient.PATIENT.FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return Patient.PATIENT.LAST_NAME;
    }

    @Override
    public Integer component1() {
        return getPatientId();
    }

    @Override
    public String component2() {
        return getFirstName();
    }

    @Override
    public String component3() {
        return getLastName();
    }

    @Override
    public Integer value1() {
        return getPatientId();
    }

    @Override
    public String value2() {
        return getFirstName();
    }

    @Override
    public String value3() {
        return getLastName();
    }

    @Override
    public PatientRecord value1(Integer value) {
        setPatientId(value);
        return this;
    }

    @Override
    public PatientRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public PatientRecord value3(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public PatientRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PatientRecord
     */
    public PatientRecord() {
        super(Patient.PATIENT);
    }

    /**
     * Create a detached, initialised PatientRecord
     */
    public PatientRecord(Integer patientId, String firstName, String lastName) {
        super(Patient.PATIENT);

        setPatientId(patientId);
        setFirstName(firstName);
        setLastName(lastName);
    }
}
