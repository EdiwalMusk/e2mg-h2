package com.e2mg.h2.repo;

import com.e2mg.h2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//继承JpaRepository来完成对数据库的操作
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByName(String name);
}