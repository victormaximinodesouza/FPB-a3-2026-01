package com.a3_20261.SistemaHospitalar.services;

import com.a3_20261.SistemaHospitalar.Enum.TipoSanguineo;
import com.a3_20261.SistemaHospitalar.Repository.DoacaoSangueRepository;
import com.a3_20261.SistemaHospitalar.entities.DoacaoSangue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoacaoSangueService {

    @Autowired
    private DoacaoSangueRepository doacaoSangueRepository;


    public List<DoacaoSangue> findAll() {

        return doacaoSangueRepository.findAll();
    }


    public DoacaoSangue adicionarBolsa(TipoSanguineo tipo, Integer quantidade){

        DoacaoSangue estoque =
                doacaoSangueRepository.findByTipoSanguineo(tipo);

        if(estoque == null){
            estoque = new DoacaoSangue();
            estoque.setTipoSanguineo(tipo);
            estoque.setQuantidadeBolsas(0);
        }
        estoque.setQuantidadeBolsas(
                estoque.getQuantidadeBolsas() + quantidade
        );
        return doacaoSangueRepository.save(estoque);
    }
    public Integer quantidadeTotal(){

        List<DoacaoSangue> lista = doacaoSangueRepository.findAll();

        Integer total = 0;

        for(DoacaoSangue d : lista){

            total += d.getQuantidadeBolsas();
        }

        return total;
    }
}