package com.zhx.controller;

import com.zhx.FeignApplication;
import com.zhx.entity.Student;
import com.zhx.feign.StudentFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class StudentController {
    @Autowired
    StudentFeign studentFeign;
    @GetMapping("/findall")
    public Collection<Student> findall(){
       return studentFeign.findall();

    }
    @GetMapping("/index")
    public  String index(){
    return studentFeign.index();

    }
}
