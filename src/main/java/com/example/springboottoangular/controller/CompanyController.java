package com.example.springboottoangular.controller;

import com.example.springboottoangular.entity.Flight;
import com.example.springboottoangular.service.FlightService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/company")
public class CompanyController {
    private FlightService flightService;

    public CompanyController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/{id}")
     ResponseEntity<?> getFlight(@PathVariable Long id) {
        return new ResponseEntity<>(flightService.get(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getFlights() {
        return new ResponseEntity<>(flightService.get(),HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> createFlight(@RequestBody Flight flight) {
        return new ResponseEntity<>(flightService.createFlight(flight),HttpStatus.OK);
    }

}
