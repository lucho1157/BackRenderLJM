
package com.porfolio1.PorfolioBack1.service;

import com.porfolio1.PorfolioBack1.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    public void crearPersona (Persona per);
    public void borrarPersona (Integer id);
    public Persona buscarPersona (Integer id);
    
}
