package com.springbootpractice.schoolmanagementsystem.Course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/API/courses")
public class CourseController {
    private final CourseService couseService;
    public CourseController(CourseService couseService) {
        this.couseService = couseService;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return couseService.getAllCourses();
    }


}
