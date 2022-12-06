package com.guillerminaSalinas.PortfolioAP.services.Interfaces;

import com.guillerminaSalinas.PortfolioAP.Model.Project;
import java.util.List;

public interface IProjectService {
    
    public List<Project> getProjects();
    public void createProjectItem(Project pr);
    public void deleteProjectItem(Long id);
    public void updateProjectItem(Project pr);
    public Project getProjectItemById(Long id);
}
