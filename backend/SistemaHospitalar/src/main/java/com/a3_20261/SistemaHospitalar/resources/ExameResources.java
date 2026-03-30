package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.DTO.ExameDTO;
import com.a3_20261.SistemaHospitalar.Repository.ExameRepository;
import com.a3_20261.SistemaHospitalar.entities.Agendamento;
import com.a3_20261.SistemaHospitalar.entities.Exame;
import com.a3_20261.SistemaHospitalar.services.ExameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/exames")
public class ExameResources {

    @Autowired
    private ExameService exameService;

    @GetMapping
public List<ExameDTO> findAll(){
        List<Exame> list = exameService.findAll();

        return list.stream().map(ExameDTO::new).toList();
    }
}
