package com.guillerminaSalinas.PortfolioAP.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String proyect_name;
    private String description;
    private String project_url;
    private String photo_url;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Person person;

    public Project() {
    }

    public Project(Long id, String proyect_name, String description, String project_url, String photo_url, Person person) {
        this.id = id;
        this.proyect_name = proyect_name;
        this.description = description;
        this.project_url = project_url;
        this.photo_url = photo_url;
        this.person = person;
    }

    
}
