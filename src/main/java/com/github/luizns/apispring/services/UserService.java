package com.github.luizns.apispring.services;

import com.github.luizns.apispring.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    List<User> findAll();
}
