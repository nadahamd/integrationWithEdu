package com.example.Edu.service.generic;

import com.example.Edu.dao.generic.GenericDao;
import com.example.Edu.domain.generic.GenericDomain;
import org.springframework.beans.factory.annotation.Autowired;


import javax.transaction.Transactional;
import java.io.Serializable;

@Transactional
public class GenericService <Dao extends GenericDao,Domain extends GenericDomain,IdClass extends Serializable>{
    protected Dao dao;

    @Autowired
    public void setDao(Dao dao) {
        this.dao = dao;
    }

}
