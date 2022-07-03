package com.practice.jpaproject.repository;

import com.practice.jpaproject.entities.Course;
import com.practice.jpaproject.entities.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void SaveCourseMaterial(){
        Course course = Course.builder().courseName("Math").build();
        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("https://google.com")
                .course(course)
                .build();

        courseMaterialRepository.save(courseMaterial);
    }
}