package com.guillerminaSalinas.PortfolioAP.repository;

import com.guillerminaSalinas.PortfolioAP.Model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository extends JpaRepository<Skill, Long>{
    
}
