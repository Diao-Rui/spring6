import org.example.entity.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Diao Rui
 * @className: UserTest
 * @Description: TODO
 * @DateTime: 2023/8/1 11:42
 * @version: 1.0
 **/
public class UserTest {
    //创建日志对象
    private Logger logger = LoggerFactory.getLogger(UserTest.class);
    @Test
    public void testUser() {
        //加载spring配置文件，对象创建
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //获取创建对象的方法
        User user = (User) context.getBean("user");
        System.out.println(user);
        //使用对象调用方法进行测试
        user.add();
        //手动写日志
        logger.info("执行调用成功。。。");
    }

    @Test
    public void testUserObject() throws Exception {
        //获取Class对象
        Class<?> aClass = Class.forName("org.example.entity.User");
        //创建对象
        Object instance = aClass.getDeclaredConstructor().newInstance();
        //强制类型转换
        User user = (User) instance;
        System.out.println(user);
    }
}
