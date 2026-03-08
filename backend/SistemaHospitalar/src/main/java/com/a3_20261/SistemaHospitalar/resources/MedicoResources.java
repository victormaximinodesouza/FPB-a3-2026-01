package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.entities.Medico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/medicos")
public class MedicoResources {

    @GetMapping
    public ResponseEntity<Medico> findAll(){
        Medico M = new Medico(1 ,"Davi",2050,"Cirurgiao",839815732);
                return ResponseEntity.ok().body(M);

    }
}
