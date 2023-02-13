
package com.porfolio1.PorfolioBack1.service;

import com.porfolio1.PorfolioBack1.model.Schools;
import java.util.List;


public interface ISchoolsService {
    
    public List<Schools> verEducacion ();
    public void crearEducacion (Schools edu);
    public void borrarEducacion (Integer id);
    public Schools buscarEducacion (Integer id);
    public Schools getOne (Integer id);
    public boolean existById(Integer id);
    
}
