package com.dao.impl;

import com.dao.Calculator;

/**
 * @Author: Diao Rui
 * @className: StaticCalculatorImpl
 * @Description: 实现静态代理模式
 * @DateTime: 2023/8/7 11:35
 * @version: 1.0
 **/
public class StaticCalculatorImpl implements Calculator {
    private Calculator calculator;

    public StaticCalculatorImpl(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);
        int result = calculator.add(i, j);
        System.out.println("[日志] add 方法结束了，结果是：" + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
