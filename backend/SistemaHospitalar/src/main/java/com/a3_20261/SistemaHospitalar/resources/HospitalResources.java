package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.entities.Hospital;
import com.a3_20261.SistemaHospitalar.entities.Medico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/hospitais")
public class HospitalResources {

    @GetMapping
    public ResponseEntity<Hospital> findAll(){
        Hospital H = new Hospital(1 ,"Sao vicente",2050,"Rua da republica");
                return ResponseEntity.ok().body(H);

    }
}
