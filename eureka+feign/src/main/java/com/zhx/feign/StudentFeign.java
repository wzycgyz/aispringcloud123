package com.zhx.feign;

import com.zhx.entity.Student;
import com.zhx.feign.impl.StudentFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider" ,fallback = StudentFeignImpl.class)
public interface StudentFeign {
    @GetMapping("/www/findall")
    public Collection<Student> findall();
    @GetMapping("/www/index")
    public  String index();
}
