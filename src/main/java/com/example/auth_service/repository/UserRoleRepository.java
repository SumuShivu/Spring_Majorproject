package com.example.auth_service.repository;



import com.example.auth_service.entity.User;
import com.example.auth_service.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    List<UserRole> findByUser(User user);
}

