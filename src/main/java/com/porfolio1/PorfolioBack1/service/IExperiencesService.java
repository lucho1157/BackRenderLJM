
package com.porfolio1.PorfolioBack1.service;

import com.porfolio1.PorfolioBack1.model.Experiences;
import java.util.List;


public interface IExperiencesService {
    
    public List<Experiences> verExperiencias ();
    public Experiences getOne (Integer id);
    public void crearExperiencia (Experiences exp);
    public void borrarExperiencia (Integer id);
    public Experiences buscarExperiencia (Integer id);
    public boolean existById(Integer id);
    
}
