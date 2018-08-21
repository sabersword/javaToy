package org.ypq.beanutils;

public class Course {

    private String teacher;
    private int time;

    public Course() {
    }

    public Course(String teacher, int time) {
        this.teacher = teacher;
        this.time = time;
    }

    public String getTeacher() {
        return teacher;
    }

    public int getTime() {
        return time;
    }
}
