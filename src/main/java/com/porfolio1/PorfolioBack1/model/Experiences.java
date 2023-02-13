
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
public class Experiences {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String empresa;
    private String puesto1;
    private String puesto2;
    private String puesto3;
    private String puesto4;
    private String tarea;
    private String herramientas;
    @Size(max = 50)
    private String start;
    @Size(max = 50)
    private String end;
    @Size(max = 150)
    private String imglog;
    @Column (name = "persona_id")
    private Integer personaId;

    public Experiences() {
    }

    public Experiences(String empresa, String puesto1, String puesto2, String puesto3, String puesto4, String tarea, String herramientas, String start, String end, String imglog, Integer personaId) {
        this.empresa = empresa;
        this.puesto1 = puesto1;
        this.puesto2 = puesto2;
        this.puesto3 = puesto3;
        this.puesto4 = puesto4;
        this.tarea = tarea;
        this.herramientas = herramientas;
        this.start = start;
        this.end = end;
        this.imglog = imglog;
        this.personaId = personaId;
    }

    public Experiences orElse(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    

    
    
    
}
