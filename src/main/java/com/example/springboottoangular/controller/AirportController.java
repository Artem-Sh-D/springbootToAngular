package com.example.springboottoangular.controller;

import com.example.springboottoangular.entity.Airport;
import com.example.springboottoangular.pojo.AirportPojo;
import com.example.springboottoangular.service.AirportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/airport")
public class AirportController {

    private AirportService airportService;

    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Airport> getAirport(@PathVariable Long id) {
        return new ResponseEntity<>(airportService.get(id), HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<Airport>> getAirports() {
        return new ResponseEntity<>(airportService.getAll(),HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Airport> createAirport(@RequestBody AirportPojo airportPojo) {
        return new ResponseEntity<>(airportService.create(airportPojo),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Airport> updateAirport(@PathVariable Long id, AirportPojo airportPojo) {

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteAirport(@PathVariable Long id) {
        deleteAirport(id);
        return new ResponseEntity<>(true,HttpStatus.OK);
    }


}
