package com.example.springboottoangular.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;
@Entity
@Data
@NoArgsConstructor
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "departure_date")
    private Date departureDate;
    @Column(name = "arrival_date")
    private Date arrivalDate;

    @ManyToOne
    @JoinColumn(name = "company_id",nullable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "plane_id",nullable = false)
    private Plane plane;

    @OneToMany(mappedBy = "flight")
    private Set<Booking> bookings;

}
