package org.example.objectdi;

import java.util.Arrays;

/**
 * @Author: Diao Rui
 * @className: Employee
 * @Description: TODO
 * @DateTime: 2023/8/2 11:41
 * @version: 1.0
 **/
public class Employee {
    private String name;
    private int age;
    private Depart depart;
    private String[] hobbies;

    public Employee() {
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

    public Depart getDepart() {
        return depart;
    }

    public void setDepart(Depart depart) {
        this.depart = depart;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", depart=" + depart +
                ", hobbies='" + Arrays.toString(hobbies) + '\'' +
                '}';
    }
}
