package com.dallaproracing.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dallaproracing.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
