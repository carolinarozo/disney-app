package com.alkemy.disney.disney.controller;

import com.alkemy.disney.disney.dto.TipoDTO;
import com.alkemy.disney.disney.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tipo")

public class TipoController {

    @Autowired
    private TipoService tipoService;

    @GetMapping
    public ResponseEntity<List<TipoDTO>> getAll(){
        List<TipoDTO> tipos=this.tipoService.getAllTipos();
        return ResponseEntity.ok().body(tipos);
    }


    @PostMapping
    public ResponseEntity<TipoDTO> save(@RequestBody TipoDTO tipo){
        // save
        //201, continente guardado

        TipoDTO tipoGuardado= tipoService.save(tipo);
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoGuardado);

    }
}
