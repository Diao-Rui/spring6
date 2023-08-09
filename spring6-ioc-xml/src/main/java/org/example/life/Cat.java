package org.example.life;

/**
 * @Author: Diao Rui
 * @className: Cat
 * @Description: TODO
 * @DateTime: 2023/8/3 10:34
 * @version: 1.0
 **/
public class Cat {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2.set方法被调用了");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat() {
        System.out.println("1.无参数构造器被调用了");
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initMethod() {
        System.out.println("4.初始化方法被调用了");
    }

    public void destroyMethod() {
        System.out.println("7.销毁方法被调用了");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
