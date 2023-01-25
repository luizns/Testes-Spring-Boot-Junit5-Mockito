package com.github.luizns.apispring.services.impl;

import com.github.luizns.apispring.domain.User;
import com.github.luizns.apispring.repositories.UserRepository;
import com.github.luizns.apispring.services.UserService;
import com.github.luizns.apispring.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Long id) {
        return this.repository
                .findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado"));
    }


}
