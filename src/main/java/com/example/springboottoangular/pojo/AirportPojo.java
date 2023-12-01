package com.example.springboottoangular.pojo;

import com.example.springboottoangular.entity.Airport;

public class AirportPojo {
    private String name;

    private String city;

    private String country;

    public AirportPojo(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public static Airport convertToAirport(AirportPojo airportPojo) {
        Airport airport = new Airport();
        airport.setName(airportPojo.getName());
        airport.setCountry(airportPojo.getCountry());
        airport.setCity(airportPojo.getCity());
        return airport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
