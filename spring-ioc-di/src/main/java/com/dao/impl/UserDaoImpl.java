package com.dao.impl;

import com.annotaion.Bean;
import com.dao.UserDao;

/**
 * @Author: Diao Rui
 * @className: UserDaoImpl
 * @Description: TODO
 * @DateTime: 2023/8/4 10:55
 * @version: 1.0
 **/
@Bean
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("UserDao saved...");
    }
}
