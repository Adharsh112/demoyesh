package com.example.demoyesh.models;

public class Student {
    private static Integer Id;
    private String name ;
    private String branch;
    private String gender;

    public Student(Integer Id, String name, String branch, String gender) {
        this.Id = Id;
        this.name = name;
        this.branch = branch;
        this.gender = gender;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
       this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
