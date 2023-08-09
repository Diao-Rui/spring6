package com;

import com.config.SpringConfig;
import com.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Diao Rui
 * @className: AnnotaionTest
 * @Description: TODO
 * @DateTime: 2023/8/3 15:40
 * @version: 1.0
 **/
public class AnnotaionTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean("userController", UserController.class);
        userController.sub();
    }
}
