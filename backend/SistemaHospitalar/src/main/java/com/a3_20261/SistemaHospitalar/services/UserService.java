package com.a3_20261.SistemaHospitalar.services;

import com.a3_20261.SistemaHospitalar.Repository.UserRepository;
import com.a3_20261.SistemaHospitalar.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

        @Autowired
        private UserRepository repository;

        public List<User> findAll(){
            return repository.findAll();
        }

    public long totalPacientes() {
        return repository.count();
    }

    public User insert(@RequestBody User user) {
            return repository.save(user);
    }
}
