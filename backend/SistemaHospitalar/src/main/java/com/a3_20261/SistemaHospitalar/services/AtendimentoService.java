package com.a3_20261.SistemaHospitalar.services;

import com.a3_20261.SistemaHospitalar.Repository.AgendamentoRepository;
import com.a3_20261.SistemaHospitalar.Repository.AtendimentoRepository;
import com.a3_20261.SistemaHospitalar.entities.Agendamento;
import com.a3_20261.SistemaHospitalar.entities.Atendimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class AtendimentoService {
    @Autowired
    private AtendimentoRepository atendimentoRepository;

    @GetMapping
    public List<Atendimento> findAll() {
        return atendimentoRepository.findAll();
    }

}

