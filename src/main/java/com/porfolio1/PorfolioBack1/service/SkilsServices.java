
package com.porfolio1.PorfolioBack1.service;

import com.porfolio1.PorfolioBack1.model.Skils;
import com.porfolio1.PorfolioBack1.repository.SkilsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkilsServices implements ISkilsService {

    @Autowired
    public SkilsRepository skiliRepo;

    @Override
    public List<Skils> verHabilidad() {
        return skiliRepo.findAll();
    }

    @Override
    public void crearHabilidad(Skils ski) {
        skiliRepo.save(ski);
    }

    @Override
    public void borrarHabilidad(Integer id) {
        skiliRepo.deleteById(id);
    }

    @Override
    public Skils buscarHabilidad(Integer id) {
        return skiliRepo.findById(id).orElse(null);
    }

    @Override
    public Skils getOne(Integer id) {
        return  skiliRepo.findById(id).orElse(null);
    }

    @Override
    public boolean existById(Integer id) {
        skiliRepo.existsById(id);
        return true;
    }

    
    
    
    
}
