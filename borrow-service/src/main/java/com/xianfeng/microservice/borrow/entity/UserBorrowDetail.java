package com.xianfeng.microservice.borrow.entity;


import com.xianfeng.microservice.entity.Book;
import com.xianfeng.microservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserBorrowDetail {
   User user;
   List<Book> bookList;

}
