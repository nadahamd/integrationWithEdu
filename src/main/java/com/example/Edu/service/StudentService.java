package com.example.Edu.service;

import com.example.Edu.dao.DetailsDao;
import com.example.Edu.dao.StudentsDao;
import com.example.Edu.domain.Details;
import com.example.Edu.domain.Students;
import com.example.Edu.service.generic.GenericService;
import org.springframework.stereotype.Service;


@Service
public class StudentService extends GenericService<StudentsDao, Students,Integer> {
}
