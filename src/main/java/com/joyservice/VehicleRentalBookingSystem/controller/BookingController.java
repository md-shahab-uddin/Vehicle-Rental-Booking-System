package com.joyservice.VehicleRentalBookingSystem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joyservice.VehicleRentalBookingSystem.entity.Booking;
import com.joyservice.VehicleRentalBookingSystem.service.BookingService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/booking")
public class BookingController
{
    private BookingService bookingService;
    @PostMapping("/book")
    public ResponseEntity<String> bookVehicle(@RequestBody Booking booking)
    {
       return bookingService.bookVehicle(booking);
    }
}
