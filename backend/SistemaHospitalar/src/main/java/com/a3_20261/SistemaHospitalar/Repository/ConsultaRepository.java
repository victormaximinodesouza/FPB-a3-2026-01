package com.a3_20261.SistemaHospitalar.Repository;


import com.a3_20261.SistemaHospitalar.entities.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface ConsultaRepository extends JpaRepository<Consulta,Integer> {
    long countByData(LocalDate data);
}
