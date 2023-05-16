package ru.hse.seminar18.studentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface StudentController {

    @GetMapping("/{id}")
    String listStudents(@PathVariable String id);
}
