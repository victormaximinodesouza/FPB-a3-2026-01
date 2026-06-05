package com.a3_20261.SistemaHospitalar.Repository;


import com.a3_20261.SistemaHospitalar.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);
}
