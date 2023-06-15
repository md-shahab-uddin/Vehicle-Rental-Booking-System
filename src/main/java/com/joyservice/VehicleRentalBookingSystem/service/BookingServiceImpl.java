package com.joyservice.VehicleRentalBookingSystem.service;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.joyservice.VehicleRentalBookingSystem.entity.Booking;
import com.joyservice.VehicleRentalBookingSystem.exception.NotValidUserException;
import com.joyservice.VehicleRentalBookingSystem.exception.VehicleAlreadyBookedException;
import com.joyservice.VehicleRentalBookingSystem.repository.BookingRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookingServiceImpl implements BookingService
{
    private final BookingRepository bookingRepository;
    private final UserService userService;

    @Override
    public ResponseEntity<String> bookVehicle(Booking booking)
    {
        if (!userService.isValidUser(booking.getUserId()))
        {
            throw new NotValidUserException();
        }
        var bookings = bookingRepository.findByVehicleTyp(booking.getVehicleTyp());
        if (!bookings.isEmpty())
        {
            throw new VehicleAlreadyBookedException();
        }
        booking.setRentedDate(LocalDateTime.now());
        bookingRepository.save(booking);
        return ResponseEntity.status(HttpStatus.OK).body("Your booking for " + booking.getVehicleTyp()+" completed successfully..");
    }

    @Override
    public void getBookingByBookingId(Integer bookingId)
    {

    }
}
