package com.guillerminaSalinas.PortfolioAP.repository;

import com.guillerminaSalinas.PortfolioAP.Model.JobExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJobExperienceRepository extends JpaRepository<JobExperience, Long>{
    
}
