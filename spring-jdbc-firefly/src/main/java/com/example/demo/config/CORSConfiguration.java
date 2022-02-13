package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Refer: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/cors/CorsConfiguration.html
@Configuration
@PropertySource("classpath:app/config/header.properties")
public class CORSConfiguration implements WebMvcConfigurer {

    @Value("${cors.mapping}")
    private String CORS_MAPPING;

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping(CORS_MAPPING);
    }

}
