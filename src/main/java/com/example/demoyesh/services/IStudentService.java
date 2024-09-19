package com.example.demoyesh.services;

import com.example.demoyesh.models.Student;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

public interface IStudentService {
    Student getStudentById(Integer Id);
    List<Student> getAllStudents();
    String createStudents(Student student);
    String updateStudent(Integer Id, Student updatedStudentDetails);
    String deleteStudentById(Integer Id);
}
