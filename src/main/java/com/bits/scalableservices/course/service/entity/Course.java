package com.bits.scalableservices.course.service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "COURSE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;
	@Column(nullable = false)
	private String courseName;
	@Column(nullable = false)
	private String courseCode;
	private int semester;
	@Column(nullable = false)
	private Long departmentId;
}
