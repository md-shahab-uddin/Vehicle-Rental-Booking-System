package com.joyservice.VehicleRentalBookingSystem.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "booking")
public class Booking
{
    @Id
    @SequenceGenerator(name = "idGenerator", sequenceName = "idGenerator")
    @GeneratedValue(generator = "idGenerator", strategy = GenerationType.SEQUENCE)
    private Integer bookingId;
    @Column(name = "vehicleTyp")
    private String vehicleTyp;
    @Column(name = "userId")
    private Integer userId;
    @Column(name = "rentedDate")
    private LocalDateTime rentedDate;
}
