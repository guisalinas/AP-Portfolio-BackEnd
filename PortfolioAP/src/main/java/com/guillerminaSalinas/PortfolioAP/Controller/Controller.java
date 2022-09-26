package com.guillerminaSalinas.PortfolioAP.Controller;

import com.guillerminaSalinas.PortfolioAP.Model.Person;
import com.guillerminaSalinas.PortfolioAP.services.IPersonServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IPersonServices P_service;
    
    @PostMapping("/new/person")
    public void addPerson(@RequestBody Person p){
        P_service.createPerson(p);
    }
   
    @GetMapping("/get/person")
    @ResponseBody
    public List<Person> getPersonList(){
        return P_service.getPersons();
    }
            
    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable Long id){
        P_service.deletePerson(id);
    }
}
