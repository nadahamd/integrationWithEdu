package com.example.Edu.controller.generic;

import com.example.Edu.dao.generic.GenericDao;
import com.example.Edu.domain.generic.GenericDomain;
import com.example.Edu.service.generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class GenericController <Service extends GenericService, Dao extends GenericDao, Domain extends GenericDomain , Id extends Serializable>{
    @Autowired
    protected Service service;

}
