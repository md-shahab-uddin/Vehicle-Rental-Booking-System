package com.joyservice.VehicleRentalBookingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joyservice.VehicleRentalBookingSystem.entity.vehicle.Car;

public interface CarRepository extends JpaRepository<Car, String>
{
}
