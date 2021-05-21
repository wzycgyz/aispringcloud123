package com.zhx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/findall")
    public Collection findall(){
        return restTemplate.getForObject("http://provider/www/findall",Collection.class);
    }
    @RequestMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/www/index",String.class);
    }

}
