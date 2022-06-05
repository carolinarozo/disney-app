package com.alkemy.disney.disney.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="pelicula_serie")
@Getter
@Setter

public class PeliculaSerieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String imagen;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "tipo_id",insertable = false,updatable = false)
    private TipoEntity tipo;
    @Column(name ="tipo_id",nullable = false)
    private Long tipoId;


    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name="personaje_pelicula",
            joinColumns = @JoinColumn(name = "pelicula_serie_id"),
            inverseJoinColumns = @JoinColumn(name = "personaje_id"))
    private Set<PersonajeEntity> personajes=new HashSet<>();

    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name="genero_pelicula",
            joinColumns = @JoinColumn(name = "pelicula_serie_id"),
            inverseJoinColumns = @JoinColumn(name = "genero_id"))
    private Set<GeneroEntity> generos=new HashSet<>();

    @Override

    public boolean equals(Object obj){
        if(obj==null)
            return  false;
        if(getClass() !=obj.getClass())
            return false;
        final PeliculaSerieEntity other=(PeliculaSerieEntity) obj;
        return other.id==this.id;

    }


}
