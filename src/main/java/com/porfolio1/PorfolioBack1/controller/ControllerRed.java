
package com.porfolio1.PorfolioBack1.controller;

import com.porfolio1.PorfolioBack1.model.Redes;
import com.porfolio1.PorfolioBack1.service.IRedesService;
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
public class ControllerRed {
    
    @Autowired
    private IRedesService redesiServ;
    
    @PostMapping ("/new/red")
    public String agregarRed (@RequestBody Redes rede) {
        redesiServ.crearRed(rede);
        return "La Red fue agregada correctamente";
    }
    
    @GetMapping ("/detailred/{id}")
    public ResponseEntity<Redes> getById(@PathVariable Integer id) {
        if (redesiServ.existById(id)) {
            Redes red = redesiServ.getOne(id);
            return new ResponseEntity(red, HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }
    
    @GetMapping ("/ver/redes")
    @ResponseBody
    public List<Redes> verRedes() {
        return redesiServ.verRedes();
    }
    
    @DeleteMapping ("/red/delete/{id}")
    public String borrarRed(@PathVariable Integer id) {
        redesiServ.borrarRed(id);
        return "La Red fue borrada crrectamente";
    }
    
    @PutMapping("red/editar/{id}")
    public Redes editRed (@RequestBody Redes red) {
        redesiServ.crearRed(red);
        return red;
    }
    
}
