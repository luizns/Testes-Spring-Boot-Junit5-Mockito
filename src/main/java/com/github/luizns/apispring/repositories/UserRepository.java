package com.github.luizns.apispring.repositories;

import com.github.luizns.apispring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
