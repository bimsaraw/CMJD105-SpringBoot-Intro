package com.ijse.hellospring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.hellospring.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //Custom queries can be added here
    Optional<User> findByUsername(String username);
}
