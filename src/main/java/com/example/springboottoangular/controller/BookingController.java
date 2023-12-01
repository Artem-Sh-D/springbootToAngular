package com.example.springboottoangular.controller;

import com.example.springboottoangular.entity.Booking;
import com.example.springboottoangular.pojo.BookingPojo;
import com.example.springboottoangular.service.AirportService;
import com.example.springboottoangular.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/booking")
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getBooking(@PathVariable Long id) {
        return new ResponseEntity<>(bookingService.get(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Booking>> getBookings() {
        return new ResponseEntity<>(bookingService.getAll(),HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Booking> createBooking(@RequestBody BookingPojo bookingPojo) {
        return new ResponseEntity<>(bookingService.create(bookingPojo),HttpStatus.OK);
    }

}
