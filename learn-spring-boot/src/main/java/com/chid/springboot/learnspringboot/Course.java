package com.chid.springboot.learnspringboot;

public class Course {

    private long id;
    private String courseName;
    private String courseStudent;

    public Course(long id, String courseName, String courseStudent) {
        this.id = id;
        this.courseName = courseName;
        this.courseStudent = courseStudent;
    }

    public long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseStudent() {
        return courseStudent;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", courseStudent='" + courseStudent + '\'' +
                '}';
    }
}
