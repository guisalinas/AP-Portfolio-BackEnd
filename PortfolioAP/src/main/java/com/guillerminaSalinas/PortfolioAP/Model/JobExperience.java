
package com.guillerminaSalinas.PortfolioAP.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
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

@Getter @Setter
@Entity
@Table(name= "job_experiences")
public class JobExperience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company_name;
    private Boolean is_current_job;
    @Temporal(TemporalType.DATE)
    private Date start_date;
    @Temporal(TemporalType.DATE)
    private Date finish_date;
    private String description;
    private String job_name;
       
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Person_id")
    private Person person_id;   

    public JobExperience(){
    }

    public JobExperience(Long id, String company_name, Boolean is_current_job, Date start_date, Date finish_date, String description, String job_name, Person person_id) {
        this.id = id;
        this.company_name = company_name;
        this.is_current_job = is_current_job;
        this.start_date = start_date;
        this.finish_date = finish_date;
        this.description = description;
        this.job_name = job_name;
        this.person_id = person_id;
    }

}
