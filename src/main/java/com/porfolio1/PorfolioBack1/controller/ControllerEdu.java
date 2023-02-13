
package com.porfolio1.PorfolioBack1.controller;

import com.porfolio1.PorfolioBack1.model.Schools;
import com.porfolio1.PorfolioBack1.service.ISchoolsService;
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
public class ControllerEdu {
    
    @Autowired
    private ISchoolsService educServ;
    
    @PostMapping ("/new/educacion")
    public String agregarEducacion (@RequestBody Schools educa) {
        educServ.crearEducacion(educa);
        return "";
    }
    
    @GetMapping ("/detailedu/{id}")
    public ResponseEntity<Schools> getById(@PathVariable Integer id) {
        if (educServ.existById(id)) {
            Schools educ = educServ.getOne(id);
            return new ResponseEntity(educ, HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }
        
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Schools> verEducacion() {
        return educServ.verEducacion();
    }
    
    @DeleteMapping ("/educacion/delete/{id}")
    public String borrarEducacion(@PathVariable Integer id) {
        educServ.borrarEducacion(id);
        return "La Educación fue borrada crrectamente";
    }
    
    @PutMapping("educacion/editar/{id}")
    public Schools editEducacion (@RequestBody Schools educ) {
        educServ.crearEducacion(educ);
        return educ;
    }
    
}
