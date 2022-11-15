package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.domain.User;
import com.jiawa.wiki.mapper.TestMapper;
import com.jiawa.wiki.mapper.UserMapper;
import org.apache.catalina.mapper.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    public List<User> list(){
        System.out.println(userMapper.list().get(0).getName());
        if((userMapper.list().get(0).getName()).equals("wumian")){
            System.out.println(userMapper.list().get(0).getClass());
        }
        return userMapper.list();
    }
}
