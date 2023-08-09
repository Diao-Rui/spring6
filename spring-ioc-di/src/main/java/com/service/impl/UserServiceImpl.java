package com.service.impl;

import com.annotaion.Bean;
import com.annotaion.Di;
import com.dao.UserDao;
import com.service.UserService;

/**
 * @Author: Diao Rui
 * @className: UserServiceImpl
 * @Description: TODO
 * @DateTime: 2023/8/4 10:54
 * @version: 1.0
 **/
@Bean
public class UserServiceImpl implements UserService {
    @Di
    private UserDao userDao;

    public void save(){
        userDao.save();
        System.out.println("UserService saved...");
    }
}
