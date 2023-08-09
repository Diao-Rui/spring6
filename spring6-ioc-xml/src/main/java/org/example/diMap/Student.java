package org.example.diMap;

import java.util.Arrays;
import java.util.Map;

/**
 * @Author: Diao Rui
 * @className: Student
 * @Description: TODO
 * @DateTime: 2023/8/2 15:14
 * @version: 1.0
 **/
public class Student {
    private int sId;
    private String sName;
    private String[] hobbies;
    private Map<String, Teacher> teacherMap;

    public Student() {
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", teacherMap=" + teacherMap +
                '}';
    }
}
