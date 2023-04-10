package com.example.travelcourse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DetailCourse {
    private int spotNo;
    private int id;
    private String courseName;
    private int dayy;
    private String type;
    private String spotName;
}
