package org.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Diao Rui
 * @className: BeanTest
 * @Description: TODO
 * @DateTime: 2023/8/2 10:17
 * @version: 1.0
 **/
public class BeanTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = context.getBean(UserDao.class);
        userDao.run();

    }
}
