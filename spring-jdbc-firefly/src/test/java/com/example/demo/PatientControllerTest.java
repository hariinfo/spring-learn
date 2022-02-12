package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest (classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class PatientControllerTest {
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void getPatients() throws Exception {
        ResponseEntity<String> response = testRestTemplate.getForEntity("/patient", String.class);
        //log.info(response.toString());
        Assertions.assertThat(!response.getBody().isEmpty());
    }

}
