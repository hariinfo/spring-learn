package com.example.demo.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDTO {
    Long appointment_id;
    Long physician_id;
    Long examination_room_id;
    PatientDTO patient;
}
