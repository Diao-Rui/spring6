package org.example.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: Diao Rui
 * @className: MyBeanProcess
 * @Description: TODO
 * @DateTime: 2023/8/3 10:42
 * @version: 1.0
 **/
public class MyBeanProcess implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5.bean的后置处理器被调用了");
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3.bean的后置处理器被调用了");
        return bean;
    }
}
