package xmlaop.test;

import xmlaop.service.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Diao Rui
 * @className: Test
 * @Description: TODO
 * @DateTime: 2023/8/8 11:41
 * @version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("xmlaop.xml");
        Calculator bean = context.getBean(Calculator.class);
        bean.add(1,3);
    }
}
