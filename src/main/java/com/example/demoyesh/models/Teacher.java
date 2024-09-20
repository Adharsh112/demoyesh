package com.example.demoyesh.models;

public class Teacher {
    private static Integer teacherId;
    private String teacherName ;
    private String branch;
    private String gender;

    public Teacher(String teacherName, String branch, String gender) {
        this.teacherName = teacherName;
        this.branch = branch;
        this.gender = gender;
    }

    public static Integer getTeacherId() {
        return teacherId;
    }

    public static void setTeacherId(Integer teacherId) {
        Teacher.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
