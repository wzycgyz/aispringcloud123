package com.zhx.feign.impl;
import com.zhx.entity.Student;
import com.zhx.feign.StudentFeign;
import org.springframework.stereotype.Component;
import java.util.Collection;

@Component
public class StudentFeignImpl implements StudentFeign {
    @Override
    public Collection<Student> findall() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中.....";
    }
}
