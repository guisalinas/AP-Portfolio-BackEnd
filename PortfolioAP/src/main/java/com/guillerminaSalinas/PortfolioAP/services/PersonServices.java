package com.guillerminaSalinas.PortfolioAP.services;

import com.guillerminaSalinas.PortfolioAP.services.Interfaces.IPersonServices;
import com.guillerminaSalinas.PortfolioAP.Model.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guillerminaSalinas.PortfolioAP.repository.IPersonRepository;

@Service
public class PersonServices implements IPersonServices{
    
    @Autowired
    public IPersonRepository P_repository;

    @Override
    public List<Person> getPersons() {
        return P_repository.findAll();
    }

    @Override
    public void createPerson(Person p) {
        P_repository.save(p);
    }

    @Override
    public void deletePerson(Long id) {
        P_repository.deleteById(id);
    }

    @Override
    public Person getPersonById(Long id) {
        return P_repository.findById(id).orElse(null);
    }

    @Override
    public void updatePerson(Person p) {
        P_repository.save(p);
    }
    
}
