package com.example.springboottoangular.controller;

import com.example.springboottoangular.entity.Flight;
import com.example.springboottoangular.entity.Plane;
import com.example.springboottoangular.service.FlightService;
import com.example.springboottoangular.service.PlaneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/flight")
public class PlaneController {
    private PlaneService planeService;

    public PlaneController(PlaneService planeService) {
        this.planeService = planeService;
    }

    @GetMapping("/{id}")
     ResponseEntity<?> getPlane(@PathVariable Long id) {
        return new ResponseEntity<>(planeService.getPlane(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getPlanes() {
        return new ResponseEntity<>(planeService.getPlanes(),HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> createPlane(@RequestBody Plane plane) {
        return new ResponseEntity<>(planeService.createPlane(plane),HttpStatus.OK);
    }

}
