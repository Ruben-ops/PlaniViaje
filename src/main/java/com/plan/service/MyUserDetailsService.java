package com.plan.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Aquí puedes cargar el usuario desde la base de datos
        return new User("admin", "$2a$10$DowNve77eYvQseAqx7ozf.S3AvErn/uGfeHB/hwrbToq/j3hIBOS2", new ArrayList<>());
    }
}