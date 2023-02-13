
package com.porfolio1.PorfolioBack1.service;

import com.porfolio1.PorfolioBack1.model.Projects;
import com.porfolio1.PorfolioBack1.repository.ProjectsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectsService implements IProjectsService {

    @Autowired
    public ProjectsRepository proyeRepo;

    @Override
    public List<Projects> verProyectos() {
       return proyeRepo.findAll();
    }

    @Override
    public Projects getOne(Integer id) {
        return  proyeRepo.findById(id).orElse(null);
    }

    @Override
    public void crearProyecto(Projects pro) {
        proyeRepo.save(pro);
    }

    @Override
    public void borrarProyecto(Integer id) {
        proyeRepo.deleteById(id);
    }

    @Override
    public Projects buscarProyecto(Integer id) {
        return proyeRepo.findById(id).orElse(null);
    }

    @Override
    public boolean existById(Integer id) {
        proyeRepo.existsById(id);
        return true; 
    }

}
