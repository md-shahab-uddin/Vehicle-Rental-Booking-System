package com.joyservice.VehicleRentalBookingSystem.service;

import org.springframework.http.ResponseEntity;

import com.joyservice.VehicleRentalBookingSystem.entity.Booking;

public interface BookingService
{
    ResponseEntity<String> bookVehicle(Booking booking);
    void getBookingByBookingId(Integer bookingId);
}
