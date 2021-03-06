package com.alkemy.disney.disney.dto;

import com.alkemy.disney.disney.Entity.PeliculaSerieEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class GeneroDTO {

    private Long id;
    private String nombre;
    private String imagen;
    private List<PeliculasSeriesDTO> peliculaSeries;
}
