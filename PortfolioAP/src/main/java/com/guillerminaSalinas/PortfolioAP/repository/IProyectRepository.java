package com.guillerminaSalinas.PortfolioAP.repository;

import com.guillerminaSalinas.PortfolioAP.Model.Proyect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectRepository extends JpaRepository<Proyect, Long>{
    
}
