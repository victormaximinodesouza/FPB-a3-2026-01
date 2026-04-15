package com.a3_20261.SistemaHospitalar.Repository;



import com.a3_20261.SistemaHospitalar.entities.Consulta;
import com.a3_20261.SistemaHospitalar.entities.Exame;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface ExameRepository extends JpaRepository<Exame,Integer> {


    long countByDate_request(Date data);
    List<Exame> findByDate_request(Date data);


    long countByDate_requestBetween(Date inicio, Date fim);

    List<Exame> findByDate_requestBetween(Date inicio, Date fim);
}
