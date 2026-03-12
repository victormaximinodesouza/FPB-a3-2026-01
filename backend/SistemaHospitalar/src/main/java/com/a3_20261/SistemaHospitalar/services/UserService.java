package com.a3_20261.SistemaHospitalar.services;

import com.a3_20261.SistemaHospitalar.Repository.UserRepository;
import com.a3_20261.SistemaHospitalar.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {



        @Autowired
        private UserRepository repository;

        public List<User> findAll(){
            return repository.findAll();
        }
}
