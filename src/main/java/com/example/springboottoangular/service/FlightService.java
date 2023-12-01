package com.example.springboottoangular.service;

import com.example.springboottoangular.entity.Booking;
import com.example.springboottoangular.entity.Flight;
import com.example.springboottoangular.repository.FlightRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FlightService {
    private FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public Flight get(Long id) {
        return flightRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Flight is not found"));
    }
    public List<Flight> getAll() {
        return flightRepository.findAll();
    }

    public Flight create(Flight flight){
        return flightRepository.save(flight);
    }
}
