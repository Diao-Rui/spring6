package com.controller;

import com.service.BookService;
import com.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author: Diao Rui
 * @className: BookController
 * @Description: TODO
 * @DateTime: 2023/8/8 17:01
 * @version: 1.0
 **/
@Controller
public class BookController {
    private BookService service;

    private CheckoutService checkoutService;

    @Autowired
    public BookController(BookService service, CheckoutService checkoutService) {
        this.service = service;
        this.checkoutService = checkoutService;
    }

    public void buyBook(Integer userId, Integer bookId, Integer count) {
        service.buyBook(userId, bookId, count);
    }

    public void checkout(Integer userId, Integer[] bookIds) {
        checkoutService.checkout(bookIds, userId);
    }
}
