package org.example.life;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Diao Rui
 * @className: CatTest
 * @Description: TODO
 * @DateTime: 2023/8/3 10:40
 * @version: 1.0
 **/
public class CatTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life.xml");
        Cat cat = context.getBean("cat", Cat.class);
        System.out.println("6.bean对象准备完毕");
        context.close();
    }
}
