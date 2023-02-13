
package com.porfolio1.PorfolioBack1.repository;

import com.porfolio1.PorfolioBack1.model.Skils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkilsRepository extends JpaRepository <Skils, Integer> {
    
}
