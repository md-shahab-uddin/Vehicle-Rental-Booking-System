package com.joyservice.VehicleRentalBookingSystem.entity.vehicle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bike
{
    @Id
    @Column(name = "name")
    private String bikeName;
    @Column(name = "vehicleType")
    private String vehicleType;
}
