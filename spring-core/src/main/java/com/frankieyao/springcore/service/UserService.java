package com.frankieyao.springcore.service;

import com.frankieyao.springcore.pojo.User;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserService {

    public UserService() {
        System.out.println("Empty constructor for UserService.");
    }

    public User getUser() {
        User user = new User();
        user.setName("Frankie Yao");
        user.setAge(27);
        return user;
    }
}
