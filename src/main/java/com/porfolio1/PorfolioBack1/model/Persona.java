
package com.porfolio1.PorfolioBack1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Size(min =1, max = 50)
    private String nombre;
    @NotNull
    @Size(min = 1, max = 50)
    private String apellido;
    private String profesion;
    private String banner;
    @Lob
    @Column(name = "about", length=5000)
    private String about;
    @Size(max = 150)
    private String urlperfil;
    
    @OneToMany (mappedBy = "personaId")
    private List<Schools> estudio;
    
    @OneToMany (mappedBy = "personaId")
    private List<Projects> proyectos;
    
    @OneToMany (mappedBy = "personaId")
    private List<Redes> redesSociales;
    
    @OneToMany (mappedBy = "personaId")
    private List<Skils> habilidades;
    
    @OneToMany (mappedBy = "personaId")
    private List<Experiences> experiencias;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String profesion, String banner, String about, String urlperfil, List<Schools> estudio, List<Projects> proyectos, List<Redes> redesSociales, List<Skils> habilidades, List<Experiences> experiencias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.banner = banner;
        this.about = about;
        this.urlperfil = urlperfil;
        this.estudio = estudio;
        this.proyectos = proyectos;
        this.redesSociales = redesSociales;
        this.habilidades = habilidades;
        this.experiencias = experiencias;
        
        estudio = new ArrayList();
        proyectos = new ArrayList();
        redesSociales = new ArrayList();
        habilidades = new ArrayList();
        experiencias = new ArrayList();
    }
    
    

}
