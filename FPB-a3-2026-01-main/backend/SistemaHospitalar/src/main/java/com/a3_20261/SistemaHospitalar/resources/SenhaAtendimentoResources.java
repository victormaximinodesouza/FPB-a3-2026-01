package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.entities.SalaCirurgica;
import com.a3_20261.SistemaHospitalar.entities.SenhaAtendimento;
import com.a3_20261.SistemaHospitalar.services.SenhaAtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/senha")
public class SenhaAtendimentoResources {

    @Autowired
    private SenhaAtendimentoService senhaAtendimentoService;

    @PostMapping
    public SenhaAtendimento adicionar(@RequestBody SenhaAtendimento senhaAtendimento) {
        return senhaAtendimentoService.adicionar(senhaAtendimento);
    }

    @GetMapping
    public List<SenhaAtendimento> listar() {
        return senhaAtendimentoService.listarFila();
    }
    // Chamar próximo
    @DeleteMapping("/proximo")
    public SenhaAtendimento chamarProximo() {
        return senhaAtendimentoService.chamarProximo();
    }


}