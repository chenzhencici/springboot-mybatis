package com.example.demo.review.user;

import com.example.demo.review.entity.User;

import java.util.List;

public interface UserService {

    String SERVICE_NAME = "userService";

    List<User> findAll();

    List<User> getAll();

}
