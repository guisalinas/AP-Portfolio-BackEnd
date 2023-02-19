package com.guillerminaSalinas.PortfolioAP.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String course_name;
    private String institute_name;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date start_date;
    @Temporal(TemporalType.DATE)
    private Date finish_date;
    private String logo_url;
    @ManyToOne(fetch = FetchType.EAGER)
    private Person person;

    public Education() {

    }

    public Education(Long id, String course_name, String institute_name, String description, Date start_date, Date finish_date, String logo_url, Person person) {
        this.id = id;
        this.course_name = course_name;
        this.institute_name = institute_name;
        this.description = description;
        this.start_date = start_date;
        this.finish_date = finish_date;
        this.logo_url = logo_url;
        this.person = person;
    }

}
