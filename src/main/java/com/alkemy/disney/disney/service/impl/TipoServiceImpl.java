package com.alkemy.disney.disney.service.impl;

import com.alkemy.disney.disney.Entity.TipoEntity;
import com.alkemy.disney.disney.dto.TipoDTO;
import com.alkemy.disney.disney.mapper.TipoMapper;
import com.alkemy.disney.disney.repository.TipoRepository;
import com.alkemy.disney.disney.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TipoServiceImpl implements TipoService {

    @Autowired
    private TipoMapper tipoMapper;

    @Autowired
    private TipoRepository tipoRepository;

    public TipoDTO save(TipoDTO dto){

        TipoEntity entity= tipoMapper.tipoDTO2Entity(dto);
        TipoEntity entitySave=tipoRepository.save(entity);
        TipoDTO result=tipoMapper.tipoEntity2DTO(entitySave);

        return result;

    }


    public List<TipoDTO> getAllTipos() {

        List<TipoEntity> entities=this.tipoRepository.findAll();
        List<TipoDTO> result=this.tipoMapper.tipoEntityList2DTO(entities);
        return result;
    }


}
