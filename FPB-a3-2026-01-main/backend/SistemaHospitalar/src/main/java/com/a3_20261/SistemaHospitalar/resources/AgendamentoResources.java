package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.entities.Agendamento;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/agendamentos")
public class AgendamentoResources {

    @GetMapping
    public ResponseEntity<Agendamento> findAll(){
        Agendamento A = new Agendamento();
                return ResponseEntity.ok().body(A);

    }
}
