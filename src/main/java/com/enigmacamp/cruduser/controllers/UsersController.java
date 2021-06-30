package com.enigmacamp.cruduser.controllers;

import com.enigmacamp.cruduser.entities.Users;
import com.enigmacamp.cruduser.repositories.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping()
    public List<Users> findAll(){
        return usersRepository.findAll();
    }

    @PostMapping()
    public Users create(@RequestBody() Users users){
        return usersRepository.save(users);
    }

}
