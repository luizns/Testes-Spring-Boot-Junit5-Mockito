package com.github.luizns.apispring.resources;

import com.github.luizns.apispring.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResources {
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById() {
return ResponseEntity.ok().body(new User(1L, "Luiz","luns.wm@gmail.com","123"));
    }
}
