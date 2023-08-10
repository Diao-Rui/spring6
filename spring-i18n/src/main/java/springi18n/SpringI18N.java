package springi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

/**
 * @Author: Diao Rui
 * @className: SpringI18N
 * @Description: TODO
 * @DateTime: 2023/8/10 10:56
 * @version: 1.0
 **/
public class SpringI18N {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        Object[] objs = new Object[]{"dr", new Date().toString()};
        String message = context.getMessage("messages", objs, Locale.ENGLISH);
        System.out.println(message);

    }
}
