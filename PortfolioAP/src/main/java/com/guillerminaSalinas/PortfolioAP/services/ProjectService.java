package com.guillerminaSalinas.PortfolioAP.services;

import com.guillerminaSalinas.PortfolioAP.Model.Project;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guillerminaSalinas.PortfolioAP.services.Interfaces.IProjectService;
import com.guillerminaSalinas.PortfolioAP.repository.IProjectRepository;

@Service
public class ProjectService implements IProjectService{
    
    @Autowired
    public IProjectRepository Pr_repository;

    @Override
    public List<Project> getProjects() {
        return Pr_repository.findAll();
    }

    @Override
    public void createProjectItem(Project pr) {
        Pr_repository.save(pr);
    }

    @Override
    public void deleteProjectItem(Long id) {
        Pr_repository.deleteById(id);
    }

    @Override
    public void updateProjectItem(Project pr) {
        Pr_repository.save(pr);
    }

    @Override
    public Project getProjectItemById(Long id) {
        return Pr_repository.findById(id).orElse(null);
    }
}
