package com.example.demo.services;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:db/queries/physician.properties")
public class PhysicianService {
}
