package com.example.generator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("index")
public class IndexController {


    @RequestMapping("/index")
    public Object index(HttpServletRequest request){
        System.out.println(request.getContextPath());
        return null;
    }
}
