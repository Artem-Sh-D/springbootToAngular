package com.example.springboottoangular.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "person_first_name")
    private String personFirstName;
    @Column(name = "person_last_name")
    private String personLastName;

    private Gender gender;

    private Date date;

    private Double price;

    private Boolean validity;

    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

}
