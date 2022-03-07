package com.example.demo.config;

import com.example.demo.Controller.UserController;
import com.example.demo.DAO.UserDAO;
import com.example.demo.Service.UserService;
import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public UserDAO userDAO(){
        UserDAO userDAO = new UserDAO();
        return userDAO;
    }

    @Bean
    public UserService userService(){
        return new UserService();
    }

    @Bean
    public UserController userController(){
        return new UserController();
    }
}
