
package com.porfolio1.PorfolioBack1.controller;

import com.porfolio1.PorfolioBack1.model.Experiences;
import com.porfolio1.PorfolioBack1.service.IExperiencesService;
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
@CrossOrigin(origins= "http://localhost:4200")
public class ControllerExp {
    
    @Autowired
    private IExperiencesService expeServ;
    
    @PostMapping ("/new/experiencia")
    public String agregarExperiencia (@RequestBody Experiences exper) {
        expeServ.crearExperiencia(exper);
        return "";
    }
    
    @GetMapping ("/detailexp/{id}")
    public ResponseEntity<Experiences> getById(@PathVariable Integer id) {
        if (expeServ.existById(id)) {
            Experiences expe = expeServ.getOne(id);
            return new ResponseEntity(expe, HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }
        
    @GetMapping ("/ver/experiencias")
    @ResponseBody
    public List<Experiences> verExperiencias() {
        return expeServ.verExperiencias();
    }
    
    @DeleteMapping ("/experiencia/delete/{id}")
    public String borrarExperiencia(@PathVariable Integer id) {
        expeServ.borrarExperiencia(id);
        return "La Experiencia fue borrada crrectamente";
    }
    
    @PutMapping("experiencia/editar/{id}")
    public Experiences editExperiencia (@RequestBody Experiences exp) {
        expeServ.crearExperiencia(exp);
        return exp;
    }
                                 
    
}
