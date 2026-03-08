package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.entities.SalaCirurgica;
import com.a3_20261.SistemaHospitalar.entities.SenhaAtendimento;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/senha")
public class SenhaAtendimentoResources {

    @GetMapping
    public ResponseEntity<SenhaAtendimento> findAll(){
        SenhaAtendimento SE = new SenhaAtendimento();
                return ResponseEntity.ok().body(SE);

    }
}
