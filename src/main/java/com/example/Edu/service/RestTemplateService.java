package com.example.Edu.service;


import com.example.Edu.domain.Students;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RestTemplateService {

    @Autowired
    Environment ev;


    @Autowired
    private RestTemplate restTemplate;

    public Students getResults(String mark){

       Students respone= restTemplate.getForObject("http://localhost:8080/student/search-by-mark?mark="+mark, Students.class);
return respone;
    }

    public Students addnew(Students students) {
        Map<String, String> request = new HashMap<>();
        request.put("firstName", students.getFirstName());
        request.put("lastName", students.getLastName());
        String url="http://localhost:8080/student";
        return restTemplate.postForObject(url, request, Students.class);
    }
}
