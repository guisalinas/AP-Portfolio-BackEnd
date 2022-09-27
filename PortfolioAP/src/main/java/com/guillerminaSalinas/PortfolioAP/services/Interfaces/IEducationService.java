package com.guillerminaSalinas.PortfolioAP.services.Interfaces;

import com.guillerminaSalinas.PortfolioAP.Model.Education;
import java.util.List;


public interface IEducationService {
    
    public List<Education> getEducation();
    public void createEducationItem(Education ed);
    public void deleteEdcucationItem(Long id);
    public void updateEducationItem(Education ed);
    public Education getEducationItemById(Long id);
    
}
