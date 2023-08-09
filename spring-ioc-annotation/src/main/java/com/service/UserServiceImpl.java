package com.service;

import com.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Author: Diao Rui
 * @className: UserServiceImpl
 * @Description: TODO
 * @DateTime: 2023/8/3 15:25
 * @version: 1.0
 **/
@Service
public class UserServiceImpl implements UserService{
    //根据名称注入bean，没写默认为属性名
    //如果名称找不到，那么就会改为类型注入
    @Resource
    private UserDao userDao;
    @Override
    public void sub() {
        System.out.println("UserServiceImpl sub...");
        userDao.sub();
    }
}
