package com.zhx.controller;

import com.zhx.entity.Student;
import com.zhx.reposity.StudentReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/www")
public class StudentController {
    @Autowired
    StudentReposity studentReposity;
    @Value("${server.port}")
    String index;
    @RequestMapping("/findall")
    public Collection<Student> findall(){

        return studentReposity.findAll();
    }
    @RequestMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentReposity.findById(id);
    }
    @GetMapping("/index")
    public String index(){

        return this.index;

    }
}
