
package com.porfolio1.PorfolioBack1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Redes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Size(min =1, max = 50)
    private String nombre;
    @Size(max = 150)
    private String urlred;
    @Column (name = "persona_id")
    private Integer personaId;

    public Redes() {
    }

    public Redes(String nombre, String urlred, Integer personaId) {
        this.nombre = nombre;
        this.urlred = urlred;
        this.personaId = personaId;
    }
    
    

    
    
    

    
    
    
    
}
