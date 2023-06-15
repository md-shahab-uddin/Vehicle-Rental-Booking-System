package com.joyservice.VehicleRentalBookingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joyservice.VehicleRentalBookingSystem.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
}
