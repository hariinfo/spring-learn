package com.example.cache.graphql.varnishspring.controller;

import com.example.cache.graphql.varnishspring.data.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@Slf4j
public class HelloController {

    @GetMapping
    public ResponseEntity<?> getHome(){
        log.info("Inside home controller");
        return new ResponseEntity<>(new Message("Hello Varnish!!!"), HttpStatus.OK);
    }
}
