package com.e2mg.h2;

import com.e2mg.h2.repo.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class H2ApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public void contextLoads() throws JsonProcessingException {
        System.out.println(new ObjectMapper().writeValueAsString(userRepository.findAllByName("a")));
    }

}
