package com.bits.scalableservices.course.service.service;

import com.bits.scalableservices.course.service.entity.Course;
import com.bits.scalableservices.course.service.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public Course saveCourse(Course course) {
        log.info("Inside saveCourse method of CourseService");
        return courseRepository.save(course);
    }

    public Course getCourseById(Long courseId) {
        log.info("Inside saveCourse method of CourseService");
        return courseRepository.findByCourseId(courseId);
    }

    public List<Course> getCourseBySemester(int semester) {
        log.info("Inside saveCourse method of CourseService");
        return courseRepository.findAllCoursesBySemester(semester);
    }

    public List<Course> getCourseListByDepartmentId(Long departmentId) {
        log.info("Inside getCourseListByDepartmentId method of CourseService");
        return courseRepository.findAllCoursesByDepartmentId(departmentId);
    }
}
