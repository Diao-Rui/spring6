package com.controller;

import com.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 * @Author: Diao Rui
 * @className: UserController
 * @Description: TODO
 * @DateTime: 2023/8/3 15:31
 * @version: 1.0
 **/
@Controller
public class UserController {
    @Resource
    private UserService userService;

    public void sub(){
        System.out.println("UserController sub...");
        userService.sub();
    }
}
