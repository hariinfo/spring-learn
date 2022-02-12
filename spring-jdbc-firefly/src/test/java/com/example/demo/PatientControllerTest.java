package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
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
        String actual = "[{\"patient_id\":0,\"firstName\":\"test\",\"lastName\":\"test\"},{\"patient_id\":1,\"firstName\":\"test\",\"lastName\":\"test\"}]";
        ResponseEntity<String> response = testRestTemplate.getForEntity("/patient", String.class);
        JSONAssert.assertEquals(response.getBody(), actual, JSONCompareMode.LENIENT);
    }

}
