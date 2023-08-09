package com.test;

import com.config.ProxyFactory;
import com.dao.Calculator;
import com.dao.impl.CalculatorImpl;

/**
 * @Author: Diao Rui
 * @className: CalculatorTest
 * @Description: TODO
 * @DateTime: 2023/8/7 14:10
 * @version: 1.0
 **/
public class CalculatorTest {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator)proxyFactory.getProxy();
//        proxy.add(1,2);
        proxy.sub(1,5);
    }
}
