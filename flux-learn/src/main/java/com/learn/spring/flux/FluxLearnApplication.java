package com.learn.spring.flux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

@SpringBootApplication
@EnableR2dbcAuditing
public class FluxLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(FluxLearnApplication.class, args);
	}

}
