package com.guillerminaSalinas.PortfolioAP.Controller;

import com.guillerminaSalinas.PortfolioAP.Model.JobExperience;
import com.guillerminaSalinas.PortfolioAP.services.JobExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/JobExperience")
public class JobExperienceController {
    @Autowired
    public JobExperienceService JE_service;
    
    @GetMapping()
    private ResponseEntity<List<JobExperience>> getExperiences(){
        return ResponseEntity.ok(JE_service.getJobExperiences());
    }
    
}
