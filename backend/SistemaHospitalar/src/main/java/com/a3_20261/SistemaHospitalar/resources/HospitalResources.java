package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.entities.Hospital;
import com.a3_20261.SistemaHospitalar.entities.Medico;
import com.a3_20261.SistemaHospitalar.entities.User;
import com.a3_20261.SistemaHospitalar.services.HospitalSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value ="/hospitais")
public class HospitalResources {

    @Autowired
    private HospitalSevice hospitalSevice;

    @GetMapping
    public ResponseEntity <List<Hospital>>findAll(){
        List<Hospital> list = hospitalSevice.findAll();

                return ResponseEntity.ok().body(list);

    }
}
