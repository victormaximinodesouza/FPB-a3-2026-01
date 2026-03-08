package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.entities.Hospital;
import com.a3_20261.SistemaHospitalar.entities.Prontuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/prontuarios")
public class ProntuarioResources {

    @GetMapping
    public ResponseEntity<Prontuario> findAll(){
        Prontuario P = new Prontuario(1 ,null,"Cidadao bem");
                return ResponseEntity.ok().body(P);

    }
}
