package com.springrestt.springrestt.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrestt.springrestt.services.courseService;



@RestController
public class Mycontroller {
    @Autowired
    private courseService courseService;
    @GetMapping("/home")
    public String home(){
        return "Welcome to courses application";

    }
    //get the courses
    @GetMapping("/course")
    public List<course> getcourses(){
        return this.courseService.getCourses();
    }
    //get the courses via their id
    @GetMapping("/course/{courseId}")
    public course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
    //to add the courses
    @PostMapping ("/course")

    public course addCourse(@RequestBody course course) {
        return this.courseService.addCourse(course);
        
    }
    //to update the courses
    @PutMapping("/course")
    public course updateCourse(@RequestBody course course){
        return this.courseService.updateCourse(course);
    }
    @DeleteMapping("/course/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try {
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);  
        }
    }
    

}