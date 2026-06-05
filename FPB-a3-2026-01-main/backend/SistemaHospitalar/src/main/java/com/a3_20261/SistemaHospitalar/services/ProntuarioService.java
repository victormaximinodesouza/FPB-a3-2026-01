package com.a3_20261.SistemaHospitalar.services;

import com.a3_20261.SistemaHospitalar.Repository.AgendamentoRepository;
import com.a3_20261.SistemaHospitalar.Repository.ProntuarioRepository;
import com.a3_20261.SistemaHospitalar.entities.Agendamento;
import com.a3_20261.SistemaHospitalar.entities.Prontuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProntuarioService {
    @Autowired
    private ProntuarioRepository prontuarioRepository;

    @GetMapping
    public List<Prontuario> findAll() {
        return prontuarioRepository.findAll();
    }

}

