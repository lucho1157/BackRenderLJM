
package com.porfolio1.PorfolioBack1.controller;

import com.porfolio1.PorfolioBack1.model.Persona;
import com.porfolio1.PorfolioBack1.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins= "http://localhost:4200")
public class ControllerPer {
    
    @Autowired
    private IPersonaService persoServ;
    
    
    @PostMapping ("/new/persona")
    public String agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
        return "";
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }
    
    @GetMapping ("/detail/{id}")
    public Persona buscarPersona(@PathVariable Integer id) {
        return persoServ.buscarPersona(id);
    }
    
    @DeleteMapping ("/deleteper/{id}")
    public String borrarPersona(@PathVariable Integer id) {
        persoServ.borrarPersona(id);
        return "La persona fue borrada crrectamente";
    }
    
    @PutMapping("personas/edit") 
    public void editPersona( @RequestBody Persona pers) {
        persoServ.crearPersona(pers);
        
    }
    
    @PutMapping("personas/edit/{id}")
    public Persona crearPersona (@PathVariable Integer id,
                                 @RequestParam ("nombre") String nuevoNombre,
                                 @RequestParam ("apellido") String nuevoApellido,
                                 @RequestParam ("profesion") String nuevoProfesion,
                                 @RequestParam ("banner") String nuevoBanner,
                                 @RequestParam ("about") String nuevoAbout,
                                 @RequestParam ("urlperfil") String nuevoUrlperfil) {
        Persona person = persoServ.buscarPersona(id);
        
        person.setNombre(nuevoNombre);
        person.setApellido(nuevoApellido);
        person.setProfesion(nuevoProfesion);
        person.setBanner(nuevoBanner);
        person.setAbout(nuevoAbout);
        person.setUrlperfil(nuevoUrlperfil);
        
        return person;
    }
    
}
