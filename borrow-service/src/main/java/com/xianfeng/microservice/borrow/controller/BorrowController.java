package com.xianfeng.microservice.borrow.controller;

import com.xianfeng.microservice.borrow.entity.UserBorrowDetail;
import com.xianfeng.microservice.borrow.service.BorrowService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
public class BorrowController {
    @Resource
    BorrowService borrowService;

    @RequestMapping("/borrow/{uid}")
    UserBorrowDetail findUserBorrows(@PathVariable("uid") int uid){

        return borrowService.getUserBorrowDetailByUid(uid);
    }
}
