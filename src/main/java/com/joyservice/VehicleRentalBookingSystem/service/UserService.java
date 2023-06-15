package com.joyservice.VehicleRentalBookingSystem.service;

import org.springframework.http.ResponseEntity;

import com.joyservice.VehicleRentalBookingSystem.entity.User;

public interface UserService
{
    ResponseEntity<String> createUser(User user);
    boolean isValidUser(Integer userid);
}
