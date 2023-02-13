
package com.porfolio1.PorfolioBack1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Skils {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Size(min =1, max = 50)
    private String habilidad;
    @Min(0)
    @Max(100)
    private int porcentaje;
    @Column (name = "persona_id")
    private Integer personaId;

    public Skils() {
    }

    public Skils(String habilidad, int porcentaje, Integer personaId) {
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
        this.personaId = personaId;
    }
    
    

    
    
}
