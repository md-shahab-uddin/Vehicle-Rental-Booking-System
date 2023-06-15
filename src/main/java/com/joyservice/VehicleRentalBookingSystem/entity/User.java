package com.joyservice.VehicleRentalBookingSystem.entity;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name = "customer")
public class User
{
    @Id
    @SequenceGenerator(name = "userIdGenerator", sequenceName = "userIdGenerator")
    @GeneratedValue(generator = "userIdGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer userId;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
}
