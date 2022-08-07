package com.xianfeng.microservice.book.service;


import com.xianfeng.microservice.entity.Book;

public interface BookService {
    Book getBookById(int bid);
}
