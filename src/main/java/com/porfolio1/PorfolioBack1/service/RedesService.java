
package com.porfolio1.PorfolioBack1.service;

import com.porfolio1.PorfolioBack1.model.Redes;
import com.porfolio1.PorfolioBack1.repository.RedesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedesService implements IRedesService {

    @Autowired
    public RedesRepository redesiRepo;

    @Override
    public List<Redes> verRedes() {
        return redesiRepo.findAll();
    }

    @Override
    public void crearRed(Redes red) {
        redesiRepo.save(red);
    }

    @Override
    public void borrarRed(Integer id) {
        redesiRepo.deleteById(id);
    }

    @Override
    public Redes buscarRed(Integer id) {
        return redesiRepo.findById(id).orElse(null);
    }

    @Override
    public Redes getOne(Integer id) {
        return  redesiRepo.findById(id).orElse(null);
    }

    @Override
    public boolean existById(Integer id) {
        redesiRepo.existsById(id);
        return true;
    }
    
    
    
}
