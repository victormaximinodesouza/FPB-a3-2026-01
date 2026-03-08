package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.entities.Medico;
import com.a3_20261.SistemaHospitalar.entities.SalaCirurgica;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/sala")
public class SalaCirurgicaResources {

    @GetMapping
    public ResponseEntity<SalaCirurgica> findAll(){
        SalaCirurgica S = new SalaCirurgica(1 ,2050);
                return ResponseEntity.ok().body(S);

    }
}
