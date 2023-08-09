package com.service.impl;

import com.dao.BookDao;
import com.dao.UserDao;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Diao Rui
 * @className: BookServiceImpl
 * @Description: TODO
 * @DateTime: 2023/8/8 16:56
 * @version: 1.0
 **/
//@Transactional 加载类上面那么所有方法都会进行事务管理
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private BookDao bookDao;

    @Override
    //指定该方法为一个事务，要么全部执行成功全部提交，要么出现一个问题，全部回滚
    @Transactional()
    public void buyBook(Integer bookId, Integer userId, Integer count) {
        /*
         * MySQL默认是一条SQL语句为一个事务，所以在执行时
         * 如果不进行事务管理会出现逻辑错误（库存扣掉了，钱没扣）
         * */
        //查询图书价格
        int price = bookDao.getBookPrice(bookId);
        //扣除图书库存
        bookDao.updateStock(bookId, count);
        //扣除用户余额
        userDao.updateBalance(userId, price * count);

    }
}
