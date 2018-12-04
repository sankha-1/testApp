package com.ilending.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ilending.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
