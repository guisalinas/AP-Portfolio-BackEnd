
package com.guillerminaSalinas.PortfolioAP.repository;

import com.guillerminaSalinas.PortfolioAP.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person, Long>{
    
}
