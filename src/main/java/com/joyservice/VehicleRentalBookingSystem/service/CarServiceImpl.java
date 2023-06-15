package com.joyservice.VehicleRentalBookingSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.joyservice.VehicleRentalBookingSystem.entity.vehicle.Car;
import com.joyservice.VehicleRentalBookingSystem.repository.CarRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService
{
    private final CarRepository carRepository;

    @Override
    public void saveCar(Car car)
    {
        carRepository.save(car);
    }

    @Override
    public void saveCars(List<Car> cars)
    {
        carRepository.saveAll(cars);
    }

    @Override
    public List<Car> getAllCars()
    {
        return carRepository.findAll();
    }
}
