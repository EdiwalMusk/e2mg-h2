package com.e2mg.h2.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class H2TableInitializer implements CommandLineRunner {
 
    private final JdbcTemplate jdbcTemplate;
 
    public H2TableInitializer(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
 
    @Override
    public void run(String... args) {
        // 创建表的SQL语句
        String createTableSql = "CREATE TABLE IF NOT EXISTS user " +
                                "(id INT PRIMARY KEY, name VARCHAR(100))";
        jdbcTemplate.execute(createTableSql);
    }
}