package com.guillerminaSalinas.PortfolioAP.Controller;

import com.guillerminaSalinas.PortfolioAP.Model.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    List<Person> personList = new ArrayList();
    
    //crear persona
    @PostMapping("/new/person")
    public void addPerson(@RequestBody Person p){
        personList.add(p);
    }
    
    //mostrar lista de personas
    @GetMapping("/get/person")
    @ResponseBody
    public List<Person> getPersonList(){
        return personList;
    }
            
    
}
