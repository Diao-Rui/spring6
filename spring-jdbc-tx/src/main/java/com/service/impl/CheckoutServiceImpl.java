package com.service.impl;

import com.service.BookService;
import com.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Diao Rui
 * @className: CheckoutServiceImpl
 * @Description: TODO
 * @DateTime: 2023/8/9 10:56
 * @version: 1.0
 **/
@Service
public class CheckoutServiceImpl implements CheckoutService {
    private BookService service;

    //构造器注入
    @Autowired
    public CheckoutServiceImpl(BookService service) {
        this.service = service;
    }

    //默认是REQUIRED（全部放在一个事务里面）
    //REQUIRES_NEW（每一个都是单独的事务）
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void checkout(Integer[] bookIds, Integer userId) {
        for (Integer bookId : bookIds) {
            service.buyBook(bookId, userId, 1);
        }
    }
}
