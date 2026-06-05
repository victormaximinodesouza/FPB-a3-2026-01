package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.DTO.ProntuarioDTO;
import com.a3_20261.SistemaHospitalar.Repository.ProntuarioRepository;
import com.a3_20261.SistemaHospitalar.entities.Hospital;
import com.a3_20261.SistemaHospitalar.entities.Prontuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value ="/prontuarios")
public class ProntuarioResources {

    @Autowired
    private ProntuarioRepository prontuarioRepository;


    @GetMapping
    public ResponseEntity<List<ProntuarioDTO>> findAll() {
        List<Prontuario> list = prontuarioRepository.findAll();
        List<ProntuarioDTO> dto = list.stream().map(ProntuarioDTO::new).toList();
        return ResponseEntity.ok(dto);
    }
    }

