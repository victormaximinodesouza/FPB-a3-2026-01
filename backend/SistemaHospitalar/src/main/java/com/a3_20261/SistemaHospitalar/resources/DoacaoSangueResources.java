package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.Enum.TipoSanguineo;
import com.a3_20261.SistemaHospitalar.entities.DoacaoSangue;
import com.a3_20261.SistemaHospitalar.services.DoacaoSangueService;
import com.a3_20261.SistemaHospitalar.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/doacaoSangue")
public class DoacaoSangueResources {
   @Autowired
    private DoacaoSangueService doacaoSangueService;

   @GetMapping
    public List<DoacaoSangue> findAll() {
       List<DoacaoSangue> list = doacaoSangueService.findAll();
       return list;
   }
    @PostMapping
    public DoacaoSangue adicionar(
            @RequestParam TipoSanguineo tipo,
            @RequestParam Integer quantidade){

        return doacaoSangueService.adicionarBolsa(tipo, quantidade);
    }


}
