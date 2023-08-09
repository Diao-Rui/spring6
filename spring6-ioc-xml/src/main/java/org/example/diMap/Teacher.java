package org.example.diMap;

/**
 * @Author: Diao Rui
 * @className: Teacher
 * @Description: TODO
 * @DateTime: 2023/8/2 15:14
 * @version: 1.0
 **/
public class Teacher {
    private int tId;
    private String tName;

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                '}';
    }
}
