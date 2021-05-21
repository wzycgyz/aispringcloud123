package com.zhx.reposity.Impl;

import com.zhx.entity.Student;
import com.zhx.reposity.StudentReposity;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentReposityImpl implements StudentReposity {
     private static Map<Long,Student> studentMap;
    static {
        studentMap=new HashMap<>();
        studentMap.put(1L,new Student(1L,"wzy",20));
        studentMap.put(2L,new Student(2L,"wzyy",21));
        studentMap.put(3L,new Student(3L,"wzzy",22));
    }


    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

}
