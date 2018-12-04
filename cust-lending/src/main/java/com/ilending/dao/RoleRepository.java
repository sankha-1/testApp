package com.ilending.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ilending.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
