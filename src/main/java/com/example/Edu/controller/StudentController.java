package com.example.Edu.controller;

import com.example.Edu.controller.generic.GenericController;
import com.example.Edu.dao.StudentsDao;
import com.example.Edu.domain.Students;
import com.example.Edu.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController extends GenericController<StudentService, StudentsDao, Students,Integer> {
}
