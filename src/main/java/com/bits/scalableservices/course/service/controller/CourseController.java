package com.bits.scalableservices.course.service.controller;

import com.bits.scalableservices.course.service.entity.Course;
import com.bits.scalableservices.course.service.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable("id") Long courseId){
        log.info("Inside getCourseById method of CourseController");
        return courseService.getCourseById(courseId);
    }
}
