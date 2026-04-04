package com.a3_20261.SistemaHospitalar.config;

import com.a3_20261.SistemaHospitalar.Repository.*;
import com.a3_20261.SistemaHospitalar.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private MedicoRepository medicoRepository;
    @Autowired
    private AtendimentoRepository atendimentoRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CirurgiasRepository cirurgiasRepository;
    @Autowired
    private ConsultaRepository consultaRepository;
    @Autowired
    private ExameRepository exameRepository;
    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private ProntuarioRepository prontuarioRepository;
    @Autowired
    private SalaCirurgicaRepository salaCirurgicaRepository;
    @Autowired
    private SenhaAtendimentoRepository senhaAtendimentoRepository;
    @Autowired
    private AgendamentoRepository agendamentoRepository;


    @Override
    public void run(String... args) throws Exception {

        Cirurgia c1 = new Cirurgia(null,null,"feito com sucesso",new ArrayList<>());
        Cirurgia c2 = new Cirurgia(null,null,"deu errado",new ArrayList<>());

        Medico m1 = new Medico(null, "joao", 3232, "cabeca", 922992922,new ArrayList<>());
        Medico m2 = new Medico(null, "maria", 32333, "pe", 992922,new ArrayList<>());


        m1.getCirurgia().add(c2);
        m2.getCirurgia().add(c1);


        c2.getMedicos().add(m1);
        c1.getMedicos().add(m2);

        cirurgiasRepository.saveAll(Arrays.asList(c1,c2));
        medicoRepository.saveAll(Arrays.asList(m1,m2));


        Atendimento a1 = new Atendimento(null, "Prioridade", null);
        Atendimento a2 = new Atendimento(null, "Prioridade", null);

        atendimentoRepository.saveAll(Arrays.asList(a1, a2));


        Consulta cs1 = new Consulta(null,null,LocalDate.now(),"dor de barriga");
        Consulta cs2 = new Consulta(null,null, LocalDate.now(),"dor de dente");

        consultaRepository.saveAll(Arrays.asList(cs1,cs2));

        Exame e1 = new Exame(null,null,null,null);
        Exame e2 = new Exame(null,null,null,null);

        exameRepository.saveAll(Arrays.asList(e1,e2));


        SalaCirurgica s1 =new SalaCirurgica(null,20);
        SalaCirurgica s2 =new SalaCirurgica(null,30);

        salaCirurgicaRepository.saveAll(Arrays.asList(s1,s2));

        User u1 =new User(null,"adm1",1111111111,null,"rua da macaxeira","adm1@gmail.com","2",null,new ArrayList<>());
        User u2 =new User(null,"adm2",111113311,null,"rua da severina","adm2@gmail.com","3",null,new ArrayList<>());

        userRepository.saveAll(Arrays.asList(u1,u2));


        Prontuario p1 =new Prontuario(null,null,"cleinte bem",u1);
        Prontuario p2 =new Prontuario(null,null,"cleinte mal",u2);

        prontuarioRepository.saveAll(Arrays.asList(p1,p2));

        Hospital h1 = new Hospital(null, "Sao vicente", 20, "rua da igreja", Arrays.asList(u1),Arrays.asList(m1));
        Hospital h2 = new Hospital(null, "Metropolitado", 30, "rua de cima", Arrays.asList(u2),Arrays.asList(m2));

        hospitalRepository.saveAll(Arrays.asList(h1,h2));

        SenhaAtendimento se1 =new SenhaAtendimento("20",null);
        SenhaAtendimento se2 =new SenhaAtendimento("30",null);

        senhaAtendimentoRepository.saveAll(Arrays.asList(se1,se2));

        Agendamento ag1 = new Agendamento(null,null);
        Agendamento ag2 = new Agendamento(null,null);

        agendamentoRepository.saveAll(Arrays.asList(ag1,ag2));



    }




    }






