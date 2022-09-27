package com.guillerminaSalinas.PortfolioAP.services.Interfaces;

import com.guillerminaSalinas.PortfolioAP.Model.JobExperience;
import java.util.List;

public interface IJobExperienceService {
    
    public List<JobExperience> getJobExperiences();
    public void createJobExperienceItem(JobExperience je);
    public void deleteJobExperienceItem(Long id);
    public void updateJobExperienceItem(JobExperience je);
    public JobExperience getJobExperienceItemById(Long id);
    
}
