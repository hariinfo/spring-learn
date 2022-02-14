package com.example.demo.data.validator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewPatient {

   // @NotBlank(message = "Primary email id can not be empty")
    private String primary_email;

}
