package com.aditseo.springbootbasic.demo.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
                .forEach(courses::add);
        return courses;
    }

    public Course getCourses(String id) {
        return courseRepository.findById(id).get();
    }

    public void addCourses(Course course) {
        courseRepository.save(course);
    }

    public void updateCourses(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourses(String id) {
        courseRepository.deleteById(id);
    }
}
