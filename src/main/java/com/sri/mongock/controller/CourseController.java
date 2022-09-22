package com.sri.mongock.controller;

import com.sri.mongock.model.Course;
import com.sri.mongock.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Cacheable(value = "coursesCache")
    @GetMapping
    public List<Course> getCourseList() {
        return courseService.getCourseList();
    }

    @CacheEvict(value = "coursesCache", allEntries = true)
    @PostMapping
    public Course createCourse(@Valid @RequestBody Course course) {
        return courseService.createCourse(course);
    }
}
