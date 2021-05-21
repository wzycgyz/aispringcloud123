package com.zhx.controller;

import com.zhx.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class RestStudentController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/findall")
    public Collection<Student> findall() {
        return restTemplate.getForEntity("http://localhost:8710/www/findall", Collection.class).getBody();
    }
    @RequestMapping("/findall1")
    public Collection<Student> findall1(){
        return restTemplate.getForObject("http://localhost:8710/www/findall",Collection.class);
    }
    @RequestMapping("/findbyid/{id}")
    public Student findbyid(@PathVariable("id")long id){

        return restTemplate.getForEntity("http://localhost:8710/www/findById/{id}",Student.class,id).getBody();

    }
    @RequestMapping("/findbyid1/{id}")
    public Student findbyid1(@PathVariable("id")long id){

        return restTemplate.getForObject("http://localhost:8710/www/findById/{id}",Student.class,id);

    }



}