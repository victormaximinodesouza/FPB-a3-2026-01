package com.a3_20261.SistemaHospitalar.services;

import com.a3_20261.SistemaHospitalar.DTO.LoginDTO;
import com.a3_20261.SistemaHospitalar.Repository.UserRepository;
import com.a3_20261.SistemaHospitalar.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired
    private JWTService jwtService;


    public List<User> findAll() {
        return repository.findAll();
    }

    public long totalPacientes() {
        return repository.count();
    }

    public User insert(@RequestBody User user) {

        user.setSenha(encoder.encode(user.getSenha()));

        return repository.save(user);
    }
    public String login(LoginDTO loginDTO) {

        System.out.println(loginDTO.getEmail());
        System.out.println(loginDTO.getSenha());

        User user = repository.findByEmail(loginDTO.getEmail())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        System.out.println(user.getSenha());

        if (!encoder.matches(loginDTO.getSenha(), user.getSenha())) {
            throw new RuntimeException("Senha inválida");
        }

        return jwtService.gerarToken(user.getEmail());
    }
}