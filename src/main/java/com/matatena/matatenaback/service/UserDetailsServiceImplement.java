package com.matatena.matatenaback.service;

import com.matatena.matatenaback.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImplement implements UserDetailsService {

    private UserRepository userRepository;

    UserDetailsServiceImplement(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Extrae el usuario de la BD
        return this.userRepository.findByUsername(username);

    }

}

