package com.alkemy.disney.disney.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter

public class PeliculasSeriesDTO {
    private Long id;
    private String titulo;
    private String imagen;
    private LocalDate fechaCreacion;
    private Long calificacion;
    private TipoDTO tipo;
    private List<GeneroDTO> generos;
    private List<PersonajeDTO> personajes;
}
