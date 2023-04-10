package com.example.travelcourse;

import java.sql.Timestamp;
import java.util.ArrayList;

public interface ITravelCourseService {
    ArrayList<Travel> selectAll();
    ArrayList<City> selectCity();
    ArrayList<Travel> selectSearch(String city);
    Travel selectTravel(int id);
    ArrayList<DetailCourse> selectDetailCourse(int id);
    void insertTravel(Travel travel);
    void insertDetailCourse(DetailCourse detailCourse);
    void deleteDetailCourse(int spotNo);
    void deleteTravel(int id);
}
