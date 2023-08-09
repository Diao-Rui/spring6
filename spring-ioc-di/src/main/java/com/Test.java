package com;

import com.annotaion.AnnotationApplicationContext;
import com.service.UserService;
import com.service.impl.UserServiceImpl;

/**
 * @Author: Diao Rui
 * @className: Test
 * @Description: TODO
 * @DateTime: 2023/8/4 14:39
 * @version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        AnnotationApplicationContext context =
                new AnnotationApplicationContext("com");
        Object bean = context.getBean(UserService.class);
        UserService userService = (UserServiceImpl) bean;
        userService.save();
    }
}
