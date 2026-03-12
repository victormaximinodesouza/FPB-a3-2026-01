package com.a3_20261.SistemaHospitalar.services;

import com.a3_20261.SistemaHospitalar.Repository.AgendamentoRepository;
import com.a3_20261.SistemaHospitalar.Repository.CirurgiasRepository;
import com.a3_20261.SistemaHospitalar.entities.Agendamento;
import com.a3_20261.SistemaHospitalar.entities.Cirurgias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CirurgiasService {
    @Autowired
    private CirurgiasRepository cirurgiasRepository;

    @GetMapping
    public List<Cirurgias> findAll() {
        return cirurgiasRepository.findAll();
    }

}

