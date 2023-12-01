package com.example.springboottoangular.pojo;

import com.example.springboottoangular.entity.Airport;
import com.example.springboottoangular.entity.Booking;
import com.example.springboottoangular.entity.Gender;
import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;
public class BookingPojo {

    private String personFirstName;

    private String personLastName;

    private Gender gender;

    private Date date;

    private Double price;

    private Boolean validity;

    public BookingPojo(String personFirstName, String personLastName, Gender gender, Date date, Double price, Boolean validity) {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.gender = gender;
        this.date = date;
        this.price = price;
        this.validity = validity;
    }

    public static Booking convertToBooking(BookingPojo bookingPojo) {
        Booking booking = new Booking();
        booking.setPersonFirstName(bookingPojo.getPersonFirstName());
        booking.setPersonLastName(bookingPojo.getPersonLastName());
        booking.setGender(bookingPojo.getGender());
        booking.setDate(bookingPojo.getDate());
        booking.setPrice(bookingPojo.getPrice());
        booking.setValidity(bookingPojo.getValidity());

        return booking;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getValidity() {
        return validity;
    }

    public void setValidity(Boolean validity) {
        this.validity = validity;
    }
}
