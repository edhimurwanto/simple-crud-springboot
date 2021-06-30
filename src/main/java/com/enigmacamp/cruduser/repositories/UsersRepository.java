package com.enigmacamp.cruduser.repositories;

import com.enigmacamp.cruduser.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
