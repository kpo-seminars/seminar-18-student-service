package ru.hse.seminar18.studentservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentControllerImpl implements StudentController {

    @Override
    public String listStudents(String id) {
        return "Student: " + id;
    }
}
