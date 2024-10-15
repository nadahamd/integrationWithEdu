package com.example.Edu.dao.generic;

import com.example.Edu.domain.generic.GenericDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface GenericDao <T extends GenericDomain,IdClass> extends JpaRepository<T, IdClass>, Serializable {
}
