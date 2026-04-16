package com.a3_20261.SistemaHospitalar.services;

import com.a3_20261.SistemaHospitalar.Enum.ExameStatus;
import com.a3_20261.SistemaHospitalar.Repository.AgendamentoRepository;
import com.a3_20261.SistemaHospitalar.Repository.ExameRepository;
import com.a3_20261.SistemaHospitalar.entities.Agendamento;
import com.a3_20261.SistemaHospitalar.entities.Exame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import static sun.security.util.KnownOIDs.Data;

@Service
public class ExameService {
    @Autowired
    private ExameRepository exameRepository;

    @GetMapping
    public List<Exame> findAll() {
        return exameRepository.findAll();
    }

    public long totalExamePorMes(int mes, int ano) {

        LocalDate inicioLocal = LocalDate.of(ano, mes, 1);
        LocalDate fimLocal = inicioLocal.withDayOfMonth(inicioLocal.lengthOfMonth());

        Date inicio = Date.from(inicioLocal.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date fim = Date.from(fimLocal.atTime(23,59,59)
                .atZone(ZoneId.systemDefault()).toInstant());

        return exameRepository.countByDateRequestBetween(inicio, fim);
    }
    public long totalPorStatus(ExameStatus status) {
        return exameRepository.countByExameStatus(status);
    }

}

