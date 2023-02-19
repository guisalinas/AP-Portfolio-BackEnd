package com.guillerminaSalinas.PortfolioAP.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "Persons")
public class Person implements Serializable {
        
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
    
    @OneToOne(mappedBy="person_id")
    private User user;
    
    @OneToMany(mappedBy= "person_id")
    private List<JobExperience> job_experience = new ArrayList<JobExperience>();
    
    @OneToMany(mappedBy= "person_id")
    private List<Skill> skills;
    
    @OneToMany(mappedBy= "person_id")
    private List<Education> education;
     
    @OneToMany(mappedBy= "person_id")
    private List<Project> projects;
    
    public Person (){}
    
    public Person(Long id) {
        super();
        this.id = id;
    }

    public Person(Long id, String name, String surname, String about_me, String email, String photo_url, String description, List<JobExperience> job_experience, List<Skill> skills, List<Education> education, List<Project> projects, User user) {
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
        this.projects = projects;
        this.user = user;
    } 
    
}




