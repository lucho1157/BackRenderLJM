
package com.porfolio1.PorfolioBack1.repository;

import com.porfolio1.PorfolioBack1.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Integer> {
    
    
}
