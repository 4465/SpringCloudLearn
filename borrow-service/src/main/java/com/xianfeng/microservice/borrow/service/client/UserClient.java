package com.xianfeng.microservice.borrow.service.client;

import com.xianfeng.microservice.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 刘威甫
 * @date 2022/8/27 21:16
 * @description
 */
@FeignClient("user-service")
public interface UserClient {

    @RequestMapping("/user/{uid}")
    User getUserById(@PathVariable("uid") int uid);
}
