package com.pojo;

/**
 * @Author: Diao Rui
 * @className: Bird
 * @Description: TODO
 * @DateTime: 2023/8/3 16:24
 * @version: 1.0
 **/
public class Bird {
    private String name;
    private int age;
    public int speed;

    //公有无参数构造器
    public Bird() {
    }

    //私有有参数构造器
    private Bird(String name, int age, int speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public void work() {
        System.out.println(name + "在寻找食物");
    }

    private void run() {
        System.out.println(name + "在飞行");
    }

    public static void hava() {
        System.out.println("一个静态方法");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", speed=" + speed +
                '}';
    }
}
