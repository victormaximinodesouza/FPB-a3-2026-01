package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.Repository.ConsultaRepository;
import com.a3_20261.SistemaHospitalar.entities.Agendamento;
import com.a3_20261.SistemaHospitalar.entities.Consulta;
import com.a3_20261.SistemaHospitalar.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value ="/consultas")
public class ConsultaResources {

    @Autowired
    private ConsultaService consultaService;
    @Autowired
    private ConsultaRepository consultaRepository;

    @GetMapping
    public ResponseEntity<List<Consulta>> findAll(){
        List<Consulta> consultas = consultaRepository.findAll();
                return ResponseEntity.ok().body(consultas);

    }
    @GetMapping("/por-dia")
    public ResponseEntity<Long> totalPorDia(@RequestParam String data) {

        LocalDate dataFormatada = LocalDate.parse(data);

        long total = consultaService.totalConsultasPorDia(dataFormatada);

        return ResponseEntity.ok(total);
    }
}
