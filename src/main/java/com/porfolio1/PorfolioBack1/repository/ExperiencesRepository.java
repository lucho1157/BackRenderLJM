
package com.porfolio1.PorfolioBack1.repository;

import com.porfolio1.PorfolioBack1.model.Experiences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperiencesRepository extends JpaRepository <Experiences, Integer> {
  
}
