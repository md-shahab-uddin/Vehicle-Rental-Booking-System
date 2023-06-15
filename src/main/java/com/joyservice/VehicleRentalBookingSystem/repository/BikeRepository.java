package com.joyservice.VehicleRentalBookingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joyservice.VehicleRentalBookingSystem.entity.vehicle.Bike;

public interface BikeRepository extends JpaRepository<Bike,String>
{
}
