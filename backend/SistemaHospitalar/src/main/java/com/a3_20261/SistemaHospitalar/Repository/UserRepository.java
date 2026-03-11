package com.a3_20261.SistemaHospitalar.Repository;


import com.a3_20261.SistemaHospitalar.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
