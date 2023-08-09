package org.example.objectdi;

import java.util.List;

/**
 * @Author: Diao Rui
 * @className: Depart
 * @Description: TODO
 * @DateTime: 2023/8/2 11:40
 * @version: 1.0
 **/
public class Depart {
    private String name;
    private List<Employee> employees;

    public Depart() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Depart{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
