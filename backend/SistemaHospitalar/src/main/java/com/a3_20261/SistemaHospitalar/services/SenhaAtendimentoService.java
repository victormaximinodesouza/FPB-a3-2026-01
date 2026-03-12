package com.a3_20261.SistemaHospitalar.services;

import com.a3_20261.SistemaHospitalar.Repository.SalaCirurgicaRepository;
import com.a3_20261.SistemaHospitalar.Repository.SenhaAtendimentoRepository;
import com.a3_20261.SistemaHospitalar.entities.SalaCirurgica;
import com.a3_20261.SistemaHospitalar.entities.SenhaAtendimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class SenhaAtendimentoService {
    @Autowired
    private SenhaAtendimentoRepository senhaAtendimentoRepository;

    @GetMapping
    public List<SenhaAtendimento> findAll() {
        return senhaAtendimentoRepository.findAll();
    }

}

