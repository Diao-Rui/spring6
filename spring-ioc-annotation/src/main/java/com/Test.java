package com;

import com.controller.CatController;
import com.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Diao Rui
 * @className: Test
 * @Description: TODO
 * @DateTime: 2023/8/3 14:24
 * @version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        CatController catController = context.getBean("catController", CatController.class);
        catController.add();
        UserController userController = context.getBean("userController", UserController.class);
        userController.sub();
    }
}
