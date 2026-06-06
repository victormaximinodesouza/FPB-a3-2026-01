package com.a3_20261.SistemaHospitalar.config;

import com.a3_20261.SistemaHospitalar.Enum.*;
import com.a3_20261.SistemaHospitalar.Repository.*;
import com.a3_20261.SistemaHospitalar.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

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
    @Autowired
    private BCryptPasswordEncoder encoder;


    @Override
    public void run(String... args) throws Exception {

        Cirurgia c1 = new Cirurgia(null,"Ponte de Safena",2,new Date(),"feito com sucesso", StatusCirurgia.AGENDADA,new ArrayList<>(),null);
        Cirurgia c2 = new Cirurgia(null,"Joelho",3,new Date(),"deu errado",null,new ArrayList<>(),null);
        Cirurgia c3 = new Cirurgia(null,"Apendicite",1,new Date(),"sucesso", StatusCirurgia.AGENDADA,new ArrayList<>(),null);
        Cirurgia c4 = new Cirurgia(null,"Hérnia",2,new Date(),"em observação", StatusCirurgia.REALIZADA,new ArrayList<>(),null);
        Cirurgia c5 = new Cirurgia(null,"Catarata",1,new Date(),"sem complicações", StatusCirurgia.AGENDADA,new ArrayList<>(),null);
        Cirurgia c6 = new Cirurgia(null,"Vesícula",3,new Date(),"cirurgia concluída", StatusCirurgia.CANCELADA,new ArrayList<>(),null);

        Medico m1 = new Medico(null, "joao", 3232, null, 922992922,new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        Medico m2 = new Medico(null, "maria", 32333, null, 992922,new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        Medico m3 = new Medico(null, "Carlos", 5555, null, 999111111,new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        Medico m4 = new Medico(null, "Ana", 6666, null, 999222222,new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        Medico m5 = new Medico(null, "Pedro", 7777, null, 999333333,new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        Medico m6 = new Medico(null, "Juliana", 8888, null, 999444444,new ArrayList<>(),new ArrayList<>(),new ArrayList<>());

        m1.getCirurgia().add(c2);
        m2.getCirurgia().add(c1);
        m3.getCirurgia().add(c3);
        m4.getCirurgia().add(c4);
        m5.getCirurgia().add(c5);
        m6.getCirurgia().add(c6);

        c2.getMedicos().add(m1);
        c1.getMedicos().add(m2);
        c3.getMedicos().add(m3);
        c4.getMedicos().add(m4);
        c5.getMedicos().add(m5);
        c6.getMedicos().add(m6);

        cirurgiasRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6));
        medicoRepository.saveAll(Arrays.asList(m1,m2,m3,m4,m5,m6));

        SalaCirurgica s1 =new SalaCirurgica(null,20, StatusSalaCirurgica.LIVRE,Arrays.asList(c1));
        SalaCirurgica s2 =new SalaCirurgica(null,30,StatusSalaCirurgica.MANUNTENCAO,Arrays.asList(c2));
        SalaCirurgica s3 = new SalaCirurgica(null,40,StatusSalaCirurgica.LIVRE,Arrays.asList(c3));
        SalaCirurgica s4 = new SalaCirurgica(null,50,StatusSalaCirurgica.OCUPADA,Arrays.asList(c4));
        SalaCirurgica s5 = new SalaCirurgica(null,60,StatusSalaCirurgica.LIVRE,Arrays.asList(c5));
        SalaCirurgica s6 = new SalaCirurgica(null,70,StatusSalaCirurgica.MANUNTENCAO,Arrays.asList(c6));

        salaCirurgicaRepository.saveAll(Arrays.asList(s1,s2,s3,s4,s5,s6));

        User u1 =new User(null,"adm1",1111111111,null,"rua da macaxeira","adm1@gmail.com", encoder.encode("2"),"2",null,new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        User u2 =new User(null,"davi",111113311,null,"rua da severina","adm2@gmail.com",encoder.encode("3"),"4",null,new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        User u3 = new User(null,"Jose",222222222,null,"Rua A","jose@gmail.com", encoder.encode("123"),"123",null,new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        User u4 = new User(null,"Mariana",333333333,null,"Rua B","mariana@gmail.com", encoder.encode("123"),"123",null,new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        User u5 = new User(null,"Paulo",444444444,null,"Rua C","paulo@gmail.com", encoder.encode("123"),"123",null,new ArrayList<>(),new ArrayList<>(),new ArrayList<>());
        User u6 = new User(null,"Fernanda",555555555,null,"Rua D","fernanda@gmail.com", encoder.encode("123"),"123",null,new ArrayList<>(),new ArrayList<>(),new ArrayList<>());

        userRepository.saveAll(Arrays.asList(u1,u2,u3,u4,u5,u6));

        Exame e1 = new Exame(null,null,null,u1,ExameTipo.ELETROCARDIOGRAMA,m1, ExameStatus.AGENDADO);
        Exame e2 = new Exame(null,null,null,u2,ExameTipo.RAIO_X,m2,ExameStatus.AGENDADO);
        Exame e3 = new Exame(null,null,null,u3,ExameTipo.Ressonancia_Magnetica,m3,ExameStatus.AGENDADO);
        Exame e4 = new Exame(null,null,null,u4,ExameTipo.RAIO_X,m4,ExameStatus.CONCLUIDO);
        Exame e5 = new Exame(null,null,null,u5,ExameTipo.HEMOGRAMA,m5,ExameStatus.AGENDADO);
        Exame e6 = new Exame(null,null,null,u6,ExameTipo.HEMOGRAMA,m6,ExameStatus.CONCLUIDO);

        exameRepository.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e6));

        Consulta cs1 = new Consulta(null,null,LocalDate.now(),"dor de barriga",u3);
        Consulta cs2 = new Consulta(null,null, LocalDate.now(),"dor de dente",u2);
        Consulta cs3 = new Consulta(null,null,LocalDate.now(),"febre",u3);
        Consulta cs4 = new Consulta(null,null,LocalDate.now(),"dor nas costas",u4);
        Consulta cs5 = new Consulta(null,null,LocalDate.now(),"enxaqueca",u5);
        Consulta cs6 = new Consulta(null,null,LocalDate.now(),"alergia",u6);

        cs1.setMedico(m1);
        cs2.setMedico(m2);
        cs3.setMedico(m3);
        cs4.setMedico(m4);
        cs5.setMedico(m5);
        cs6.setMedico(m6);
        consultaRepository.saveAll(Arrays.asList(cs1,cs2,cs3,cs4,cs5,cs6));

        Prontuario p1 =new Prontuario(null,null,"cleinte bem",u1);
        Prontuario p2 =new Prontuario(null,null,"cleinte mal",u2);
        Prontuario p3 = new Prontuario(null,null,"paciente estável",u3);
        Prontuario p4 = new Prontuario(null,null,"necessita exames",u4);
        Prontuario p5 = new Prontuario(null,null,"em recuperação",u5);
        Prontuario p6 = new Prontuario(null,null,"alta prevista",u6);

        prontuarioRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6));

        Hospital h1 = new Hospital(null, "Sao vicente", 20, "rua da igreja", Arrays.asList(u1),Arrays.asList(m1));
        Hospital h2 = new Hospital(null, "Metropolitado", 30, "rua de cima", Arrays.asList(u2),Arrays.asList(m2));
        Hospital h3 = new Hospital(null,"Santa Maria",40,"Rua Centro", Arrays.asList(u3),Arrays.asList(m3));
        Hospital h4 = new Hospital(null,"Hospital Regional",50,"Rua Principal", Arrays.asList(u4),Arrays.asList(m4));
        Hospital h5 = new Hospital(null,"Nossa Senhora",60,"Rua Nova", Arrays.asList(u5),Arrays.asList(m5));
        Hospital h6 = new Hospital(null,"Hospital Municipal",70,"Rua Sul", Arrays.asList(u6),Arrays.asList(m6));

        hospitalRepository.saveAll(Arrays.asList(h1,h2,h3,h4,h5,h6,h6));

        Atendimento a1 = new Atendimento(null,"cliente dolorido", "Prioridade", null, AtendimentoStatus.ANDAMENTO,u1);
        Atendimento a2 = new Atendimento(null,"cliente bem", "Prioridade", null,AtendimentoStatus.CONCLUIDO,u2);
        Atendimento a3 = new Atendimento(null,"paciente com febre","Normal", null,AtendimentoStatus.ANDAMENTO,u3);
        Atendimento a4 = new Atendimento(null,"paciente aguardando exame","Prioridade", null,AtendimentoStatus.CONCLUIDO,u4);
        Atendimento a5 = new Atendimento(null,"paciente com dor","Normal", null,AtendimentoStatus.ANDAMENTO,u5);
        Atendimento a6 = new Atendimento(null,"paciente em observação","Prioridade", null,AtendimentoStatus.CONCLUIDO,u6);

        atendimentoRepository.saveAll(Arrays.asList(a1, a2, a3,a4,a5,a6,a6));

        SenhaAtendimento se1 =new SenhaAtendimento(null,u1,StatusSenha.ESPERANDO);
        SenhaAtendimento se2 =new SenhaAtendimento(null,u2,StatusSenha.ESPERANDO);
        SenhaAtendimento se3 = new SenhaAtendimento(null,u3,StatusSenha.ESPERANDO);
        SenhaAtendimento se4 = new SenhaAtendimento(null,u4,StatusSenha.CHAMADO);
        SenhaAtendimento se5 = new SenhaAtendimento(null,u5,StatusSenha.ESPERANDO);
        SenhaAtendimento se6 = new SenhaAtendimento(null,u6,StatusSenha.CHAMADO);

        senhaAtendimentoRepository.saveAll(Arrays.asList(se1,se2,se3,se4,se5,se6,se6));

        Agendamento ag1 = new Agendamento(null,null);
        Agendamento ag2 = new Agendamento(null,null);
        Agendamento ag3 = new Agendamento(null,null);
        Agendamento ag4 = new Agendamento(null,null);
        Agendamento ag5 = new Agendamento(null,null);
        Agendamento ag6 = new Agendamento(null,null);

        agendamentoRepository.saveAll(Arrays.asList(ag1,ag2,ag3,ag4,ag5,ag6,ag6));



    }




    }






