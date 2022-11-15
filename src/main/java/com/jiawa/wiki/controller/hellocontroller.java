package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.domain.User;
import com.jiawa.wiki.service.TestService;
import com.jiawa.wiki.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class hellocontroller {
    @Value("${test.hello}")
    private String testHello;
    @Resource
    private TestService testService;
    @Resource
    private UserService UserService;
     @GetMapping("/hello")
        public String hello(){
             System.out.println("helloworld");
             return "hello world"+testHello;
         }
    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
    @GetMapping("/user/list")
    public List<User> list1(){
         return UserService.list();
    }
      @PostMapping("/hello/post")
      public String helloPost(String name){
          return "hello world! Post." + name;
      }
}
