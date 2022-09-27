package com.guillerminaSalinas.PortfolioAP.services.Interfaces;

import com.guillerminaSalinas.PortfolioAP.Model.Proyect;
import java.util.List;

public interface IProyectService {
    
    public List<Proyect> getProyects();
    public void createProyectItem(Proyect pr);
    public void deleteProyectItem(Long id);
    public void updateProyectItem(Proyect pr);
    public Proyect getProyectItemById(Long id);
}
