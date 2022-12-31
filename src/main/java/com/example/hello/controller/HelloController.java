package com.example.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wbstart
 * @create 2022-12-27 16:19
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping
    public String hello(){
        System.out.println("欢迎访问hello项目");
        return "hello,iu";
    }
}
