package com.xianfeng.microservice.book.controller;


import com.xianfeng.microservice.book.service.BookService;
import com.xianfeng.microservice.entity.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BookController {
    @Resource
    BookService service;
    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid") int bid){

        System.out.println("调用了图书服务");

        return service.getBookById(bid);
    }
}