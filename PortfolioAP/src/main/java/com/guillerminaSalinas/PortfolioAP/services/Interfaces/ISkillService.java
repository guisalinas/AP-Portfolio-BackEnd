package com.guillerminaSalinas.PortfolioAP.services.Interfaces;

import com.guillerminaSalinas.PortfolioAP.Model.Skill;
import java.util.List;

public interface ISkillService {
    
    public List<Skill> getSkills();
    public void createSkillItem(Skill s);
    public void deleteSkillItem(Long id);
    public void updateSkillItem(Skill s);
    public Skill getSkillItemById(Long id);
    
}
