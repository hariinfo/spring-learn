package com.example.demo.exception;

public class PatientAlreadyExistsException extends Exception {
    public PatientAlreadyExistsException(String message){
        super(message);
    }
}
