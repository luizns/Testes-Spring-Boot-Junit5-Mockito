package com.github.luizns.apispring.services;

import com.github.luizns.apispring.domain.User;
import com.github.luizns.apispring.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Long id);

    List<User> findAll();

    User create(UserDTO obj);

    User update(UserDTO obj);

    void delete(Long id);

}