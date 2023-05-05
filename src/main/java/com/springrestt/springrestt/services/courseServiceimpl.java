package com.springrestt.springrestt.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrestt.springrestt.controller.course;
@Service

public class courseServiceimpl implements courseService {
    List<course> list;
    public courseServiceimpl(){
        list=new ArrayList<>();
        list.add(new course(144,"java core course","this course contsins basic of java"));

        list.add(new course(145,"spring boot course","creating rest api using spring boot"));
    }

    @Override
    public List<course> getCourses() {
        return list;
    }

    @Override
    public course getCourse(long courseId) {
        course c=null;
        for(course course:list){
            if(course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public course addCourse(course course) {
        list.add(course);
        return course;
    }   

    @Override
    public course updateCourse(course course) {
        list.forEach(e ->{
            if(e.getId()==course.getId()){
                e.setTitle(course.getTitle());
                e.setDescription(course.getDescription());
            }
        });
        return course;
        
    }
    @Override
    public void  deleteCourse(long parseLong){
        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
    }

 
}
