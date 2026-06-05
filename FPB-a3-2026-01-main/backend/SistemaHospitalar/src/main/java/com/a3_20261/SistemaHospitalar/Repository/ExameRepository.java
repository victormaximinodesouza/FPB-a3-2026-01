package com.a3_20261.SistemaHospitalar.Repository;

import com.a3_20261.SistemaHospitalar.Enum.ExameStatus;
import com.a3_20261.SistemaHospitalar.entities.Exame;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ExameRepository extends JpaRepository<Exame, Integer> {

    long countByDateRequest(Date data);

    List<Exame> findByDateRequest(Date dateRequest);

    long countByDateRequestBetween(Date inicio, Date fim);

    List<Exame> findByDateRequestBetween(Date inicio, Date fim);

    long countByExameStatus(ExameStatus status);
}