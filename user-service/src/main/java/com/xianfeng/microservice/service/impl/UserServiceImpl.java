package com.xianfeng.microservice.service.impl;

import com.xianfeng.microservice.entity.User;
import com.xianfeng.microservice.mapper.UserMapper;
import com.xianfeng.microservice.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {


    @Resource
    UserMapper userMapper;

    @Override
    public User getUserById(int uid) {
        System.out.println("调用用户服务");
        return userMapper.getUserById(uid);
    }
}
