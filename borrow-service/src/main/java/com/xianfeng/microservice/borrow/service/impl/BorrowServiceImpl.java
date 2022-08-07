package com.xianfeng.microservice.borrow.service.impl;

import com.xianfeng.microservice.borrow.entity.UserBorrowDetail;
import com.xianfeng.microservice.borrow.mapper.BorrowMappper;
import com.xianfeng.microservice.borrow.service.BorrowService;
import com.xianfeng.microservice.entity.Book;
import com.xianfeng.microservice.entity.Borrow;
import com.xianfeng.microservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowServiceImpl implements BorrowService {
    @Autowired
    BorrowMappper borrowMappper;

    @Resource
    RestTemplate restTemplate;

    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(int uid) {
        List<Borrow> borrows = borrowMappper.getBorrowsByUid(uid);


        User user = restTemplate.getForObject("http://user-service/user/" + uid, User.class);

        List<Book> bookList = borrows.
                stream().
                map(b -> restTemplate.getForObject("http://book-service/book/" + b.getBid(), Book.class)).
                collect(Collectors.toList());
        return new UserBorrowDetail(user, bookList);
    }
}
