package com.joyservice.VehicleRentalBookingSystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joyservice.VehicleRentalBookingSystem.entity.Booking;
import com.joyservice.VehicleRentalBookingSystem.entity.User;

public interface BookingRepository extends JpaRepository<Booking, Integer>
{
    List<Booking> findByVehicleTyp(String vehicleTyp);
}
