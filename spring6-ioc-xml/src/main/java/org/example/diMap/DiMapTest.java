package org.example.diMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Diao Rui
 * @className: DiMapTest
 * @Description: TODO
 * @DateTime: 2023/8/2 15:31
 * @version: 1.0
 **/
public class DiMapTest {
    public static void main(String[] args) {
        //注入map测试
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-di-map.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
