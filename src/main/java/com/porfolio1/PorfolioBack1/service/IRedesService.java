
package com.porfolio1.PorfolioBack1.service;

import com.porfolio1.PorfolioBack1.model.Redes;
import java.util.List;


public interface IRedesService {
    
    public List<Redes> verRedes ();
    public void crearRed (Redes red);
    public void borrarRed (Integer id);
    public Redes buscarRed (Integer id);
    public Redes getOne (Integer id);
    public boolean existById(Integer id);
    
}
