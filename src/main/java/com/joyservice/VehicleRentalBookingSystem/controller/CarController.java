package com.joyservice.VehicleRentalBookingSystem.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joyservice.VehicleRentalBookingSystem.entity.vehicle.Car;
import com.joyservice.VehicleRentalBookingSystem.service.CarService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/car")
@AllArgsConstructor
public class CarController
{
    private final CarService carService;
    @PostMapping("/add")
    public ResponseEntity<String> save(@RequestBody Car car)
    {
        carService.saveCar(car);
        return ResponseEntity.status(HttpStatus.OK).body("Car added successfully..");
    }
    @GetMapping("/findAll")
    public List<Car> getAllCars()
    {
        return carService.getAllCars();
    }
}
