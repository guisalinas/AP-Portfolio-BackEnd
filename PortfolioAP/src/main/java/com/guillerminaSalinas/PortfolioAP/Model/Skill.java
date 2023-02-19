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
@Table(name= "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Skill_name;
    private int porcent;
    @ManyToOne(fetch = FetchType.EAGER)
    private Person person;

    public Skill(){
    }

    public Skill(Long id, String Skill_name, int porcent, Person person) {
        this.id = id;
        this.Skill_name = Skill_name;
        this.porcent = porcent;
        this.person = person;
    }
     
    
}
