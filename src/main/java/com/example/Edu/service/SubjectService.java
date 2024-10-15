package com.example.Edu.service;

import com.example.Edu.dao.DetailsDao;
import com.example.Edu.dao.SubjectDao;
import com.example.Edu.domain.Details;
import com.example.Edu.domain.Subject;
import com.example.Edu.service.generic.GenericService;
import org.springframework.stereotype.Service;


@Service
public class SubjectService extends GenericService<SubjectDao, Subject,Integer> {
}
