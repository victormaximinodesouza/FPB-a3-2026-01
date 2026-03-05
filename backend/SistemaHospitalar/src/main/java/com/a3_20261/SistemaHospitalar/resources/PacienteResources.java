package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.entities.Paciente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value ="/pacientes")
public class PacienteResources {

    @GetMapping
    public ResponseEntity<Paciente> findAll(){
        Paciente p = new Paciente(1,"maria",158558509,null,"rua maria sant","20","maria@gmail.com");
                return ResponseEntity.ok().body(p);

    }
}
