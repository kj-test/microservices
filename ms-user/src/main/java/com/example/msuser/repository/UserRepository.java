package com.example.msuser.repository;

import com.example.msuser.entity.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {



}