package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    Long id;
    String genre;
    String title;
    String author;
    BigDecimal price;
}
