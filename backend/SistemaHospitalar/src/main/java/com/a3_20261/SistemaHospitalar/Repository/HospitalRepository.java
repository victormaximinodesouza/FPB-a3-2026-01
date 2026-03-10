package com.a3_20261.SistemaHospitalar.Repository;

import com.a3_20261.SistemaHospitalar.entities.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital,Integer> {
}
