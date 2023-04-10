package com.example.travelcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;

@Service
public class TravelCourseService implements ITravelCourseService {
    @Autowired
    private TravelCourseDAO travelCourseDAO;

    @Override
    public ArrayList<Travel> selectAll() {
        return travelCourseDAO.selectAll();
    }

    @Override
    public ArrayList<City> selectCity() {
        return travelCourseDAO.selectCity();
    }

    @Override
    public ArrayList<Travel> selectSearch(String city) {
        return travelCourseDAO.selectSearch(city);
    }

    @Override
    public Travel selectTravel(int id) {
        return travelCourseDAO.selectTravel(id);
    }

    @Override
    public ArrayList<DetailCourse> selectDetailCourse(int id) {
        return travelCourseDAO.selectDetailCourse(id);
    }

    @Override
    public void insertTravel(Travel travel) {
        travelCourseDAO.insertTravel(travel);
    }

    @Override
    public void insertDetailCourse(DetailCourse detailCourse) {
        travelCourseDAO.insertDetailCourse(detailCourse);
    }

    @Override
    public void deleteDetailCourse(int spotNo) {
        travelCourseDAO.deleteDetailCourse(spotNo);
    }

    @Override
    public void deleteTravel(int id) {
        travelCourseDAO.deleteTravel(id);
    }
}
