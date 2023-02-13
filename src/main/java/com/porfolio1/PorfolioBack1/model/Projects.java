
package com.porfolio1.PorfolioBack1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Projects {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Size(min =1, max = 50)
    private String name;
    @Lob
    @Column(name = "text", length=5000)
    private String text;
    @Size(max = 150)
    private String imglog;
    @Column (name = "persona_id")
    private Integer personaId;

    public Projects() {
    }

    public Projects(String name, String text, String imglog, Integer personaId) {
        this.name = name;
        this.text = text;
        this.imglog = imglog;
        this.personaId = personaId;
    }

    public Projects orElse(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    
    
    
    
}
