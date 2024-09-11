package com.santiagomorge.UserService.repository;


import com.santiagomorge.UserService.domain.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user, Long > {
}
