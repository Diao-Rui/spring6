package org.example.diMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Diao Rui
 * @className: MapListTest
 * @Description: TODO
 * @DateTime: 2023/8/2 16:23
 * @version: 1.0
 **/
public class MapListTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-list-map-di.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
