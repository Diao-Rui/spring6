package com.entity;

import org.springframework.stereotype.Component;

/**
 * @Author: Diao Rui
 * @className: Cat
 * @Description: TODO
 * @DateTime: 2023/8/8 14:23
 * @version: 1.0
 **/
@Component //IOC容器组件
public class Cat {
    private String name;
    private int age;

    public Cat() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
