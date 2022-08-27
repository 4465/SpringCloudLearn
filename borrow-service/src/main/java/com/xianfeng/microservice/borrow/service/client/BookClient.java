package com.xianfeng.microservice.borrow.service.client;

import com.xianfeng.microservice.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 刘威甫
 * @date 2022/8/27 21:18
 * @description
 */
@FeignClient("book-service")
public interface BookClient {
    @RequestMapping("/book/{bid}")
    Book getBookById(@PathVariable("bid") int bid);
}
