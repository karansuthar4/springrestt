package com.springrestt.springrestt.services;
import java.util.List;

import com.springrestt.springrestt.controller.course;
public interface courseService {
    
    public List<course> getCourses();
    public course getCourse(long courseId);
    public course addCourse(course course);
    public course updateCourse(course course);
    public void deleteCourse(long parseLong);

}
