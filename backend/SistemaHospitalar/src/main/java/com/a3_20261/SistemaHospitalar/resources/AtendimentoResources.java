package com.a3_20261.SistemaHospitalar.resources;


import com.a3_20261.SistemaHospitalar.entities.Atendimento;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/atendimentos")
public class AtendimentoResources {

    @GetMapping
    public ResponseEntity<Atendimento> findAll(){
        Atendimento AT = new Atendimento(1,"CLiente doente",null);
                return ResponseEntity.ok().body(AT);

    }
}
