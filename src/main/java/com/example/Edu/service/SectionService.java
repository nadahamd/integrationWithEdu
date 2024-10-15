package com.example.Edu.service;


import com.example.Edu.dao.SectionDao;

import com.example.Edu.domain.Section;
import com.example.Edu.service.generic.GenericService;
import org.springframework.stereotype.Service;

@Service
public class SectionService extends GenericService<SectionDao, Section,Integer> {
}
