package com.guillerminaSalinas.PortfolioAP.services;

import com.guillerminaSalinas.PortfolioAP.services.Interfaces.ISkillService;
import com.guillerminaSalinas.PortfolioAP.Model.Skill;
import com.guillerminaSalinas.PortfolioAP.repository.ISkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
    @Autowired
    public ISkillRepository R_repository;

    @Override
    public List<Skill> getSkills() {
        return R_repository.findAll();
    }

    @Override
    public void createSkillItem(Skill s) {
        R_repository.save(s);
    }

    @Override
    public void deleteSkillItem(Long id) {
        R_repository.deleteById(id);
    }

    @Override
    public void updateSkillItem(Skill s) {
        R_repository.save(s);
    }

    @Override
    public Skill getSkillItemById(Long id) {
       return R_repository.findById(id).orElse(null);
    }
}
