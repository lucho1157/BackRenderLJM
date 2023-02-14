
package com.porfolio1.PorfolioBack1.controller;

import com.porfolio1.PorfolioBack1.model.Projects;
import com.porfolio1.PorfolioBack1.service.IProjectsService;
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
public class ControllerPro {
    
    @Autowired
    private IProjectsService proyeServ;
    
    @PostMapping ("/new/proyecto")
    public String agregarProyecto (@RequestBody Projects proy) {
        proyeServ.crearProyecto(proy);
        return "";
    }
    
    @GetMapping ("/detailpro/{id}")
    public ResponseEntity<Projects> getById(@PathVariable Integer id) {
        if (proyeServ.existById(id)) {
            Projects proye = proyeServ.getOne(id);
            return new ResponseEntity(proye, HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }
    
    @GetMapping ("/ver/proyectos")
    @ResponseBody
    public List<Projects> verProyectos() {
        return proyeServ.verProyectos();
    }
    
    @DeleteMapping ("/proyecto/delete/{id}")
    public String borrarProyecto(@PathVariable Integer id) {
        proyeServ.borrarProyecto(id);
        return "";
    }
    
    @PutMapping("proyecto/editar/{id}")
    public Projects editProyecto (@RequestBody Projects pro) {
        proyeServ.crearProyecto(pro);
        return pro;
    }
    
}
