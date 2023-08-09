package com.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author: Diao Rui
 * @className: ProxyFactory
 * @Description: 生成动态代理类的工厂
 * @DateTime: 2023/8/7 11:49
 * @version: 1.0
 **/
public class ProxyFactory {
    //代理对象
    private Object target;
    //创建日志
    private Logger logger = LoggerFactory.getLogger(ProxyFactory.class);

    public ProxyFactory(Object proxy) {
        this.target = proxy;
    }

    //获取代理类
    public Object getProxy() {
        //获取目标对象的类加载器
        ClassLoader classLoader = target.getClass().getClassLoader();
        //获取目标对象的所有接口的Class的对象数组
        Class<?>[] interfaces = target.getClass().getInterfaces();
        //创建InvocationHandler
        InvocationHandler invocationHandler = new InvocationHandler() {
            /*
             * proxy：代理对象
             * method：代理对象需要实现的方法，即其中需要重写的方法
             * args：method所对应方法的参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    //实现需要代理的目标代码
                    logger.info("[动态代理][日志] " + method.getName() + "，参数：" + Arrays.toString(args));
                    //调用目标方法
                    result = method.invoke(target, args);
                    logger.info("[动态代理][日志] " + method.getName() + "，返回值：" + result);
                } catch (Exception e) {
                    e.printStackTrace();
                    logger.info("[动态代理][日志] " + method.getName() + "，异常：" + e.getMessage());
                } finally {
                    logger.info("[动态代理][日志] " + method.getName() + "执行完毕");
                }
                return result;
            }
        };

        /*
         * newProxyInstance()：创建一个代理实例
         * 其中有三个参数：
         * 1、classLoader：加载动态生成的代理类的类加载器
         * 2、interfaces：目标对象实现的所有接口的class对象所组成的数组
         * 3、invocationHandler：设置代理对象实现目标对象方法的过程，即代理类中如何重写接口中的抽象方法
         */
        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
