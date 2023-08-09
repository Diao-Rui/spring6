package com.dao.impl;

import com.dao.Calculator;

/**
 * @Author: Diao Rui
 * @className: CalculatorImpl
 * @Description: 普通实现类
 * @DateTime: 2023/8/7 11:37
 * @version: 1.0
 **/
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {

        int result = i + j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int sub(int i, int j) {

        int result = i - j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int mul(int i, int j) {

        int result = i * j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    @Override
    public int div(int i, int j) {

        int result = i / j;

        System.out.println("方法内部 result = " + result);

        return result;
    }
}
