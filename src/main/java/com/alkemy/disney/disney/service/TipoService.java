package com.alkemy.disney.disney.service;


import com.alkemy.disney.disney.dto.TipoDTO;

import java.util.List;

public interface TipoService {

    TipoDTO save(TipoDTO dto);

    List<TipoDTO> getAllTipos();




}
