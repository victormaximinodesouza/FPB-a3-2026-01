package com.a3_20261.SistemaHospitalar.Repository;

import com.a3_20261.SistemaHospitalar.Enum.TipoSanguineo;
import com.a3_20261.SistemaHospitalar.entities.Agendamento;
import com.a3_20261.SistemaHospitalar.entities.DoacaoSangue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoacaoSangueRepository extends JpaRepository<DoacaoSangue,Integer> {
    DoacaoSangue findByTipoSanguineo(TipoSanguineo tipoSanguineo);
}
