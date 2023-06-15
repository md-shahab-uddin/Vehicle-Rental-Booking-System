package com.joyservice.VehicleRentalBookingSystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joyservice.VehicleRentalBookingSystem.entity.User;
import com.joyservice.VehicleRentalBookingSystem.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController
{
    private UserService userService;
    @PostMapping("/register")
    public ResponseEntity<String> registerUSer(@RequestBody User user)
    {
        userService.createUser(user);
        return ResponseEntity.status(HttpStatus.OK).body("User registered successfully...");
    }
}
