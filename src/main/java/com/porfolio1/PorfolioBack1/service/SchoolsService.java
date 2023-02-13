
package com.porfolio1.PorfolioBack1.service;

import com.porfolio1.PorfolioBack1.model.Schools;
import com.porfolio1.PorfolioBack1.repository.SchoolsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolsService implements ISchoolsService {

    @Autowired
    public SchoolsRepository educRepo;

    @Override
    public List<Schools> verEducacion() {
        return educRepo.findAll();
    }

    @Override
    public void crearEducacion(Schools edu) {
        educRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Integer id) {
        educRepo.deleteById(id);
    }

    @Override
    public Schools buscarEducacion(Integer id) {
        return educRepo.findById(id).orElse(null);
    }

    @Override
    public Schools getOne(Integer id) {
        return  educRepo.findById(id).orElse(null);
    }

    @Override
    public boolean existById(Integer id) {
        educRepo.existsById(id);
        return true; 
    }
    
    
    
}
