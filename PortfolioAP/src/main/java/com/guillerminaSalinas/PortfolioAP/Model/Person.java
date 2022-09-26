package com.guillerminaSalinas.PortfolioAP.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String about_me;
    private String email;
    private String photo_url;
    private String description;  
    
    public Person (){}
    
    public Person(Long id, String name, String surname, String about_me, String email, String photo_url, String description){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.about_me = about_me;
        this.email = email;
        this.photo_url = photo_url;
        this.description = description;
    }   
    
}




