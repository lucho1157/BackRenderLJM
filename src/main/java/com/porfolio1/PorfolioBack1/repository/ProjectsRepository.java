
package com.porfolio1.PorfolioBack1.repository;

import com.porfolio1.PorfolioBack1.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsRepository extends JpaRepository <Projects, Integer> {
  
}
