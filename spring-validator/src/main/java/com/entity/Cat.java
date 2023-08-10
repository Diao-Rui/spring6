package com.entity;

/**
 * @Author: Diao Rui
 * @className: Cat
 * @Description: TODO
 * @DateTime: 2023/8/10 11:30
 * @version: 1.0
 **/
public class Cat {
    private String name;
    private int age;

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
