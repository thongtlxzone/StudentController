package com.cybersoft.demoSpringBoot.controller;

import com.cybersoft.demoSpringBoot.model.StudentModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    List<StudentModel> studentList = new ArrayList<>();
    //PathVariable
    @PostMapping("/{name}/{age}")
    public ResponseEntity<?> addStudentPV(
            @PathVariable("name") String studentName,
            @PathVariable("age") int studentAge
    ){
        StudentModel newStudent = new StudentModel();
        newStudent.setStudentName(studentName);
        newStudent.setStudentAge(studentAge);
        studentList.add(newStudent);
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
    //RequestParam
    @PostMapping("")
    public ResponseEntity<?> addStudentRP(
            @RequestParam String studentName,
            @RequestParam int studentAge
    ){
        StudentModel newStudent = new StudentModel();
        newStudent.setStudentName(studentName);
        newStudent.setStudentAge(studentAge);
        studentList.add(newStudent);
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
    //ResquestBody
    @PutMapping("")
    public ResponseEntity<?> addStudentRB(
            @RequestBody StudentModel studentModel
    ){
        studentList.add(studentModel);
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
}
