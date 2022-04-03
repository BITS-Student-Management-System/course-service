package com.bits.scalableservices.course.service.repository;

import com.bits.scalableservices.course.service.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByCourseId(Long courseId);

    List<Course> findAllCoursesBySemester(int semester);
}
