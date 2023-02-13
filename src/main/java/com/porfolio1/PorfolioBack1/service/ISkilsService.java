
package com.porfolio1.PorfolioBack1.service;

import com.porfolio1.PorfolioBack1.model.Skils;
import java.util.List;


public interface ISkilsService {
    
    public List<Skils> verHabilidad ();
    public void crearHabilidad (Skils ski);
    public void borrarHabilidad (Integer id);
    public Skils buscarHabilidad (Integer id);
    public Skils getOne (Integer id);
    public boolean existById(Integer id);
    
}
