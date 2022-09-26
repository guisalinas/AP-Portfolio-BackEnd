
package com.guillerminaSalinas.PortfolioAP.services;

import com.guillerminaSalinas.PortfolioAP.Model.Person;
import com.guillerminaSalinas.PortfolioAP.repository.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServices implements IPersonServices{
    
    @Autowired
    public PersonRepository P_repository;

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
    public Person findPerson(Long id) {
        return P_repository.findById(id).orElse(null);
    }
    
    
    
}
