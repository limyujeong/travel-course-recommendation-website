package com.example.travelcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;
import java.util.ArrayList;

@Controller
public class MainController {
    @Autowired
    ITravelCourseService travelCourseService;

//    ArrayList<Travel> travels = new ArrayList<>();
//    ArrayList<DetailCourse> detailCourses = new ArrayList<>();
//
//    public MainController() {
//        travels.add(new Travel("코스1", "경기도", "용인시", 2, 3, 365));
//        travels.add(new Travel("코스2", "경기도", "화성시", 1, 2, 12));
//        travels.add(new Travel("천안 여행 코스", "충청남도", "천안시", 2, 3, 102));
//
//        detailCourses.add(new DetailCourse("코스1", 1, "관광지", "강남대학교", "2022/12/30 14:30:02"));
//        detailCourses.add(new DetailCourse("코스1", 1, "식당", "신혼부부즉석떡볶이", "2022/12/30 14:35:00"));
//        detailCourses.add(new DetailCourse("코스1", 1, "카페", "스타벅스", "2022/12/29 15:03:45"));
//    }

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("list", travelCourseService.selectAll());
        model.addAttribute("cities", travelCourseService.selectCity());
        return "home";
    }

    @RequestMapping("/search")
    public String search(Model model, String city) {
        model.addAttribute("list", travelCourseService.selectSearch(city));
        model.addAttribute("cities", travelCourseService.selectCity());
        return "search";
    }

    @RequestMapping("/recommendform")
    public String recommendform(Model model) {
        model.addAttribute("cities", travelCourseService.selectCity());
        return "recommendform";
    }

    @RequestMapping("/recommend")
    public String recommend(@ModelAttribute Travel travel) {
        travelCourseService.insertTravel(travel);
        return "redirect:/addform?id=" + travel.getId();
    }

    @RequestMapping("/addform")
    public String addform(@RequestParam int id, Model model) {
        model.addAttribute("travel", travelCourseService.selectTravel(id));
        model.addAttribute("detailCourse", travelCourseService.selectDetailCourse(id));
        return "addform";
    }

    @RequestMapping("/add")
    public String add(@ModelAttribute DetailCourse detailCourse) {
        travelCourseService.insertDetailCourse(detailCourse);
        return "redirect:/addform?id=" + detailCourse.getId();
    }

    @RequestMapping("/deleteD")
    public String deleteD(@RequestParam int spotNo, @RequestParam int id) {
        travelCourseService.deleteDetailCourse(spotNo);
        return "redirect:/addform?id=" + id;
    }

    @RequestMapping("/deleteT")
    public String deleteT(@RequestParam int id) {
        travelCourseService.deleteTravel(id);
        return "redirect:/";
    }

    @RequestMapping("/course")
    public String course(@RequestParam int id, Model model) {
        model.addAttribute("travel", travelCourseService.selectTravel(id));
        model.addAttribute("detailCourse", travelCourseService.selectDetailCourse(id));
        return "course";
    }
}
