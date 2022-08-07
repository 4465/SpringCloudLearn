package com.xianfeng.microservice.borrow.service;

import com.xianfeng.microservice.borrow.entity.UserBorrowDetail;

public interface BorrowService {
    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}
