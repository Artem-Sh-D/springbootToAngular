package com.example.springboottoangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringbootToAngularApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootToAngularApplication.class, args);
    }

}
