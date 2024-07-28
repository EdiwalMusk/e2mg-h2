package com.e2mg.h2.controller;

import com.e2mg.h2.entity.User;
import com.e2mg.h2.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class IndexController {

    @Resource
    UserService userService;

    @RequestMapping("/list")
    public Object list() {
        return userService.getUserList();
    }

    @RequestMapping("/add")
    public void add(@RequestBody User user) {
        userService.save(user);
    }
}