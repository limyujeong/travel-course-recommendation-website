package com.example.travelcourse;

import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface TravelCourseMapper {
    // "/"에서 리스트 나열할 때 사용
    @Select("SELECT * FROM travel")
    ArrayList<Travel> selectAll();

    // 도시 정보 가져올 때 사용
    @Select("SELECT * FROM city")
    ArrayList<City> selectCity();

    // "/"에서 검색할 때 사용
    @Select("SELECT * FROM travel WHERE city=#{city}")
    ArrayList<Travel> selectSearch(String city);

    // "/addform"에서 상단 코스 정보 나타낼 때 사용
    @Select("SELECT * FROM travel WHERE id=#{id}")
    Travel selectTravel(int id);

    // "/course"에서 디테일 코스 정보 나타낼 때 사용
    @Select("SELECT * FROM detailCourse WHERE id=#{id}")
    ArrayList<DetailCourse> selectlDetailCourse(int id);

    // "/recommendform"에서 추천 여행 코스 등록할 때 사용
    @Insert("INSERT INTO travel (id, courseName, city, night, days) VALUES (#{id}, #{courseName}, #{city}, #{night}, #{days})")
    void insertTravel(Travel travel);

    // "/addform"에서 디테일 코스 등록할 때 사용
    @Insert("INSERT INTO detailCourse (id, courseName, dayy, type, spotName) VALUES (#{id}, #{courseName}, #{dayy}, #{type}, #{spotName})")
    void insertDetailCourse(DetailCourse detailCourse);

    // "/addform", "/updateform"에서 detailCourse 삭제 기능
    @Delete("DELETE FROM detailCourse WHERE spotNo=#{spotNo}")
    void deleteDetailCourse(int spotNo);

    // "/updateform"에서 travel 삭제 기능
    @Delete("DELETE FROM travel WHERE id=#{id}")
    void deleteTravel(int id);
}
