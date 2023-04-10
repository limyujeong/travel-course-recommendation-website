package com.example.travelcourse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Travel {
    private int id;
    private String courseName;
    private String city;
    private int night;
    private int days;
}
