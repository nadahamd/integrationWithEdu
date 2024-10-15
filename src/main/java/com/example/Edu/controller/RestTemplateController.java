package com.example.Edu.controller;


import com.example.Edu.domain.Students;
import com.example.Edu.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/integration")
public class RestTemplateController {


    public RestTemplateService restTemplateService;

    @Autowired
    public void setRestTemplateService(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }

    @GetMapping("/search-by-mark")
    public ResponseEntity getByMark(@RequestParam("mark") String mark) {
      Students studentsList = restTemplateService.getResults(mark);
        return studentsList != null ?
                new ResponseEntity(studentsList, HttpStatus.OK) :
                new ResponseEntity(null, null);

    }

    @PostMapping("add-student")
    public Students addNew(@RequestBody Students students){
         Students result=restTemplateService.addnew(students);
         return result;
    }


}
