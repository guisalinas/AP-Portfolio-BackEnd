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

@Getter @Setter
@Entity
@Table(name= "proyects")
public class Proyect {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String proyect_name;
    private String description;
    private String proyect_url;
    
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Person_id")
    private Person person_id;
    
    public Proyect(){
    }

    public Proyect(Long id, String proyect_name, String description, String proyect_url, Person person_id) {
        this.id = id;
        this.proyect_name = proyect_name;
        this.description = description;
        this.proyect_url = proyect_url;
        this.person_id = person_id;
    }
    
}
