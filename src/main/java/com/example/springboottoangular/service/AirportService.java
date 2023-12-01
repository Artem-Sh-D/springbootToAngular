package com.example.springboottoangular.service;

import com.example.springboottoangular.entity.Airport;
import com.example.springboottoangular.pojo.AirportPojo;
import com.example.springboottoangular.repository.AirportRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
public class AirportService {
   private AirportRepository airportRepository;

    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    public Airport get(Long id) {
        return airportRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Airport in not found"));
    }

    public List<Airport> getAll() {
        return airportRepository.findAll();
    }

    public Airport create(AirportPojo airportPojo){
        Airport airport = AirportPojo.convertToAirport(airportPojo);
        return airportRepository.save(airport);
    }

}
