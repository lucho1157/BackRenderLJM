
package com.porfolio1.PorfolioBack1.controller;

import com.porfolio1.PorfolioBack1.model.Usuario;
import com.porfolio1.PorfolioBack1.service.UsuarioDTO;
import com.porfolio1.PorfolioBack1.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins= "https://porfolio-ap-ljm.web.app")
public class ControllerUsu {
    
    @Autowired
    UsuarioService usuarioService;
    
    //login
    @PostMapping("/aut/login")
    public UsuarioDTO loginUsuario (@RequestBody Usuario usua){
         return usuarioService.loginUsuario(usua.getEmail(), usua.getPassword());
    }
    
    
    @PostMapping ("/new/usuario")
    public String agregarUsuario (@RequestBody Usuario usua) {
        usuarioService.crearUsuario(usua);
        return "El Usuario fue agregado correctamente";
    }
    
}
