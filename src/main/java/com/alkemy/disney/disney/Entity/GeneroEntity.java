package com.alkemy.disney.disney.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="genero")
@Getter
@Setter


public class GeneroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String imagen;

    @ManyToMany(mappedBy = "generos",cascade = CascadeType.ALL)
    private List<PeliculaSerieEntity> peliculaSeries= new ArrayList<>();

    //Add and remove peliculas
    public void addPeliculas(PeliculaSerieEntity peliculasSeries){this.peliculaSeries.add(peliculasSeries);}
    public void removePeliculas(PeliculaSerieEntity peliculaSeries){this.peliculaSeries.remove(peliculaSeries);}









}
