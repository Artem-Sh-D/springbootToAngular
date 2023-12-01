package com.example.springboottoangular.controller;

import com.example.springboottoangular.entity.Flight;
import com.example.springboottoangular.service.FlightService;
import com.example.springboottoangular.service.PlaneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/flight")
public class FlightController {
    private FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/{id}")
     ResponseEntity<?> getFlight(@PathVariable Long id) {
        return new ResponseEntity<>(flightService.get(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getFlights() {
        return new ResponseEntity<>(flightService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> createFlight(@RequestBody Flight flight) {
        return new ResponseEntity<>(flightService.create(flight),HttpStatus.OK);
    }

}
