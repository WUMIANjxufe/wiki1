package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class hellocontroller {
     @GetMapping("/hello")
        public String hello(){
             System.out.println("helloworld");
             return "hello world";
         }
      @PostMapping("/hello/post")
      public String helloPost(String name){
          return "hello world! Post." + name;
      }
}
