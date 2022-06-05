package com.alkemy.disney.disney.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="personaje")
@Getter
@Setter

public class PersonajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private Long edad;
    private Long peso;
    private String historia;

    @ManyToMany(mappedBy = "personajes",cascade = CascadeType.ALL)
    private List<PeliculaSerieEntity> peliculaSeries= new ArrayList<>();

    //Add and remove paises
    public void addPeliculas(PeliculaSerieEntity peliculasSeries){this.peliculaSeries.add(peliculasSeries);}
    public void removePeliculas(PeliculaSerieEntity peliculaSeries){this.peliculaSeries.remove(peliculaSeries);}


}
