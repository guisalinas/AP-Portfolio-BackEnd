package com.guillerminaSalinas.PortfolioAP.services.Interfaces;

import com.guillerminaSalinas.PortfolioAP.Model.Person;
import java.util.List;

public interface IPersonServices {
    
    public List<Person> getPersons();
    public void createPerson(Person p);
    public void deletePerson(Long id);
    public void updatePerson(Person p);
    public Person getPersonById(Long id);
    
}
