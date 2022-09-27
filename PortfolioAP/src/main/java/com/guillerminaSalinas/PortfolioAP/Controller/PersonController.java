package com.guillerminaSalinas.PortfolioAP.Controller;

import com.guillerminaSalinas.PortfolioAP.Model.Person;
import com.guillerminaSalinas.PortfolioAP.services.PersonServices;
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
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonServices P_service;

    @PostMapping("/new")
    public void addPerson(@RequestBody Person p) {
        P_service.createPerson(p);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<Person> getPersonList() {
        return P_service.getPersons();
    }

    @GetMapping("/{id}")
     public Person getPersonById(@PathVariable("id") Long id) {
        return P_service.getPersonById(id);
    }
     
    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable("id") Long id) {
        P_service.deletePerson(id);
    }
    
    @PutMapping()
    public void updatePerson(@RequestBody Person p) {
        P_service.updatePerson(p);
    }
}
