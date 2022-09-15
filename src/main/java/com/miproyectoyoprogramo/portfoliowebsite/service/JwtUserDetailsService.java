package com.miproyectoyoprogramo.portfoliowebsite.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("apadmin".equals(username)) {
            return new User("apadmin", "$2a$10$haWRJ1FLkKznFcpYsJ/8IO0.7qe/2Ki/CmJtl1eaU9Ir3.F64l23O",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}