package aop.test;

import aop.service.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Diao Rui
 * @className: Test
 * @Description: TODO
 * @DateTime: 2023/8/8 10:38
 * @version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        Calculator bean = context.getBean(Calculator.class);
//        bean.add(1, 2);
        bean.div(1, 0);
    }
}
