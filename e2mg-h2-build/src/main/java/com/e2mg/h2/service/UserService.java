package com.e2mg.h2.service;

import com.e2mg.h2.entity.User;
import com.e2mg.h2.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> getUserList() {
        return userRepository.findAll();
    }


    public User findUserById(long id) {
        return userRepository.findById(id).orElse(null);
    }


    public void save(User user) {
        userRepository.save(user);
    }


    public void edit(User user) {
        userRepository.save(user);
    }


    public void delete(long id) {
        userRepository.deleteById(id);
    }
}