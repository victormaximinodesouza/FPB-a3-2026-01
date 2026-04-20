package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.entities.Medico;
import com.a3_20261.SistemaHospitalar.entities.SalaCirurgica;
import com.a3_20261.SistemaHospitalar.services.SalaCirurgicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/sala")
public class SalaCirurgicaResources {

    @Autowired
    private SalaCirurgicaService salaCirurgicaService;

    @GetMapping
    public List<SalaCirurgica> getSalaCirurgica(){
        List<SalaCirurgica> list = salaCirurgicaService.findAll();
        return list;
    }
}
