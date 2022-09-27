package com.guillerminaSalinas.PortfolioAP.services;

import com.guillerminaSalinas.PortfolioAP.services.Interfaces.IProyectService;
import com.guillerminaSalinas.PortfolioAP.Model.Proyect;
import com.guillerminaSalinas.PortfolioAP.repository.IProyectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectService implements IProyectService{
    
    @Autowired
    public IProyectRepository Pr_repository;

    @Override
    public List<Proyect> getProyects() {
        return Pr_repository.findAll();
    }

    @Override
    public void createProyectItem(Proyect pr) {
        Pr_repository.save(pr);
    }

    @Override
    public void deleteProyectItem(Long id) {
        Pr_repository.deleteById(id);
    }

    @Override
    public void updateProyectItem(Proyect pr) {
        Pr_repository.save(pr);
    }

    @Override
    public Proyect getProyectItemById(Long id) {
        return Pr_repository.findById(id).orElse(null);
    }
}
