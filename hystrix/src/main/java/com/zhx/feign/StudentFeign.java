package com.zhx.feign;

import com.zhx.entity.Student;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider")
public interface StudentFeign {
    @GetMapping("/www/findall")
    public Collection<Student> findall();
    @GetMapping("/www/index")
    public  String index();
}
