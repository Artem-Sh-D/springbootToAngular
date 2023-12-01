package com.example.springboottoangular.service;

import com.example.springboottoangular.entity.Airport;
import com.example.springboottoangular.entity.Plane;
import com.example.springboottoangular.repository.PlaneRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
public class PlaneService {
    private PlaneRepository planeRepository;

    public PlaneService(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    public Plane get(Long id) {
        return planeRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Plane is not found"));
    }

    public List<Plane> getAll() {
        return planeRepository.findAll();
    }

    public Plane create(Plane plane){
        return planeRepository.save(plane);
    }

    public boolean delete(Long id) {
        return  planeRepository.delete(planeRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Plane is not found")));
    }

}
