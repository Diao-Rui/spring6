package org.example.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Diao Rui
 * @className: BookTest
 * @Description: TODO
 * @DateTime: 2023/8/2 10:43
 * @version: 1.0
 **/
public class BookTest {
    public static void main(String[] args) {
        //基于xml注入
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        //基于构造器注入（有参数构造）
        book = context.getBean("bookCon", Book.class);
        System.out.println(book);
    }

    public static void test() {
        //传统注入方法
        Book book = new Book();
        book.setName("Java");
        book.setAuthor("Diao Rui");
        System.out.println(book);
        //传统构造器注入
        Book book1 = new Book("java开发", "刁锐");
        System.out.println(book1);
    }
}
