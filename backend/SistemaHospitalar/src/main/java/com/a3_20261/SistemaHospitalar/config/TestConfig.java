package com.a3_20261.SistemaHospitalar.config;

import com.a3_20261.SistemaHospitalar.Repository.AtendimentoRepository;
import com.a3_20261.SistemaHospitalar.Repository.MedicoRepository;
import com.a3_20261.SistemaHospitalar.entities.Atendimento;
import com.a3_20261.SistemaHospitalar.entities.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private AtendimentoRepository atendimentoRepository;

    @Override
    public void run(String... args) throws Exception {

        Medico m1 = new Medico(null, "joao", 3232, "cabeca", 922992922);
        Medico m2 = new Medico(null, "maria", 32333, "pe", 992922);

        medicoRepository.saveAll(Arrays.asList(m1, m2));


        Atendimento a1 = new Atendimento(null, "Prioridade", null);
        Atendimento a2 = new Atendimento(null, "Prioridade", null);

        atendimentoRepository.saveAll(Arrays.asList(a1, a2));
    }




    }






