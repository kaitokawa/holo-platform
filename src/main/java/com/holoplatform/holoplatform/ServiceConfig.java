package com.holoplatform.holoplatform;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ServiceConfig {

    @Bean
    public UserController userController() {
        return new UserController();
    }
}
