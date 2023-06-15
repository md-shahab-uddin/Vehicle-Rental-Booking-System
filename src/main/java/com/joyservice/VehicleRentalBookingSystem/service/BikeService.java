package com.joyservice.VehicleRentalBookingSystem.service;

import java.util.List;

import com.joyservice.VehicleRentalBookingSystem.entity.vehicle.Bike;

public interface BikeService
{
    void saveBike(Bike bike);

    void saveBikes(List<Bike> bikes);

    List<Bike> getAllBikes();
}
