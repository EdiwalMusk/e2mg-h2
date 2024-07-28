package com.e2mg.h2;

import com.e2mg.h2.entity.User;
import com.e2mg.h2.repo.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@SpringBootTest
@RunWith(SpringRunner.class)
public class InsertUserTest {

    @Autowired
    UserRepository userRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void contextLoads() throws JsonProcessingException {
        System.out.println("all");
        userRepository.save(new User(null, "a"));
        jdbcTemplate.update("insert into tbl_user(name) values(?);", new Object[]{null});

    }

}
