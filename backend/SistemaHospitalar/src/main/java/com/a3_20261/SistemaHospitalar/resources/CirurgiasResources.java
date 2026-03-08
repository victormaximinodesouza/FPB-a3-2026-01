package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.entities.Agendamento;
import com.a3_20261.SistemaHospitalar.entities.Cirurgias;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/cirurgias")
public class CirurgiasResources {

    @GetMapping
    public ResponseEntity<Cirurgias> findAll(){
        Cirurgias C = new Cirurgias(1,null,"operação no menisco");
                return ResponseEntity.ok().body(C);

    }
}
