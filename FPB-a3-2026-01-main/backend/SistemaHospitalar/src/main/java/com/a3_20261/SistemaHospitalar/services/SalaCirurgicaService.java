package com.a3_20261.SistemaHospitalar.services;

import com.a3_20261.SistemaHospitalar.Repository.AgendamentoRepository;
import com.a3_20261.SistemaHospitalar.Repository.SalaCirurgicaRepository;
import com.a3_20261.SistemaHospitalar.entities.Agendamento;
import com.a3_20261.SistemaHospitalar.entities.SalaCirurgica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class SalaCirurgicaService {
    @Autowired
    private SalaCirurgicaRepository salaCirurgicaRepository;

    @GetMapping
    public List<SalaCirurgica> findAll() {
        return salaCirurgicaRepository.findAll();
    }

}

