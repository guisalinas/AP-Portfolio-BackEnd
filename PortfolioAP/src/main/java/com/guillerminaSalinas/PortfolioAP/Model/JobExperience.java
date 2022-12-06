
package com.guillerminaSalinas.PortfolioAP.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "job_experiences")
public class JobExperience implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company_name;
    @Temporal(TemporalType.DATE)
    private Date start_date;
    @Temporal(TemporalType.DATE)
    private Date finish_date;
    private String description;
    private String job_name;
    private String logo_url;

    @JoinColumn(name="person_id", nullable = false)
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private Person person_id;   

    public JobExperience(){
    }

    public JobExperience(Long id, String company_name, Date start_date, Date finish_date, String description, String job_name, String logo_url, Person person_id) {
        this.id = id;
        this.company_name = company_name;
        this.start_date = start_date;
        this.finish_date = finish_date;
        this.description = description;
        this.job_name = job_name;
        this.logo_url = logo_url;
        this.person_id = person_id;
    } 
    
}
