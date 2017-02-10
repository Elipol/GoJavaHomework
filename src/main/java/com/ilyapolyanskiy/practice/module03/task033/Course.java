package com.ilyapolyanskiy.practice.module03.task033;

import java.util.Date;

/**
 * Created by ignipolari on 10.02.17.
 */
public class Course {
    private String teacherName;
    private Date startDate;
    private String name;
    private int hoursDuration;

    public Course(String teacherName, String name, int hoursDuration) {
        this.teacherName = teacherName;
        this.name = name;
        this.hoursDuration = hoursDuration;
    }

    public Course(Date startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }
}
