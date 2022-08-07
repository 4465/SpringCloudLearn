package com.xianfeng.microservice.controller;

import com.xianfeng.microservice.entity.User;
import com.xianfeng.microservice.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/user/{uid}")
    public User getUserById(@PathVariable("uid") int uid){
        System.out.println(System.currentTimeMillis() + "我被调用了");
        return userService.getUserById(uid);
    }
}
