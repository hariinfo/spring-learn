package com.example.demo.exception;

import com.example.demo.data.APIExceptionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class RESTExceptionController extends ResponseEntityExceptionHandler {

    @ExceptionHandler({PatientAlreadyExistsException.class})
    protected ResponseEntity<Object> handlePatientAlreadyExistsException(PatientAlreadyExistsException exception, WebRequest request) {
        List<String> details = new ArrayList<String>();
        details.add(exception.getMessage());

        APIExceptionDTO apiException = new APIExceptionDTO(
                "Patient with current email already exists."
                ,HttpStatus.BAD_REQUEST
                , details
                ,LocalDateTime.now()
                );

        return new ResponseEntity<>(apiException, apiException.getHttpStatus());
    }
}
