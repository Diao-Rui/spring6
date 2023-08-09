package org.example.objectdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Diao Rui
 * @className: ObjectDiTest
 * @Description: TODO
 * @DateTime: 2023/8/2 11:48
 * @version: 1.0
 **/
public class ObjectDiTest {
    public static void main(String[] args) {
        testList("bean-di-list.xml");
    }
    public static void testObject(String path){
        //外部bean注入
        ApplicationContext context =
                new ClassPathXmlApplicationContext(path);
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
        Employee employee1 = context.getBean("employee2", Employee.class);
        System.out.println(employee1);
        Employee employee3 = context.getBean("employee3", Employee.class);
        System.out.println(employee3);
    }
    public static void testArray(String path){
        //外部bean注入
        ApplicationContext context =
                new ClassPathXmlApplicationContext(path);
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
    public static void testList(String path){
        //外部bean注入
        ApplicationContext context =
                new ClassPathXmlApplicationContext(path);
        Depart depart = context.getBean("depart", Depart.class);
        System.out.println(depart);
    }
}
