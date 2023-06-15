package com.joyservice.VehicleRentalBookingSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.joyservice.VehicleRentalBookingSystem.entity.vehicle.Bike;
import com.joyservice.VehicleRentalBookingSystem.repository.BikeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BikeServiceImpl implements BikeService
{
    private final BikeRepository bikeRepository;

    @Override
    public void saveBike(Bike bike)
    {
        bikeRepository.save(bike);
    }

    @Override
    public void saveBikes(List<Bike> bikes)
    {
        bikeRepository.saveAll(bikes);
    }

    @Override
    public List<Bike> getAllBikes()
    {
        return bikeRepository.findAll();
    }
}
