package com.me.videorental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.videorental.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);

}
