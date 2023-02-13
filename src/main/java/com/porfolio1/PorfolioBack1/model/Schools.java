
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
public class Schools {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String level;
    @NotNull
    private String instituto;
    private String career;
    private String title;
    @Size(max = 50)
    private String start;
    @Size(max = 50)
    private String end;
    @Size(max = 150)
    private String imglog;
    @Column (name = "persona_id")
    private Integer personaId;

    public Schools() {
    }

    public Schools(String level, String instituto, String career, String title, String start, String end, String imglog, Integer personaId) {
        this.level = level;
        this.instituto = instituto;
        this.career = career;
        this.title = title;
        this.start = start;
        this.end = end;
        this.imglog = imglog;
        this.personaId = personaId;
    }
    
    

    
    
    
}
