package com.a3_20261.SistemaHospitalar.services;

import com.a3_20261.SistemaHospitalar.Repository.HospitalRepository;
import com.a3_20261.SistemaHospitalar.entities.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class HospitalSevice {
    @Autowired
    private HospitalRepository hospitalRepository;

    @GetMapping
    public List<Hospital> findAll() {
        return hospitalRepository.findAll();
    }

}

