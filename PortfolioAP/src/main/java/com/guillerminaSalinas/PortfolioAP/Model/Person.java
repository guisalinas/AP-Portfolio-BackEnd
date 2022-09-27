package com.guillerminaSalinas.PortfolioAP.Model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name= "Persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    private String about_me;
    @Column(nullable = false)
    private String email;
    private String photo_url;
    @Column(nullable = false)
    private String description;  
    @OneToMany(mappedBy= "person_id")
    private List<JobExperience> job_experience;
    @OneToMany(mappedBy= "person_id")
    private List<Skill> skills;
    @OneToMany(mappedBy= "person_id")
    private List<Education> education;
    @OneToMany(mappedBy= "person_id")
    private List<Proyect> proyects;
    
    public Person (){}

    public Person(Long id, String name, String surname, String about_me, String email, String photo_url, String description, List<JobExperience> job_experience, List<Skill> skills, List<Education> education, List<Proyect> proyects) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.about_me = about_me;
        this.email = email;
        this.photo_url = photo_url;
        this.description = description;
        this.job_experience = job_experience;
        this.skills = skills;
        this.education = education;
        this.proyects = proyects;
    }    
}




