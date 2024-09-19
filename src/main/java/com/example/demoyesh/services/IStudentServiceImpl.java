package com.example.demoyesh.services;

import com.example.demoyesh.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class IStudentServiceImpl implements IStudentService{

    List<Student> studentList = new ArrayList<>();

    @Override
    public Student getStudentById(Integer Id) {
        Optional<Student> optionalStudent = studentList.stream()
                .filter(Student -> Student.getId().equals(Id))
                .findFirst();

        if(optionalStudent.isPresent()){
            return optionalStudent.get();
        }
        else{
            throw new RuntimeException("Student not found by the given Id : " + Id);
        }
    }

    @Override
    public List<Student> getAllStudents() {

        return studentList;
    }

    @Override
    public String createStudents(Student student ){
        studentList.add(student);
        return "Student has been created";
    }

    @Override
    public String updateStudent(Integer Id, Student updatedStudentDetails) {

        Optional<Student>optionalStudent = studentList.stream()
                .filter(student -> studentList.get(Id).equals(Id))
                .findFirst();
        if(optionalStudent.isPresent()){
            Student updatedStudent = optionalStudent.get();

            updatedStudent.setId(updatedStudentDetails.getId());
            updatedStudent.setName(updatedStudentDetails.getName());
            updatedStudent.setBranch(updatedStudentDetails.getBranch());
            updatedStudent.setGender(updatedStudentDetails.getGender());

            return "Student is succesfully updated";
        }
        else {
            throw new RuntimeException("Student not found ");
        }
    }


    @Override
    public String deleteStudentById(Integer Id){

        Optional<Student> optionalStudent = studentList.stream()
                .filter(Student -> Student.getId().equals(Id))
                .findFirst();

        if(optionalStudent.isPresent()){
            studentList.remove(optionalStudent);
            return "Student is has been deleted";
        }
        else {
            throw new RuntimeException("no such student is present ");
        }
    }

}
