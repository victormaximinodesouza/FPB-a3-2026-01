package com.a3_20261.SistemaHospitalar.services;

import com.a3_20261.SistemaHospitalar.Repository.AgendamentoRepository;
import com.a3_20261.SistemaHospitalar.Repository.ConsultaRepository;
import com.a3_20261.SistemaHospitalar.entities.Agendamento;
import com.a3_20261.SistemaHospitalar.entities.Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository consultaRepository;

    @GetMapping
    public List<Consulta> findAll() {
        return consultaRepository.findAll();
    }

}

