package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.DTO.UserDTO;
import com.a3_20261.SistemaHospitalar.Repository.UserRepository;
import com.a3_20261.SistemaHospitalar.entities.Prontuario;
import com.a3_20261.SistemaHospitalar.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/users")

public class UserResources {
    @Autowired
     private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> list = userRepository.findAll();
        List<UserDTO> dto = list.stream().map(UserDTO::new).toList();
        return ResponseEntity.ok(dto);
    }
    }

