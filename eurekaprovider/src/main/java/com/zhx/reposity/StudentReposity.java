package com.zhx.reposity;

import com.zhx.entity.Student;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public interface StudentReposity {
    public Collection<Student> findAll();
    public  Student findById(Long id);

}
