package com.auth.Authentication.repository;

import com.auth.Authentication.entity.User;
import com.auth.Authentication.service.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<UserDetails> findUserByUsername(String username);
}
