package com.zhx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String poo;
    @GetMapping("/index")
    public String index(){

        return this.port+"-"+this.poo;

    }
}
