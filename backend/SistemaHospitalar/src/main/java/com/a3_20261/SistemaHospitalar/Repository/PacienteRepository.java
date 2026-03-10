package com.a3_20261.SistemaHospitalar.Repository;


import com.a3_20261.SistemaHospitalar.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente,Integer> {
}
