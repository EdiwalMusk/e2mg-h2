package com.e2mg.h2.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class EnvConfig implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        String key = "spring.jdbc.getParameterType.ignore";
        String value = environment.getProperty(key);
        System.setProperty(key, value != null ? value : "true");
    }
}
