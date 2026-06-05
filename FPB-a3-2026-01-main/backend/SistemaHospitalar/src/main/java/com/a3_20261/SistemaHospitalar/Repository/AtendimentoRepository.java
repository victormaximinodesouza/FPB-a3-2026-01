package com.a3_20261.SistemaHospitalar.Repository;

import com.a3_20261.SistemaHospitalar.Enum.AtendimentoStatus;
import com.a3_20261.SistemaHospitalar.entities.Atendimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendimentoRepository extends JpaRepository<Atendimento,Integer> {

    long countByAtendimentoStatus(AtendimentoStatus status);
}
