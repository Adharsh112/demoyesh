package com.example.demoyesh.controllers;

import com.example.demoyesh.models.Student;
import com.example.demoyesh.services.IStudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController // this annotation helps use in writting the Rest api it is the combination of @controler and @ResponseBody annotaion so we don't have to write @controller on every methods
@RequestMapping("students" )// this annotation  is helpfull in mapping all the request to a particular end point it is used to create a base/ parent url for the controller
public class StudentController {


    // this is dependency injection iis a DP that removes dependency from the programming code so that it can be easy to manage ad test the application
    // it makes the programming code loosely coupled 
    private final IStudentService iStudentService;

    public StudentController(IStudentService iStudentService){
        this.iStudentService = iStudentService;
    }


    //ResponseEntity controlls the whole http request and response it lets us add status codes and headers and body to the request
    @GetMapping("{Id}")
    public ResponseEntity<Student> getStduentById(@PathVariable Integer Id){
        return ResponseEntity.ok(iStudentService.getStudentById(Id));

    }

    @GetMapping("all")
    public ResponseEntity<List<Student>> getAllStdents(){
        return ResponseEntity.ok(iStudentService.getAllStudents());
    }
    @PutMapping("{Id}")
    public ResponseEntity<String> updateStudent(@PathVariable Integer Id, @RequestBody Student StudentDetails){
       return  ResponseEntity.ok(iStudentService.updateStudent(Id,StudentDetails));
    }

    @PostMapping
    //@RequestBody is used to bind  the http request body to the method parameter
    public ResponseEntity<String> createStudents(@RequestBody Student student){
        return ResponseEntity.ok(iStudentService.createStudents( student));
//    return ResponseEntity.ok()
    }

//
//    @DeleteMapping
//    //@Pathvariable is used to map the variable given in the url path with the method parameter
//    public ResponseEntity<String> deleteStudentById(@PathVariable Integer Id){
//
//        return ResponseEntity.ok(iStudentService.deleteStudentById(Id));
//        //
//    }


}
