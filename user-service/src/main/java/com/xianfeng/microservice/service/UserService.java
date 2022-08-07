package com.xianfeng.microservice.service;

import com.xianfeng.microservice.entity.User;

public interface UserService {
    User getUserById(int uid);
}
