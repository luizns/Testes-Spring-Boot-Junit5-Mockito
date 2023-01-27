package com.github.luizns.apispring.resources;

import com.github.luizns.apispring.domain.User;
import com.github.luizns.apispring.domain.dto.UserDTO;
import com.github.luizns.apispring.services.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserResourceTest {

    public static final long ID = 1L;
    public static final Integer INDEX = 0;
    public static final String NAME = "Luiz";
    public static final String EMAIL = "luiz@gmail.com";
    public static final String PASSWORD = "123";
    public static final String EMAIL_JA_CADASTRADO_NO_SISTEMA = "Email já cadastrado no sistema";
    public static final String USUARIO_NAO_ENCONTRADO = "Usuário não encontrado";

    private User user;
    private UserDTO userDTO;
    @InjectMocks
    private UserResource resource;

    @Mock
    private ModelMapper mapper;
    @Mock
    private UserServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUser();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    private void startUser() {
        user = new User(ID, NAME, EMAIL, PASSWORD);
        userDTO = new UserDTO(ID, NAME, EMAIL, PASSWORD);
    }
}