package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.entities.Cirurgia;
import com.a3_20261.SistemaHospitalar.services.CirurgiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/cirurgias")
public class CirurgiasResources {

    @Autowired
    private CirurgiasService cirurgiasService;
    @GetMapping
    public ResponseEntity <List<Cirurgia>> findAll(){
        List<Cirurgia> list= cirurgiasService.findAll();

                return ResponseEntity.ok().body(list);

    }
}
