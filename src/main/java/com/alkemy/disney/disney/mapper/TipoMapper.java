package com.alkemy.disney.disney.mapper;

import com.alkemy.disney.disney.Entity.TipoEntity;
import com.alkemy.disney.disney.dto.TipoDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class TipoMapper {

    public TipoEntity tipoDTO2Entity(TipoDTO dto){
        TipoEntity tipoEntity=new TipoEntity();
        tipoEntity.setTipo(dto.getNombre());

        return  tipoEntity;

    }

    public TipoDTO tipoEntity2DTO(TipoEntity entity){
        TipoDTO tipoDTO=new TipoDTO();
        tipoDTO.setId(entity.getId());
        tipoDTO.setNombre(entity.getTipo());

        return  tipoDTO;

    }

    public List<TipoDTO> tipoEntityList2DTO(List<TipoEntity> entities){
        List<TipoDTO> dtos=new ArrayList<>();
        for(TipoEntity entity:entities){
            dtos.add(this.tipoEntity2DTO(entity));
        }

        return dtos;
    }
}
