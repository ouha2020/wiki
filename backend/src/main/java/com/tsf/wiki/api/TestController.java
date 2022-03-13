package com.tsf.wiki.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @PostMapping("/hello")
    public String hello(){
        return "hello1";
    }

}
