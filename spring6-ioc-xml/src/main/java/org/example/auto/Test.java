package org.example.auto;

import org.example.auto.controller.DogController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Diao Rui
 * @className: Test
 * @Description: TODO
 * @DateTime: 2023/8/3 11:14
 * @version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean-auto.xml");
        DogController dogController = context.getBean("dogController", DogController.class);
        dogController.shout();
    }
}
