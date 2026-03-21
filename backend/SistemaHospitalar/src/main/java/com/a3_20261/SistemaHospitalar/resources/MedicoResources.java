package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.DTO.MedicoDTO;
import com.a3_20261.SistemaHospitalar.entities.Medico;
import com.a3_20261.SistemaHospitalar.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/medicos")
public class MedicoResources {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public List<MedicoDTO> findAll(){
        List<Medico> list = medicoService.findAll();

                return list.stream().map(MedicoDTO::new).toList();

    }
}
