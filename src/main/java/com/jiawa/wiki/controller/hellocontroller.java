package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
     @RequestMapping("/hello")
        public String hello(){
             System.out.println("helloworld");
             return "hello world";
         }
}
