package com.a3_20261.SistemaHospitalar.resources;

import com.a3_20261.SistemaHospitalar.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/users")

public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1,"maria",158558509,null,"rua maria sant","20","maria@gmail.com");
                return ResponseEntity.ok().body(user);

    }
}
