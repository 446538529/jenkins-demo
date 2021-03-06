package com.example.jenkinsdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String test(){
        return "ok:"+new Date();
    }

    @GetMapping(value = "/ramdom")
    public String ramdom(){
        Random r=new Random();
        return r.nextBoolean()+":"+new Date();
    }

}
