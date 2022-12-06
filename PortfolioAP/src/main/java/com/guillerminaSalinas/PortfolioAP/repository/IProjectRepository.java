package com.guillerminaSalinas.PortfolioAP.repository;

import com.guillerminaSalinas.PortfolioAP.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjectRepository extends JpaRepository<Project, Long>{
    
}
