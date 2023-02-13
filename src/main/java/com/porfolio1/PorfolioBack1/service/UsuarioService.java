package com.porfolio1.PorfolioBack1.service;

import com.porfolio1.PorfolioBack1.model.Usuario;
import com.porfolio1.PorfolioBack1.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    public UsuarioRepository usuarRepo;
    
    public void crearUsuario(Usuario usu) {
        usuarRepo.save(usu);
    }
    
    public UsuarioDTO loginUsuario(String email, String password) {
        Usuario usuario= usuarRepo.findByEmailAndPassword(email, password);
        UsuarioDTO usuarioDTO= new UsuarioDTO(usuario.getId());
        return usuarioDTO;
        
        
    }
    
}
