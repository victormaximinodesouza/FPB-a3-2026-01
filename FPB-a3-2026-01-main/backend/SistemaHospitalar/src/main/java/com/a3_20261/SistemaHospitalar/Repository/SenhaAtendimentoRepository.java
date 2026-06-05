package com.a3_20261.SistemaHospitalar.Repository;

import com.a3_20261.SistemaHospitalar.entities.SenhaAtendimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SenhaAtendimentoRepository extends JpaRepository<SenhaAtendimento,Integer> {
    List<SenhaAtendimento> findAllByOrderByIdAsc();
}
