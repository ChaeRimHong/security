package com.example.security.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security.persistence.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findQneById(Long id);
}