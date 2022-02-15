package com.example.demo.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    Long examination_room_id;
    Long blockfloor;
    Long blockcode;
    String roomtype;
    boolean available;
}
