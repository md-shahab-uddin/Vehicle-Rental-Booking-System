package com.joyservice.VehicleRentalBookingSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joyservice.VehicleRentalBookingSystem.entity.vehicle.Bike;
import com.joyservice.VehicleRentalBookingSystem.service.BikeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/bike")
@AllArgsConstructor
public class BikeController
{
    @Autowired
    private final BikeService bikeService;
    @PostMapping("/add")
    public ResponseEntity<String> save(@RequestBody Bike bike)
    {
        bikeService.saveBike(bike);
        return ResponseEntity.status(HttpStatus.OK).body("Bike added successfully..");
    }
    @GetMapping("/findAll")
    public List<Bike> getAllBikes()
    {
        return bikeService.getAllBikes();
    }
}
