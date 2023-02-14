
package com.porfolio1.PorfolioBack1.controller;

import com.porfolio1.PorfolioBack1.model.Skils;
import com.porfolio1.PorfolioBack1.service.ISkilsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins= "https://porfolio-ap-ljm.web.app")
public class ControllerSk {
    
    @Autowired
    private ISkilsService skiliServ;
    
    @PostMapping ("/new/habilidad")
    public String agregarHabilidad (@RequestBody Skils skil) {
        skiliServ.crearHabilidad(skil);
        return ("");
        
    }
    
    @GetMapping ("/detailhab/{id}")
    public ResponseEntity<Skils> getById(@PathVariable Integer id) {
        if (skiliServ.existById(id)) {
            Skils ski = skiliServ.getOne(id);
            return new ResponseEntity(ski, HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }
    
    @GetMapping ("/ver/habilidades")
    @ResponseBody
    public List<Skils> verHabilidades() {
        return skiliServ.verHabilidad();
    }
    
    @DeleteMapping ("/habilidad/delete/{id}")
    public String borrarHabilidad(@PathVariable Integer id) {
        skiliServ.borrarHabilidad(id);
        return "";
    }
    
    @PutMapping("habilidad/editar/{id}")
    public Skils editHabilidad (@RequestBody Skils ski) {
        skiliServ.crearHabilidad(ski);
        return ski;
    }
    
}
