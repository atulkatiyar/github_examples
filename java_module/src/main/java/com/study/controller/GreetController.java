package com.study.controller;

import com.study.model.BookingRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetController {

    @GetMapping("/greeting")
    public String greet(@RequestParam(value = "name") String name) {
        return "Hello " + name;
    }

    @PostMapping("/book")
    public BookingRequest bookHotel(@RequestBody BookingRequest bookingRequest) {
        bookingRequest.setStatus("booked");
        return bookingRequest;
    }

}
