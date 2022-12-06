package com.guillerminaSalinas.PortfolioAP.Controller;

import com.guillerminaSalinas.PortfolioAP.Model.JobExperience;
import com.guillerminaSalinas.PortfolioAP.services.JobExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/JobExperience")
public class JobExperienceController {
    
    @Autowired
    public JobExperienceService JE_service;

    @GetMapping("/getAll")
    @ResponseBody
    public List<JobExperience> getExperiences(){
        return JE_service.getJobExperiences();
    }    
    
    @PostMapping("/new")
    public void addJobExperience(@RequestBody JobExperience je) {
        JE_service.createJobExperienceItem(je);
    }

    @GetMapping("/{id}")
    public JobExperience getJobExperienceById(@PathVariable("id") Long id) {
        return JE_service.getJobExperienceItemById(id);
    }
     
    @DeleteMapping("/delete/{id}")
    public void deleteJobExperience(@PathVariable("id") Long id) {
        JE_service.deleteJobExperienceItem(id);
    }
    
    @PutMapping()
    public void updateJobExperience(@RequestBody JobExperience je) {
        JE_service.updateJobExperienceItem(je);
    }
    
}
