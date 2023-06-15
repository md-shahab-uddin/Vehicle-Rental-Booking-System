package com.joyservice.VehicleRentalBookingSystem.service;

import java.util.List;

import com.joyservice.VehicleRentalBookingSystem.entity.vehicle.Car;

public interface CarService
{
    void saveCar(Car car);

    void saveCars(List<Car> cars);

    List<Car> getAllCars();
}
