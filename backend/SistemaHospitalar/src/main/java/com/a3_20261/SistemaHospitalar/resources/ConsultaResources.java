package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.entities.Agendamento;
import com.a3_20261.SistemaHospitalar.entities.Consulta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/consultas")
public class ConsultaResources {

    @GetMapping
    public ResponseEntity<Consulta> findAll(){
        Consulta CO = new Consulta(1,"cliente com gripe");
                return ResponseEntity.ok().body(CO);

    }
}
