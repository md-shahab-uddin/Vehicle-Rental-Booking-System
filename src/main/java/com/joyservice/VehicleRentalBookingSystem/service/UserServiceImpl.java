package com.joyservice.VehicleRentalBookingSystem.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.joyservice.VehicleRentalBookingSystem.entity.User;
import com.joyservice.VehicleRentalBookingSystem.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService
{
    private final UserRepository userRepository;
    @Override
    public ResponseEntity<String> createUser(User user)
    {
        userRepository.save(user);
        return ResponseEntity.status(HttpStatus.OK).body("Account has been created successfully..");
    }

    @Override
    public boolean isValidUser(Integer userid)
    {
        return userRepository.findById(userid).isPresent();
    }
}
