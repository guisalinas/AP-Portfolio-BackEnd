package com.guillerminaSalinas.PortfolioAP.services;

import com.guillerminaSalinas.PortfolioAP.services.Interfaces.IJobExperienceService;
import com.guillerminaSalinas.PortfolioAP.Model.JobExperience;
import com.guillerminaSalinas.PortfolioAP.repository.IJobExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobExperienceService implements IJobExperienceService {
    @Autowired
    public IJobExperienceRepository JE_repository;

    @Override
    public List<JobExperience> getJobExperiences() {
        return JE_repository.findAll();
    }

    @Override
    public void createJobExperienceItem(JobExperience je) {
        JE_repository.save(je);
    }

    @Override
    public void deleteJobExperienceItem(Long id) {
        JE_repository.deleteById(id);
    }

    @Override
    public void updateJobExperienceItem(JobExperience je) {
        JE_repository.save(je);
    }

    @Override
    public JobExperience getJobExperienceItemById(Long id) {
        return JE_repository.findById(id).orElse(null);
    }
    
    
}
