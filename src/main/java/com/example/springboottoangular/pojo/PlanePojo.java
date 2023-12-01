package com.example.springboottoangular.pojo;

import com.example.springboottoangular.entity.Airport;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class PlanePojo {
    @ManyToOne
    @JoinColumn(name = "from_airport_id", nullable = false)
    private Airport fromAirport;

    @ManyToOne
    @JoinColumn(name = "to_airport_id", nullable = false)
    private Airport toAirport;
}
