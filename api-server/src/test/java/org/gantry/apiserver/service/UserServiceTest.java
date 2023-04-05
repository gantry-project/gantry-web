package org.gantry.apiserver.service;

import org.gantry.apiserver.domain.Application;
import org.gantry.apiserver.domain.DockerClientConnect;
import org.gantry.apiserver.persistence.ApplicationRepository;
import org.gantry.apiserver.persistence.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository repository;
    @Mock
    private PasswordEncoder passwordEncoder;
    @InjectMocks
    private UserService service;

    @BeforeEach
    public void before() {
    }

//    @Test
//    void get() {
//        given(repository.findById(userId)).willReturn(User);
//        Optional<User> user = service.findById(userId);
//        assertThat(user.getId()).isEqualTo(userId);
//    }
}