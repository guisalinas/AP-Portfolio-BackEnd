package com.guillerminaSalinas.PortfolioAP.services;

import com.guillerminaSalinas.PortfolioAP.services.Interfaces.IEducationService;
import com.guillerminaSalinas.PortfolioAP.Model.Education;
import com.guillerminaSalinas.PortfolioAP.repository.IEducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EducationService implements IEducationService{
    
    @Autowired
    public IEducationRepository E_repository;
    
    @Override
    public List<Education> getEducation(){
        return E_repository.findAll();
    };
    
    @Override
    public void createEducationItem(Education ed){
        E_repository.save(ed);
    };
    
    @Override
    public void deleteEdcucationItem(Long id){
        E_repository.deleteById(id);
    };
    
    @Override
    public void updateEducationItem(Education ed){
        E_repository.save(ed);
    };
    
    @Override
    public Education getEducationItemById(Long id){
        return E_repository.findById(id).orElse(null);
    };  
    
}
