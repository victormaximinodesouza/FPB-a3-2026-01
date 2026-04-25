package com.a3_20261.SistemaHospitalar.resources;


import com.a3_20261.SistemaHospitalar.DTO.ExameDTO;
import com.a3_20261.SistemaHospitalar.Enum.AtendimentoStatus;
import com.a3_20261.SistemaHospitalar.entities.Atendimento;
import com.a3_20261.SistemaHospitalar.services.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping(value ="/atendimentos")
public class AtendimentoResources {

    @Autowired
    private AtendimentoService atendimentoService;

    @GetMapping
    public ResponseEntity<List<Atendimento>> findAll() {
        List<Atendimento> list= atendimentoService.findAll();

        return ResponseEntity.ok(list);
    }
    @GetMapping("/por-status")

    public ResponseEntity<Long> totalAtendimentos(@RequestParam AtendimentoStatus status) {
        long total = atendimentoService.totalPorStatus(status);
        return ResponseEntity.ok(total);
    }


    }

