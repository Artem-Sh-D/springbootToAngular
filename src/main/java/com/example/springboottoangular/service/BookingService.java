package com.example.springboottoangular.service;

import com.example.springboottoangular.entity.Booking;
import com.example.springboottoangular.pojo.BookingPojo;
import com.example.springboottoangular.repository.BookingRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking get(Long id) {
        return bookingRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Booking is not found"));
    }

    public List<Booking> getAll() {
        return bookingRepository.findAll();
    }

    public Booking create(BookingPojo bookingPojo){
        Booking booking = BookingPojo.convertToBooking(bookingPojo);
        return bookingRepository.save(booking);
    }

    public Booking update(Booking booking, Long id) {
        Optional<Booking> lastBooking = bookingRepository.findById(id);

        if(lastBooking.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Booking is not found");
        }
        Booking newBooking = lastBooking.get();
        newBooking.setPersonFirstName(booking.getPersonFirstName());
        newBooking.setPersonLastName(booking.getPersonLastName());
        newBooking.setGender(booking.getGender());
        newBooking.setPrice(booking.getPrice());
        newBooking.setDate(booking.getDate());
        newBooking.setFlight(booking.getFlight());

        return bookingRepository.save(newBooking);
    }
}
