package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.entities.Agendamento;
import com.a3_20261.SistemaHospitalar.entities.Exame;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/exames")
public class ExameResources {

    @GetMapping
    public ResponseEntity<Exame> findAll(){
        Exame E = new Exame(1,null,null);
                return ResponseEntity.ok().body(E);

    }
}
