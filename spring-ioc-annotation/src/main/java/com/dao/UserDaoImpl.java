package com.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: Diao Rui
 * @className: UserDaoImpl
 * @Description: TODO
 * @DateTime: 2023/8/3 15:24
 * @version: 1.0
 **/
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void sub() {
        System.out.println("dao sub...");
    }
}
