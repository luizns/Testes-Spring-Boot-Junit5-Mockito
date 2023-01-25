package com.github.luizns.apispring.services;

import com.github.luizns.apispring.domain.User;

public interface UserService {

    User findById(Long id);

}
