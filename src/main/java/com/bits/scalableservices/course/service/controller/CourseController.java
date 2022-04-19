package com.bits.scalableservices.course.service.controller;

import com.bits.scalableservices.course.service.entity.Course;
import com.bits.scalableservices.course.service.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("{courseId}")
    public @ResponseBody Course getCourseBySemester(@PathVariable("courseId") Long courseId){
        log.info("Inside getCourseBySemester method of CourseController");
        return courseService.getCourseById(courseId);
    }

    @GetMapping("/getCourseBySemester/{semester}")
    public @ResponseBody List<Course> getCourseBySemester(@PathVariable("semester") int semester){
        log.info("Inside getCourseBySemester method of CourseController");
        return courseService.getCourseBySemester(semester);
    }

    @GetMapping("/getCourseListByDepartmentId/{departmentId}")
    public @ResponseBody List<Course> getCourseListByDepartmentId(@PathVariable("departmentId") Long departmentId){
        log.info("Inside getCourseListByDepartmentId method of CourseController");
        return courseService.getCourseListByDepartmentId(departmentId);
    }
}
