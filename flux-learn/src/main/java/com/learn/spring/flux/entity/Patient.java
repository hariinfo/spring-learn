package com.learn.spring.flux.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("patient")
public class Patient {
    
    @Id @Column("id")
    private Integer id;
 
    @Column("first_name")
    private String firstName;

    @Column("last_name")
    private String lastName;

}
