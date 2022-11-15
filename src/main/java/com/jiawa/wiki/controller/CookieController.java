package com.jiawa.wiki.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@RestController
public class CookieController {
    @GetMapping("/change-username")
    public String setCookie(HttpServletResponse response){
        Cookie cookie = new Cookie("username","java");
        response.addCookie(cookie);
        return "Username is changed";
    }
    @GetMapping("/all-cookies")
    public String readAllCookies(HttpServletRequest request) {
            //1. 获取Cookie数组
            Cookie[] cookies = request.getCookies();
            //2. 遍历数组
            for (Cookie cookie : cookies) {
            //3. 获取数据
                String name = cookie.getName();
                String value = cookie.getValue();
                System.out.println(name+":"+value);
        }
        return "No cookies";
    }
}
