package com.example.travelcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TravelCourseDAO implements ITravelCourseDAO {
    @Autowired
    private TravelCourseMapper travelCourseMapper;

    @Override
    public ArrayList<Travel> selectAll() {
        return travelCourseMapper.selectAll();
    }

    @Override
    public ArrayList<City> selectCity() {
        return travelCourseMapper.selectCity();
    }

    @Override
    public ArrayList<Travel> selectSearch(String city) {
        return travelCourseMapper.selectSearch(city);
    }

    @Override
    public Travel selectTravel(int id) {
        return travelCourseMapper.selectTravel(id);
    }

    @Override
    public ArrayList<DetailCourse> selectDetailCourse(int id) {
        return travelCourseMapper.selectlDetailCourse(id);
    }

    @Override
    public void insertTravel(Travel travel) {
        travelCourseMapper.insertTravel(travel);
    }

    @Override
    public void insertDetailCourse(DetailCourse detailCourse) {
        travelCourseMapper.insertDetailCourse(detailCourse);
    }

    @Override
    public void deleteDetailCourse(int spotNo) {
        travelCourseMapper.deleteDetailCourse(spotNo);
    }

    @Override
    public void deleteTravel(int id) {
        travelCourseMapper.deleteTravel(id);
    }
}
