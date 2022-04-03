package com.bits.scalableservices.course.service.controller;

import com.bits.scalableservices.course.service.entity.Course;
import com.bits.scalableservices.course.service.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@Slf4j
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("/")
    public Course saveCourse(@RequestBody Course course){
        log.info("Inside saveCourse method of CourseController");
        return courseService.saveCourse(course);
    }

    @GetMapping("/{semester}")
    public @ResponseBody List<Course> getCourseBySemester(@PathVariable("semester") int courseId){
        log.info("Inside getCourseBySemester method of CourseController");
        return courseService.getCourseBySemester(courseId);
    }
}
