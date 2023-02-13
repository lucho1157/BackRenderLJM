
package com.porfolio1.PorfolioBack1.service;

import com.porfolio1.PorfolioBack1.model.Projects;
import java.util.List;


public interface IProjectsService {
    
    public List<Projects> verProyectos ();
    public Projects getOne (Integer id);
    public void crearProyecto (Projects pro);
    public void borrarProyecto (Integer id);
    public Projects buscarProyecto (Integer id);
    public boolean existById(Integer id);
    
    
}
