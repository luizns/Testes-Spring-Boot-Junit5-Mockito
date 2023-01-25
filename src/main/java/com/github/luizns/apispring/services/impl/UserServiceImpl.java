package com.github.luizns.apispring.services.impl;

import com.github.luizns.apispring.domain.User;
import com.github.luizns.apispring.repositories.UserRepository;
import com.github.luizns.apispring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }


}
