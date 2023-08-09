package org.example;

import org.example.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Diao Rui
 * @className: ${NAME}
 * @Description: TODO
 * @DateTime: ${DATE} ${TIME}
 * @version: 1.0
 **/
public class Main {
    public static void main(String[] args) {
        //加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //获取bean
        //通过ID获取bean
        Object user = context.getBean("user");
        System.out.println(user);
        //通过类获取bean
        User bean = context.getBean(User.class);
        System.out.println(bean);
        //通过ID和类获取bean
        User user1 = context.getBean("user", User.class);
        System.out.println(user1);
    }
}