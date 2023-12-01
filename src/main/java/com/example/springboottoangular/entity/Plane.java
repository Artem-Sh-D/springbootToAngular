package com.example.springboottoangular.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "from_airport_id", nullable = false)
    private Airport fromAirport;

    @ManyToOne
    @JoinColumn(name = "to_airport_id", nullable = false)
    private Airport toAirport;

    @OneToMany(mappedBy = "plane")
    private Set<Flight> flights;

}
