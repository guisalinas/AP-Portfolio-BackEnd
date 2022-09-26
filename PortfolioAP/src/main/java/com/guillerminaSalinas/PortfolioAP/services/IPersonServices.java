package com.guillerminaSalinas.PortfolioAP.services;

import com.guillerminaSalinas.PortfolioAP.Model.Person;
import java.util.List;

public interface IPersonServices {
    
    public List<Person> getPersons();
    public void createPerson(Person p);
    public void deletePerson(Long id);
    public Person findPerson(Long id); 
    
    
}
