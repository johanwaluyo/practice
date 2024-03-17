package com.johanwaluyo.java.practice.repos;

import com.johanwaluyo.java.practice.domain.User;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, UUID> {
}
