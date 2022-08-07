package com.xianfeng.microservice.book.service.impl;

import com.xianfeng.microservice.entity.Book;
import com.xianfeng.microservice.book.mapper.BookMapper;
import com.xianfeng.microservice.book.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper mapper;

    @Override
    public Book getBookById(int bid) {
        return mapper.getBookById(bid);
    }
}
