package com.joyservice.VehicleRentalBookingSystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException
{
    @ExceptionHandler(VehicleAlreadyBookedException.class)
    public ResponseEntity<String> vehicleBookedException(VehicleAlreadyBookedException vehicleAlreadyBookedException)
    {
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("This type of vehicle already booked");
    }
    @ExceptionHandler(NotValidUserException.class)
    public ResponseEntity<String> notValidUserException(NotValidUserException notValidUserException)
    {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("you are not allowed to book the vehicle");
    }
}
