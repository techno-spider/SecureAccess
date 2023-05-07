package com.codehunter.secureaccess.service;

import com.codehunter.secureaccess.dto.UserRegistrationDto;
import com.codehunter.secureaccess.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
