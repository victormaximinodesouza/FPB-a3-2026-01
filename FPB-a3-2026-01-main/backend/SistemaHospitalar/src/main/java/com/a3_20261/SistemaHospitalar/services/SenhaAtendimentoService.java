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

    public List<SenhaAtendimento> listarFila() {
        return senhaAtendimentoRepository.findAllByOrderByIdAsc();
    }

    public SenhaAtendimento adicionar(SenhaAtendimento senha) {
        return senhaAtendimentoRepository.save(senha);
    }

    public SenhaAtendimento chamarProximo() {
        List<SenhaAtendimento> fila = listarFila();
        if (fila.isEmpty()) {
            return null;
        }
        SenhaAtendimento proximo = fila.get(0);
        senhaAtendimentoRepository.delete(proximo);
        return proximo;
    }
}


