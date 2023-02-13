
package com.porfolio1.PorfolioBack1.service;

import com.porfolio1.PorfolioBack1.model.Experiences;
import com.porfolio1.PorfolioBack1.repository.ExperiencesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperiencesService implements IExperiencesService {

    @Autowired
    public ExperiencesRepository expeRepo;

    @Override
    public List<Experiences> verExperiencias() {
        return expeRepo.findAll();
    }

    @Override
    public Experiences getOne(Integer id) {
        return  expeRepo.findById(id).orElse(null);
    }

    @Override
    public void crearExperiencia(Experiences exp) {
        expeRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Integer id) {
        expeRepo.deleteById(id);
    }

    @Override
    public Experiences buscarExperiencia(Integer id) {
        return expeRepo.findById(id).orElse(null);
    }

    @Override
    public boolean existById(Integer id) {
        expeRepo.existsById(id);
        return true; 
    }

    
}
